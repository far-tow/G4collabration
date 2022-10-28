package se.lexicon;



import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NameRepositoryTest {

    @Test
    public void testfind() {
        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn",
                "Farhad Towfighian"};
        String fullName = "Liljana Ristevska";
        NameRepository.setNames(names);
        String value = NameRepository.find("Liljana Ristevska");
        assertEquals(fullName, value);

    }

    @Test
  public void updateTest() {
        String[] names = {"Mehrdad Javan", "Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn",
                "Farhad Towfighian"};

        NameRepository.setNames(names);
        assertEquals(6, NameRepository.getSize());

        boolean value = NameRepository.update("Nivethitha Jothikumar", "Nivethitha Jayanth");
        assertTrue(value);

        String expectedName = "Nivethitha Jayanth";
        String actualName = NameRepository.find("Nivethitha Jayanth");

        assertEquals(expectedName, actualName);


    }


}
