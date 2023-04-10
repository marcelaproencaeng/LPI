package sistemaContaBancariaex2.contaBancaria;

public class TesteSistema {
	public static void main(String[] args) {

		ContaBancaria c1 = new ContaBancaria(3000.0, "Marco da Rocha Azevedo", 15000.000);
		c1.depositar(100);
		try {
			c1.sacar(-50);
		} catch (EstouroDeLimiteException e) {

			System.out.println("Estourou o limite!");
			e.printStackTrace();
		} catch (IllegalArgumentException e1) {
			System.out.println("Parâmetro Inválido!");
		}
		c1.getSaldo();

		ContaBancaria c2 = new ContaBancaria(5000.0, "Marta Barbosa dos Santos", 10500.000);
		c2.depositar(566);
		try {
			c2.sacar(50);
		} catch (EstouroDeLimiteException e) {
			System.out.println("Estourou o limite!");

			e.printStackTrace();
		}
		c2.getSaldo();

		ContaBancaria c3 = new ContaBancaria(2000.0, "Felipe Stein", 20000.000);
		c3.depositar(200);
		try {
			c2.sacar(40);
		} catch (EstouroDeLimiteException e) {
			System.out.println("Estourou o limite!");

			e.printStackTrace();
		}
		c3.getSaldo();
	}

}
