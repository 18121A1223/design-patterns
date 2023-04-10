package ButtonFamily;

import ButtonFamily.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("rendering windows button");
    }
}
