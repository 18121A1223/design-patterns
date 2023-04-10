package AbstractFactories;

import ButtonFamily.Button;
import CheckboxFamily.checkbox;

public interface GUIElementsFactory {
    public Button CreateButton();
    public checkbox CreateCheckBox();
}
