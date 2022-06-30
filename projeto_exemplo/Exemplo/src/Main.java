import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        System.out.println("Hello World! I am learning Java");
        int my_age = 19;
        Scanner leitor = new Scanner(System.in);
        my_age = leitor.nextInt();
        System.out.println(my_age);
    }
}

// psvm é como criar nosso método principal
// primeiro objetivo, printar algo com sout[x]