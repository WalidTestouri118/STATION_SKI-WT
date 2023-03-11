package com.SKI.TP.esprit.services;

import com.SKI.TP.esprit.Entities.Piste;

import java.util.List;
import java.util.Optional;

public interface IPisteService {
    List<Piste> retrieveAllPistes();
    Piste addPiste(Piste piste);
    Piste updatePiste (Piste piste);
    Optional<Piste> retrievePiste (Long numPiste);
    void removePiste(Long numPiste);
}
