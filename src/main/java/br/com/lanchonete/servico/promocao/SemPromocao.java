package br.com.lanchonete.servico.promocao;

import br.com.lanchonete.modelo.Lanche;

/**
 * Created by rsd on 26/02/19.
 */
public class SemPromocao implements IPromacaoHandler {
    @Override
    public Double handle(Lanche lanche) {
        return lanche.getValor();
    }

    @Override
    public IPromacaoHandler next(IPromacaoHandler pHandler) {
        return null;
    }
}
