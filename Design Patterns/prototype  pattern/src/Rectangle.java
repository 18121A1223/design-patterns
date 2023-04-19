import javax.xml.stream.FactoryConfigurationError;

public class Rectangle extends Shape{
    int width, bredth;

    public Rectangle(int x, int y, String color, int width, int bredth) {
        super(x, y, color);
        this.width = width;
        this.bredth = bredth;
    }

    public Rectangle(Rectangle rectangle) {
        super(rectangle);
        this.width = rectangle.width;
        this.bredth = rectangle.bredth;
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object) || object instanceof Rectangle) return false;
        Rectangle obj = (Rectangle) object;
        return obj.bredth == this.bredth && obj.width == this.width;
    }


}
