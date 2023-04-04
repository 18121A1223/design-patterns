package DecoratorPattern;

public class AppleStore {

    public static void main(String args[]){
        Ipad ipad=new Applepencil(new IpadAir());
        System.out.println("cost: "+ipad.cost());
        Ipad ipad2=new Applepencil(new MagicKeyBoard(new IpadPro()));
        System.out.println("cost: "+ipad2.cost());
    }
}
