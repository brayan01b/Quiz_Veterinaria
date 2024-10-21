package com.example.BDSpringSD.InterfaceService;

import com.example.BDSpringSD.Model.Propietario;

import java.util.List;
import java.util.Optional;

public interface IPropietarioService {

    // AQUI SE VAN A CREAR LOS METODOS QUE VOY USAR

    public List<Propietario> listarPro();

    public void guardarDo(Propietario Pro);

    public Optional<Propietario> editarPro(int id);

    public void eliminarPro (int id);


}
