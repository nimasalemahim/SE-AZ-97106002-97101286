public class JapaneseGardenCreator implements GardenCreator{


    @Override
    public JapaneseTree createTree() {
        return new JapaneseTree();
    }

    @Override
    public JapaneseFlower createFlower() {
        return new JapaneseFlower();
    }
}
