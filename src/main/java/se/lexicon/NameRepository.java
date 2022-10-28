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

        int len = names.length;
        return len;
    }

    public static void setNames(String[] names) {   /* NameRepository.names=Arrays.copyOf(names,names.length);
        System.out.println("Array with new names:"+NameRepository.names);*/
        /*String[] addNames = {"Samuel Svahn", "Nivethitha Jothikumar", "Liljana Ristevska",
                "Farhad Towfighian", "Veronica Okoli"};*/
        NameRepository.names = arrayConcat(NameRepository.names, names);

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
        // String[] names = {"Samuel Svahn", "Nivethitha Jothikumar",
        // "Liljana Ristevska", "Farhad Towfighian", "Veronica Okoli"};
        // Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);
        // System.out.println(Arrays.toString(names));
        String[] result = Arrays.copyOf(names, names.length);

        return result;
    }

    public static String find(final String fullName) {
        for (String na : names) {
            if (fullName.equalsIgnoreCase(na))
                return na;
        }
        return "Name not found";

    }


    public static boolean add(final String fullName) {


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

            return true;
        }

        return false;
    }

    public static String findByLastName(final String lastName) {

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


    public static String[] findByFirstname(final String firstName) {
        String splitNames[];
        for (String na : names) {
            splitNames = na.split(" ");
            if (splitNames.length >= 2 && splitNames[0].equalsIgnoreCase(firstName)) {
                System.out.println("First name is: " + firstName);
                System.out.println("and full name is: " + na);

            }
        }
        return new String[]{"NAME NOT FOUND"};
    }


    public static boolean remove(final String fullName) {
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

    public static boolean update(final String original, final String updatedName) {

        // step 1: find the index of the original value
        int originalIndex = -1;
        for (int i = 0 ; i< names.length; i++){
            if (names[i].equalsIgnoreCase(original)){
                originalIndex = i;
            }
        }
        System.out.println("originalIndex = " + originalIndex);
        if (originalIndex == -1){
            return false;
        }

        // step 2: find the index of the updated value


        int UpdatedIndex = -1;
        for (int i = 0 ; i< names.length; i++){
            if (names[i].equalsIgnoreCase(updatedName)){
                UpdatedIndex = i;
            }
        }
        System.out.println("UpdatedIndex = " + UpdatedIndex);
        if (UpdatedIndex == -1){
            names[originalIndex]=updatedName;
            System.out.println(Arrays.toString(names));

        }




        return true;

    }


}


