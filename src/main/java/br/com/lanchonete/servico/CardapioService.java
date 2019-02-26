package br.com.lanchonete.servico;

import br.com.lanchonete.modelo.Lanche;
import br.com.lanchonete.repositorio.LancheDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by rsd on 26/02/19.
 */
@Component
public class CardapioService {

    @Autowired
    private LancheDAO lancheDAO;

    public Set<Lanche> getLanches() {
        return lancheDAO.getLanches();
    }
}
