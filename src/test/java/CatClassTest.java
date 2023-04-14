import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class CatClassTest {
    Cat cat;

    @Before
    public void createObjectsForTestClass() {
        Feline feline = new Feline();
        cat = new Cat(feline);
    }

    //Проверка звука, извадаемого котом
    @Test
    public void testCatGetCorrectSound() {
        assertEquals("Кот не мяукает", "Мяу", cat.getSound());
    }

    //Проверка того, что кот-хищник
    @Test
    public void testCatIsPredator() throws Exception {
        assertEquals("Кот ест другую еду", List.of("Животные", "Птицы", "Рыба"), cat.getFood());

    }

}