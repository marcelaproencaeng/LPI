package abstracao;
//Crie uma classe para representar uma conta bancária, 

//com métodos para depositar uma quantia, sacar uma quantia e obter o saldo. 
//Para cada saque será debitada também uma taxa de operação equivalente 
//à 0,5% do valor sacado. 
//Crie, em seguida, uma subclasse desta classe anterior para representar 
//uma conta corrente de um cliente especial. 
//Clientes especiais pagam taxas de operação de apenas 0,1% do valor sacado. 
//Faça testes com as duas classes e verifique seus resultados.

public class ContaBancaria {

	private String agencia;
	private TipoConta tipoConta;
	private String nomeCompletoCorrentista;
	private String numeroConta;
	private String numeroBanco;
	private double saldo;

	public ContaBancaria(String agencia, TipoConta tipoConta, String nomeCompletoCorrentista, String numeroConta,
			String numeroBanco,double saldo) {

		this.agencia = agencia;
		this.tipoConta = tipoConta;
		this.nomeCompletoCorrentista = nomeCompletoCorrentista;
		this.numeroConta = numeroConta;
		this.numeroBanco = numeroBanco;
		this.saldo=saldo;

	}

	public void sacar(double quantiaSacada) {

		if (tipoConta == TipoConta.CONTA_SALARIO) {

			double taxaOperacao = 0.5 / 100;
			saldo = saldo - (saldo * quantiaSacada * taxaOperacao);
			System.out.println(saldo);

		} else if (tipoConta == TipoConta.CONTA_POUPANCA) {

			double taxaOperacao = 0.5 / 100;
			saldo = saldo - (saldo * quantiaSacada * taxaOperacao);
			System.out.println(saldo);

		} else {
			double taxaOperacao = 0.1 / 100;
			saldo = saldo - (saldo * quantiaSacada * taxaOperacao);
			System.out.println(saldo);
		}

	}

	public void depositar(double quantiaDepositada) {

		saldo = saldo + quantiaDepositada;
		System.out.println(saldo);

	}

	public String getAgencia() {
		return agencia;
	}

	public TipoConta getTipoConta() {
		return tipoConta;
	}

	public String getNomeCompletoCorrentista() {
		return nomeCompletoCorrentista;
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public String getNumeroBanco() {
		return numeroBanco;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaBancaria " + "[agencia=" + getAgencia() + ", tipoConta=" + getTipoConta()
				+ ", nomeCompletoCorrentista=" + getNomeCompletoCorrentista() + ", numeroConta=" + getNumeroConta()
				+ ", numeroBanco=" + getNumeroBanco();
	}

}
