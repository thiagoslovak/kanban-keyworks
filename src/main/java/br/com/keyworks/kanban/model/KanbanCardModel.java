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

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public void setTipoCard(String tipoCard) {
        this.tipoCard = tipoCard;
    }

    public void setTituloCard(String tituloCard) {
        this.tituloCard = tituloCard;
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void setPrevista(LocalDate prevista) {
        this.prevista = prevista;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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
