package br.com.lanchonete.modelo;

/**
 * Created by rsd on 22/02/19.
 */
public class Ingrediente {

    private String descricao;
    private Double valor;

    public Ingrediente(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Ingrediente that = (Ingrediente) o;

        return descricao != null ? descricao.equals(that.descricao) : that.descricao == null;
    }

    @Override
    public int hashCode() {
        return descricao != null ? descricao.hashCode() : 0;
    }
}
