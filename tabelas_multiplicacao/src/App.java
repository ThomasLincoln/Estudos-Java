import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Insira o número A (A*B), será o número de tabelas: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Insira o número B (A*B) será o numero de linhas das tabelas: ");
        int b = sc.nextInt();
        for(int i = 1; i<=a; i++){
            System.out.println("-------------");
            for(int j = 0; j<=b; j++){
                int result = i * j;
                System.out.println(i + "x" + j + " = " + result);
            }
        }
    }
}
