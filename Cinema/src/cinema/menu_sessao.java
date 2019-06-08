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
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author grand
 */
public class menu_sessao {

    public static int menu_sessao(ArrayList<sessao> listasessao,
            ArrayList<poltrona> listapoltrona) throws ParseException {

        String opcao;
        boolean loop = true;
        Scanner scan = new Scanner(System.in);

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
                System.out.println("Digite o nome da sessão: ");
                String nome = scan.next();
                se.setNomesessao(nome);
                System.out.println("Digite o nome do filme: ");
                String nomefilme = scan.next();
                se.setFilme(nomefilme);
                System.out.println("Digite a data de inicio da sessão: ");
                String datainicio = scan.next();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                se.setDatainiciosessao(formato.parse(datainicio));
                System.out.println("Digite o horário: ");
                String horario = scan.next();
                SimpleDateFormat forma = new SimpleDateFormat("HH:mm");
                Date teste = forma.parse(horario);
                Time time = new Time(teste.getTime());
                se.setHorario(time);
                System.out.println("Digite o valor: ");
                double valor = scan.nextDouble();
                se.setValor(valor);
                listasessao.add(se);

            } else if (opcao.equals("2")) {
                String nome = JOptionPane.showInputDialog(null, "Digite o nome da sessão", "Alterar Cadastro da Sessão", 3);
                if (nome != null) {
                    for (int i = 0; i < listasessao.size(); i++) {
                        if (listasessao.get(i).getNomesessao().equals(nome)) {
                            sessao a = listasessao.get(i);
                            System.out.println("Digite o nome da sessão: ");
                            String nomesessao = scan.next();
                            a.setNomesessao(nomesessao);
                            System.out.println("Digite o nome do filme: ");
                            String nomefilme = scan.next();
                            a.setFilme(nomefilme);
                            System.out.println("Digite a data de inicio da sessão: ");
                            String datainicio = scan.next();
                            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
                            a.setDatainiciosessao(formato.parse(datainicio));
                            System.out.println("Digite o horário: ");
                            String horario = scan.next();
                            SimpleDateFormat forma = new SimpleDateFormat("HH:mm");
                            Date teste = forma.parse(horario);
                            Time time = new Time(teste.getTime());
                            a.setHorario(time);
                            System.out.println("Digite o valor: ");
                            double valor = scan.nextDouble();
                            a.setValor(valor);
                            

                        }
                    }
                }
            } else if (opcao.equals("3")) {
                String nome = JOptionPane.showInputDialog(null, "Digite o nome da Sessão", "Consultar", 3);
                
                if (nome != null) {
                    for (int i = 0; i < listasessao.size(); i++) {
                        if (listasessao.get(i).getNomesessao().equals(nome)) {
                            JOptionPane.showMessageDialog(null,
                                    "Nome da sessão: " + listasessao.get(i).getNomesessao() + "\n"
                                    + "Nome do filme: " + listasessao.get(i).getFilme() + "\n"
                                    + "Data Inicio: " + listasessao.get(i).getDatainiciosessao() + "\n"
                                    + "Horário: " + listasessao.get(i).getHorario() + "\n"
                                    + "Valor: " + listasessao.get(i).getValor());
                        }
                    }
                    return 0;

                }

            }
            else if(opcao.equals("4")){
                String nome = JOptionPane.showInputDialog(null, "Digite o nome da sessão", "Excluir Cadastro de sessão", 3);
                if (nome != null) {
                    for (int i = 0; i < listasessao.size(); i++) {
                        if (listasessao.get(i).getNomesessao().equals(nome)){
                            listasessao.remove(i);
                            JOptionPane.showMessageDialog(null,"O Cadastro da Sessão " + nome + " foi excluido" ,"Excluir Cadastro de Sessão", 3);
                            break;
                        }
                    }
                }
            }
            else if(opcao.equals("5")){
                String sessoes = "\n ";
                for (int i = 0; i < listasessao.size(); i++) {
                    sessoes += "\n Sessão "+ i+1+": " +  listasessao.get(i).getNomesessao() + "\n Filme: " + listasessao.get(i).getFilme()
                            + "\n Data: " + listasessao.get(i).getDatainiciosessao() + "\n Horário: " + listasessao.get(i).getHorario()
                            + "\n Valor: " + listasessao.get(i).getValor()+ "\n";
                }
                JOptionPane.showMessageDialog(null, sessoes, "Sessões cadastradas", 3);

            }
        }
        return 0;
    }
}