import java.util.Scanner;

public class Desenbaralhando {
    public static void main(String[] args) throws Exception {
        
        Scanner leitor = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Digite a quantidade de linhas, EX:. 5 á 100 : ");
		int N = leitor.nextInt();
        System.out.println(" ");
        System.out.println("Agora digite as palvaras embaralhadas que deseja: ");
		for (int i = 0; i < N; i++) {
            System.out.println(" ");
			String frase = readLine(leitor);
			StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
			StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			parte1.reverse();
			parte2.reverse();
			System.out.println(parte1.toString() + parte2.toString());
            System.out.println(" ");
		}
	}
	
	public static String readLine(Scanner leitor) {
		String line = leitor.nextLine();
		while (line.isEmpty())
			line = leitor.nextLine();
		return line;
	}
    
}
