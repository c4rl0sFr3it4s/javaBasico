package br.com.carlosFreitas.finalConstantes042;

public class Professor {
	private double salario;
	private String nomeCurso;
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public double calcularSalarioLiquido() {
		return 0;
	}
	
//	polimorfismo em real time
	public String obterEtiquetaEndereco() {
		String s = "Endere�o Professor, ";
		return s;
	}
// polimorfismo em real time	
	public void imprimirEtiquetaEndereco() {
		System.out.println("Obtendo endere�o Professor. ");
		System.out.println(this.obterEtiquetaEndereco());
	}
}
