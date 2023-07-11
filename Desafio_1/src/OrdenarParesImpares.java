import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class OrdenarParesImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Insira o número de linhas a serem lidas:");
        System.out.println(" ");
        int n = sc.nextInt();
        sc.nextLine();

        List<Integer> numeros = new ArrayList<>();

        System.out.println(" ");
        System.out.println("Insira os números, um por linha:");
        System.out.println(" ");
        for (int i = 0; i < n; i++) {
            int valor = sc.nextInt();
            numeros.add(valor);
        }

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int valor : numeros) {
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println(" ");
        System.out.println("Valores pares:");
        System.out.println(" ");
        for (int valor : pares) {
            System.out.println(valor);
        }

        System.out.println(" ");

        System.out.println("Valores ímpares:");
        System.out.println(" ");
        for (int valor : impares) {
            System.out.println(valor);
        }
        System.out.println(" ");

        sc.close();
    }
}
