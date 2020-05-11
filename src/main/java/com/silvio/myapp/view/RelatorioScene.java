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
import javafx.scene.layout.TilePane;


public class RelatorioScene extends AbstractScene {
    
    private final Config config = Config.getInstance();

    public RelatorioScene(MainApp mainApp) {
        super(mainApp);
        
        var label = new Label("Formato de Relatorios = "+config.getFormatRelatorio());
        var btnVoltar = new Button("Voltar");
        setRoot(new TilePane(label, btnVoltar));
        btnVoltar.setOnAction( event -> mainApp.setScene(new MainScene(mainApp)));

    }
    
}
