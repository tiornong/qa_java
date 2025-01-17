package FelineTest;

import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class GetKittensTest {

    @Test
    public void getKittensNoParametersTest() {
        Feline feline = new Feline();
        Feline felineSpy = Mockito.spy(feline);
        Assert.assertEquals(1, felineSpy.getKittens());
    }

    @Test
    public void getKittensWithParametersTest() {
        Feline feline = new Feline();
        Assert.assertEquals(5, feline.getKittens(5));
    }
}
