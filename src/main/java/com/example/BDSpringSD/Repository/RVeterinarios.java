package com.example.BDSpringSD.Repository;

import com.example.BDSpringSD.Model.Veterinarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RVeterinarios extends JpaRepository<Veterinarios, Integer> {
}

