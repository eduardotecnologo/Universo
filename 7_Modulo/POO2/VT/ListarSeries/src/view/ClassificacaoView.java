package view;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author edudeveloper
 */
public class ClassificacaoView extends JIFrameDefault{
    JLabel jlIdade;
    JLabel jlTipoCenas;
    
    JComboBox jcbIdade;
    JTextField jtfTiposCenas;
    
    // Construtor
    public ClassificacaoView(){
        setTitle("Cadastro de Classificação");
    }

    @Override
    public void initializeComponents() {
            // Campo de Idade
           jlIdade = new JLabel("Idade");
           jlIdade.setBounds(60, 120, 170, 30);    // Coluna, linha, largura e altura
           jPanelForm.add(jlIdade);
           
           jcbIdade = new JComboBox();
           jcbIdade.setBounds(100, 120, 150, 30); // Coluna, linha, largura e altura
           jPanelForm.add(jcbIdade);      
           
           
           // Campos de Tipos de Cenas 
           jlTipoCenas = new JLabel("Tipos de Cenas");
           jlTipoCenas.setBounds(280, 120, 170, 30);    // Coluna, linha, largura e altura
           jPanelForm.add(jlTipoCenas);
           
           jtfTiposCenas = new JTextField();
           jtfTiposCenas.setBounds(380, 120, 300, 30);    // Coluna, linha, largura e altura
           jPanelForm.add(jtfTiposCenas); 
    }

    @Override
    public void saveView() {
        
    }
}
