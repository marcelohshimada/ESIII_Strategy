package controller;

import model.Calculo;

public class ImpostoBeloHorizonte implements ICalculoImposto {

	@Override
	public double calcularImposto(Calculo calculo) {

		double imposto = 0;
		imposto = calculo.getAreaTotal() * 7 + calculo.getQuartos() * 4;
		return imposto;
	}

}
