package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.ContaCorrente;

public class TestaArrays {

	public static void main(String[] args) {
		double saldo = 0;
		double media = 0;
		
		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
		Conta conta = new ContaCorrente();
		conta.deposita(i * 100.0);
		contas[i] = conta;
		}
		
		for (int i = 0; i < contas.length; i++) {
			saldo += contas[i].getSaldo();
		}
		media = saldo / contas.length;
		System.out.println(media);

	}

}
