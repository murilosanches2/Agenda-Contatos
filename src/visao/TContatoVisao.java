package visao;

import controle.TipoContatoControle;

public class TContatoVisao extends FormPadrao {
    
    public TContatoVisao(){
        setTitle("Cadastro de Tipo de Contato");
    }

    @Override
    public void inicializarComponentes() {
        
    }
    
    TipoContatoControle tcc = new TipoContatoControle();
    
    @Override
    public void salvarVisao() {
        tcc.salvarControle(jtfId.getText(),jtfDescricao.getText());
    }
}
