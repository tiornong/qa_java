package LionTest;

import Constants.Constants;
import com.example.Feline;
import com.example.Lion;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class GetKittensTest {

    @Test
    public void getKittensTest() throws Exception {
        Feline felineMock = Mockito.mock(Feline.class);
        Mockito.when(felineMock.getKittens()).thenReturn(1);

        Lion lion = new Lion(Constants.DEFAULT_TEST_SEX, felineMock);
        Assert.assertEquals(1, lion.getKittens());
    }
}