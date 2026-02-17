package entregas.moraDaniel;

import java.util.Scanner;

public class BuscaMinasCorregido {

	static String[][] tableroVisible = {
			{ " ", "1", "2", "3", "4", "5", "6", "7" },

			{ "1", "-", "-", "-", "-", "-", "-", "-" },

			{ "2", "-", "-", "-", "-", "-", "-", "-" },

			{ "3", "-", "-", "-", "-", "-", "-", "-" },

			{ "4", "-", "-", "-", "-", "-", "-", "-" },

			{ "5", "-", "-", "-", "-", "-", "-", "-" }
	};

	static String[][] tableroMinasActivas = {
			{ " ", "1", "2", "3", "4", "5", "6", "7" },

			{ "1", "0", "0", "0", "0", "0", "0", "0" },

			{ "2", "0", "0", "0", "0", "0", "0", "0" },

			{ "3", "0", "0", "0", "0", "0", "0", "0" },

			{ "4", "0", "0", "0", "0", "0", "0", "0" },

			{ "5", "0", "0", "0", "0", "0", "0", "0" }
	};

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int minasColocadas = 0;
		while (minasColocadas < 5) {
			int filaAleatorinaDeMina = (int) (Math.random() * 5 + 1);
			int columnaAleatoriaDeMina = (int) (Math.random() * 7 + 1);
			if (!tableroMinasActivas[filaAleatorinaDeMina][columnaAleatoriaDeMina].equals("1")) {

				tableroMinasActivas[filaAleatorinaDeMina][columnaAleatoriaDeMina] = "1";
				minasColocadas++;
			}
		}

		int columnaMina = 0, filaMina = 0, juegoEncendido = 1, valoresCorrectos, contadorMapa = 0, contadorMinas = 0;

		while (juegoEncendido == 1) {
			for (minasColocadas = 0; minasColocadas < tableroVisible.length; minasColocadas++) {
				for (int j = 0; j < tableroVisible[minasColocadas].length; j++) {
					System.out.print(tableroVisible[minasColocadas][j]);

				}
				System.out.println(" ");

			}
			valoresCorrectos = 0;
			while (valoresCorrectos == 0) {
				System.out.println(" ");
				System.out.println("Ingrese X");
				filaMina = scanner.nextInt();
				System.out.println("Ingrese Y");
				columnaMina = scanner.nextInt();
				if (filaMina < 1 || filaMina > 5 || columnaMina < 1 || columnaMina > 7) {
					valoresCorrectos = 0;
				} else {
					valoresCorrectos = 1;
				}
			}

			if (tableroMinasActivas[filaMina][columnaMina].equals("1")) {
				tableroVisible[filaMina][columnaMina] = "x";
				contadorMinas++;
			} else if (tableroMinasActivas[filaMina][columnaMina].equals("0")) {
				tableroVisible[filaMina][columnaMina] = ".";
			} else {
				System.out.println("No es correcta esa opcion.");
			}

			contadorMapa++;
			if (contadorMinas > 2) {
				juegoEncendido = 0;
				System.out.println("Has perdido");
			} else if (contadorMapa >= 30) {
				System.out.println("Felicidades Ganador!");
				juegoEncendido = 0;
			} else {

			}

		}
	}
}
