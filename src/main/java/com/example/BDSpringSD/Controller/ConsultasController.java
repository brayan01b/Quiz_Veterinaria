package com.example.BDSpringSD.Controller;

import com.example.BDSpringSD.InterfaceService.IConsultasService;
import com.example.BDSpringSD.InterfaceService.IMascotaService;
import com.example.BDSpringSD.Model.Consultas;
import com.example.BDSpringSD.Model.Mascota;
import com.example.BDSpringSD.Service.MascotaService;
import com.example.BDSpringSD.Service.PropietarioService;
import com.example.BDSpringSD.Service.VeterinariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class ConsultasController {

    @Autowired
    private VeterinariosService VeterinariosService;
    @Autowired
    private MascotaService MascotaService;
    @Autowired
    private IConsultasService service;


    @GetMapping("/listarCon")
    public String listarConsultas(Model model){

        model.addAttribute("titulo","Spring DB");
        model.addAttribute("cuerpo","LISTA DE CONSULTAS");
        model.addAttribute("mascotas", MascotaService.obtenerTodosLosMascotas());
        model.addAttribute("veterinarios", VeterinariosService.obtenerTodosLosVeterinarios());
        model.addAttribute("datos", service.listarCon());
        return "indexCon";
    }

    @GetMapping("/nuevoCon")
    public String formAgregarConsultas(Model model){

        model.addAttribute("titulo", "Nuevo");
        model.addAttribute("cuerpo", "CONSULTA NUEVA");
        model.addAttribute("mascotas", MascotaService.obtenerTodosLosMascotas());
        model.addAttribute("veterinarios", VeterinariosService.obtenerTodosLosVeterinarios());
        model.addAttribute("Con",new Consultas());
        return "nuevoCon";
    }

    @PostMapping("/guardarCon")
    public String guardarConsultas(@ModelAttribute Consultas Con){

        service.guardarCon(Con);

        return "redirect:/listarCon";
    }


    @GetMapping("/editarCon/{id}")
    public String editarConsultas(@PathVariable("id") int id, Model model){

        model.addAttribute("mascotas", MascotaService.obtenerTodosLosMascotas());
        model.addAttribute("veterinarios", VeterinariosService.obtenerTodosLosVeterinarios());
        model.addAttribute("Con", service.editarCon(id));

        return "nuevoCon";

    }

    @GetMapping("/eliminarCon/{id}")
    public String eliminarConsultas(@PathVariable("id") int id){

       service.eliminarCon(id);

        return "redirect:/listarCon";

    }














}
