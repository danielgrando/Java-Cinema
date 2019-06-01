
package cinema;


import java.sql.Time;
import java.util.Date;


public class sessao {
    
   private String nomesessao;
   private String filme;
   private Date datainiciosessao;
   private Time horario;
   private double valor;

    public String getNomesessao() {
        return nomesessao;
    }

    public void setNomesessao(String nomesessao) {
        this.nomesessao = nomesessao;
    }

    public String getFilme() {
        return filme;
    }

    public void setFilme(String filme) {
        this.filme = filme;
    }

    public Date getDatainiciosessao() {
        return datainiciosessao;
    }

    public void setDatainiciosessao(Date datainiciosessao) {
        this.datainiciosessao = datainiciosessao;
    }

    public Time getHorario() {
        return horario;
    }

    public void setHorario(Time horario) {
        this.horario = horario;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
   
   
   
    
}
