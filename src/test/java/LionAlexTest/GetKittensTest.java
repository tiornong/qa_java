package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

public class GetKittensTest {

    @Test
    public void getKittensTest() throws Exception{
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        Assert.assertEquals(0, lionAlex.getKittens());
    }

}
