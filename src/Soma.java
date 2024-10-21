public class Soma {
    public static void main (String[] args){
        int indice = 12;
        int soma = 0;
        for (int k = 1; k < indice; k++){
            soma = soma + k;
        }
        System.out.println("Valor soma: " + soma);
    }
}
