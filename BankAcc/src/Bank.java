import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int choice = 0;

        double accValue = 1599.99;

        String menu = """
                ** Digite sua opção **
                
                1 - Consultar saldo
                2 - Saque
                3 - Deposito
                4 - Sair;
                
                """;
        String name;
        String acc;

        System.out.println("###########################\n\nBem vindo ao banco Bank!!!\n\n###########################\n\n");

        do {
            System.out.println("Por favor digite seu nome:");
            name = read.nextLine();
        } while (name.isEmpty());

        do {
            System.out.println("Digite o tipo da conta:");
            acc = read.nextLine();
        } while (acc.isEmpty());

        System.out.println("\n***************************************\nDados iniciais do cliente\nNome: "+name+"\nTipo de conta: "+acc+"\nSaldo da conta: R$"+accValue+"\n***************************************\n");

        while (choice != 4) {
            System.out.println(menu);

            choice = read.nextInt();
            if (choice == 1) {
                System.out.println("Saldo disponivel: R$"+accValue);
            } else if (choice == 2) {
                System.out.println("Bem vindo ao modulo de saque!!\nQuanto gostaria de sacar?\nSaldo atual: R$"+accValue);
                double withdraw = read.nextDouble();
                if (withdraw <= accValue) {
                    accValue -= withdraw;
                    System.out.println("Saque realizado com sucesso\nSaldo atualizado R$"+accValue);
                } else {
                    System.out.println("Saldo insuficiente para realizar o saque");
                }
            } else if (choice == 3) {
                System.out.println("Bem vindo ao modulo de depositos!!\nQuanto gostaria de depositar?\nSaldo atual: R$"+accValue);
                double deposit = read.nextDouble();
                accValue += deposit;
                System.out.println("Deposito realizado com sucesso!!\nSaldo atualizado R$"+accValue);
            } else if (choice == 4) {
                System.out.println("Obrigado por utilizar nossos serviços!!");
            } else{
                System.out.println("Opção Invalida");
            }
        }
    }
}

