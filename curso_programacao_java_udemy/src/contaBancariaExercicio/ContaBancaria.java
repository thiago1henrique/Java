package contaBancariaExercicio;

public class ContaBancaria {
    private int numeroConta;
    private String nome;
    private double valorDeposito;

    public ContaBancaria(){}

    public ContaBancaria(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
    }

    public ContaBancaria(int numeroConta, String nome, double valorDeposito) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.valorDeposito = valorDeposito;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public double getValorDeposito() {
        return valorDeposito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double deposito(double valor) {
        return this.valorDeposito += valor;
    }

    public void saque(double valor) {
        if(valor != 0) {
        	this.valorDeposito -= (valor + 5); 
        }
    }
}
