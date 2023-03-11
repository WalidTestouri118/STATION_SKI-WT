package com.SKI.TP.esprit.services;

import com.SKI.TP.esprit.Entities.Cours;
import java.util.List;
import java.util.Optional;

public interface ICoursService {

    List<Cours> retrieveAllCours();
    Cours addCours(Cours cours);
    Cours updateCours (Cours cours);
    Optional<Cours> retrieveCours (Long numCours);

    void removeCours(Long numCours);
}
