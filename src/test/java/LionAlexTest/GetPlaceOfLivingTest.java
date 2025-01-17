package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

public class GetPlaceOfLivingTest {

    @Test
    public void getPlaceOfLivingTest() throws Exception{
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertEquals("Нью-Йоркский Зоопарк", lionAlex.getPlaceOfLiving());
    }

}
