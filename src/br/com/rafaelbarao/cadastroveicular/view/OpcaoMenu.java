package br.com.rafaelbarao.cadastroveicular.view;

public class OpcaoMenu {
    //Atributos
    private Integer codigo;
    private String descricao;

    // Método Construtor
    // Chamado apenas no momento de instanciar um objeto
    public OpcaoMenu(Integer codigo, String descricao) throws Exception {

        if (codigo == null)
            throw new Exception("CODIGO É OBRIGATÓRIO");

        if (descricao == null)
            throw new Exception("DESCRIÇÃO É OBRIGATÓRIA");

        this.codigo = codigo;
        this.descricao = descricao;
    }

    public Integer getCodigo() {
        return codigo;
    }

    //Métodos comuns que podem ser chamados a qualquer momento
    public String getVisualizaoOpcao()
    {
        return codigo.toString() + " - " + descricao.toString();
    }
}
