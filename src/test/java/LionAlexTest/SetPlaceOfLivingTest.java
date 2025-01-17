package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class SetPlaceOfLivingTest {

    @Test
    public void setPlaceOfLivingTest() throws Exception{
        Feline felineMock = Mockito.mock(Feline.class);
        LionAlex lionAlex = new LionAlex(felineMock);

        lionAlex.setPlaceOfLiving("Кремль");

        Assert.assertEquals("Возвращен некорректный список друзей",
                "Кремль",
                lionAlex.getPlaceOfLiving()
        );
    }

}
