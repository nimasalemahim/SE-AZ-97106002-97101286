public class Square extends Shape{
    float side;

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public float getArea(){
        return this.side * this.side;
    }
}
