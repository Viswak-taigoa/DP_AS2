public class Main {
    public static void main(String[] args) {
        UIFactory factory = new AFactory();

        Button buttonA = factory.createButton("Submit");
        TextField textFieldA = factory.createTextField("Enter Name");
        Checkbox checkboxA = factory.createCheckbox("I Agree");

        System.out.println("UI Elements in Style A:");
        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        buttonA.setText("Click Me");
        textFieldA.setText("Enter Email");
        checkboxA.setText("I Accept");

        System.out.println("\nUpdated UI Elements in Style A:");
        buttonA.display();
        textFieldA.display();
        checkboxA.display();

        factory = new BFactory();

        Button buttonB = factory.createButton("Submit");
        TextField textFieldB = factory.createTextField("Enter Address");
        Checkbox checkboxB = factory.createCheckbox("I Agree");

        System.out.println("\nUI Elements in Style B:");
        buttonB.display();
        textFieldB.display();
        checkboxB.display();

        buttonB.setText("Press Me");
        textFieldB.setText("Enter Zip Code");
        checkboxB.setText("I Accept");

        System.out.println("\nUpdated UI Elements in Style B:");
        buttonB.display();
    }
}
