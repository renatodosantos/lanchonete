package br.com.lanchonete.modelo;

import java.util.Set;
import java.util.stream.Stream;

import static br.com.lanchonete.modelo.Constantes.*;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.toSet;
import static br.com.lanchonete.modelo.Constantes.ALFACE;

/**
 * Created by rsd on 26/02/19.
 */
public class Dados {

    public static Set<Ingrediente> ingredientes = Stream.of(
            new Ingrediente(ALFACE, new Double(0.40)),
            new Ingrediente(BACON, new Double(2.00)),
            new Ingrediente(HAMBURGUER_DE_CARNE, new Double(3.00)),
            new Ingrediente(OVO, new Double(0.80)),
            new Ingrediente(QUEIJO, new Double(1.50))).collect(toSet());

    public static Set<Lanche> lanches = Stream.of(
            new Lanche(X_BACON,asList(getIngredientes(BACON), getIngredientes(HAMBURGUER_DE_CARNE), getIngredientes(QUEIJO))),
            new Lanche(X_BURGER, asList(getIngredientes(HAMBURGUER_DE_CARNE),getIngredientes(QUEIJO))),
            new Lanche(X_EGG, asList(getIngredientes(HAMBURGUER_DE_CARNE), getIngredientes(OVO),getIngredientes(QUEIJO))),
            new Lanche(X_EGG_BACON, asList(getIngredientes(HAMBURGUER_DE_CARNE),getIngredientes(OVO),getIngredientes(QUEIJO),getIngredientes(BACON)))
            ).collect(toSet());

    private static Ingrediente getIngredientes(String descricao) {
        return ingredientes
                .stream()
                .filter(u -> descricao.equals(u.getDescricao()))
                .findAny()
                .orElse(new Ingrediente("", 0.0));
    }

}
