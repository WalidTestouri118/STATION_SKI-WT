package com.SKI.TP.esprit.Entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.*;
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
