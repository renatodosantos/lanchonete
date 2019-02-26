package br.com.lanchonete.servico.promocao;

import br.com.lanchonete.modelo.Ingrediente;
import br.com.lanchonete.modelo.Lanche;

import java.util.List;

import static br.com.lanchonete.modelo.Constantes.ALFACE;
import static br.com.lanchonete.modelo.Constantes.BACON;

/**
 * Created by rsd on 26/02/19.
 */
public class Light  implements IPromacaoHandler {


    private IPromacaoHandler next;

    @Override
    public Double handle(Lanche lanche) {
        List<Ingrediente> ingredientes = lanche.getIngredientes();
        if(contains(ingredientes, ALFACE) && !contains(ingredientes, BACON)) {
            return lanche.getValor() * 0.9;
        }
        return next.handle(lanche);
    }

    private boolean contains(final List<Ingrediente> list, final String name){
        return list.stream().filter(u -> u.getDescricao().equals(name)).findFirst().isPresent();
    }

    @Override
    public IPromacaoHandler next(IPromacaoHandler pHandler) {
        next = pHandler;
        return next;
    }
}
