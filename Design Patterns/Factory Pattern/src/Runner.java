import Creators.Dialog;
import Creators.WebDialog;
import Creators.WindowsDialog;

import java.util.Scanner;

public class Runner {

    // if we want more type of buttons we will extend the button interface
    // and make many classes as we want
    //and create concrete dialog and override createbutton()
    // for those classes such that they will return object of the class
    public static void main(String args[]) throws NullPointerException{
        Scanner sc= new Scanner(System.in);
        String env = sc.nextLine();
        Dialog dialog = null;
        if (env.equals("windows"))
             dialog = new WindowsDialog();
        else if (env.equals("web"))
            dialog = new WebDialog();
        if (dialog==null)
            System.out.println("enter correct environment");
        else
            dialog.Render();

        return;
    }
}
