package se.lexicon;


import java.util.Arrays;

/**
 * public static void clear(), public static String[] findByFirstName(final String firstName)   for farhad
 * <p>
 * <p>
 * public static String[] findAll(), public static boolean add(final String fullName) ; lilly
 * <p>
 * <p>
 * -findByLastName,  boolean remove(final String fullName) ; sam
 * <p>
 * <p>
 * find full name,    update; Nivethitha
 **/
public class NameRepository {


    private static String names[] = new String[0];


    public static String[] findAll() {
        String[] names = {"Samuel Svahn", "Nivethitha Jothikumar", "Liljana Ristevska", "Farhad Towfighian", "Veronica Okoli"};
        // Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        // System.out.println(Arrays.toString(names));
        String[] result = Arrays.copyOf(names, names.length);


        return result;

    }


    public static boolean add(final String fullName) {
        String[] names;
        String newArray[] = Arrays.copyOf(names, names.length + 1);
        names = new String[];
        // addNameToArray(names," ");
        boolean flag = true;
        for (String name : names) {
            if (name.equals(fullName)) {
                flag = false;
                System.out.println("Name found cannot add");
            }
        }
        if (flag) {
            String newArray[] = Arrays.copyOf(names, names.length + 1);
            newArray[newArray.length - 1] = fullName;
            System.out.println(Arrays.toString(newArray));


            boolean ifNameExists = false;
            for (String name : names) {
                if (!name.equals(fullName)) ;
                // ifNameExists = true;
            }
            if (ifNameExists == true) {
                return false;
            } else {
                //newArray[names.length] = fullName;
                return true;
            }

        }


    }


}



