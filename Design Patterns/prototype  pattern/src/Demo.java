import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String args[]){

        List<Shape> shapeRegistery = new ArrayList<>();

        Circle circle = new Circle(1,2,"blue",5, 4);

        Circle anotherCircle = (Circle) circle.clone();

        Rectangle rectangle = new Rectangle(10,5,"green",5,5);
        Rectangle rectangle1 = (Rectangle) rectangle.clone();//downcasting to rectangle because it is


        shapeRegistery.add(circle);
        shapeRegistery.add(anotherCircle);
        shapeRegistery.add(rectangle);
        shapeRegistery.add(rectangle1);

        compareClones(shapeRegistery);





    }

    private static void compareClones(List<Shape> shapeRegistery) {
        List<Shape> shapeRegisteryCopy = new ArrayList<>();

        for (Shape shape:shapeRegistery){
            shapeRegisteryCopy.add(shape.clone());
        }
        Circle circle = new Circle(1,2,"blue",3,4);
        shapeRegisteryCopy.add(circle);
        shapeRegistery.add(circle);
        for (int i=0;i<shapeRegistery.size();i++){

            if (shapeRegistery.get(i) != shapeRegisteryCopy.get(i)){
                System.out.println("both are not same object");
                if (shapeRegistery.get(i).equals(shapeRegisteryCopy.get(i)))
                    System.out.println("yet they are identical");
                else
                    System.out.println("different objects");
            }
            else
                System.out.println("same objects");


        }
    }
}
