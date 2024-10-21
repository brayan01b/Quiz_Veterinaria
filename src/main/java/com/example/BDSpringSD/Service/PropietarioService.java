package com.example.BDSpringSD.Service;

import com.example.BDSpringSD.InterfaceService.IPropietarioService;
import com.example.BDSpringSD.Model.Propietario;
import com.example.BDSpringSD.Repository.RPropietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PropietarioService implements IPropietarioService {

    // AQUI SE IMPLMENTAN LOS METODOS QUE ESTAN EN INTERFACE SERVICE

    // SE DEBE INYECTAR LA INTERFACE QUE EXITENDE DE JPA

    @Autowired
    private RPropietario repositorio;


    @Override
    public List<Propietario> listarPro() {
        return repositorio.findAll();
    }

    @Override
    public void guardarDo(Propietario Pro) {
        repositorio.save(Pro);
    }

    @Override
    public Optional<Propietario> editarPro(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminarPro(int id) {

        repositorio.deleteById(id);

    }
}
