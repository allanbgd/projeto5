package desafioDioBanco;

import static desafioDioBanco.Conta.SEQUENCIAL;

public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;
	public static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	public Conta() {
		// TODO Auto-generated constructor stub
	 
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero=SEQUENCIAL++;
	
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		this.saldo -= valor;
	}


	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		this.saldo+= valor;
	}
	
	@Override
	public void transferir(double valor, Conta contaDestino) {
		// TODO Auto-generated method stub
		this.sacar(valor);
		this.depositar(valor);
	}
	protected void imprimirInformacoesComuns() {
		System.out.println(String.format("Agencia : %d", this.agencia));
		System.out.println(String.format("Numero : %d", this.numero));
		System.out.println(String.format("Saldo : %.2f", this.saldo));
	}

	
		public int getAgencia() {
			return agencia;
		}


		public int getNumero() {
			return numero;
		}


		public double getSaldo() {
			return saldo;
		

	}


		
}
