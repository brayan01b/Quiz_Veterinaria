package com.example.BDSpringSD.InterfaceService;

import com.example.BDSpringSD.Model.Consultas;
import com.example.BDSpringSD.Model.Mascota;

import java.util.List;
import java.util.Optional;

public interface IConsultasService {

    // AQUI SE VAN A CREAR LOS METODOS QUE VOY USAR

    public List<Consultas> listarCon();

    public void guardarCon(Consultas Con);

    public Optional<Consultas> editarCon(int id);

    public void eliminarCon (int id);


}
