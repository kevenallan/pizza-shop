package br.edu.ifpb.padroes.api.damenos.proxy;

import br.edu.ifpb.padroes.api.damenos.DamenosPizza;
import br.edu.ifpb.padroes.api.damenos.DamenosServiceImpl;

import java.util.ArrayList;
import java.util.List;

// TODO - implementar proxy de cache para evitar leitura do json a cada chamada do método
public class DamenosServiceProxy implements DamenosService {
    
	private DamenosService damenosService;
	
	private List<DamenosPizza> cacheList;
	
	public DamenosServiceProxy() {
		damenosService = new DamenosServiceImpl();
		cacheList = new ArrayList<>();
	}
	
	@Override
    public List<DamenosPizza> getPizzas() {
		List<DamenosPizza> list;
		if (cacheList.isEmpty()) {
			 list = damenosService.getPizzas();
			 cacheList = list;
		}else {
			System.out.println("Retornando lista de pizza armazenadas em cache...");
			list = cacheList;
		}
		return list;
    }
}
