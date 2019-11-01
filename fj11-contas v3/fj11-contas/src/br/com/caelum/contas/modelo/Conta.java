package br.com.caelum.contas.modelo;

import java.time.LocalDate;

public abstract class Conta implements Comparable<Conta>{
	private String titular; 
	private int numero;
	private String agencia;
	private double saldo;
	private LocalDate dataDeAbertura;
	private double rendimento;
	private int id = 0;
	static private int contador = 0;

	public Conta() {
		this.setId();
	}

	public Conta(String titular) {
		this.setTitular(titular);
		this.setId();
	}

	private void setId() {
		incrementaContador();
		this.id = getContador();
	}

	static private void incrementaContador() {
		contador++;
	}

	public int getId() {
		return this.id;
	}

	static public int getContador() {
		return contador;
	}

	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar" +
												" um valor negativo");
		} else if (this.saldo < valor) {
			System.out.println("Saldo Insuficiente");
		} else {
			this.saldo -= valor;
		}

	}

	public void deposita(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou depositar" +
												" um valor negativo");
		} else {
			this.saldo += valor;
		}
	}

	public double calculaRendimento() {
		return this.rendimento;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "ID: " + this.getId();
		dados += "\nTipo: " + this.getTipo();
		dados += "\nTitular: " + this.getTitular();
		dados += "\nNúmero: " + this.getNumero();
		dados += "\nAgência: " + this.getAgencia();
		dados += "\nSaldo: " + this.getSaldo();
		dados += "\nData de Abertura: " + this.getDataDeAbertura();
		return dados;
	}

	public String getTitular() {
		return this.titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public LocalDate getDataDeAbertura() {
		return this.dataDeAbertura;
	}

	public void setDataDeAbertura(LocalDate localDate) {
		this.dataDeAbertura = localDate;
	}

	public abstract String getTipo();

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	@Override
	public String toString() {
		return "[titular=" + titular + ", numero=" + numero + ", agencia=" + agencia + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Conta outraConta = (Conta) obj;

		return this.numero == outraConta.numero && this.agencia.equals(outraConta.agencia);
	}
	
	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}

}
