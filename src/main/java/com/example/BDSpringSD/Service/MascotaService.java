package com.example.BDSpringSD.Service;

import com.example.BDSpringSD.InterfaceService.IMascotaService;
import com.example.BDSpringSD.Model.Mascota;
import com.example.BDSpringSD.Repository.RMascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MascotaService implements IMascotaService {

    // AQUI SE IMPLMENTAN LOS METODOS QUE ESTAN EN INTERFACE SERVICE

    // SE DEBE INYECTAR LA INTERFACE QUE EXITENDE DE JPA

    @Autowired
    private RMascota repositorio;


    @Override
    public List<Mascota> listar() {
        return repositorio.findAll();
    }

    @Override
    public void guardar(Mascota Masc) {
        repositorio.save(Masc);
    }

    @Override
    public Optional<Mascota> editar(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void eliminar(int id) {

        repositorio.deleteById(id);

    }
}
