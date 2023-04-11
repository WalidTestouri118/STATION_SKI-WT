package com.SKI.TP.esprit.Controllers;

import com.SKI.TP.esprit.Entities.Cours;
import com.SKI.TP.esprit.Entities.Inscription;
import com.SKI.TP.esprit.Entities.Skieur;
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


    @PostMapping("")
    public Skieur addSkierAndAssignToCourse(Skieur skieur){
        assert.notnull(skieur.getabonnement(),"abonnement must be entered");
        assert.notNull(skieur.getinscription(),"inscription must be entered");
        Set<Inscription> inscriptions=skieur.getInscriptions();
        inscriptions.forEach(inscription -> {
            assert.notNull(inscription.getCours().getNumCours(), "cour must be entered");
            Cours cours=coursRepository.findbyid(inscription.getCours().getNumCours().orElse(null))
            assert.notNull(cours,"no coutr found with this is !!!!!");
            inscriptions.setCours(cours);
            SkieurRepository.saveAndFlush(skieur);
            inscription.setSkieur(skieur);
            InscriptionRepository.Save(inscription);
        });

        return skieur;
    }
}
