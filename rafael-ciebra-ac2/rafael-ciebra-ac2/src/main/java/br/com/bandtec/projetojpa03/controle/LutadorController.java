package br.com.bandtec.projetojpa03.controle;

import br.com.bandtec.projetojpa03.dominio.Lutador;
import br.com.bandtec.projetojpa03.repositorio.LutadorRepository;
import net.bytebuddy.dynamic.DynamicType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/lutadores")
public class LutadorController {

    Lutador l = new Lutador();

    @Autowired
    private LutadorRepository repository;

    @GetMapping
    public ResponseEntity getLutadores() {
        return ResponseEntity.status(200).body(repository.findAll());
    }

    @PostMapping
    public ResponseEntity postLutadores(@RequestBody @Valid Lutador novoLutador) {
        repository.save(novoLutador);
        return ResponseEntity.status(201).build();
    }

    @GetMapping("/contagem-vivos")
    public ResponseEntity getContagemVivos(){

        Optional<Lutador> lutadorOptional =repository.findAll(l.getVivo())
    }

    @PostMapping("/id/concentrar")
    public ResponseEntity postConcentrar(@PathVariable @Valid  Integer id, @PathVariable @Valid Integer concentrar) {
        Optional<Lutador> lutadorOptional =repository.findById(id);

        if(lutadorOptional.isPresent() && ){

        }
        return ResponseEntity.status(201).build();
    }
}
