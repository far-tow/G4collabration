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


    public static int getSize() {

    } //Should have a Return!


    public static void setNames(String[] names) {

    }


    public static void clear() {
    }

    public static String[] findAll(){}

    public static String find(final String fullName) {
        for (String na : names){
            if (fullName.equalsIgnoreCase(na))
                return na;}
        return "Name not found";

    }

    public static boolean add(final String fullName) {


        public static String[] findByFirstName ( final String firstName){


        }
        public static String[] findByLastName (final String LastName){


        }


        public static boolean update(final String original,final String updatedName){
            int index = 0;
            boolean flag = false;
            for (int i = 0; i < names.length; i++) {
                if (names[i].equals(updatedName)) {
                    index = i;
                    flag = true;
                }
            }
            if (!flag) {

                names = Arrays.copyOf(names, names.length + 1);
                names[names.length - 1] = updatedName;
                System.out.println("Updated array");
                System.out.println(Arrays.toString(names));
            }


            return false;
        }


    } //Should have a Return!



    public static boolean remove(final String fullName) {

    } //Should have a Return!

}




}

