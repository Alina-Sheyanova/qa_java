import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalClassTest {
    Animal animal = new Animal();

    //проверка вывода семейств
    @Test
    public void testAnimalGetFoodReturnCorrectString() {
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

    //проверка вызова исключения в случае несовпадения вида
    @Test
    public void testAnimalGetFoodReturnCorrectTrowString() {
        String expectedAnswer = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
        Exception actualAnswer = Assert.assertThrows(Exception.class, () -> animal.getFood("Пончикоядное"));
        assertEquals("Неправильный ответ", expectedAnswer, actualAnswer.getMessage());
    }
}