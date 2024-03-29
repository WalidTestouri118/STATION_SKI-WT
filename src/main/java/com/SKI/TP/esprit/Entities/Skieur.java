package com.SKI.TP.esprit.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long numSkieur;
    String nomS;
    String prenomS;
    LocalDate dateNaissance;
    String ville;
    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;
    @ManyToMany
    private List<Piste>pistes;

    @OneToOne( cascade = CascadeType.REMOVE)
    private Abonnement abonnement;
}
