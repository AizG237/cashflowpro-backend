package com.cashflowpro.cashflowpro.cfpController;
import com.cashflowpro.cashflowpro.modele.VisaMastercard;
import com.cashflowpro.cashflowpro.service.VisaMastercardServiceImpl;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visamastercard")
@AllArgsConstructor
@Getter
@Setter

public class VisaMastercardController {
    private final VisaMastercardServiceImpl visaMastercardServiceImpl;
    //@Autowired
    @GetMapping("/get/{id_compte}")
    public VisaMastercard getCompte(@PathVariable long id_compte){
        return visaMastercardServiceImpl.getCompte(id_compte);
    }
    @DeleteMapping("/delete/{id_compte}")
    public void deleteCompte(@PathVariable long id_compte){
        visaMastercardServiceImpl.deleteCompte(id_compte);
    }
    @PostMapping("/add")
    public VisaMastercard addCompete(@RequestBody VisaMastercard VisaMastercard){
        return  visaMastercardServiceImpl.addCompte(VisaMastercard);
    }
    @PutMapping("update/{id_compte}")
    public String updateCompte(@PathVariable long id_compte, @RequestBody VisaMastercard VisaMastercard){
        visaMastercardServiceImpl.updateCompte(id_compte, VisaMastercard);
        return "LE STRING LA DERANGE";
    }
}
