package Entities;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Cour")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Cours {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long numCours;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCour typeCours;
    @Enumerated(EnumType.ORDINAL)
    private Support support;
    private float prix;
    private int crenau;
}
