import AbstractFactories.GUIElementsFactory;
import ButtonFamily.Button;
import CheckboxFamily.checkbox;

public class Application {
     Button button;

    checkbox chkbox;

    public Application(GUIElementsFactory guiElementsFactory){
        this.button = guiElementsFactory.CreateButton();
        this.chkbox = guiElementsFactory.CreateCheckBox();
    }
    public void Render(){
        button.render();
        chkbox.checked();
    }
}
