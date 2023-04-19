public class Circle extends Shape{
    int radius;

    public Circle(int x, int y, String color, int radius, int i) {
        super(x, y, color);
        this.radius = radius;
    }

    public Circle(Circle circle){
        super(circle);
        this.radius = circle.radius;
    }


    @Override
    public Shape clone() {
        return new Circle(this);
    }

    public boolean equals(Object object){
        if (!super.equals(object)) return false;
        if ( object instanceof Circle){
            Circle obj = (Circle) object;
            return obj.radius == this.radius;
        }
        return false;

    }


}
