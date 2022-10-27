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


    /* Veronica
    Inside NameRepository create a private static empty array of String called names.
    SUGGESTIONS:  */
    private static String names[] = new String[0];

    public static int getSize() {
        // System.out.println(names.length);
        int len = names.length;
        return len;
    }

    public static void setNames(String[] names) {
        String[] addNames = {"Samuel Svahn", "Nivethitha Jothikumar", "Liljana Ristevska",
                "Farhad Towfighian", "Veronica Okoli"};
        names = arrayConcat(names, addNames);

    }

    public static String[] arrayConcat(String[] source, String[] elementsToAdd) {
        String[] combined = Arrays.copyOf(source, source.length + elementsToAdd.length);
        for (int i = source.length, j = 0; i < combined.length; i++, j++) {
            combined[i] = elementsToAdd[j];
        }
        return combined;
    }


    public static void clear() {
        names = new String[0];
    }

    public static String[] findAll() {
        String[] names = {"Samuel Svahn", "Nivethitha Jothikumar", "Liljana Ristevska", "Farhad Towfighian", "Veronica Okoli"};
        // Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        // System.out.println(Arrays.toString(names));
        String[] result = Arrays.copyOf(names, names.length);

        return result;


        public static String find ( final String fullName){
            for (String na : names) {
                if (fullName.equalsIgnoreCase(na))
                    return na;
            }
            return "Name not found";

        }

    /* Lilly
    public static boolean add(final String fullName)
    Should add a new name to the array.
    Returns true when name was added and false when the array contains the name.
    SUGGESTIONS:  */


        public static boolean add ( final String fullName){
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
            public static String findByLastName ( final String lastName){

                String splitNames[];
                for (String na : names) {
                    splitNames = na.split(" ");
                    if (splitNames.length >= 2 && splitNames[1].equalsIgnoreCase(lastName)) {
                        System.out.println("Full Name: " + na);
                        return na;
                    }
                }
                return "NAME NOT FOUND";
            }





    /* Farhad
    public static String[] findByFirstName(final String firstName)
    Searches the array trying to find all names that has passed in first name.
    Returns a String array containing all matches.
    SUGGESTIONS:  */
            public static String[] findByFirstname ( final String firstName){
                String splitNames[];
                for (String na : names) {
                    splitNames = na.split(" ");
                    if (splitNames.length >= 2 && splitNames[0].equalsIgnoreCase(firstname)) {
                        System.out.println("First name is: " + firstname);
                        return "Full name is: " + na;
                    }
                }
                return "NAME NOT FOUND";

            } //Should have a Return!

        }

    /* Samuel
    public static boolean remove(final String fullName)
    Should remove a name from the array. Returns true if name was removed and false if the name was not
    removed for some reason.
    SUGGESTIONS:  */
        public static boolean remove ( final String fullName){
            String[] names = {"Nive", "Farhad", "Lilly", "Sam", "Veronica"};
            boolean flag = false;
            int index = 0;
            for (int i = 0; i < names.length; i++) {
                if (fullName.equals(names[i])) {

                    flag = true;
                    index = i;
                }
            }
            if (flag) {

                names[index] = " ";
                System.out.println("Name removed");
            }
            for (String na : names) {
                if (na.equals(" ")) {
                    continue;
                }
                System.out.println(na);
            }

            return true;

        }


    }


