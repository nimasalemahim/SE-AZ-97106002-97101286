import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class TestLaptopBuilder {

    Director director = new Director();


    @Test
    void testLaptopBuilder() {
        AsusBuilder asusBuilder = new AsusBuilder();
        director.ConstructAsus(asusBuilder);
        Asus asus = asusBuilder.getResult();

        assertEquals("Asus", asus.getType());
        assertEquals("Asus Cpu", asus.getCpu());

        MacBuilder macBuilder = new MacBuilder();
        director.ConstructMac(macBuilder);
        MacLaptop mac = macBuilder.getResult();

        assertEquals("Mac", mac.getType());
        assertEquals("Mac Cpu", mac.getCpu());


    }
}
