package br.com.cassioliveira.controledeponto.controller;

import br.com.cassioliveira.controledeponto.model.JornadaTrabalho;
import br.com.cassioliveira.controledeponto.service.JornadaTrabalhoService;
import javassist.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/jornadas")
public class JornadaTrabalhoController {

    private JornadaTrabalhoService jornadaTrabalhoService;

    public JornadaTrabalhoController(JornadaTrabalhoService jornadaTrabalhoService) {
        this.jornadaTrabalhoService = jornadaTrabalhoService;
    }

    @PostMapping
    public JornadaTrabalho criarJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.criarJornada(jornadaTrabalho);
    }

    @GetMapping
    public List<JornadaTrabalho> jornadas(){
        return jornadaTrabalhoService.jornadas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<JornadaTrabalho> jornadaPorId(@PathVariable Long id) throws Exception {
        return ResponseEntity.ok(jornadaTrabalhoService.jornadaPorId(id).orElseThrow(() -> new NotFoundException("Jornada não encontrada")));
    }

    @PutMapping
    public JornadaTrabalho atualizarJornada(@RequestBody JornadaTrabalho jornadaTrabalho){
        return jornadaTrabalhoService.atualizarJornada(jornadaTrabalho);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void excluirPorId(@PathVariable Long id) throws Exception {
        jornadaTrabalhoService.excluirJornada(id);
    }

}
