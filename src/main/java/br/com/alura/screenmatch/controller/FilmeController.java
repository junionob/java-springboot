package br.com.alura.screenmatch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.processing.Generated;

@Controller
@RequestMapping("/filmes")
public class FilmeController {


    @GetMapping
    public String carregaPaginaFormulario(){
        return "filmes/formulario";
    }
}
