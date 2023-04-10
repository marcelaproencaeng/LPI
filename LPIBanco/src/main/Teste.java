package main;

import abstracao.ContaBancaria;
import abstracao.TipoConta;

public class Teste {
	public static void main(String[] args) {
		ContaBancaria c1 = new ContaBancaria("0444", TipoConta.CONTA_CORRENTE_CLIENTE_ESPECIAL, "João dos Anjos",
				"000873952312-2", "042", 1000.0);
		c1.depositar(100);
		c1.sacar(50);
		c1.getSaldo();

		ContaBancaria c2 = new ContaBancaria("0424", TipoConta.CONTA_SALARIO, "Paula Fonseca", "000775952334-2", "041", 200.0);
		c2.depositar(566);
		c2.sacar(50);
		c2.getSaldo();

		ContaBancaria c3 = new ContaBancaria("0444", TipoConta.CONTA_POUPANCA, "Juliano Machado", "000552247812-5",
				"043",300);
		c3.depositar(200);
		c2.sacar(40);
		c3.getSaldo();
	}
}
