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

        if (listasessao.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não existe sessões cadastradas!", "Alerta", 3);
            loop = false;
        } else {

            while (loop) {
                opcao = JOptionPane.showInputDialog(null, "Escolha uma das opcoes: \n "
                        + "1 - Nova Poltrona \n"
                        + " 2 - Alterar Poltrona \n"
                        + " 3 - Excluir Poltrona \n"
                        + " 4 - Consultar Poltrona \n"
                        + " 5 - Listar Poltrona da Sessão \n"
                        + " 6 - Listar Renda da Sessão escolhida \n"
                        + " 7 - Listar todas Poltronas \n"
                        + " 8 - Voltar");

                if (opcao.equals("1")) {
                    poltrona pol = new poltrona();
                    String n = JOptionPane.showInputDialog(null, "Digite o numero da poltrona: ", "Cadastro", 3);
                    int numero_convertido = Integer.parseInt(n);
                    pol.setNumeropoltrona(numero_convertido);
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome da pessoa: ", "Cadastro", 3);
                    pol.setNome(nome);
                    String tipo = JOptionPane.showInputDialog(null, "Digite o tipo da poltrona (Meia ou Inteira): ", "Cadastro", 3);
                    pol.setTipo(tipo);
                    String necessidades = JOptionPane.showInputDialog(null, "Digite se tem necessidades especiais (True ou False): ", "Cadastro", 3);
                    boolean b = Boolean.getBoolean(necessidades);
                    pol.setNecessidade_especiais(b);
                    String sessao = JOptionPane.showInputDialog(null, "Digite a sessao da poltrona: ", "Cadastro", 3);
                    for (int i = 0; i < listasessao.size(); i++) {
                        if (sessao.equals(listasessao.get(i).getNomesessao())) {
                            pol.setSessao(listasessao.get(i));
                        }
                    }
                    listapoltrona.add(pol);

                } else if (opcao.equals("2")) {
                    if (listapoltrona.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não existe poltrona cadastrada!", "Alerta", 3);
                    } else {
                        String numero = JOptionPane.showInputDialog(null, "Digite o número da poltrona: ", "Alterar Cadastro da Poltrona", 3);
                        if (numero.equals("")) {
                            JOptionPane.showMessageDialog(null, "Numero inválido!", "Alterar", 3);
                        } else {
                            int numero_convertido = Integer.parseInt(numero);
                            for (int i = 0; i < listapoltrona.size(); i++) {
                                if (listapoltrona.get(i).getNumeropoltrona() == numero_convertido) {
                                    poltrona a = listapoltrona.get(i);
                                    String nome1 = JOptionPane.showInputDialog(null, "Digite o nome da pessoa: ", "Cadastro", 3);
                                    a.setNome(nome1);
                                    String tipo = JOptionPane.showInputDialog(null, "Digite o tipo da poltrona (Meia ou Inteira): ", "Cadastro", 3);
                                    a.setTipo(tipo);
                                    String necessidades = JOptionPane.showInputDialog(null, "Digite se tem necessidades especiais (True ou False): ", "Cadastro", 3);
                                    boolean necessidade = scan.nextBoolean();
                                    a.setNecessidade_especiais(necessidade);
                                    String sessao = JOptionPane.showInputDialog(null, "Digite a sessao da poltrona: ", "Cadastro", 3);
                                    for (int b = 0; b < listasessao.size(); b++) {
                                        if (sessao.equals(listasessao.get(i).getNomesessao())) {
                                            a.setSessao(listasessao.get(i));
                                        }

                                    }
                                } else {
                                    JOptionPane.showMessageDialog(null, "Poltrona inválida!", "Alterar", 3);
                                }
                            }
                        }

                    }
                } else if (opcao.equals("3")) {
                    if (listapoltrona.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não existe poltrona cadastrada!", "Alerta", 3);
                    } else {
                        String numero = JOptionPane.showInputDialog(null, "Digite o numero da Poltrona: ", "Excluir Cadastro de Poltrona", 3);
                        if (numero.equals("")) {
                            JOptionPane.showMessageDialog(null, "Número inválido!", "Consultar", 3);
                        } else {
                            int numeroConvertido = Integer.parseInt(numero);
                            for (int i = 0; i < listapoltrona.size(); i++) {
                                if (listapoltrona.get(i).getNumeropoltrona() == numeroConvertido) {
                                    listapoltrona.remove(i);
                                    JOptionPane.showMessageDialog(null, "O Cadastro da Poltrona " + numero + " foi excluido!", "Excluir Cadastro da Poltrona", 3);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Poltrona inválida!", "Remover", 3);
                                }
                            }

                        }

                    }

                } else if (opcao.equals("4")) {
                    if (listapoltrona.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não existe poltrona cadastrada!", "Alerta", 3);
                    } else {
                        String numero = JOptionPane.showInputDialog(null, "Digite o numero da Poltrona: ", "Consultar Cadastro de Poltrona", 3);
                        if (numero.equals("")) {
                            JOptionPane.showMessageDialog(null, "Numero inválido!", "Consultar", 3);
                        } else {
                            String poltronas = "";
                            int numeroConvertido = Integer.parseInt(numero);
                            for (int i = 0; i < listapoltrona.size(); i++) {
                                if (listapoltrona.get(i).getNumeropoltrona() == numeroConvertido) {
                                    poltronas = "Numero Poltrona: " + listapoltrona.get(i).getNumeropoltrona() + "\n Nome: "
                                            + listapoltrona.get(i).getNome() + "\n Tipo: " + listapoltrona.get(i).getTipo()
                                            + "\n Necessidades Especiais: " + listapoltrona.get(i).getNecessidade_especiais()
                                            + "\n Sessão: " + listapoltrona.get(i).getSessao();
                                    JOptionPane.showMessageDialog(null, poltronas, "Consultar", 3);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Número inválido!", "Consultar", 3);
                                }
                            }

                        }

                    }

                } else if (opcao.equals("5")) {
                    if (listapoltrona.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não existe poltrona cadastrada!", "Alerta", 3);
                    } else {
                        String nomes = JOptionPane.showInputDialog(null, "Digite o nome da sessao: ", "Consultar Poltronas da Sessão", 3);
                        for (int i = 0; i < listapoltrona.size(); i++) {
                            if (nomes.equals(listapoltrona.get(i).getSessao().getNomesessao())) {
                                JOptionPane.showMessageDialog(null, listapoltrona.get(i).getNumeropoltrona(), "Poltronas cadastradas na Sessão", 3);
                            } else {
                                JOptionPane.showMessageDialog(null, "Nome da sessao inválida!", "Alerta", 3);
                            }
                        }

                    }

                } else if (opcao.equals("6")) {
                    if (listapoltrona.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não existe poltrona cadastrada!", "Alerta", 3);
                    } else {
                        double total = 0;
                        int guarda = 0;
                        double valor = 0;
                        String nome_sessao = JOptionPane.showInputDialog(null, "Digite o nome da sessao:", "Consultar Renda da Sessão", 3);
                        if (nome_sessao.equals("")) {
                            JOptionPane.showMessageDialog(null, "Nome inválido!", "Atenção", 3);
                        } else {
                            for (int i = 0; i < listapoltrona.size(); i++) {
                                if (nome_sessao.equals(listapoltrona.get(i).getSessao().getNomesessao())) {
                                    valor = listapoltrona.get(i).getSessao().getValor();
                                    for (int j = 0; j < listapoltrona.size(); j++) {
                                        if (listapoltrona.get(j).getSessao().getNomesessao().equals(nome_sessao)) {
                                            guarda++;
                                        }
                                    }
                                    if (listapoltrona.get(i).getTipo().equals("meia")) {
                                        total += valor / 2;
                                    } else if (listapoltrona.get(i).getTipo().equals("inteira")) {
                                        total += valor;
                                    }
                                    JOptionPane.showMessageDialog(null, "Total da Sessão: " + total, "Renda da Sessão", 3);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Nome da sessão inválido!", "Renda da Sessão", 3);
                                }

                            }

                        }

                    }

                } else if (opcao.equals("7")) {
                    if (listapoltrona.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Não existe poltrona cadastrada!", "Alerta", 3);
                    } else {

                        String poltronas_cadastradas = "";

                        for (int i = 0; i < listapoltrona.size(); i++) {
                            int cadastradas_poltronas = listapoltrona.get(i).getNumeropoltrona();
                            String cadastradas = Integer.toString(cadastradas_poltronas);
                            poltronas_cadastradas += "\n Poltrona: " + cadastradas;
                        }
                        JOptionPane.showMessageDialog(null, poltronas_cadastradas, "Poltronas Cadastradas", 3);
                    }
                } else if (opcao.equals("8")) {
                    loop = false;
                }
            }
        }

    }
}