package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	public String getTipo() {
		return "Conta Corrente";
	}

	@Override
	public void saca(double valor) {
		double valorSaque = 0;
		valorSaque = (valor + 0.10);
		if (valor < 0) {
			throw new IllegalArgumentException("Você tentou sacar um valor negativo");
		}
		if (this.getSaldo() < valor) {
			throw new SaldoInsuficienteException(valor);
		}
		super.saca(valorSaque);
	}

	@Override
	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

}
