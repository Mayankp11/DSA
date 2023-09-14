public class Main {
    public static void main(String[] argument){
        var textBox1 = new TextBox();              // var is use to mention the class. and will be recognised by new;
        textBox1.setText("One1");

        System.out.println(textBox1.text);

        var textBox2 = new TextBox();
        textBox2.setText("Two2");

        System.out.println(textBox2.text);



    }

}
