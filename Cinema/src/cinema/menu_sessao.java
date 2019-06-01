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
public class menu_sessao {

    public static int menu_sessao(ArrayList<sessao> listasessao,
            ArrayList<poltrona> listapoltrona) {

        String opcao;
        boolean loop = true;

        while (loop) {
            opcao = JOptionPane.showInputDialog(null, "Escolha uma das opcoes: \n "
                    + " 1 - Cadastrar Sessão \n"
                    + " 2 - Alterar Sessão \n"
                    + " 3 - Consultar Sessão \n"
                    + " 4 - Excluir Sessão \n"
                    + " 5 - Listar Sessão \n"
                    + " 6 - Listar Sessão pelo Horário \n"
                    + " 7 - Voltar");
        }
        return 0;

    }

}
