public class Demo {

    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1==singleton2);
        System.out.println("object no of singleton1"+ " "+ singleton1.objectNo);
        System.out.println("object no of singleton2"+" "+ singleton2.objectNo);
    }
}
