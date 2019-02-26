package br.com.lanchonete.servico;

import br.com.lanchonete.modelo.Lanche;
import br.com.lanchonete.servico.promocao.ExecutaRegrasPromocao;
import org.springframework.stereotype.Component;

/**
 * Created by rsd on 26/02/19.
 */
@Component
public class CalculaPrecoService {
    public Double getValor(Lanche lanche) {
        return new ExecutaRegrasPromocao(lanche).getPreco();
    }
}
