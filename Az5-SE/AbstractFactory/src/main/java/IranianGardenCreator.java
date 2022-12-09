public class IranianGardenCreator implements GardenCreator{

    @Override
    public IranianTree createTree(){
        return new IranianTree();
    }

    @Override
    public IranianFlower createFlower(){
        return new IranianFlower();
    }


}
