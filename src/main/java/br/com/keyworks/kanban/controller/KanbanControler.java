package br.com.keyworks.kanban.controller;

import br.com.keyworks.kanban.model.KanbanCardModel;
import br.com.keyworks.kanban.repository.KanbanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class KanbanControler {

    @Autowired
    private KanbanRepository repository;

    @GetMapping("/card/{codigo}")
    public ResponseEntity consultar(@PathVariable("codigo") Integer codigo) {
        return repository.findById(codigo)
                .map(record -> ResponseEntity.ok().body(record))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/card/novoCard")
    public KanbanCardModel salvar(@RequestBody KanbanCardModel card) {
        return repository.save(card);
    }

    @PutMapping(path = "/card/atualizarCard")
    public KanbanCardModel atualizar(@RequestBody KanbanCardModel card) {
        return repository.save(card);
    }

    @DeleteMapping(path = "/card/deletarCard")
    public void delete(@RequestBody KanbanCardModel card) {
        repository.delete(card);
    }
}
