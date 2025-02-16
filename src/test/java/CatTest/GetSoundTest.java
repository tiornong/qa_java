package CatTest;

import com.example.Cat;
import com.example.Feline;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;


public class GetSoundTest {

    @Test
    public void getSoundTest() {
        Feline felineMock = Mockito.mock(Feline.class);
        Cat cat = new Cat(felineMock);

        assertEquals("Возвращен некорректный звук",
                "Мяу",
                cat.getSound()
        );
    }

}