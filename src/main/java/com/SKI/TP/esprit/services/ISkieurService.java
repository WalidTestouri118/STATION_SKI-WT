package com.SKI.TP.esprit.services;

import com.SKI.TP.esprit.Entities.Skieur;
import com.SKI.TP.esprit.Entities.Support;
import com.SKI.TP.esprit.Entities.TypeAbonnement;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Optional<Skieur> retrieveSkieur (Long numSkieur);
    Skieur updateSkieur (Skieur Skieur);
    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);
    Skieur AssignSkierToSubscription(long numSkieur, long numAbon);

    Skieur assignSkierToInscription(Long numSkieur, Long numInscription);

    List<Skieur> getSkieurByAbonnement_TypeAbon(TypeAbonnement typeAbonnement);

    List<Skieur> findByMoniteurNameAndSupportTypeJPQL(@Param("support") Support support, @Param("nom") String nom);


    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);

    Skieur addSkierAndAssignToCourse(Skieur skieur);
}
