package Entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.mapping.List;

@Entity
@Table(name = "Piste")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Piste {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long numPiste;
    private String nomPiste;
    @Enumerated(EnumType.STRING)
    private Couleur couleur;
    private int pente;
    private int longueur;

    @ManyToMany()
    private List skieurs;
}
