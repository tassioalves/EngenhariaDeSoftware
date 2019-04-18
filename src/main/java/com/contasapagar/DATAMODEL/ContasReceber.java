/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.contasapagar.DATAMODEL;

import com.towel.el.annotation.Resolvable;
import java.math.BigDecimal;

/**
 *
 * @author Tássio
 */
public class ContasReceber {

    @Resolvable(colName = "ID")
    private String id;
    @Resolvable(colName = "Nome")
    private String nome;
    @Resolvable(colName = "Descricao")
    private String descricao;
    @Resolvable(colName = "DataInicio")
    private String dataInicio;
    @Resolvable(colName = "DataVencimento")
    private String dataVencimento;
    @Resolvable(colName = "Valor")
    private BigDecimal valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
