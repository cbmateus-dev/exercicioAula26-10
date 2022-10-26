
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Exercicio2610 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        int selecionado = 0;
        Object[] opcoes = { "Incluir", "Listar", "Apagar", "Alterar", "Finalizar" };
        do {
            selecionado = JOptionPane.showOptionDialog(
                    null,
                    "O que você deseja?",
                    "Exemplo",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null, opcoes, opcoes[0]);
            if (selecionado == 0) { // opcoes[selecionado].equals("Incluir")
                String item = JOptionPane.showInputDialog("Digite o nome do item que deseja alterar:");
                lista.add(item); // guarda na lista o item digitado
            }
            if (selecionado == 1) {
                String msg = "";
                for (String item : lista) {
                    msg += item + "\n";
                }
                JOptionPane.showMessageDialog(null, msg);
            }
            if (selecionado == 2) {
                Object[] opcaoApagar = new Object[lista.size()];
                for (int i = 0; i < opcaoApagar.length; i++) {
                    opcaoApagar[i] = lista.get(i);
                }
                Object itemSelecionado = JOptionPane.showInputDialog(
                        null,
                        "Selecione o item para apagar",
                        "Apagar",
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        opcaoApagar,
                        opcaoApagar[0]);

                for (int i = 0; i < lista.size(); i++) {
                    if (itemSelecionado.toString().equals(lista.get(i))) {
                        lista.remove(i);
                    }
                }
            }
            if (selecionado == 3) {
                Object[] opcaoAlterar = new Object[lista.size()];
                for (int i = 0; i < opcaoAlterar.length; i++) {
                    opcaoAlterar[i] = lista.get(i);
                }
                Object itemSelecionado = JOptionPane.showInputDialog(
                        null,
                        "Selecione o item para alterar",
                        "Alterar",
                        JOptionPane.INFORMATION_MESSAGE,
                        null,
                        opcaoAlterar,
                        opcaoAlterar[0]);
                for (int i = 0; i < lista.size(); i++) {
                    if (itemSelecionado.toString().equals(lista.get(i))) {
                        String item = JOptionPane.showInputDialog("Digite o novo nome do item:");
                        lista.set(i, item); // guarda na lista o item digitado
                    }
                }
            }
        } while (selecionado != 4);

    }
}
