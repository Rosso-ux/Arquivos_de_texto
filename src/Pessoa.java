public class Pessoa {

    private String nome;
    private int idade;
    private String profissao;

    public Pessoa(String nome, int idade, String profissao) {

        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }

    // Método para exibir XML
    public String toXML() {

        return
                "<pessoa>\n" +
                        "   <nome>" + nome + "</nome>\n" +
                        "   <idade>" + idade + "</idade>\n" +
                        "   <profissao>" + profissao + "</profissao>\n" +
                        "</pessoa>";
    }
}