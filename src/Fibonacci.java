import java.util.ArrayList;
import java.util.Scanner;

public class Fibonacci {
    static int numUser;
    static ArrayList<Integer> fiboArray = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o número:");
        numUser = sc.nextInt();
        fibonacci();
        System.out.println("Lista Fibonacci com 500 elementos");
        System.out.println(fiboArray);

        if (fiboArray.contains(numUser)) {
            System.out.println(numUser + " é um numero Fibonacci.");
        } else {
            System.out.println(numUser + " não é um número Fibonacci.");
        }

        }
        
        static void fibonacci(){
            int num1 = 0, num2 = 1;
            //Eu dei hardcode nessa condição do 'for' por causa da natureza exponencial da sequencia fibonacci, a partir de 31 elementos já passa de um milhão
            for (int i = 0; i < 500; i++) {
                fiboArray.add(num1);
                int num3 = num2 + num1;
                num1 = num2;
                num2 = num3;
            }

        }
    }
