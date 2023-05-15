package com.SKI.TP.esprit.Repositories;

import com.SKI.TP.esprit.Entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CoursRepository extends JpaRepository<Cours,Long > {




}

