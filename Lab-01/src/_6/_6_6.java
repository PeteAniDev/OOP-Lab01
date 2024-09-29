package _6;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class _6_6 {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the two matrices width.");
		int matrixWidth = scanner.nextInt();
		System.out.println("Enter the two matrices height.");
		int matrixHeight = scanner.nextInt();
		double[][] sumMatrix = new double[matrixWidth][matrixHeight];
		for (int i = 0; i < matrixHeight; i++) {
			for (int j = 0; j < matrixWidth; j++) {
				sumMatrix[j][i] = 0;
			}
		}

		for (int x = 0; x < 2; x++) {
			System.out.printf("Enter the %s matrix.\n", x == 0 ? "first" : "second");
			for (int i = 0; i < matrixHeight; i++) {
				for (int j = 0; j < matrixWidth; j++) {
					double n = scanner.nextDouble();
					sumMatrix[j][i] += n;
				}
			}
		}

		for (int i = 0; i < matrixHeight; i++) {
			for (int j = 0; j < matrixWidth; j++) {
				System.out.print(sumMatrix[j][i] + " ");
			}
			System.out.println();
		}
	}

}
