package ButtonFamily;

import ButtonFamily.Button;

public class webButton implements Button {
    @Override
    public void render() {
        System.out.println("rendering web app button");
    }
}
