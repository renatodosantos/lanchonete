package br.com.lanchonete.repositorio;

import br.com.lanchonete.modelo.Dados;
import br.com.lanchonete.modelo.Ingrediente;
import org.springframework.stereotype.Repository;

import java.util.Set;

/**
 * Created by rsd on 22/02/19.
 */
@Repository
public class IngredienteDAO {


    public Set<Ingrediente> getIngredientes() {
        return Dados.ingredientes;
    }

    public Ingrediente getIngredientes(String descricao) {
        return getIngredientes()
                .stream()
                .filter(u -> descricao.equals(u.getDescricao()))
                .findAny()
                .orElse(new Ingrediente("", 0.0));
    }

    public void insere(Ingrediente ingrediente) {
        getIngredientes().add(ingrediente);
    }

}
