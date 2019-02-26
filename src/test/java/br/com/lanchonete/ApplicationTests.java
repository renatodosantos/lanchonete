package br.com.lanchonete;

import br.com.lanchonete.modelo.Ingrediente;
import br.com.lanchonete.modelo.Lanche;
import br.com.lanchonete.repositorio.IngredienteDAO;
import br.com.lanchonete.repositorio.LancheDAO;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static br.com.lanchonete.modelo.Constantes.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	LancheDAO lancheDAO;

	@Autowired
	IngredienteDAO ingredienteDAO;

	@Test
	public void valoresLanches() {

		Ingrediente bacon = ingredienteDAO.getIngredientes(BACON);
		Ingrediente humburger = ingredienteDAO.getIngredientes(HAMBURGUER_DE_CARNE);
		Ingrediente queijo = ingredienteDAO.getIngredientes(QUEIJO);

		Double soma = bacon.getValor() + humburger.getValor() + queijo.getValor();

		Lanche xbacon = lancheDAO.getLanche(X_BACON);
		Assert.assertEquals(soma, xbacon.getValor());
	}

}
