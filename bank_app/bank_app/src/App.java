import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        int dinheiro_atual = 0;
        int escolha = 0; 
        while(escolha != 3){
            System.out.println("Escolha um número");
            System.out.println("Escolha 1 para depositar dinheiro");
            System.out.println("Escolha 2 para sacar dinheiro");
            System.out.println("Escolha 3 para Sair1");
            System.out.println("------------------------------");
            escolha = sc.nextInt();
            int valor_inserido;
            if(escolha == 1){
                System.out.println("Insira um valor");
                dinheiro_atual += sc.nextInt();
                System.out.println("O seu saldo é: " + dinheiro_atual);
            }else if(escolha == 2){
                System.out.println("Insira um valor");
                valor_inserido = sc.nextInt();
                if(valor_inserido < dinheiro_atual){
                    System.out.println("Incapaz de sacar, você não tem saldo o suficiente");
                }else{
                    System.out.println("Você sacou: " + (valor_inserido));
                    dinheiro_atual -= valor_inserido;
                }
                System.out.println("O seu saldo é: " + dinheiro_atual);
            }else if(escolha == 3){
                System.out.println("Saindo...");
            }else{
                System.out.println("Operação inválida");
            }
        }
    }
}
