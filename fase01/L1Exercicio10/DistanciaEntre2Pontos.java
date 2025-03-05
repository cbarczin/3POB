/*10. Distância Entre Dois Pontos
Desenvolva um programa que leia as coordenadas x1, y1 e x2, y2 de dois pontos no plano cartesiano e calcule a distância entre eles.

Fórmula: D = sqrt((x2 - x1)² + (y2 - y1)²) */

package fase01.L1Exercicio10;

import java.util.Locale;
import java.util.Scanner;

public class DistanciaEntre2Pontos {
    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe a coordenada X1: ");
        int x1 = entrada.nextInt();
        System.out.printf("Informe a coordenada X2: ");
        int x2 = entrada.nextInt();
        System.out.print("Informe a coordenada Y1: ");
        int y1 = entrada.nextInt();
        System.out.print("Informe a coordenada Y2: ");
        int y2 = entrada.nextInt();

        double quadx = Math.pow(x2 - x1, 2);
        double quady = Math.pow(y2 - y1, 2);

        double distancia = Math.sqrt(quadx + quady);

        System.out.print("A distancia entre esses pontos é de: " + String.format(Locale.US, "%.2f", distancia));
        entrada.close();
    }
    
}
