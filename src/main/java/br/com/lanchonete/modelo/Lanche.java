package br.com.lanchonete.modelo;

import java.util.List;

/**
 * Created by rsd on 22/02/19.
 */
public class Lanche {
    private String descricao;
    private List <Ingrediente> ingredientes;

    public Lanche(String descricao, List<Ingrediente> ingredientes) {
        this.descricao = descricao;
        this.ingredientes = ingredientes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return ingredientes.stream().mapToDouble(Ingrediente::getValor).sum();
    }

    public List<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public void addIngrediente(Ingrediente ingrediente) {
        this.ingredientes.add(ingrediente);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lanche lanche = (Lanche) o;

        return descricao != null ? descricao.equals(lanche.descricao) : lanche.descricao == null;
    }

    @Override
    public int hashCode() {
        return descricao != null ? descricao.hashCode() : 0;
    }
}
