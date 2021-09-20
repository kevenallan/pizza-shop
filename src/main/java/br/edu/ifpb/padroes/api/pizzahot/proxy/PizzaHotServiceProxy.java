package br.edu.ifpb.padroes.api.pizzahot.proxy;

import br.edu.ifpb.padroes.api.pizzahot.PizzaHotPizza;
import br.edu.ifpb.padroes.api.pizzahot.PizzaHotServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class PizzaHotServiceProxy implements PizzaHotService {
    
	private PizzaHotService pizzaHotService;
	
	private List<PizzaHotPizza> cacheList;
	
	public PizzaHotServiceProxy() {
		pizzaHotService = new PizzaHotServiceImpl();
		cacheList = new ArrayList<>();
	}
	
	@Override
    public List<PizzaHotPizza> getPizzas() {
		List<PizzaHotPizza> list;
		if (cacheList.isEmpty()) {
			list = pizzaHotService.getPizzas();
			cacheList = list;
		}else {
			System.out.println("Retornando lista de pizza armazenadas em cache...");
			list = cacheList;
		}
		return list;
	}
}