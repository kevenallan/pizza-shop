package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;

import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public interface PizzaHotService {

    public List<PizzaHotPizza> getPizzas();

}
