package FelineTest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class GetKittensTest {

    @Test
    public void getKittensTest() {
        Feline feline = new Feline(); // заменить на Spy
        Assert.assertEquals(1, feline.getKittens());
    }
}
