package com.example.BDSpringSD.Service;

import com.example.BDSpringSD.InterfaceService.IVeterinariosService;
import com.example.BDSpringSD.Model.Veterinarios;
import com.example.BDSpringSD.Repository.RVeterinarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeterinariosService implements IVeterinariosService {

    @Autowired
    private RVeterinarios repositorio;

    @Override
    public List<Veterinarios> listarVet() {
        return repositorio.findAll();
    }



    @Override
    public void guardarVet(Veterinarios Vet) {
        repositorio.save(Vet);
    }

    @Override
    public Optional<Veterinarios> editarVet(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminarVet(int id) {

        repositorio.deleteById(id);

    }


    @Override
    public List<Veterinarios> obtenerTodosLosVeterinarios() {
        return repositorio.findAll();
    }
}