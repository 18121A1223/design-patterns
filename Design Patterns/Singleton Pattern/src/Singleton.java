public class Singleton {

    private static Singleton singletonInstance;
    int objectNo;

    private Singleton(int objectNo){
        this.objectNo = objectNo;
    }

    public static Singleton getInstance(){
        if (singletonInstance == null){
            singletonInstance = new Singleton(5);
        }
        return singletonInstance;
    }


}
