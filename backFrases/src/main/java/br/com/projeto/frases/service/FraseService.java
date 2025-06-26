package br.com.projeto.frases.service;

import br.com.projeto.frases.dto.FraseDTO;
import br.com.projeto.frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FraseService {
    @Autowired
    private FraseRepository fraseRepository;

    public List<FraseDTO> buscarFrases() {
        return fraseRepository.findAll().stream()
                .map(f -> new FraseDTO(f.getTitulo(),
                        f.getFrase(),
                        f.getPersonagem(),
                        f.getPoster()))
                .collect(Collectors.toList());
    }
}
