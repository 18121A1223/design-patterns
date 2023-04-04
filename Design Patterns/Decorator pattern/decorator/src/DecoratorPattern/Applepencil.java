package DecoratorPattern;

public class Applepencil extends Acessories{
    public Applepencil(Ipad ipad) {
        super(ipad);
    }

    @Override
    public int cost() {
        return ipad.cost()+120;
    }
}
