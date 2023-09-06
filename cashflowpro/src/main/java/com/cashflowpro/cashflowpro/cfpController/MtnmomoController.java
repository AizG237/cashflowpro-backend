package com.cashflowpro.cashflowpro.cfpController;

import com.cashflowpro.cashflowpro.modele.Mtnmomo;
/*import com.cashflowpro.cashflowpro.modele.mtnmomo;*/
import com.cashflowpro.cashflowpro.service.MtnMomoServiceImpl;
/*mport com.cashflowpro.cashflowpro.service.mtnmomoServiceImpl;*/
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/mtnmomo")

public class MtnmomoController {
    private final MtnMomoServiceImpl mtnMomoService;

    @PostMapping("/add")
    public void ajoutermtnmomo(@RequestBody Mtnmomo mtnmomo){
        mtnMomoService.addMtnmomo(mtnmomo);
    }

    //read
    @GetMapping("/get/{id}")
    public Mtnmomo trouvermtnmomo(@PathVariable long id){

        return mtnMomoService.getMtnmomo(id);
    }

    //readAll
    @GetMapping("get/all")
    public List<Mtnmomo> trouverAllmtnmomo(){
        return mtnMomoService.getAllMtnmomo();
    }
    //update
    @PutMapping("/update/{id}")
    public Mtnmomo updatemtnmomo(@PathVariable long id, @RequestBody Mtnmomo mtnmomo){
        return mtnMomoService.updateMtnmomo(id,mtnmomo);
    }
    //delete
    @DeleteMapping("/delete/{id}")
    public String supprimermtnmomo(@PathVariable long id){
        return mtnMomoService.deleteMtnmomo(id);
    }
    
}
