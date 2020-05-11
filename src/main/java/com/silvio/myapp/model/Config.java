/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silvio.myapp.model;

/**
 *
 * @author silvio
 */
public class Config {
    
    /*
    Este atributo serve para que seja criado apenas uma instancia dessa classe durante toda a aplicação
    e dessa forma aplicar o padrao singleton
    */
    private static final Config instance = new Config();
    
    String formatRelatorio = "html";
    String tiposGraficos = "pizza";
    
    /* o construtor privado serve para evitar que ao instanciar a aplicaçao,
    nao seja criado um construtor publico, dessa forma evitando se instanciar a classe
    */
    private Config(){};
    
    /*
    Esta é a forma de se acessar a classe (atravez de um metodo publico e statico).
    */
    public static Config getInstance(){
        return instance;
    }
    
    public String getFormatRelatorio() {
        return formatRelatorio;
    }

    public void setFormatRelatorio(String formatRelatorio) {
        this.formatRelatorio = formatRelatorio;
    }

    public String getTiposGraficos() {
        return tiposGraficos;
    }

    public void setTiposGraficos(String tiposGraficos) {
        this.tiposGraficos = tiposGraficos;
    }
    
    
}
