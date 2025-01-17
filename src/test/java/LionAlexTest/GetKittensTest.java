package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class GetKittensTest {

    @Test
    public void getKittensTest() throws Exception{
        Feline felineMock = Mockito.mock(Feline.class);
        LionAlex lionAlex = new LionAlex(felineMock);

        Assert.assertEquals("Получено некорректное количество детёнышей",
                0,
                lionAlex.getKittens()
        );
    }

}
