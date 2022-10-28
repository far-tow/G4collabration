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
                    String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn", "Samuel Test",
                            "Farhad Towfighian"};
                    NameRepository.setNames(names);
                    break;
                case 3:
                    NameRepository.clear();
                    break;
                case 4:
                    String [] Array1 = NameRepository.findAll();
                    System.out.println("new array:" + Arrays.toString(Array1));
                    break;
                case 5:
                    String Value= NameRepository.find("Veronica Okoli");
                    System.out.println(Value);
                    break;
                case 6:
                    NameRepository.add("Mehardad javan");
                    break;
                case 7:
                   String[] resultFindByFN = NameRepository.findByFirstname("Samuel");
                    System.out.println(Arrays.toString(resultFindByFN));
                    break;
                case 8:
                    String[] resultFindByLN= NameRepository.findByLastName("Towfighian");
                    System.out.println(Arrays.toString(resultFindByLN));
                    break;
                case 9:
                     NameRepository.update("Nivethitha", "Nivethith");
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


        }


    }


    public static void printMenu() {
        System.out.println("Group45(Team 4) collabration workshop");
        System.out.println("\t\t\tMembers");
        System.out.println("Nive, Sam, Farhad, Veronica, Lilly");
        System.out.println("                          ");
        String[] options = {"\t1. To Get Size of Array", "\t2. Set Names in array", "\t3. Clear the array", "\t4. Find all in array", "\t5. Find value in array", "\t6. Add value in Array",
                "\t7. Find value by First Name", "\t8. Find value by Last Name", "\t9. Update value in array", "\t10. Remove value from Array", "\t0. To Exit"};

        for (String opt : options) {
            System.out.println(opt);
        }

    }
    public static int getInputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\tEnter your method:");
        int number = 0;
        try {
            number = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("\t\tenter a valid number between 1-10");
        }

        return number;
    }
}

