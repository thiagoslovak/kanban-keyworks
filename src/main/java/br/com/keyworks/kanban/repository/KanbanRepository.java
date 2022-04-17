package br.com.keyworks.kanban.repository;

import br.com.keyworks.kanban.model.KanbanCardModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface KanbanRepository extends CrudRepository<KanbanCardModel, Integer> {
}
