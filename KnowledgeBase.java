import java.util.HashMap;

public class KnowledgeBase {

    private HashMap<String, String> faq;

    public KnowledgeBase() {

        faq = new HashMap<>();

        faq.put("java", "Java is a high-level, object-oriented programming language.");
        faq.put("oop", "OOP stands for Object-Oriented Programming.");
        faq.put("arraylist", "ArrayList is a dynamic array in Java.");
        faq.put("inheritance", "Inheritance allows one class to acquire properties of another class.");
        faq.put("polymorphism", "Polymorphism allows one interface to have multiple implementations.");
        faq.put("encapsulation", "Encapsulation means binding data and methods together.");
        faq.put("abstraction", "Abstraction hides implementation details.");
        faq.put("dsa", "DSA stands for Data Structures and Algorithms.");
    }

    public String getResponse(String keyword) {
        return faq.get(keyword);
    }
}