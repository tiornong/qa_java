package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class GetPlaceOfLivingTest {

    @Test
    public void getPlaceOfLivingTest() throws Exception{
        Feline felineMock = Mockito.mock(Feline.class);
        LionAlex lionAlex = new LionAlex(felineMock);

        Assert.assertEquals("Получено некорректное место обитания",
                "Нью-Йоркский Зоопарк",
                lionAlex.getPlaceOfLiving()
        );
    }

}
