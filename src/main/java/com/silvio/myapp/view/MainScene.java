/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silvio.myapp.view;

import com.silvio.myapp.MainApp;
import javafx.scene.control.Button;
import javafx.scene.layout.TilePane;


public class MainScene extends AbstractScene {

    public MainScene(MainApp mainApp) {
        super(mainApp);
        
        var btnRelatorios = new Button("Relatorios");
        var btnConfig = new Button("Configurações");
        setRoot(new TilePane(btnRelatorios, btnConfig));
        
        btnRelatorios.setOnAction( event -> mainApp.setScene(new RelatorioScene(mainApp)));
        btnConfig.setOnAction( event -> mainApp.setScene(new ConfigScene(mainApp)));

    }
    
}
