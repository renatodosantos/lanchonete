package br.com.lanchonete.servico.promocao;

import br.com.lanchonete.modelo.Lanche;

/**
 * Created by rsd on 26/02/19.
 */
public interface IPromacaoHandler {
    public Double handle(final Lanche lanche) ;
    public IPromacaoHandler next(IPromacaoHandler pHandler);
}
