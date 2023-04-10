package AbstractFactories;

import ButtonFamily.Button;
import ButtonFamily.WindowsButton;
import CheckboxFamily.WindowsCheckBox;
import CheckboxFamily.checkbox;

public class WindowsFactory implements GUIElementsFactory{
    @Override
    public Button CreateButton() {
        return new WindowsButton();
    }

    @Override
    public checkbox CreateCheckBox() {
        return new WindowsCheckBox();
    }
}
