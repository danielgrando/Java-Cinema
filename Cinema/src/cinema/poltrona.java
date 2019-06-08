/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author grand
 */
public class poltrona {
    
    private int numeropoltrona;
    private String nome;
    private String tipo;
    private Boolean necessidade_especiais;
    private String sessao;

    public int getNumeropoltrona() {
        return numeropoltrona;
    }

    public void setNumeropoltrona(int numeropoltrona) {
        this.numeropoltrona = numeropoltrona;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Boolean getNecessidade_especiais() {
        return necessidade_especiais;
    }

    public void setNecessidade_especiais(Boolean necessidade_especiais) {
        this.necessidade_especiais = necessidade_especiais;
    }

    public String getSessao() {
        return sessao;
    }

    public void setSessao(String sessao) {
        this.sessao = sessao;
    }
    
}
