import java.util.Arrays;
import java.util.Scanner;

public class ParesArray {
    public static void main(String[] args) throws Exception {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println(" ");
            System.out.print("Digite o tamanho do array: ");
            int n = scanner.nextInt();
            System.out.println(" ");
            System.out.print("Digite o valor alvo: ");
            int k = scanner.nextInt();

            int[] arr = new int[n];
            System.out.println(" ");
            System.out.println("Digite os elementos do array, um por linha:");
            System.out.println(" ");

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            Arrays.sort(arr);

            int count = 0;
            int i = 0;
            int j = 1;

            while (j < n) {
                int diff = arr[j] - arr[i];

                if (diff == k) {
                    count++;
                    j++;
                } else if (diff > k) {
                    i++;
                } else {
                    j++;
                }
            }

            System.out.println(" ");
            System.out.println("Número de pares encontrados: " + count);
            System.out.println(" ");
        }
    }

}
