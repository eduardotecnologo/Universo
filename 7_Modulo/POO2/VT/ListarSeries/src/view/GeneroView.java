package view;

import control.GenreSeriesController;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author edudeveloper
 */
public class GeneroView extends JIFrameDefault{     // Trabalhando com Herança JIFrameDefault
     JLabel jlGenero;
     JComboBox jcbGenero;
     
    public GeneroView(){
       
           setTitle("Cadastro de Genero");

       }

    @Override
    public void initializeComponents() {
         //To change body of generated methods, choose Tools | Templates.
    }
    
    // Instância de Coontroler
    GenreSeriesController gsc = new GenreSeriesController();

    @Override
    public void saveView() {
        gsc.saveController(jTextFieldID.getText(), jTextFieldDesc.getText());
    }

}
