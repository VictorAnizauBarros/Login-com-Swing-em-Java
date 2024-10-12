import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaixadeTexto extends JFrame{
    private JTextField usuario;
    private JPasswordField senha;
    private JButton login,limpa;
    private JLabel user,pass;

    public CaixadeTexto(){
        super("Login em Java");
        setLayout(new FlowLayout());

        user = new JLabel("Usuário: ");
        user.setBounds(50,50,100,30);
        add(user);

        usuario = new JTextField(15);
        usuario.setBounds(120,50,120,25);
        add(usuario);

        pass = new JLabel("Senha: ");
        pass.setBounds(50,80,100,30);
        add(pass);

        senha = new JPasswordField(15);
        senha.setBounds(120,80,120,25);
        add(senha);

        login = new JButton("Entrar");
        login.setBounds(50,120,80,30);
        login.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evento){
                if(evento.getSource()== login)
                    if(usuario.getText().equals("Java") && senha.getText().equals("1234"))
                        JOptionPane.showMessageDialog(null,"Parabens, você entrou na Matrix.");
                    else
                        JOptionPane.showMessageDialog(null,"Senha errada, estude Java!");
            }
        }
        );
        add(login);

        limpa = new JButton("Limpar");
        limpa.setBounds(150,120,80,30);
        limpa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evento) {
                usuario.setText("");
                senha.setText("");

            }
        }
        );
        add(limpa);
    }
}
