package br.com.lanchonete.servico.promocao;

import br.com.lanchonete.modelo.Lanche;

/**
 * Created by rsd on 26/02/19.
 */
public class ExecutaRegrasPromocao {
    private Lanche lanche;

    public ExecutaRegrasPromocao(Lanche lanche) {
        this.lanche = lanche;
    }

    public Double getPreco() {

        IPromacaoHandler light = new Light();
        light.next(new MuitaCarne()).next(new MuitoQueijo()).next(new SemPromocao());

        return light.handle(lanche);
    }
}
