package com.SKI.TP.esprit.services;


import com.SKI.TP.esprit.Entities.Abonnement;
import com.SKI.TP.esprit.Entities.Inscription;
import com.SKI.TP.esprit.Entities.Piste;
import com.SKI.TP.esprit.Entities.Skieur;
import com.SKI.TP.esprit.Repositories.AbonnementRepository;
import com.SKI.TP.esprit.Repositories.InscriptionRepository;
import com.SKI.TP.esprit.Repositories.PisteRepository;
import com.SKI.TP.esprit.Repositories.SkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;

@Service
public class ISkieurIMP implements ISkieurService {
    @Autowired
    SkieurRepository skieurRepository;
    @Autowired
    InscriptionRepository inscriptionRepository;
    @Autowired

    PisteRepository pisteRepository;
    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return  skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }


    @Override
    public void removeSkieur(Long numSkieur) {
        skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Optional<Skieur> retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur);
    }

    @Override
    public Skieur updateSkieur(Skieur Skieur) {
        return skieurRepository.save(Skieur);
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        //RECUPERATION ID
        Skieur skieur=skieurRepository.findById(numSkieur).orElse(null) ;
        Piste piste=pisteRepository.findById(numPiste).orElse(null);
        //verrificationnon null
        if(skieur!=null && piste!=null){
            //traitement
            // skieur.getPistes().add(piste);
            List<Piste>pistes=skieur.getPistes();
            pistes.add(piste);
            skieur.setPistes(pistes);
            return  skieurRepository.save(skieur);

        }
        return null;
    }

    @Override
    public Skieur AssignSkierToSubscription(long numSkieur, long numAbon) {
        //RECUPERATION ID
        Skieur skieur=skieurRepository.findById(numSkieur).orElse(null) ;
        Assert.notNull(skieur,"skieur not found");
        Abonnement abonnement=abonnementRepository.findById(numAbon).orElse(null);
        Assert.notNull(skieur,"abonnement not found");
        //verrificationnon null
        //if(skieur!=null && abonnement!=null){
        //traitement
        // skieur.getPistes().add(piste);

        skieur.setAbonnement(abonnement);

        return  skieurRepository.save(skieur);

        // }
        // return null;
    }

    @Override
    public Skieur assignSkierToInscription(Long numSkieur, Long numInscription) {
        Skieur skieur=skieurRepository.findById(numSkieur).orElse(null) ;
        Inscription inscription=inscriptionRepository.findById(numInscription).orElse(null);
        //verrificationnon null
        if(skieur!=null && inscription!=null){
            //traitement
            // skieur.getPistes().add(piste);
            List<Inscription>inscriptions=skieur.getInscriptions();
            inscriptions.add(inscription);
            skieur.setInscriptions(inscriptions);
            return  skieurRepository.save(skieur);

        }
        return null;    }
}