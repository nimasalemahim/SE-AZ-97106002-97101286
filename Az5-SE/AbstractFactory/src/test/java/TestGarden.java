import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestGarden {
    private GardenCreator igc = new IranianGardenCreator();
    private GardenCreator jgc = new JapaneseGardenCreator();


    @Test
    void testGardens() {
        AbstractTree iranianTree = igc.createTree();
        AbstractTree japaneseTree = jgc.createTree();

        AbstractFlower iranianFlower = igc.createFlower();
        AbstractFlower japaneseFlower = jgc.createFlower();




        assertEquals("Iranian Tree", iranianTree.getName());
        assertEquals("Japanese Tree", japaneseTree.getName());
        assertEquals("Iranian Flower", iranianFlower.getName());
        assertEquals("Japanese Flower", japaneseFlower.getName());


    }

}
