public class Main {
    public static void main(String[] args) {

        UIFactory factory = new AFactory();


        Button button = factory.createButton("Submit");
        TextField textField = factory.createTextField("Enter Name");
        Checkbox checkbox = factory.createCheckbox("I Agree");


        button.display();
        textField.display();
        checkbox.display();


        button.setText("Click Me");
        textField.setText("Enter Email");
        checkbox.setText("I Accept");


        System.out.println("\nUpdated UI:");
        button.display();
        textField.display();
        checkbox.display();
    }
}