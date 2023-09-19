import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        // Classe Objeto Construtor
        Turista mochileiro = new Turista("Maia");
        // Definir formato do objeto
        mochileiro.setNome("Agnes");
        mochileiro.setCpf("123");
        Turista mochileira = new Turista();
        mochileira.setNome("Tomas");
        //Atribuição indireta
        String nome = JOptionPane.showInputDialog("entre com o nome:");
        mochileiro.setNome(nome);
        System.out.println("o nome do objeto é :" + mochileira.getNome());

        String cpf = JOptionPane.showInputDialog("entre com o cpf:");
        mochileiro.setCpf(cpf);
        System.out.println("CPF sem validação" + mochileira.getCpf());

        // Novo objeto
        nome = JOptionPane.showInputDialog("qual seu nome: ");
        //criando objeto com construtor recebendo nome
        Turista outroTurista = new Turista(nome);
        System.out.println("O nome deste turista é :" + outroTurista.getNome());

        // Fazer o recebimento do cpf para este turista
        cpf = JOptionPane.showInputDialog("qual seu cpf: ");
        if(Validacao.cpf(cpf))
            outroTurista.setCpf(cpf);
        else
            System.out.println("CPF invalido!");
        System.out.println("O cpf deste turista é :" + cpf);


    }
}