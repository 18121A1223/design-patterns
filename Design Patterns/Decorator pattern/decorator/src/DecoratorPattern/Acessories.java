package DecoratorPattern;
//decorator
public abstract class Acessories extends Ipad{
    Ipad ipad;

    public Acessories(Ipad ipad) {
        this.ipad = ipad;
    }

}
