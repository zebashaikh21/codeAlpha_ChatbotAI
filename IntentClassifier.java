public class IntentClassifier {

    public static String detectIntent(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi"))
            return "GREETING";

        if (input.contains("bye") || input.contains("exit"))
            return "EXIT";

        if (input.contains("java"))
            return "JAVA";

        if (input.contains("oop"))
            return "OOP";

        if (input.contains("arraylist"))
            return "ARRAYLIST";

        if (input.contains("inheritance"))
            return "INHERITANCE";

        if (input.contains("polymorphism"))
            return "POLYMORPHISM";

        if (input.contains("encapsulation"))
            return "ENCAPSULATION";

        if (input.contains("abstraction"))
            return "ABSTRACTION";

        if (input.contains("dsa"))
            return "DSA";

        return "UNKNOWN";
    }
}