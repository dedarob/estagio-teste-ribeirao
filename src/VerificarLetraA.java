import java.util.Scanner;

public class VerificarLetraA {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Escreva a frase que você quer comparar");
        String palavra = sc.nextLine();
        int amount = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'A') {
                amount++;
            }
        }
        if (amount > 0) {
            System.out.println("A letra a aparece em " + palavra + ", e aparece " + amount + " vezes.");
        } else {
            System.out.println("A letra a não aparece.");
        }
        }
    }
