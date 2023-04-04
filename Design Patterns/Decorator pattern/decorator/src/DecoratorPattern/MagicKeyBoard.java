package DecoratorPattern;

public class MagicKeyBoard extends Acessories{
    public MagicKeyBoard(Ipad ipad) {
        super(ipad);
    }

    @Override
    public int cost() {
        return ipad.cost()+350;
    }
}
