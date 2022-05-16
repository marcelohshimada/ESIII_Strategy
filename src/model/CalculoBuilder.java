package model;

public class CalculoBuilder {
	private Calculo calculo;

	CalculoBuilder() {
		this.calculo = new Calculo();
	}

	public static CalculoBuilder builder() {
		return new CalculoBuilder();
	}

	public CalculoBuilder addParametroSP(double areaTotal, int comodos) {
		calculo.setAreaTotal(areaTotal);
		calculo.setComodos(comodos);
		return this;
	}

	public CalculoBuilder addParametroBH(double areaTotal, int quartos) {
		calculo.setAreaTotal(areaTotal);
		calculo.setQuartos(quartos);
		return this;
	}

	public CalculoBuilder addParametroPA(double areaTotal, double areaGaragem) {
		calculo.setAreaTotal(areaTotal);
		calculo.setAreaGaragem(areaGaragem);
		return this;
	}

	public CalculoBuilder addParametroC(double areaTotal, int idade) {
		calculo.setAreaTotal(areaTotal);
		calculo.setIdade(idade);
		return this;
	}

	public Calculo get() {
		return this.calculo;
	}
}
