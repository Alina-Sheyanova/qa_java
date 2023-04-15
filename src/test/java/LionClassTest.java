import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class LionClassTest {

    Feline feline = new Feline();

    //проверка какуж еду ест лев
    @Test
    public void testLionEatCorrectFood() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertEquals("Лев ест другую еду", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }

    //проверка вызова исключения для неподходящего пола
    @Test
    public void testLionOtherSexTrowsException() {
        String expectedAnswer = "Используйте допустимые значения пола животного - самец или самка";
        Exception actualAnswer = Assert.assertThrows(Exception.class, () -> new Lion("Я самец", feline));
        assertEquals("Ответы не совпали", expectedAnswer, actualAnswer.getMessage());
    }


}