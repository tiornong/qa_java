package FelineTest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class EatMeatTest {

    @Test
    public void eatMeatTest() throws Exception {
        Feline feline = new Feline();  // заменить на мок?
        Assert.assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }
}
