package projetoindividualamanda.game.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
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
    public ResponseEntity adicionarMago(@RequestBody Heroi heroi){
        personagens.add(heroi);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/lutadores")
    public ResponseEntity adicionarLutador(@RequestBody Lutador lutador){
        personagens.add(lutador);
        return ResponseEntity.status(201).build();
    }

    @PostMapping("/viloes")
    public ResponseEntity adicionarVilao(@RequestBody Vilao vilao){
        personagens.add(vilao);
        return ResponseEntity.status(201).build();
    }
    

    @GetMapping
    public ResponseEntity mostrarTodos(){
        if(personagens.isEmpty()){
            return ResponseEntity.status(201).build();
        }else{
            return ResponseEntity.ok(personagens);
        }
    }
}
