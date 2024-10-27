package com.example.BDSpringSD.Controller;
import com.example.BDSpringSD.InterfaceService.IMascotaService;
import com.example.BDSpringSD.InterfaceService.IPropietarioService;
import com.example.BDSpringSD.InterfaceService.IVeterinariosService;
import com.example.BDSpringSD.Model.Mascota;
import com.example.BDSpringSD.Model.Propietario;
import com.example.BDSpringSD.Model.Veterinarios;
import com.example.BDSpringSD.Service.PropietarioService;
import com.example.BDSpringSD.Service.VeterinariosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping
public class VeterinariosController {


    @Autowired
    private IVeterinariosService service;


    @GetMapping("/listarVet")
    public String listarVeterinarios(Model model){

        model.addAttribute("titulo","Spring DB");
        model.addAttribute("cuerpo","LISTA DE VETERINARIOS");
        model.addAttribute("datos", service.listarVet());
        return "indexVet";
    }

    @GetMapping("/nuevoVet")
    public String formAgregarVeterinarios(Model model){

        model.addAttribute("titulo", "Nuevo");
        model.addAttribute("cuerpo", "USUARIO NUEVO");
        model.addAttribute("Vet",new Veterinarios());
        return "nuevoVet";
    }

    @PostMapping("/guardarVet")
    public String guardarVeterinarios(@ModelAttribute Veterinarios Vet){

        service.guardarVet(Vet);
        return "redirect:/listarVet";

    }


    @GetMapping("/editarVet/{id}")
    public String editarVet(@PathVariable("id") int id, Model model){



        model.addAttribute("Vet", service.editarVet(id));

        return "nuevoVet";

    }

    @GetMapping("/eliminarVet/{id}")
    public String eliminarVeterinarios(@PathVariable("id") int id){

        service.eliminarVet(id);

        return "redirect:/listarVet";

    }







}