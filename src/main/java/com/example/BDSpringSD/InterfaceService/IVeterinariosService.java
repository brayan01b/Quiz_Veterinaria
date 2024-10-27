package com.example.BDSpringSD.InterfaceService;

import com.example.BDSpringSD.Model.Mascota;
import com.example.BDSpringSD.Model.Veterinarios;

import java.util.List;
import java.util.Optional;

public interface IVeterinariosService {

    List<Veterinarios> listarVet();



    void guardarVet(Veterinarios Vet);

    Optional<Veterinarios> editarVet(int id);

    void eliminarVet(int id);


    List<Veterinarios> obtenerTodosLosVeterinarios();

}