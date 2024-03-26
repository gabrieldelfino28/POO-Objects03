package model;

public class Funcionario {

    private String nome;
    private double salario;
    private String cargo;

    public Funcionario() {
        nome = "";
        salario = 0.0d;
        cargo = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;

    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void getSalarioLiquido(double descontos, double beneficios) {
        double salarioLiquido = ((salario + beneficios) - descontos);
        if (salarioLiquido < 1412.00) {
            salarioLiquido = 1412.00;
        }
        System.out.println("Salario Liquido: " + salarioLiquido);
    }
}
