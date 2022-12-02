public class Rectangle extends Shape{
    float length;
    float width;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    @Override
    public float getArea(){
        return this.length * this.width;
    }
}
