package com.uca.capas.ActividadLabo3.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.uca.capas.ActividadLabo3.domain.Estudiante;

@Controller
public class MainController {
	private List<Estudiante> estudiantes = new ArrayList<Estudiante>();
	@GetMapping(path = "/ejemplo1", produces= MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String ejemplo1() {
		return "Bienvenidos\nProgramacion N-capas";
	}
	
	@GetMapping("/ejemplo2")
	@ResponseBody
	public List<Estudiante> ejemplo2(){
		return Arrays.asList(
				(new Estudiante("Nombre1","Apellido1","10/10/10","informatica",true)),
				(new Estudiante("Nombre2","Apellido2","10/10/11","informatica",true)),
				(new Estudiante("Nombre3","Apellido3","10/10/12","informatica",false))
				);
	}
	
	@GetMapping("/inicio")
	public String inicio(Estudiante estudiante) {
		return "index";
	}
	
	@PostMapping("/formData")
	public ModelAndView procesar(Estudiante estudiante) {
		estudiantes.add(estudiante);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		mav.addObject("estudiante",new Estudiante());
		
		return mav;
	}
	
	@GetMapping("/listado")
	public ModelAndView listado() {
		ModelAndView mav=new ModelAndView();
		mav.setViewName("listado");
		mav.addObject("listaDestudiante",this.estudiantes);
		
		return mav;
	}
}
