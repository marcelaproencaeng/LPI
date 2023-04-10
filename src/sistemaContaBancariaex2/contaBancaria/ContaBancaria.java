package sistemaContaBancariaex2.contaBancaria;

class ContaBancaria {
	private double saldo;
	private String proprietario;
	private double limite;

	public ContaBancaria(double saldo, String proprietario, double limite) {
		this.saldo = saldo;
		this.proprietario = proprietario;
		this.limite = limite;

	}

	public void depositar(double quantiaDepositada) {

		saldo = saldo + quantiaDepositada;
		System.out.println(saldo);

	}

	public void sacar(double quantiaSacada) throws EstouroDeLimiteException {
		if (quantiaSacada > saldo) {

			throw new EstouroDeLimiteException();
		}

		if (quantiaSacada < 0) {
			throw new IllegalArgumentException();
		}
		saldo = saldo - quantiaSacada;
		System.out.println(saldo);

	}

	public double getSaldo() {
		return saldo;

	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

}
