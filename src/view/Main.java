package view;

import model.Funcionario;

public class Main {

    public static void main(String[] args) {
        Funcionario f1, f2;
        f1 = new Funcionario();
        f1.setNome("Jose Henrique");
        f1.setCargo("Analista de Dados Pleno");
        f1.setSalario(2300);
        f1.getSalarioLiquido(200, 400);

        f2 = new Funcionario();
        f2.setNome("Claudio Carvalho");
        f2.setCargo("Analista de Sistemas Júnior");
        f2.setSalario(1200);
        f2.getSalarioLiquido(300,250);

    }
}
