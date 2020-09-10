package projetoindividualamanda.game.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoindividualamanda.game.item.Item;
import projetoindividualamanda.game.personagem.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/personagens")
public class PersonagemController {

    private List<Personagem> personagens = new ArrayList<>();
    LojaController lojaController = new LojaController();

    @PostMapping("/magos")
    public ResponseEntity adicionarMago(@RequestBody Mago mago) {
        personagens.add(mago);
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
//    @PutMapping("/{nome}/{idItem}")
//    public ResponseEntity alterarVilao(@@PathVariable String nome, @PathVariable Integer idItem) {
//        for (Vilao vilao : personagens) {
//            if (vilao.getNome().equals(nome)) {
//                vilao.setItemDrop(lojaController.getItens().get(idItem - 1));
//                return ResponseEntity.status(201).build();
//            }
//        }
//        return ResponseEntity.status(404).build();
//    }

    @GetMapping
    public ResponseEntity mostrarTodos() {
        if (personagens.isEmpty()) {
            return ResponseEntity.status(201).build();
        } else {
            return ResponseEntity.ok(personagens);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deletarPersonagem(@PathVariable Integer id) {
        if (personagens.size() >= id) {
            personagens.remove(id - 1);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.status(404).build();
    }

}