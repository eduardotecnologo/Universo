package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author edudeveloper
 */
public class NotaView extends JIFrameDefault{ // Trabalhando com Herança JIFrameDefault
    
    JLabel jlTemporada;
    JLabel jlAno;
    
    JComboBox jcbTemporada;
    JTextField jtfAno;
    
    
    
    public NotaView(){
        setTitle("Nome da Série");
    }

    public void initializeComponents() {
        // Components aqui
           jlAno = new JLabel("Ano de lançamanto:");
           jlAno.setBounds(60, 120, 120, 25);
           jPanelForm.add(jlAno);
           
           jcbTemporada = new JComboBox();
           jcbTemporada.setBounds(180, 120, 170, 25);
           jPanelForm.add(jcbTemporada);
    }

    @Override
    public void saveView() {

    }
}
