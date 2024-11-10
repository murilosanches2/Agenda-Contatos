package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;

public class BairroVisao extends FormPadrao {
    
    JLabel jlBairro;
    JComboBox jcbBairro;
    
    public BairroVisao(){
        setTitle("Cadastro de Bairro");
    }

    @Override
    public void inicializarComponentes() {
        jlBairro = new JLabel("Bairro");
        jlBairro.setBounds(9,70,50,25);
        jpnFormulario.add(jlBairro);
        
        jcbBairro = new JComboBox();
        jcbBairro.setBounds(9,90,200,25);
        jpnFormulario.add(jcbBairro);
    }

    @Override
    public void salvarVisao() {
        
    }
}
