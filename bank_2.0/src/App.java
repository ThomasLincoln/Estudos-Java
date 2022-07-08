import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a opção:");
        System.out.println("1 - Sacar");
        System.out.println("2 - Depositar");
        System.out.println("3 - Sair");
        int operation = sc.nextInt();

        while(true){
            if(operation == 1){
                System.out.println("Insira o seu saldo atual: ");
                int balance = sc.nextInt();
                System.out.println("Quanto deseja sacar? ");
                int saque = sc.nextInt();
                if(saque > balance){
                    System.out.println("Você não pode realizar essa função");
                    break;
                }else{
                    balance -= saque;
                    System.out.println("Seu saldo atual é "+balance);
                }
            }else if(operation == 2){
                System.out.println("Insira o seu saldo atual: ");
                int balance = sc.nextInt();
                System.out.println("Quando deseja depositar? ");
                int deposito = sc.nextInt();
                balance += deposito;
                System.out.println("O saldo atual é: " + balance);
                break;
            }else{
                break;
            }
        }
    }
}
