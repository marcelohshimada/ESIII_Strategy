package controller;

import model.Calculo;

public class ImpostoSaoPaulo implements ICalculoImposto {

	@Override
	public double calcularImposto(Calculo calculo) {

		double imposto = 0;
		imposto = calculo.getAreaTotal() * 10 + calculo.getComodos() * 2;
		return imposto;
	}

}
