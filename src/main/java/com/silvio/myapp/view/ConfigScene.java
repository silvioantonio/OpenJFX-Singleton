/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silvio.myapp.view;

import com.silvio.myapp.MainApp;
import com.silvio.myapp.model.Config;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;


public class ConfigScene extends AbstractScene {
     
    private final Config config = Config.getInstance();
    
    public ConfigScene(MainApp mainApp) {
        super(mainApp);
         
        var label1 = new Label("Formato de Relatorios ");
        var fieldFormatoRelatorios = new TextField(config.getFormatRelatorio());
        var label2 = new Label("Tipo de Graficos ");
        var fieldTipoGraficos = new TextField(config.getTiposGraficos());
        var btnOk = new Button("ok");
        setRoot(new VBox(label1, fieldFormatoRelatorios, label2, fieldTipoGraficos, btnOk));
        
        btnOk.setOnAction(event -> {
            config.setFormatRelatorio(fieldFormatoRelatorios.getText());
            config.setTiposGraficos(fieldTipoGraficos.getText());
            mainApp.setScene(new MainScene(mainApp));
        });
        
    }
    
}
