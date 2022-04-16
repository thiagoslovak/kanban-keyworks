package br.com.keyworks.kanban.model;

import javax.persistence.*;
import java.time.LocalDate;


@Entity(name = "kanban")
public class KanbanCardModel {

    @Id
    Integer codigo;

    @Column(nullable = false)
    String tipoCard;

    @Column(nullable = false, length = 50)
    String tituloCard;

    @Column(nullable = false, length = 50)
    String projeto;

    @Column(nullable = false)
    LocalDate prevista;

    @Column(length = 250)
    String descricao;

    @Column(nullable = false, length = 50)
    String equipe;

    @Column(nullable = false, length = 50)
    String status;

    public int getCodigo() {
        return codigo;
    }

    public String getTipoCard() {
        return tipoCard;
    }

    public String getTituloCard() {
        return tituloCard;
    }

    public String getProjeto() {
        return projeto;
    }

    public LocalDate getPrevista() {
        return prevista;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getEquipe() {
        return equipe;
    }

    public String getStatus() {
        return status;
    }
}
