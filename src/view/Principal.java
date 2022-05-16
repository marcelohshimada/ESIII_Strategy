package view;

import controller.ICalculoImposto;
import controller.ImpostoBeloHorizonte;
import controller.ImpostoCuritiba;
import controller.ImpostoPortoAlegre;
import controller.ImpostoSaoPaulo;
import model.Calculo;
import model.CalculoBuilder;

public class Principal {

	public static void main(String[] args) {

		ICalculoImposto calc;

		calc = new ImpostoSaoPaulo();
		calc = new ImpostoBeloHorizonte();
		calc = new ImpostoPortoAlegre();
		calc = new ImpostoCuritiba();

		Calculo saoPaulo = CalculoBuilder.builder().addParametroSP(30, 4).get();
		Calculo beloHorizonte = CalculoBuilder.builder().addParametroBH(50, 3).get();
		Calculo portoAlegre = CalculoBuilder.builder().addParametroPA(40, 10).get();
		Calculo curitiba = CalculoBuilder.builder().addParametroC(45, 15).get();

		System.out.println(calc.calcularImposto(saoPaulo));
		System.out.println(calc.calcularImposto(beloHorizonte));
		System.out.println(calc.calcularImposto(portoAlegre));
		System.out.println(calc.calcularImposto(curitiba));

	}
}
