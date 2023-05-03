public class Staff implements Employee{

    String name;
    String position;

    public Staff(String name, String position) {
        this.name = name;
        this.position = position;
    }

    @Override
    public void print() {
        System.out.println("employee Name :"+this.name +" position: "+this.position);
    }
}
