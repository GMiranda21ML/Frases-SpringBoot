package br.com.projeto.frases.repository;

import br.com.projeto.frases.model.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface FraseRepository extends JpaRepository<Frase, Long> {
    @Query("SELECT f FROM Frase f WHERE f.id = :idAleatorio")
    Frase buscarFraseAleatoria(Long idAleatorio);
}
