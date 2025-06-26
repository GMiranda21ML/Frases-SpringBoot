package br.com.projeto.frases.repository;

import br.com.projeto.frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FraseRepository extends JpaRepository<Frase, Long> {
}
