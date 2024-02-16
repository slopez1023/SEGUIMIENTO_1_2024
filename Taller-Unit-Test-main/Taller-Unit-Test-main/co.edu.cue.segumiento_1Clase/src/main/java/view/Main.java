package view;

import model.Toys;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        List<Toys> products = DataInitializer.initializeProducts();


        Scanner scanner = new Scanner(System.in);
        int option = 0;

        while (option != 4) {
            System.out.println("Menú");
            System.out.println("1. Agregar un juguete nuevo");
            System.out.println("2. cuantos jugutes hay en cada tipo");
            System.out.println("3. Necesita la cantidad total de jugutes)");
            System.out.println("4. Valor total de todos los jugutes");
            System.out.println("5. Disminuir existencias de un juguete");
            System.out.println("6. Aumentar existencias de un juguete");
            System.out.println("7. El tipo del cual hay más juguetes");
            System.out.println("8. El tipo del cual hay menos juguetes");
            System.out.println("9. Los juguetes con valor mayor a (indicado por el usuario)\n" + "\n");
            System.out.println("10. Ordenar de menor a mayor la cantidad de existencias de juguetes por tipo.");
            System.out.println("5. Exit");
            System.out.print("Option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1: getFilteredProductsBooks(toys);
                    break;

                case 2: getFilteredProductsBaby(products);
                    break;

                case 3: getFilteredProductsToys(products);
                    break;

                case 4: getCheapestBook(products);
                    break;

                case 10:
                    System.out.println("Thank you, bye.");
                    break;
                default:
                    System.out.println("Invalid option.");
                    break;
            }
        }

        scanner.close();
}

    }


