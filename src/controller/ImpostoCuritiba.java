package controller;

import model.Calculo;

public class ImpostoCuritiba implements ICalculoImposto {

	@Override
	public double calcularImposto(Calculo calculo) {

		double imposto = 0;
		imposto = calculo.getAreaTotal() * 5;
		return imposto;
	}

}
