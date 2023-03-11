package com.SKI.TP.esprit.services;

import com.SKI.TP.esprit.Entities.Inscription;
import java.util.List;
import java.util.Optional;

public interface IInsriptionService {
    List<Inscription> retrieveAllInscription();
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    Optional<Inscription> retrieveInscription(Long numInscription);

    void removeInscription(Long numInscription);
}
