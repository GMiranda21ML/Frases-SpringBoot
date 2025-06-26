package br.com.projeto.frases.controller;

import br.com.projeto.frases.model.Frase;
import br.com.projeto.frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class FraseController {
    @Autowired
    private FraseRepository fraseRepository;

    @GetMapping("/frases")
    public List<Frase> teste() {
        return fraseRepository.findAll();
    }
}
