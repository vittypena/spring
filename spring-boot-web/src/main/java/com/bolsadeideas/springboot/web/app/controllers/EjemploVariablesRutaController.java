package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/variables")
public class EjemploVariablesRutaController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo", "Enviar parámetros a la ruta(@PathVariable)");
		return "variables/index";
	}
	
	@GetMapping("/string/{parametroAenviar}")
	public String variables(@PathVariable String parametroAenviar, Model model) {
		model.addAttribute("titulo", "Recibir parámetros de la ruta(@PathVariable)");
		model.addAttribute("resultado", "El texto enviado en la ruta es " + parametroAenviar);
		return "variables/ver";
	}
	
	@GetMapping("/string/{parametroAenviar}/{numero}")
	public String variables(@PathVariable String parametroAenviar,@PathVariable Integer numero, Model model) {
		model.addAttribute("titulo", "Recibir parámetros de la ruta(@PathVariable)");
		model.addAttribute("resultado", "El texto enviado en la ruta es " + parametroAenviar + " este numero: " + numero);
		return "variables/ver";
	}
}
