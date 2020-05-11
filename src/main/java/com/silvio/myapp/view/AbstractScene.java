/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.silvio.myapp.view;

import com.silvio.myapp.MainApp;
import javafx.scene.Scene;
import javafx.scene.layout.TilePane;

/**
 *
 * @author silvio
 */
public abstract class AbstractScene extends Scene{
    
    public AbstractScene(MainApp mainApp) {
        super(new TilePane(), 640, 680);
    }
    
}
