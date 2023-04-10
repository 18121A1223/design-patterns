package AbstractFactories;

import ButtonFamily.Button;
import ButtonFamily.webButton;
import CheckboxFamily.WebCheckBox;
import CheckboxFamily.checkbox;

public class WebFactory implements GUIElementsFactory{
    @Override
    public Button CreateButton() {
        return new webButton();
    }

    @Override
    public checkbox CreateCheckBox() {
        return new WebCheckBox();
    }
}
