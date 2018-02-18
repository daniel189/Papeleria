/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistasVentas;

import MODELO.QueryArticulo;
import MODELO.QueryCliente;
import static VistasVentas.NewSale.jDialogArticles;
import java.awt.Dimension;

/**
 *
 * @author yurym
 */
public class NewSaleWindowHelper {
    
    public void showArticles() {
        // llamada de datos
        QueryArticulo load = new QueryArticulo();
        load.CargarArticulos();
        //Centramos nuestro jDialog
        jDialogArticles.setLocation(200, 100);
        //La hacemos modal
        jDialogArticles.setModal(true);
        //Establecemos dimensiones.
        jDialogArticles.setMinimumSize(new Dimension(747, 385));

        //Establecemos un título para el jDialog
        jDialogArticles.setTitle("Lista de Artículos.");
        //La hacemos visible.
        jDialogArticles.setVisible(true);
    }
    
    public void showClients(){
    }

    
    
    
}
