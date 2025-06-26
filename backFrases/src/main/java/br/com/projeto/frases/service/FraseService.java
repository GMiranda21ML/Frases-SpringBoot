package br.com.projeto.frases.service;

import br.com.projeto.frases.dto.FraseDTO;
import br.com.projeto.frases.model.Frase;
import br.com.projeto.frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class FraseService {
    @Autowired
    private FraseRepository fraseRepository;
    private Random random = new Random();

    public FraseDTO buscarFrase() {
        List<Frase> frases = fraseRepository.findAll();
        Long idAleatorio = random.nextLong(frases.size()) + 1;
        Frase frase = fraseRepository.buscarFraseAleatoria(idAleatorio);
        return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
