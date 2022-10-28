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
                   String[] values= NameRepository.findAll();
                    System.out.println(Arrays.toString(values));
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
                    NameRepository.update("Farhad Towfighian", "Farhad T");
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
        System.out.println("##### Group45(Team 4) collabration workshop #####");
        System.out.print("\t1.To Get Size of Array,2.Set Names in array,3.Clear the array,4.Find all in array," + "\n\t" +
                "5.Fin value in array,6.Add value in Array,7.Find value by First Name,8.Find value by Last Name," + "\n\t" +
                "9.Update value in array ,10.Remove value from Array, 0. To Exit");


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

