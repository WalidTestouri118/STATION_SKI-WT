package Entities;

import java.time.LocalDate;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "Monitor")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Monitor {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long numMonitor;
    private String nomM;
    private String prenomM;
    private LocalDate dateRecru;
}
