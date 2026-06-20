public class ResponseGenerator {

    private KnowledgeBase kb;

    public ResponseGenerator() {
        kb = new KnowledgeBase();
    }

    public String generateResponse(String input) {

        String intent = IntentClassifier.detectIntent(input);

        switch (intent) {

            case "GREETING":
                return "Hello! How can I help you today?";

            case "EXIT":
                return "Goodbye! Have a nice day.";

            case "JAVA":
                return kb.getResponse("java");

            case "OOP":
                return kb.getResponse("oop");

            case "ARRAYLIST":
                return kb.getResponse("arraylist");

            case "INHERITANCE":
                return kb.getResponse("inheritance");

            case "POLYMORPHISM":
                return kb.getResponse("polymorphism");

            case "ENCAPSULATION":
                return kb.getResponse("encapsulation");

            case "ABSTRACTION":
                return kb.getResponse("abstraction");

            case "DSA":
                return kb.getResponse("dsa");

            default:
                return "Sorry, I don't understand that question.";
        }
    }
}