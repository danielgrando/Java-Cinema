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
public class menu_poltrona {

    public static int menu_poltrona(ArrayList<poltrona> listapoltrona) {

        String opcao;
        boolean loop = true;

        while (loop) {
            opcao = JOptionPane.showInputDialog(null, "Escolha uma das opcoes: \n "
                    + " 1 - Nova Poltrona \n"
                    + " 2 - Alterar Poltrona \n"
                    + " 3 - Excluir Poltrona \n"
                    + " 4 - Consultar Poltrona \n"
                    + " 5 - Listar Poltrona da Sessão \n"
                    + " 6 - Listar Renda da Sessão escolhida \n"
                    + " 7 - Listar todas Poltronas \n"
                    + " 8 - Voltar");
        }
        return 0;

    }

}
