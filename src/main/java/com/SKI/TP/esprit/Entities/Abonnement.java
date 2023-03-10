package com.SKI.TP.esprit.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long numAbon;
    LocalDate dateDebut;
    LocalDate dateFin;
    float prixAbon;
    @Enumerated(EnumType.STRING)

    TypeAbonnement typeAbon;
}
