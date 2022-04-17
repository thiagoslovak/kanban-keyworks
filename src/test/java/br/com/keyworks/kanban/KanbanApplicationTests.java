package br.com.keyworks.kanban;

import br.com.keyworks.kanban.model.KanbanCardModel;
import br.com.keyworks.kanban.repository.KanbanRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;

@SpringBootTest
class KanbanApplicationTests {

	@Autowired
	private KanbanRepository repository;

	@Test
	void testeMethodPost() {
		KanbanCardModel kanbanCardModel = new KanbanCardModel();
		kanbanCardModel.setCodigo(1);
		kanbanCardModel.setDescricao("Descricao Teste");
		kanbanCardModel.setEquipe("Equipe Teste");
		kanbanCardModel.setPrevista(LocalDate.now());
		kanbanCardModel.setProjeto("Projeto Teste");
		kanbanCardModel.setStatus("Status teste");
		kanbanCardModel.setTipoCard("Tipo Card teste");
		kanbanCardModel.setTituloCard("Titulo Card Teste");

		repository.save(kanbanCardModel);
	}

	@Test
	void testeMethodDelete() {
		KanbanCardModel kanbanCardModel = new KanbanCardModel();
		kanbanCardModel.setCodigo(1);
		kanbanCardModel.setDescricao("Descricao Teste");
		kanbanCardModel.setEquipe("Equipe Teste");
		kanbanCardModel.setPrevista(LocalDate.now());
		kanbanCardModel.setProjeto("Projeto Teste");
		kanbanCardModel.setStatus("Status teste");
		kanbanCardModel.setTipoCard("Tipo Card teste");
		kanbanCardModel.setTituloCard("Titulo Card Teste");

		repository.delete(kanbanCardModel);
	}
}
