package br.com.cassioliveira.controledeponto.service;

import br.com.cassioliveira.controledeponto.model.JornadaTrabalho;
import br.com.cassioliveira.controledeponto.repository.JornadaTrabalhoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaTrabalhoService {

    private JornadaTrabalhoRepository jornadaTrabalhoRepository;

    public JornadaTrabalhoService(JornadaTrabalhoRepository jornadaTrabalhoRepository) {
        this.jornadaTrabalhoRepository = jornadaTrabalhoRepository;
    }

    public JornadaTrabalho criarJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }
    public JornadaTrabalho atualizarJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoRepository.save(jornadaTrabalho);
    }

    public void excluirJornada(Long id){
        jornadaTrabalhoRepository.deleteById(id);
    }


    public List<JornadaTrabalho> jornadas() {
        return jornadaTrabalhoRepository.findAll();
    }

    public Optional<JornadaTrabalho> jornadaPorId(Long id) {
        return jornadaTrabalhoRepository.findById(id);
    }
}
