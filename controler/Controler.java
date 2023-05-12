package com.example.CrudSpringBoot.controler;


import com.example.CrudSpringBoot.interfaceService.IPersonaService;
import com.example.CrudSpringBoot.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;
import java.util.HashMap;
import java.util.List;


@Controller
public class Controler {


    @Autowired
    private IPersonaService service;

    public Controler (IPersonaService service) {
        this.service = service;
    }

    @GetMapping("/listar")
    public String listar(Model model) {
        List<Persona>personas=service.listar();
        model.addAttribute("personas",personas);
        return "index";
    }

    @GetMapping("/new")
    public String agregar(Model model) {
        model.addAttribute("Persona",new Persona());
        return "form";
    }

    @GetMapping("/editar/id")
    public String editar(@PathVariable int id,Model model) {
        Optional<Persona> persona = service.listarId(id);
        model.addAttribute("persona", persona);
         return "form";
    }
 @PostMapping("/save")
 public String save(@Validated Persona p,Model model) {
        service.save(p);
        return "redirect:/listar";
 }
    public static class RegistroHorasEmpleado<Empleado> {
        private final Map<String, Empleado> empleados;

        public RegistroHorasEmpleado() {
            empleados = new HashMap<>();
        }


        public void registrarLlegada(String nombre) {
            Empleado empleado;
            empleado = empleados.get(nombre);
            if (empleado != null) {
                empleado.getClass();
            }
        }

        public <empleado> void registrarSalida(String nombre) {
            empleado empleado = (empleado) empleados.get(nombre);
            if (empleado != null) {
                empleado.toString();
            }
        }

        public Class<?> obtenerLlegadas(String nombre) {
            Empleado empleado = empleados.get(nombre);
            if (empleado != null) {
                return empleado.getClass();
            }
            return null;
        }

        public <empleado> Class<?> obtenerSalidas(String nombre) {
            empleado empleado = (empleado) empleados.get(nombre);
            if (empleado != null) {
                return empleado.getClass();
            }
            return null;
        }
    }
}
