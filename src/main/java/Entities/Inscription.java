package Entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Inscription")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Inscription {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int numInscription;
    private int numSemaine;
}
