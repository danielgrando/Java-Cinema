/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author grand
 */
public class Cinema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<sessao> listasessao = new ArrayList<>();
        ArrayList<poltrona> listapoltrona = new ArrayList<>();

        String opcao;
        boolean loop = true;
        while (loop) {
            opcao = JOptionPane.showInputDialog(null, "Escolha uma das opções: \n"
                    + "1 - Sessão \n"
                    + "2 - Poltrona \n"
                    + "3 - Sair");
        }

    }

}
