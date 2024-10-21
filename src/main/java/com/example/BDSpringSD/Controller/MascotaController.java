package com.example.BDSpringSD.Controller;

import com.example.BDSpringSD.InterfaceService.IMascotaService;
import com.example.BDSpringSD.Model.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
public class MascotaController {

    @Autowired
    private IMascotaService service;


    @GetMapping("/listar")
    public String listarMascota(Model model){

        model.addAttribute("titulo","Spring DB");
        model.addAttribute("cuerpo","LISTA DE MASCOTAS");

        model.addAttribute("datos", service.listar());
        return "index";
    }

    @GetMapping("/nuevo")
    public String formAgregarMascota(Model model){

        model.addAttribute("titulo", "Nuevo");
        model.addAttribute("cuerpo", "MASCOTA NUEVA");

        model.addAttribute("Masc",new Mascota());
        return "nuevo";
    }

    @PostMapping("/guardar")
    public String guardarMascota(@ModelAttribute Mascota Masc){

        service.guardar(Masc);

        return "redirect:/listar";
    }


    @GetMapping("/editar/{id}")
    public String editarMascota(@PathVariable("id") int id, Model model){


        model.addAttribute("Masc", service.editar(id));

        return "nuevo";

    }

    @GetMapping("/eliminar/{id}")
    public String eliminarMascota(@PathVariable("id") int id){

       service.eliminar(id);

        return "redirect:/listar";

    }














}
