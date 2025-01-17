package FelineTest;

import com.example.Feline;

import org.junit.Assert;
import org.junit.Test;


public class GetKittensTest {

    @Test
    public void getKittensNoParametersTest() {
        Feline feline = new Feline();

        Assert.assertEquals("Возвращено некорректное количество детёнышей",
                1,
                feline.getKittens()
        );
    }

    @Test
    public void getKittensWithParametersTest() {
        Feline feline = new Feline();

        Assert.assertEquals("Возвращено некорректное количество детёнышей",
                5,
                feline.getKittens(5)
        );
    }

}
