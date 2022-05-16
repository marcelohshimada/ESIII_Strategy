package model;

public class Calculo {

	private double areaTotal;
	private double areaGaragem;
	private int comodos;
	private int quartos;
	private int idade;

	private double imposto;

	public double getAreaTotal() {
		return areaTotal;
	}

	public void setAreaTotal(double areaTotal) {
		this.areaTotal = areaTotal;
	}

	public double getAreaGaragem() {
		return areaGaragem;
	}

	public void setAreaGaragem(double areaGaragem) {
		this.areaGaragem = areaGaragem;
	}

	public int getComodos() {
		return comodos;
	}

	public void setComodos(int comodos) {
		this.comodos = comodos;
	}

	public int getQuartos() {
		return quartos;
	}

	public void setQuartos(int quartos) {
		this.quartos = quartos;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "Calculo [areaTotal=" + areaTotal + ", areaGaragem=" + areaGaragem + ", comodos=" + comodos
				+ ", quartos=" + quartos + ", idade=" + idade + ", imposto=" + imposto + "]";
	}

}
