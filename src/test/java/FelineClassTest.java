import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineClassTest {
    Feline feline = new Feline();

    //проверка семейства
    @Test
    public void testIsFelineTest() {
        assertEquals("Вид не совпал", "Кошачьи", feline.getFamily());
    }

    //проверка еды
    @Test
    public void testFelineEatsMeet() throws Exception {
        assertEquals("Кошачьи едят не это", List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    //проверка возвращаеого значения котят методом без параметров
    @Test
    public void testFelineReturnsKittensCountWithoutParameters() {
        assertEquals("Количество котят не совпало", 1, feline.getKittens());
    }

    //проверка возвращаеого значения котят методом с параметрами
    @Test
    public void testFelineReturnsKittensCountWithParameters() {
        assertEquals("Количество котят не совпало", 5, feline.getKittens(5));
    }


}