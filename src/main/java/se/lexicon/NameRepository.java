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

    } //Should have a Return!

    public static void setNames(String[] names) {

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
            public static String[] findByLastName ( final String LastName){


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

        } //Should have a Return!

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
    public static boolean remove(final String fullName) {


    } //Should have a Return!
}



