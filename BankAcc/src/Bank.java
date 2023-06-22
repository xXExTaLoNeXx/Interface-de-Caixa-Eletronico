import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int accValue = 2500;

        String cifrValue = "R$ " + accValue;
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

        System.out.println("\n***************************************\n\nDados iniciais do cliente\n\nNome: "+name+"\n\nTipo de conta: "+acc+"\n\nSaldo da conta: "+cifrValue+"\n\n***************************************\n\n");
        
        boolean leave = false;
        while (!leave) {
            System.out.println("Qual opção deseja acessar?\n1\n Consulta de saldo\n2 Deposito\n3 Saque\n4 Sair");
            
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
