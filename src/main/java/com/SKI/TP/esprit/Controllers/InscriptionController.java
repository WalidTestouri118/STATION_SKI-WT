package com.SKI.TP.esprit.Controllers;

import com.SKI.TP.esprit.Entities.Inscription;
import com.SKI.TP.esprit.services.IInsriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("inscription")
public class InscriptionController {
    @Autowired
    IInsriptionService iInscriptionService;
    @GetMapping
    public List<Inscription> getAll(){
        return iInscriptionService.retrieveAllInscription();

    }
    @GetMapping("{numInscription}")

    public Optional<Inscription> retrieveInscription(@PathVariable Long numInscription) {

        return  iInscriptionService.retrieveInscription(numInscription);

    }
    @PostMapping

    public Inscription addInscription(@RequestBody Inscription inscription){

        return iInscriptionService.addInscription(inscription);
    }
    @DeleteMapping("{numInscription}")
    public void removeInscription(@PathVariable Long numInscription){

        iInscriptionService.removeInscription(numInscription);
    }

    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription inscription) {

        return  iInscriptionService.updateInscription(inscription);

    }
}
