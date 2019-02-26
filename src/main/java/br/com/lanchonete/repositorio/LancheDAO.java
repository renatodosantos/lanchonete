package br.com.lanchonete.repositorio;

import br.com.lanchonete.modelo.Dados;
import br.com.lanchonete.modelo.Lanche;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.Set;

/**
 * Created by renatosantos on 23/02/19.
 */
@Repository
public class LancheDAO {

    public Set<Lanche> getLanches() {
        return Dados.lanches;
    }

    public Lanche getLanche(String descricao) {
        return getLanches()
                .stream()
                .filter(u -> descricao.equals(u.getDescricao()))
                .findAny()
                .orElse(new Lanche("", Collections.emptyList()));
    }

}
