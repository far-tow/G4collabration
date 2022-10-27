package se.lexicon;


import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * public static void clear(),
 * public static String[] findByFirstName(final String firstName)   for farhad
 * <p>
 * <p>
 * public static String[] findAll(), public static boolean add(final String fullName) ; lilly
 * <p>
 * <p>
 * findByLastName,  boolean remove(final String fullName) ; sam
 * <p>
 * <p>
 * find full name(),    update(); Nivethitha
 **/
public class NameRepository {


    static String[] names = {"Erik svensson", "Nivethitha Jayanth", "Anika ananya", "Jayanth solai"};

    public static int getSize() {
        int length=names.length;
        return length;
    }
    public static void setNames(String[] names){

        NameRepository.names=Arrays.copyOf(names,names.length);
        System.out.println("Array with new names:"+NameRepository.names);



    }
    public static void clear(){

        //int arrLen=getSize();
        String[] names= new String[0];
    }
    public static String[] findAll(){

        String[] NewArray=Arrays.copyOf(names,names.length);
        System.out.println("Names in new array:"+Arrays.toString(NewArray));
        return NewArray;

    }
    public static boolean add(final String fullName){

        String newArray[] = Arrays.copyOf(names, names.length + 1);


        boolean flag = false;
        for (String name : names) {
            if (!name.equals(fullName)){
                flag=true;
            }}
           if (flag){

               newArray[newArray.length-1]=fullName;
               return true;

           } return false;
    }



    public static void remove(final String fullName){

        boolean flag = false;
        int index=0;
        for (int i = 0; i < names.length; i++) {
            if (fullName.equals(names[i])) {

                flag = true;
                index = i;
            }
        }
        if (flag) {

            names[index]=" ";
            System.out.println("Name removed");
        }
        for(String na:names){
            if(na.equals(" ")){
                continue;
            }
            System.out.println(na);
        }
    }

   

    public static String find(final String fullName) {


        for (String na : names){
            if (fullName.equalsIgnoreCase(na))
                return na;}
        return "Name not found";
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

    public static String findByFirstName(final String lastName) {

        String splitNames[];
        for (String na : names) {
            splitNames = na.split(" ");

            if (splitNames.length >= 2 && splitNames[0].equalsIgnoreCase(lastName)) {
                System.out.println("Full Name: " + na);
                return na;
            }
        }
        return "NAME NOT FOUND";
    }


    public static boolean update(final String original, final String updatedName) {
           int index=0;
           boolean flag=false;
        for(int i=0;i< names.length;i++)
        {
            if(names[i].equals(updatedName)){
                index=i;
                flag=true;
            }
        }
        if(!flag){

            names=Arrays.copyOf(names,names.length+1);
            names[names.length-1]=updatedName;
            System.out.println("Updated array");
            System.out.println(Arrays.toString(names));
        }








        return false;
    }


}


