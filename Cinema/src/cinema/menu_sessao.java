/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author grand
 */
public class menu_sessao {

    public static void menu_sessao(ArrayList<sessao> listasessao,
            ArrayList<poltrona> listapoltrona) throws ParseException {

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
                    + " 7 - Listar Sessão pela Dia e Mês \n"
                    + " 8 - Voltar");
            if (opcao.equals("1")) {
                sessao se = new sessao();
                String nome = JOptionPane.showInputDialog(null, "Digite o nome da Sessão", "Cadastro", 3);
                se.setNomesessao(nome);
                String nomefilme = JOptionPane.showInputDialog(null, "Digite o nome do Filme", "Cadastro", 3);
                se.setFilme(nomefilme);
                String datainicio = JOptionPane.showInputDialog(null, "Digite a data início da sessão (dia/mes/ano)", "Cadastro", 3);
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                se.setDatainiciosessao(formato.parse(datainicio));
                String horario = JOptionPane.showInputDialog(null, "Digite o horário (hora:minutos)", "Cadastro", 3);
                SimpleDateFormat forma = new SimpleDateFormat("HH:mm");
                Date teste = forma.parse(horario);
                Time time = new Time(teste.getTime());
                se.setHorario(time);
                String num = JOptionPane.showInputDialog(null, "Digite o valor", "Cadastro", 3);
                double valor = Double.parseDouble(num);
                se.setValor(valor);
                listasessao.add(se);

            } else if (opcao.equals("2")) {
                if (listasessao.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não existe sessão cadastrada", "Alerta", 3);
                } else {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome da sessão", "Alterar Cadastro da Sessão", 3);
                    if (nome.equals("")) {
                        JOptionPane.showMessageDialog(null, "Nome inválido!", "Alterar", 3);

                    } else {
                        for (int i = 0; i < listasessao.size(); i++) {
                            if (listasessao.get(i).getNomesessao().equals(nome)) {
                                sessao a = listasessao.get(i);
                                String nomesessao = JOptionPane.showInputDialog(null, "Digite o nome da Sessão", "Alterar", 3);
                                a.setNomesessao(nomesessao);
                                String nomefilme = JOptionPane.showInputDialog(null, "Digite o nome do Filme", "Alterar", 3);
                                a.setFilme(nomefilme);
                                String datainicio = JOptionPane.showInputDialog(null, "Digite a data início da sessão (dia/mes/ano)", "Alterar", 3);
                                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                                a.setDatainiciosessao(formato.parse(datainicio));
                                String horario = JOptionPane.showInputDialog(null, "Digite o horário (hora:minutos)", "Alterar", 3);
                                SimpleDateFormat forma = new SimpleDateFormat("HH:mm");
                                Date teste = forma.parse(horario);
                                Time time = new Time(teste.getTime());
                                a.setHorario(time);
                                String num = JOptionPane.showInputDialog(null, "Digite o valor", "Alterar", 3);
                                double valor = Double.parseDouble(num);
                                a.setValor(valor);

                            } else {
                                JOptionPane.showMessageDialog(null, "Sessão não encontrada", "Alterar", 3);
                            }
                        }
                    }
                }
            } else if (opcao.equals("3")) {
                if (listasessao.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não existe sessão cadastrada", "Alerta", 3);
                } else {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome da Sessão", "Consultar", 3);

                    if (nome.equals("")) {
                        JOptionPane.showMessageDialog(null, "Nome inválido!", "Consultar", 3);

                    } else {
                        for (int i = 0; i < listasessao.size(); i++) {
                            if (listasessao.get(i).getNomesessao().equals(nome)) {
                                JOptionPane.showMessageDialog(null,
                                        "Nome da sessão: " + listasessao.get(i).getNomesessao() + "\n"
                                        + "Nome do filme: " + listasessao.get(i).getFilme() + "\n"
                                        + "Data Inicio: " + listasessao.get(i).getDatainiciosessao() + "\n"
                                        + "Horário: " + listasessao.get(i).getHorario() + "\n"
                                        + "Valor: " + listasessao.get(i).getValor());
                            } else {
                                JOptionPane.showMessageDialog(null, "Nome inválido!", "Consultar", 3);
                            }
                        }
                    }
                }

            } else if (opcao.equals("4")) {
                if (listasessao.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não existe sessão cadastrada", "Alerta", 3);
                } else {
                    String nome = JOptionPane.showInputDialog(null, "Digite o nome da sessão", "Excluir Cadastro de sessão", 3);
                    if (nome.equals("")) {
                        JOptionPane.showMessageDialog(null, "Nome inválido!", "Excluir", 3);
                    } else {
                        for (int i = 0; i < listasessao.size(); i++) {
                            if (listasessao.get(i).getNomesessao().equals(nome)) {
                                listasessao.remove(i);
                                JOptionPane.showMessageDialog(null, "O Cadastro da Sessão " + nome + " foi excluido", "Excluir Cadastro de Sessão", 3);
                            } else {
                                JOptionPane.showMessageDialog(null, "Nome inválido!", "Excluir", 3);
                            }
                        }
                    }
                }

            } else if (opcao.equals("5")) {
                if (listasessao.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não existe sessão cadastrada", "Alerta", 3);
                } else {
                    String sessoes = "";
                    for (int i = 0; i < listasessao.size(); i++) {
                        sessoes += "\n Sessão: " + listasessao.get(i).getNomesessao() + "\n Filme: " + listasessao.get(i).getFilme()
                                + "\n Data: " + listasessao.get(i).getDatainiciosessao() + "\n Horário: " + listasessao.get(i).getHorario()
                                + "\n Valor: " + listasessao.get(i).getValor() + "\n";
                    }
                    JOptionPane.showMessageDialog(null, sessoes, "Sessões cadastradas", 3);
                }

            } else if (opcao.equals("6")) {
                if (listasessao.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não existe sessão cadastrada", "Alerta", 3);
                } else {
                    String hor = JOptionPane.showInputDialog(null, "Digite o horário (hora:minutos)", "Listar por horário", 3);
                    if (hor.equals("")) {
                        JOptionPane.showMessageDialog(null, "Nome inválido!", "Atenção", 3);
                    } else {
                        SimpleDateFormat forma = new SimpleDateFormat("HH:mm");
                        Date teste1 = forma.parse(hor);
                        Time time = new Time(teste1.getTime());
                        String sessoes = "";
                        for (int i = 0; i < listasessao.size(); i++) {
                            if (time.equals(listasessao.get(i).getHorario())) {
                                sessoes += "\n Sessão: " + listasessao.get(i).getNomesessao() + "\n Filme: " + listasessao.get(i).getFilme()
                                        + "\n Data: " + listasessao.get(i).getDatainiciosessao() + "\n Horário: " + listasessao.get(i).getHorario()
                                        + "\n Valor: " + listasessao.get(i).getValor() + "\n";
                            }
                            if (sessoes.equals("")) {
                                JOptionPane.showMessageDialog(null, "Não existe sessão neste horário", "Atenção", 3);
                            } else {
                                JOptionPane.showMessageDialog(null, sessoes, "Sessões cadastradas", 3);
                            }
                        }
                    }

                }

            } else if (opcao.equals("7")) {
                if (listasessao.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Não existe sessão cadastrada", "Alerta", 3);
                } else {
                    String dia = JOptionPane.showInputDialog(null, "Digite a data (dia/mes/ano)", "Listar por dia/mês", 3);
                    if (dia.equals("")) {
                        JOptionPane.showMessageDialog(null, "Nome inválido!", "Atenção", 3);
                    } else {
                        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                        Date date = formato.parse(dia);
                        String sessoes = "";
                        for (int i = 0; i < listasessao.size(); i++) {
                            if (date.equals(listasessao.get(i).getDatainiciosessao())) {
                                sessoes += "\n Sessão: " + listasessao.get(i).getNomesessao() + "\n Filme: " + listasessao.get(i).getFilme()
                                        + "\n Data: " + listasessao.get(i).getDatainiciosessao() + "\n Horário: " + listasessao.get(i).getHorario()
                                        + "\n Valor: " + listasessao.get(i).getValor() + "\n";
                            }
                            if (sessoes.equals("")) {
                                JOptionPane.showMessageDialog(null, "Não existe sessão neste dia", "Atenção", 3);
                            } else {
                                JOptionPane.showMessageDialog(null, sessoes, "Sessões cadastradas", 3);
                            }

                        }

                    }

                }

            } else if (opcao.equals("8")) {
                loop = false;

            }

        }

    }
}
