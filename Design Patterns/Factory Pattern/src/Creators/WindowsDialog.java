package Creators;

import Product.Button;
import Product.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button CreateButton() {
        return new WindowsButton();
    }
}
