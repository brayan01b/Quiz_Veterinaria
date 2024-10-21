package com.example.BDSpringSD.Controller;

import com.example.BDSpringSD.InterfaceService.IPropietarioService;
import com.example.BDSpringSD.Model.Propietario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping

public class PropietarioController {




        @Autowired
        private IPropietarioService service;


        @GetMapping("/listarPro")
        public String listarPropietario(Model model){

            model.addAttribute("titulo","Spring DB");
            model.addAttribute("cuerpo","LISTA DE PROPIETARIOS");

            model.addAttribute("datos", service.listarPro());
            return "indexDo";
        }

        @GetMapping("/nuevoDo")
        public String formAgregarPropietario(Model model){

            model.addAttribute("titulo", "Nuevo");
            model.addAttribute("cuerpo", "USUARIO NUEVO");

            model.addAttribute("Pro",new Propietario());
            return "nuevo";
        }

        @PostMapping("/guardarPro")
        public String guardarPropietario(@ModelAttribute Propietario Pro){

            service.guardarDo(Pro);

            return "redirect:/listar";
        }


        @GetMapping("/editarPro/{id}")
        public String editarPropietario(@PathVariable("id") int id, Model model){



            model.addAttribute("Pro", service.editarPro(id));

            return "nuevoPro";

        }

        @GetMapping("/eliminarPro/{id}")
        public String eliminarPropietario(@PathVariable("id") int id){

            service.eliminarPro(id);

            return "redirect:/listarPro";

        }














    }


