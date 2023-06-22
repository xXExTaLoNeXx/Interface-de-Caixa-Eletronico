import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int accValue = 2500;

        String cifrValue = "R$ " + accValue;
        String name;
        String acc;

        System.out.println("###########################");
        System.out.println();
        System.out.println("Bem vindo ao banco Bank!!!");
        System.out.println();
        System.out.println("###########################");
        System.out.println();

        do {
            System.out.println("Por favor digite seu nome:");
            name = read.nextLine();
        } while (name.isEmpty());

        do {
            System.out.println("Digite o tipo da conta:");
            acc = read.nextLine();
        } while (acc.isEmpty());

        System.out.println("***************************************");
        System.out.println("Dados iniciais do cliente");
        System.out.println("Nome: "+ name);
        System.out.println("Tipo de conta: "+acc);
        System.out.println("Saldo da conta: " + cifrValue);
        System.out.println("***************************************");
        System.out.println();
        System.out.println();

        boolean leave = false;
        while (!leave) {
            System.out.println("Qual opção deseja acessar?\n");
            System.out.println("1 Consulta de saldo");
            System.out.println("2 Deposito");
            System.out.println("3 Saque");
            System.out.println("4 Sair");

            int selection1 = read.nextInt();
            read.nextLine();

            if (selection1 == 1) {
                System.out.println("Saldo disponivel: "+cifrValue);
                System.out.println("Deseja realizar outra transação? (S/N)");
                String selection2 = read.nextLine();
                if (selection2.equals("N")) {
                    leave = true;
                    break;
                }
            }
        }
    }
}
