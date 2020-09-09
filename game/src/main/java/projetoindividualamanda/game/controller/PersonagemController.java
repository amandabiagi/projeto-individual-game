package projetoindividualamanda.game.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoindividualamanda.game.item.Item;
import projetoindividualamanda.game.personagem.Heroi;
import projetoindividualamanda.game.personagem.Lutador;
import projetoindividualamanda.game.personagem.Personagem;
import projetoindividualamanda.game.personagem.Vilao;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    private List<Personagem> personagens = new ArrayList<>();

    @PostMapping("/magos")
    public ResponseEntity adicionarMago(@RequestBody Heroi heroi) {
        personagens.add(heroi);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/lutadores")
    public ResponseEntity adicionarLutador(@RequestBody Lutador lutador) {
        personagens.add(lutador);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/viloes")
    public ResponseEntity adicionarVilao(@RequestBody Vilao vilao) {
        personagens.add(vilao);
        return ResponseEntity.status(201).build();
    }


    @GetMapping
    public ResponseEntity mostrarTodos() {
        if (personagens.isEmpty()) {
            return ResponseEntity.status(201).build();
        } else {
            return ResponseEntity.ok(personagens);
        }
    }

    @DeleteMapping("{id}")
    public ResponseEntity deletarPersonagem(@PathVariable Integer id) {
        if (personagens.size() >= id) {
            personagens.remove(id - 1);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(404).build();
        }
    }

    @PutMapping("{id}")
    public ResponseEntity adicionarItemBag(@PathVariable Integer id, @RequestBody Personagem personagem) {
        personagens.remove(id - 1);
        personagens.add(id - 1, personagem);
        return ResponseEntity.ok().build();
    }

}