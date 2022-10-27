package se.lexicon;

import static org.example.NameRepository.clear;
import static org.example.NameRepository.findByLastName;
public class App 
{
    public static void main(String[] args) {
        boolean blabla = clear();
        if (blabla){
            System.out.println("Array has been cleared!");
        }

        String result = findByLastName("Veronica");
        System.out.println(result);
    }

}

