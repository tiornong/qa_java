package FelineTest;

import com.example.Feline;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class EatMeatTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();

        Assert.assertEquals("Возвращен некорректный список пищи",
                List.of("Животные", "Птицы", "Рыба"),
                feline.eatMeat()
        );
    }

}
