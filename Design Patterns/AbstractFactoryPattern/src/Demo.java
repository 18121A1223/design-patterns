import AbstractFactories.GUIElementsFactory;
import AbstractFactories.WebFactory;
import AbstractFactories.WindowsFactory;

import java.util.Scanner;

public class Demo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String env = sc.nextLine();
        Application app = createGUI(env);
        app.Render();
    }

    private static Application createGUI(String env) {
        GUIElementsFactory guiElementsFactory;
        if (env.equals("Windows"))
            guiElementsFactory = new WindowsFactory();
        else
            guiElementsFactory = new WebFactory();
        Application app = new Application(guiElementsFactory);
        return app;

    }
}
