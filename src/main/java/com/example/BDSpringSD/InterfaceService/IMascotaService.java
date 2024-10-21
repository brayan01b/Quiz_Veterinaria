package com.example.BDSpringSD.InterfaceService;

import com.example.BDSpringSD.Model.Mascota;

import java.util.List;
import java.util.Optional;

public interface IMascotaService {

    // AQUI SE VAN A CREAR LOS METODOS QUE VOY USAR

    public List<Mascota> listar();

    public void guardar(Mascota Masc);

    public Optional<Mascota> editar(int id);

    public void eliminar (int id);


}
