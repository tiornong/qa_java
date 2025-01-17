package LionAlexTest;

import com.example.Feline;
import com.example.LionAlex;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class AddFriendTest {

    @Test
    public void addFriendTest() throws Exception {
        Feline feline = new Feline();
        LionAlex lionAlex = new LionAlex(feline);
        // Вот тут точно нужен Spy
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriendsList());
        lionAlex.addFriend("Тимати");
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман", "Тимати"), lionAlex.getFriendsList());


    }

}
