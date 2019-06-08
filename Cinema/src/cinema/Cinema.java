/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.text.ParseException;
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
    public static void main(String[] args) throws ParseException {

        ArrayList<sessao> listasessao = new ArrayList<>();
        ArrayList<poltrona> listapoltrona = new ArrayList<>();
        

        String opcao;
        boolean loop = true;
        while (loop) {
            opcao = JOptionPane.showInputDialog(null, "Escolha uma das opções: \n"
                    + "1 - Sessão \n"
                    + "2 - Poltrona \n"
                    + "3 - Sair");
            if(opcao.equals("3")){
                System.out.println("Encerrado");
                break;
            }
            if(opcao.equals("1")){
                loop = false;
                menu_sessao.menu_sessao(listasessao, listapoltrona);
            }
        }

    }

}
