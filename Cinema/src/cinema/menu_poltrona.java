/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author grand
 */
public class menu_poltrona {

    public static void menu_poltrona(ArrayList<poltrona> listapoltrona, ArrayList<sessao> listasessao) {

        String opcao;
        boolean loop = true;
        Scanner scan = new Scanner(System.in);

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

            if (opcao.equals("1")) {
                poltrona pol = new poltrona();
                System.out.println("Digite o numero da poltrona: ");
                int n = scan.nextInt();
                pol.setNumeropoltrona(n);
                System.out.println("Digite o nome da pessoa: ");
                String nome = scan.next();
                pol.setNome(nome);
                System.out.println("Digite o tipo da poltrona: ");
                String tipo = scan.next();
                pol.setTipo(tipo);
                System.out.println("Digite se tem necessidades especiais: ");
                boolean necessidade = scan.nextBoolean();
                pol.setNecessidade_especiais(necessidade);
                System.out.println("Digite a sessão da poltrona: ");
                String sessao = scan.next();
                pol.setSessao(sessao);
                listapoltrona.add(pol);

            } else if (opcao.equals("2")) {
                String nome = JOptionPane.showInputDialog(null, "Digite o nome da poltrona", "Alterar Cadastro da Poltrona", 3);
                if (nome != null) {
                    for (int i = 0; i < listapoltrona.size(); i++) {
                        if (listapoltrona.get(i).getNome().equals(nome)) {
                            poltrona a = listapoltrona.get(i);
                            System.out.println("Digite o nome da pessoa: ");
                            String nome1 = scan.next();
                            a.setNome(nome1);
                            System.out.println("Digite o tipo da poltrona: ");
                            String tipo = scan.next();
                            a.setTipo(tipo);
                            System.out.println("Digite se tem necessidades especiais: ");
                            boolean necessidade = scan.nextBoolean();
                            a.setNecessidade_especiais(necessidade);
                            System.out.println("Digite a sessão da poltrona: ");
                            String sessao = scan.next();
                            for (int j = 0; j < listasessao.size(); j++) {
                                if (sessao.equals(listasessao.get(j).getNomesessao())) {
                                    a.setSessao(sessao);
                                }
                            }

                        }
                    }

                }

            } else if (opcao.equals("3")) {
                String numero = JOptionPane.showInputDialog(null, "Digite o numero da Poltrona", "Excluir Cadastro de Poltrona", 3);
                int numeroConvertido = Integer.parseInt(numero);
                if (numero != null) {
                    for (int i = 0; i < listapoltrona.size(); i++) {
                        if (listapoltrona.get(i).getNumeropoltrona() == numeroConvertido) {
                            listapoltrona.remove(i);
                            JOptionPane.showMessageDialog(null, "O Cadastro da Poltrona " + numero + " foi excluido", "Excluir Cadastro da Poltrona", 3);
                        }
                    }
                }

            }else if(opcao.equals("4")){
                String numero = JOptionPane.showInputDialog(null, "Digite o numero da Poltrona", "Consultar Cadastro de Poltrona", 3);
                String poltronas = "\n";
                    int numeroConvertido = Integer.parseInt(numero);
                    if(numero != null){
                        for (int i = 0; i < listapoltrona.size(); i++) {
                            if(listapoltrona.get(i).getNumeropoltrona()== numeroConvertido){
                                poltronas = "Numero Poltrona: "+ listapoltrona.get(i).getNumeropoltrona()+"\n Nome: " +
                                        listapoltrona.get(i).getNome()+ "\n Tipo: "+ listapoltrona.get(i).getTipo() +
                                        "\n Necessidades Especiais: "+ listapoltrona.get(i).getNecessidade_especiais()+
                                        "\n Sessão: " + listapoltrona.get(i).getSessao();                     
                            }
                        }
                        JOptionPane.showMessageDialog(null, poltronas, "Poltronas cadastradas", 3);
                    }        
            }else if (opcao.equals("5")) {
                System.out.println("Digite o nome da sessão");
                String nomes = scan.next();
                for (int i = 0; i < listapoltrona.size(); i++) {
                    if (nomes.equals(listapoltrona.get(i).getSessao())) {
                        System.out.println("Número: " + listapoltrona.get(i).getNumeropoltrona());
                    }
                }

            }else if(opcao.equals("6")){
                
                
                
            }
        }
    }
}
