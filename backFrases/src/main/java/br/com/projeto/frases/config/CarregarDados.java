package br.com.projeto.frases.config;

import br.com.projeto.frases.model.Frase;
import br.com.projeto.frases.repository.FraseRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CarregarDados implements CommandLineRunner {
    private FraseRepository fraseRepository;

    public CarregarDados(FraseRepository fraseRepository) {
        this.fraseRepository = fraseRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        if (fraseRepository.count() == 0) {
            fraseRepository.save(new Frase("Amigos não mentem", "Eleven", "Stranger things", "https://m.media-amazon.com/images/M/MV5BMDZkYmVhNjMtNWU4MC00MDQxLWE3MjYtZGMzZWI1ZjhlOWJmXkEyXkFqcGdeQXVyMTkxNjUyNQ@@._V1_SX300.jpg"));
            fraseRepository.save(new Frase("Bem-vinda ao mundo real. É uma droga. Você vai amar", "Monica", "Friends", "https://m.media-amazon.com/images/M/MV5BNDVkYjU0MzctMWRmZi00NTkxLTgwZWEtOWVhYjZlYjllYmU4XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg"));
            fraseRepository.save(new Frase("Não é uma mentira se você acreditar nela", "George Contanza", "Seinfeld", "https://m.media-amazon.com/images/M/MV5BZjZjMzQ2ZmUtZWEyZC00NWJiLWFjM2UtMzhmYzZmZDcxMzllXkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg"));
            fraseRepository.save(new Frase("Somos apenas pessoas. Nós erramos, perdemos o rumo. Até os melhores têm os seus dias ruins. Mesmo assim seguimos em frente", "Meredith Grey", "Grey's Anatomy", "https://m.media-amazon.com/images/M/MV5BODA2Mjk0N2MtNGY0Mi00ZWFjLTkxODEtZDFjNDg4ZDliMGVmXkEyXkFqcGdeQXVyMzAzNTY3MDM@._V1_SX300.jpg"));
            fraseRepository.save(new Frase("Eu não estou em perigo, eu sou o perigo", "Walter White", "Breaking Bad", "https://m.media-amazon.com/images/M/MV5BYTU3NWI5OGMtZmZhNy00MjVmLTk1YzAtZjA3ZDA3NzcyNDUxXkEyXkFqcGdeQXVyODY5Njk4Njc@._V1_SX300.jpg"));
            fraseRepository.save(new Frase("Não importa o que você faça na vida. Não vai ser lendário, a menos que os seus amigos estejam lá para ver", "Barney", "How I met your Mother", "https://m.media-amazon.com/images/M/MV5BNjg1MDQ5MjQ2N15BMl5BanBnXkFtZTYwNjI5NjA3._V1_SX300.jpg"));
            fraseRepository.save(new Frase("Não importa o quanto você bate, mas sim o quanto aguenta apanhar e continuar. O quanto pode suportar e seguir em frente. É assim que se ganha.", "Rocky Balboa", "Rocky", "https://m.media-amazon.com/images/M/MV5BNWIyNmQyNjctYmVmMS00MGI4LWIxMmUtNjA0ODYzOTA0Yjk0L2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg"));
            fraseRepository.save(new Frase("Que a força esteja com você!", "Obi Wan Kenobi", "Star Wars", "https://m.media-amazon.com/images/M/MV5BOTA5NjhiOTAtZWM0ZC00MWNhLThiMzEtZDFkOTk2OTU1ZDJkXkEyXkFqcGdeQXVyMTA4NDI1NTQx._V1_SX300.jpg"));
            fraseRepository.save(new Frase("Você me salvou de todas as maneiras que alguém pode ser salvo.", "Rose Dawson", "Titanic", "https://m.media-amazon.com/images/M/MV5BMDdmZGU3NDQtY2E5My00ZTliLWIzOTUtMTY4ZGI1YjdiNjk3XkEyXkFqcGdeQXVyNTA4NzY1MzY@._V1_SX300.jpg"));
            fraseRepository.save(new Frase("Você me deu uma eternidade dentro dos nossos dias numerados, e sou muito grata por isso.", "Hazel", "A culpa é das estrelas", "https://m.media-amazon.com/images/M/MV5BNTVkMTFiZWItOTFkOC00YTc3LWFhYzQtZTg3NzAxZjJlNTAyXkEyXkFqcGdeQXVyODE5NzE3OTE@._V1_SX300.jpg"));
        }
    }
}
