package Creators;

import Product.Button;

public abstract class Dialog {
    public void Render(){
        Button button = CreateButton();
        button.render();
    }
    //factory method which will be overriden by subclass(concrete product Creators)
    public abstract Button CreateButton();

}
