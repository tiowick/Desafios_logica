import java.util.Scanner;

public class TrocoDecimal {
    public static void main(String[] args) throws Exception {

        try (Scanner scanner = new Scanner(System.in)) {
            boolean sair = false;

            while (!sair) {
                double valor = 0.0;
                boolean entradaValida = false;

                while (!entradaValida) {
                    System.out.println();
                    System.out.print("Digite um valor: ");
                    String input = scanner.next();

                    try {
                        valor = Double.parseDouble(input);
                        entradaValida = true;
                        System.out.println();
                    } catch (NumberFormatException e) {
                        System.out.println("Valor inválido. Digite um valor numérico válido.");
                    }
                }

                String[] notas = { "100.00", "50.00", "20.00", "10.00", "5.00", "2.00" };
                String[] moedas = { "1.00", "0.50", "0.25", "0.10", "0.05", "0.01" };

                System.out.println();
                System.out.println("NOTAS:");
                System.out.println();
                for (String nota : notas) {
                    int quantidade = (int) (valor / Double.parseDouble(nota));
                    valor %= Double.parseDouble(nota);
                    System.out.println(quantidade + " nota(s) de R$ " + nota);
                }

                System.out.println();
                System.out.println("MOEDAS:");
                System.out.println();
                for (String moeda : moedas) {
                    int quantidade = (int) (valor / Double.parseDouble(moeda));
                    valor %= Double.parseDouble(moeda);
                    System.out.println(quantidade + " moeda(s) de R$ " + moeda);
                }

                System.out.println();
                boolean respostaValida = false;
                do {
                    System.out.print("Deseja sair? (S/N): ");
                    String resposta = scanner.next().toUpperCase();
                    if (resposta.equals("S")) {
                        sair = true;
                        respostaValida = true;
                    } else if (resposta.equals("N")) {
                        respostaValida = true;
                    } else {
                        System.out.println(" ");
                        System.out.println("Resposta inválida. Digite 'S' para sair ou 'N' para continuar.");
                        System.out.println(" ");
                    }
                } while (!respostaValida);
            }
        }
    }

}
