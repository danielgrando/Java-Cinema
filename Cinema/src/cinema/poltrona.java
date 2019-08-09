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
    private String necessidade_especiais;
    private sessao sessao;

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

    public String getNecessidade_especiais() {
        return necessidade_especiais;
    }

    public void setNecessidade_especiais(String necessidade_especiais) {
        this.necessidade_especiais = necessidade_especiais;
    }

    public sessao getSessao() {
        return sessao;
    }

    public void setSessao(sessao sessao) {
        this.sessao = sessao;
    }
    
}
