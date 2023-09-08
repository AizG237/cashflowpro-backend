package com.cashflowpro.cashflowpro.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {
    private static final String SECRET_KEY = "0x5E8D2D3C4A3B2C1E5F6D7C8B9A0B1C2D3E4F5A6B7C8D9E0A1B2C3D4E5F6A7B8C";
    public String extractUserName(String token) {
        return extractClaim(token, Claims::getSubject) ;
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver){
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    public String generateToken(UserDetails userDetails){
        return generatToken(new HashMap<>(), userDetails);
    }

    private Claims extractAllClaims(String token){
        return Jwts.parserBuilder()
                .setSigningKey(getSingKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }
    public String generatToken(
            Map<String,Object> extraClaims,
            UserDetails userDetails
    ){
        return  Jwts
                .builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+ 1000*60*12))
                .signWith(getSingKey(), SignatureAlgorithm.HS256)
                .compact();
    }
public boolean isTokenValid(String token, UserDetails userDetails){
        final String username= extractUserName(token);
        return (username.equals(userDetails.getUsername())) && !isTokenExprired(token);
}

    private boolean isTokenExprired(String token) {
        return extractExpitation(token).before(new Date());
    }

    private Date extractExpitation(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    private Key getSingKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
