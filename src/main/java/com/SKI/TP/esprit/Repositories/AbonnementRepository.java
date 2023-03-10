package com.SKI.TP.esprit.Repositories;

import com.SKI.TP.esprit.Entities.Abonnement;
import com.SKI.TP.esprit.Entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface AbonnementRepository extends JpaRepository<Abonnement,Long > {
    List<Abonnement> findByTypeAbon(TypeAbonnement typeAbonnement);

}
