package Entities;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "Skieur")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Skieur {
    @Id
    private long numSkieur;
    private String nomS;
    private String prenomS;
    private LocalDate dateNaiss;
    private String ville;

}
