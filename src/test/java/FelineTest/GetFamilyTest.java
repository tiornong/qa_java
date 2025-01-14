package FelineTest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class GetFamilyTest {

    @Test
    public void getFamilyTest() {
        Feline feline = new Feline();  // заменить на мок?
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }
}
