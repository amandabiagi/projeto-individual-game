package projetoindividualamanda.game.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetoindividualamanda.game.item.Item;
import projetoindividualamanda.game.item.Pocao;
import projetoindividualamanda.game.personagem.Mago;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/itens")

public class LojaController {
    private List<Item> itens = new ArrayList<>();

    @GetMapping
    public ResponseEntity exibirItens(){
        if(itens.isEmpty()) {
            return ResponseEntity.status(204).build();
        }
        return ResponseEntity.ok(itens);
    }

    @PostMapping("/pocao")
    public ResponseEntity adicionarMago(@RequestBody Pocao pocao) {
        itens.add(pocao);
        return ResponseEntity.status(201).build();
    }

    public List<Item> getItens() {
        return itens;
    }
}
