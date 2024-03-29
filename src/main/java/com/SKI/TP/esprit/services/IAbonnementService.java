package com.SKI.TP.esprit.services;

import com.SKI.TP.esprit.Entities.Abonnement;
import com.SKI.TP.esprit.Entities.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface IAbonnementService {
    List<Abonnement> retrieveAllAbonnement();
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement (Abonnement abonnement);
    Optional<Abonnement> retrieveAbonnement (Long numAbon);

    void removeAbonnement(Long numAbon);
    List<Abonnement> getSubParType(TypeAbonnement typeAbonnement);
    List<Abonnement> retrieveSubscriptionsByDates(LocalDate dateDebut, LocalDate dateFin);
}
