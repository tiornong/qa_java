package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

public class SetPlaceOfLivingTest {

    @Test
    public void setPlaceOfLivingTest() throws Exception{
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertEquals("Нью-Йоркский Зоопарк", lionAlex.getPlaceOfLiving());
        // Нет смысла городить параметризацию
        lionAlex.setPlaceOfLiving("Кремль");
        Assert.assertEquals("Кремль", lionAlex.getPlaceOfLiving());
    }

}
