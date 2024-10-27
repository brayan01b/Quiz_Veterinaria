package com.example.BDSpringSD.Service;

import com.example.BDSpringSD.InterfaceService.IConsultasService;
import com.example.BDSpringSD.InterfaceService.IMascotaService;
import com.example.BDSpringSD.Model.Consultas;
import com.example.BDSpringSD.Model.Mascota;
import com.example.BDSpringSD.Repository.RConsultas;
import com.example.BDSpringSD.Repository.RMascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ConsultasService implements IConsultasService {

    // AQUI SE IMPLMENTAN LOS METODOS QUE ESTAN EN INTERFACE SERVICE

    // SE DEBE INYECTAR LA INTERFACE QUE EXITENDE DE JPA

    @Autowired
    private RConsultas repositorio;


    @Override
    public List<Consultas> listarCon() {
        return repositorio.findAll();
    }


    @Override
    public void guardarCon(Consultas Con) {
        repositorio.save(Con);
    }

    @Override
    public Optional<Consultas> editarCon(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminarCon(int id) {

        repositorio.deleteById(id);

    }
}
