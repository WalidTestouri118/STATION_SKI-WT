package com.SKI.TP.esprit.services;

import com.SKI.TP.esprit.Entities.Abonnement;
import com.SKI.TP.esprit.Entities.TypeAbonnement;
import com.SKI.TP.esprit.Repositories.AbonnementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class IAbonnementIMP implements IAbonnementService{
    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public List<Abonnement> retrieveAllAbonnement() {
        return abonnementRepository.findAll();
    }

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepository.save(abonnement);
    }

    @Override
    public Optional<Abonnement> retrieveAbonnement(Long numAbon) {
        return abonnementRepository.findById(numAbon);
    }

    @Override
    public void removeAbonnement(Long numAbon) {
        abonnementRepository.deleteById(numAbon);
    }

    @Override
    public List<Abonnement> getSubParType(TypeAbonnement typeAbonnement){
        return abonnementRepository.findByTypeAbon(typeAbonnement);
    }
    @Override
    public List<Abonnement> retrieveSubscriptionsByDates(LocalDate dateDebut, LocalDate dateFin){
        return  abonnementRepository.findAbonnementByDateDebutAndDateFin(dateDebut,dateFin);
    }
}
