/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PapeleriaFarfarela;

import Vista.AppStart;

/**
 *
 * @author Crispin
 */
public class FarfarelaStationery {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // AppStartWindow es un objeto de la vista de AppStart para iniciar el aplciativo
        AppStart appStartWindow = new AppStart();
        //Show method was deprecated
        appStartWindow.setVisible(true);
    }
    
}
