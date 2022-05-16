package controller;

import model.Calculo;

public class ImpostoPortoAlegre implements ICalculoImposto {

	@Override
	public double calcularImposto(Calculo calculo) {

		double imposto = 0;
		imposto = calculo.getAreaTotal() * 7.5 + calculo.getAreaGaragem() * 2.5;
		return imposto;
	}

}
