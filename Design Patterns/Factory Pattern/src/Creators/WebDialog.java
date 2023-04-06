package Creators;

import Product.Button;
import Product.HtmlButton;

public class WebDialog extends Dialog{
    @Override
    public Button CreateButton() {
        return new HtmlButton();
    }
}
