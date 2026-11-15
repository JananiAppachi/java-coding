class Pen {
    String color;
    String type;

    public void function() {
        System.out.println("Writing something with");
    }

    public void penInfo() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "black";
        pen1.type = "ballpoint";
        pen1.function();
        pen1.penInfo();

        Pen pen2 = new Pen();
        pen2.color = "Blue";
        pen2.type = "gel";
        pen2.function();
        pen2.penInfo();
    }

}
