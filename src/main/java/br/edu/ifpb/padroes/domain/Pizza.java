package br.edu.ifpb.padroes.domain;

import br.edu.ifpb.padroes.domain.decorator.Extras;

public interface Pizza extends Extras{
	
    public Float getPrice();
    public String getName();

}
