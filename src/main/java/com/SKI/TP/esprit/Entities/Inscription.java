package com.SKI.TP.esprit.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    long numInscription;
    int numSemaine;
    @ManyToOne
    @JsonIgnore

    private Cours cours;

    @ManyToOne
    @JsonIgnore

    private Skieur skieur;



}
