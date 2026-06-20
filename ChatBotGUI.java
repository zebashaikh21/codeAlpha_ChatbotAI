import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChatBotGUI extends JFrame {

    private JTextArea chatArea;
    private JTextField inputField;
    private JButton sendButton;

    private ResponseGenerator generator;

    public ChatBotGUI() {

        generator = new ResponseGenerator();

        setTitle("AI ChatBot");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        chatArea = new JTextArea();
        chatArea.setEditable(false);
        chatArea.setFont(new Font("Arial", Font.PLAIN, 14));

        JScrollPane scrollPane = new JScrollPane(chatArea);

        inputField = new JTextField();

        sendButton = new JButton("Send");

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(inputField, BorderLayout.CENTER);
        panel.add(sendButton, BorderLayout.EAST);

        add(scrollPane, BorderLayout.CENTER);
        add(panel, BorderLayout.SOUTH);

        chatArea.append("Bot: Hello! I am your AI ChatBot.\n");

        sendButton.addActionListener(e -> processMessage());

        inputField.addActionListener(e -> processMessage());

        setVisible(true);
    }

    private void processMessage() {

        String userText = inputField.getText().trim();

        if (userText.isEmpty())
            return;

        chatArea.append("You: " + userText + "\n");

        String response = generator.generateResponse(userText);

        chatArea.append("Bot: " + response + "\n\n");

        inputField.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(ChatBotGUI::new);
    }
}