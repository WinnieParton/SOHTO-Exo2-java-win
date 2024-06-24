
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testComputeAssiettePetitNormalNoCoffee() {
        App app = new App();
        int price = app.Compute("assiette", "couscous", "coca", "petit", "baba", "normal", "no");
        assertEquals(19, price); 
    }

    @Test
    public void testComputeAssietteMoyenNormalWithCoffee() {
        App app = new App();
        int price = app.Compute("assiette", "couscous", "coca", "moyen", "baba", "normal", "yes");
        assertEquals(18, price);  
    }

    @Test
    public void testComputeAssietteGrandSpecialNoCoffee() {
        App app = new App();
        int price = app.Compute("assiette", "couscous", "coca", "grand", "baba", "special", "no");
        assertEquals(25, price);  
    }

    @Test
    public void testComputeSandwichPetitNormalNoCoffee() {
        App app = new App();
        int price = app.Compute("sandwich", "couscous", "coca", "petit", "baba", "normal", "no");
        assertEquals(15, price);  
    }

    @Test
    public void testComputeSandwichMoyenNormalWithCoffee() {
        App app = new App();
        int price = app.Compute("sandwich", "couscous", "coca", "moyen", "baba", "normal", "yes");
        assertEquals(13, price);  
    }

    @Test
    public void testComputeSandwichGrandSpecialNoCoffee() {
        App app = new App();
        int price = app.Compute("sandwich", "couscous", "coca", "grand", "baba", "special", "no");
        assertEquals(19, price);  
    }

    @Test
    public void testComputeInvalidInput() {
        App app = new App();
        int price = app.Compute(null, "couscous", "coca", "grand", "baba", "special", "no");
        assertEquals(-1, price);  
    }
}
