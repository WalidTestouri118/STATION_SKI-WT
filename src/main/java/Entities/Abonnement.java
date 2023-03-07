package Entities;

import jakarta.persistence.*;
import java.time.LocalDate;

import lombok.*;
@Entity
@Table(name = "Abonnement")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Abonnement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long numAbon;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private float prixAbon;
    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;
}
