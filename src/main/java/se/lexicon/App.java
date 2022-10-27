package se.lexicon;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;




public class App {
    public static void main(String[] args) {

        while (true) {
            printMenu();
            switch (getInputNumber()) {
                case 1:
                    int len= NameRepository.getSize();
                    System.out.println("len = " + len);
                    break;
                case 2:
                    String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn",
                            "Farhad Towfighian"};
                    NameRepository.setNames(names);
                    break;
                case 3:
                    NameRepository.clear();
                    break;
                case 4:
                    NameRepository.findAll();
                    break;
                case 5:
                    NameRepository.find("Veronica Okoli");
                    break;
                case 6:
                    NameRepository.add("Mehardad javan");
                    break;
                case 7:
                    NameRepository.findByFirstname("Samuel");
                    break;
                case 8:
                    NameRepository.findByLastName("Towfighian");
                    break;
                case 9:
                    NameRepository.update("Nivethitha Jothikumar", "Nivethitha Jayanth");
                    break;
                case 10:
                    NameRepository.remove("Nivethitha Jothikumar");
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("\t\tOption is not valid");
                    break;
            }


        } // while


    } // main


    public static void printMenu() {
        System.out.println("##### Group collabration workshop #####");
        System.out.print("\tOption (1-10): ");
    }

    public static int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\t\tenter a valid number between 1-10");
        }

        return number;
    }
}

