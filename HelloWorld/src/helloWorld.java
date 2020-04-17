import javax.swing.*;

public class helloWorld extends  JFrame{

    public helloWorld(){
        setTitle("Hello World");
        setSize(400,300);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
    public static void main(String[] args) {
        new helloWorld();

    }
}
