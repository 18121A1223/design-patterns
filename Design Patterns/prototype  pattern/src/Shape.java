public abstract class Shape {
    int x,y;
    String color;

    public Shape(int x, int y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public Shape(Shape shape) {
        this.x=shape.x;
        this.y=shape.y;
        this.color=shape.color;
    }

    public abstract Shape clone();

    public String getColor(){
        return this.color;
    }


    public boolean equals(Object object){
        if (object instanceof Shape){
            Shape obj = (Shape) object;
            return obj.x == this.x &&
                     obj.y == this.y &&
                     obj.color.equals(this.color);
        }
        return false;

    }
}
