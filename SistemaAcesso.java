import javax.swing.JOptionPane;

public class SistemaAcesso {
    public static void main(String[] args) {
        final String LOGIN_CORRETO = "java8";
        final String SENHA_CORRETA = "java8";
        final int MAX_TENTATIVAS = 3;

        int tentativasRestantes = MAX_TENTATIVAS;

        while (tentativasRestantes > 0) {
            String login = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            if (login.equals(LOGIN_CORRETO) && senha.equals(SENHA_CORRETA)) {
                JOptionPane.showMessageDialog(null, "Acesso permitido! Bem-vindo ao sistema.");
                break;
            } else {
                tentativasRestantes--;
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tentativas restantes: " + tentativasRestantes);
            }
        }

        if (tentativasRestantes == 0) {
            JOptionPane.showMessageDialog(null, "Número máximo de tentativas excedido. Acesso bloqueado.");
        }
    }
}


