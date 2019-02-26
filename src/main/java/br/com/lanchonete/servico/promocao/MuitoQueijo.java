package br.com.lanchonete.servico.promocao;

import br.com.lanchonete.modelo.Ingrediente;
import br.com.lanchonete.modelo.Lanche;
import br.com.lanchonete.repositorio.IngredienteDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static br.com.lanchonete.modelo.Constantes.QUEIJO;

/**
 * Created by rsd on 26/02/19.
 */
public class MuitoQueijo implements IPromacaoHandler {
    @Autowired
    private IngredienteDAO ingredienteDAO;

    private IPromacaoHandler next;

    @Override
    public Double handle(Lanche lanche) {
        List<Ingrediente> ingredientes = lanche.getIngredientes();
        int qdtQueijo = getQuantidadeQueijo(ingredientes);
        if(qdtQueijo > 0) {
            return lanche.getValor() - (qdtQueijo * ingredienteDAO.getIngredientes(QUEIJO).getValor()) ;
        }
        return next.handle(lanche);
    }

    private int getQuantidadeQueijo(List<Ingrediente> ingredientes) {

        long numeroQueijo = ingredientes.stream().filter(u -> QUEIJO.equals(u.getDescricao())).count();
        return (int) numeroQueijo/3;
    }

    @Override
    public IPromacaoHandler next(IPromacaoHandler pHandler) {
        next = pHandler;
        return next;
    }
}
