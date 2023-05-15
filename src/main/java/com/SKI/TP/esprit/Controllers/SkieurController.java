package com.SKI.TP.esprit.Controllers;

import com.SKI.TP.esprit.Entities.*;
import com.SKI.TP.esprit.Repositories.InscriptionRepository;
import com.SKI.TP.esprit.Repositories.SkieurRepository;
import com.SKI.TP.esprit.services.ISkieurService;
import org.aspectj.bridge.IMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.springframework.util.Assert.notNull;

@RestController
@RequestMapping("skieur")
public class SkieurController {
    @Autowired
    ISkieurService iSkieurService;

    //localhost:9090/retrieveAllSkieurs
    @GetMapping
    public List<Skieur> getAll() {
        return iSkieurService.retrieveAllSkieurs();

    }

    @GetMapping("{numSkieur}")

    public Optional<Skieur> retrieveSkieur(@PathVariable Long numSkieur) {

        return iSkieurService.retrieveSkieur(numSkieur);

    }

    @PostMapping

    public Skieur addSkieur(@RequestBody Skieur skieur) {

        return iSkieurService.addSkieur(skieur);
    }

    @DeleteMapping("{numSkieur}")
    public void removeSkieur(@PathVariable Long numSkieur) {

        iSkieurService.removeSkieur(numSkieur);
    }

    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur Skieur) {

        return iSkieurService.updateSkieur(Skieur);

    }

    @PutMapping("/assignSkierToPiste/{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur, @PathVariable Long numPiste) {
        return iSkieurService.assignSkierToPiste(numSkieur, numPiste);

    }
    @PutMapping("{numSkieur}/{numAbon}")

    public Skieur AssignSkierToSubscription(@PathVariable long numSkieur, @PathVariable long numAbon) {

        return iSkieurService.AssignSkierToSubscription(numSkieur, numAbon);
    }

    @PutMapping("{numSkieur}/{numInscription}")

    public Skieur AssignSkierToInscription(@PathVariable long numSkieur, @PathVariable long numInscription) {

        return iSkieurService.assignSkierToInscription(numSkieur, numInscription);
    }


    @PostMapping("addSkierAndAssignToCourse")
    Skieur addSkierAndAssignToCourse(@RequestBody Skieur skieur){
        return iSkieurService.addSkierAndAssignToCourse(skieur);
    }

    @GetMapping("getSkieurParTypeAbon/{type}")
    public List<Skieur> getSkieurParTypeAbon(@PathVariable TypeAbonnement type){
        return  iSkieurService.retrieveSkiersBySubscriptionType(type);
    }

    @GetMapping("findByNameAndSupport/{support}/{nom}")
    public List<Skieur> findByMoniteurNameAndSupportTypeJPQL(@PathVariable Support support, @PathVariable String nom) {
        return iSkieurService.findByMoniteurNameAndSupportTypeJPQL(support, nom);
        //r
    }
}
