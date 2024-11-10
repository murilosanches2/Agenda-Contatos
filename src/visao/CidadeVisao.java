package visao;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CidadeVisao extends FormPadrao {
    
    JLabel jlUf;
    JLabel jlCep;
    
    JComboBox jcbUf;
    JTextField jtfCep;
    
    public CidadeVisao(){
        setTitle("Cadastro de Cidade");
    }

    @Override
    public void inicializarComponentes() {
        jlUf = new JLabel("UF");
        jlUf.setBounds(9,70,50,25);
        jpnFormulario.add(jlUf);
        
        jcbUf = new JComboBox();
        jcbUf.setBounds(9,90,60,25);
        jpnFormulario.add(jcbUf);
        
        jlCep = new JLabel("CEP");
        jlCep.setBounds(100,70,100,25);
        jpnFormulario.add(jlCep);
        
        jtfCep = new JTextField();
        jtfCep.setBounds(100,90,100,25);
        jpnFormulario.add(jtfCep);
    }

    @Override
    public void salvarVisao() {
        
    }
}
