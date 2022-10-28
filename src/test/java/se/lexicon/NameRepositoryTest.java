package se.lexicon;

import org.junit.Assert;
import org.junit.Test;

public class NameRepositoryTest {

    @Test
    public void test_findByFirstname_return_Samuel(){
        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn",  "Samuel Test",
                "Farhad Towfighian"};
        NameRepository.setNames(names);

        int expectedSamuelNames = 2;
        int actualSamuelNames = NameRepository.findByFirstname("Samuel").length;
        Assert.assertEquals(expectedSamuelNames,actualSamuelNames);
       // Assert.assertEquals(expectedName,actualName);
        //Assert.assertEquals(expectedName,expectedName);

    }


    @Test
    public void test_findByFirstname_failed(){
        String[] names = {"Nivethitha Jothikumar", "Liljana Ristevska", "Veronica Okoli", "Samuel Svahn",  "Samuel Test",
                "Farhad Towfighian"};
        NameRepository.setNames(names);

        int expectedSamuelNames = 5;
        int actualSamuelNames = NameRepository.findByFirstname("Samuel").length;
        Assert.assertNotEquals(expectedSamuelNames,actualSamuelNames);
        // Assert.assertEquals(expectedName,actualName);
        //Assert.assertEquals(expectedName,expectedName);

    }
}
