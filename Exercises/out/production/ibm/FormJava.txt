import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormJava extends JFrame {
    private JTextField tfNome;
    private JTextField tfEmail;
    private JTextField tfResultado;
    private JButton confirmarButton;
    private JButton limparButton;
    private JLabel emailLabel;
    private JLabel nomeLabel;
    private JPanel javaForm;

    public FormJava() {
        setContentPane(javaForm);
        setTitle("Cadastro");
        setSize(450, 300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        confirmarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = tfNome.getText();
                String email = tfEmail.getText();
                tfResultado.setText(nome + " : " + email);
            }
        });
        limparButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfNome.setText("");
                tfEmail.setText("");
                tfResultado.setText("");
            }
        });
    }

    public static void main(String[] args) {
        FormJava form = new FormJava();
    }
}
