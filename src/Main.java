
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



                System.out.println("Ingresa un numero:");
                int num1 = sc.nextInt();
                System.out.println("Ingresa un numero:");
                int num2 = sc.nextInt();
                System.out.println("Ingresa un numero:");
                int num3 = sc.nextInt();

                int mayor, menor, centro;

                // Encontrar el numero mayor
                if (num1 >= num2 && num1 >= num3) {
                    mayor = num1;
                } else if (num2 >= num1 && num2 >= num3) {
                    mayor = num2;
                } else {
                    mayor = num3;
                }

                // Encontrar el numero menor
                if (num1 <= num2 && num1 <= num3) {
                    menor = num1;
                } else if (num2 <= num1 && num2 <= num3) {
                    menor = num2;
                } else {
                    menor = num3;
                }

                // El número del centro
                centro = num1 + num2 + num3 - mayor - menor;

                // Resultado
                if (num1 == num2 && num2 == num3) {
                    System.out.println("Los números son iguales");
                } else {
                    System.out.println("Números de mayor a menor: " + mayor + ", " + centro + ", " + menor);
                    System.out.println("Números de menor a mayor: " + menor + ", " + centro + ", " + mayor);
                }


       /* int i=1;
       do {
           i++;

           System.out.println("Ingresa un numero:");
           int num1 = sc.nextInt();
           System.out.println("Ingresa un numero:");
           int num2 = sc.nextInt();
           System.out.println("Ingresa un numero:");
           int num3 = sc.nextInt();
           int mayor = Math.max(num1, Math.max(num2, num3));
           int menor = Math.min(num1, Math.min(num2, num3));
           int centro = num1 + num2 + num3 - mayor - menor;
           if (num1 == num2 && num2 == num3) {
               System.out.println("Los numeros son iguales");
           } else {
               System.out.println("Numeros de mayor a menor: " + mayor + ", " + centro + ", " + menor);
               System.out.println("Numeros de menor a mayor: " + menor + ", " + centro + ", " + mayor);
           }
       }while(i <= 5);*/

   }
}

