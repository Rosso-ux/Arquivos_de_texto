import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {

        String caminhoArquivo = "pessoas.txt";

        try {

            BufferedReader leitor = new BufferedReader(
                    new FileReader(caminhoArquivo)
            );

            String linha;

            while ((linha = leitor.readLine()) != null) {

                // Separando os dados
                String[] dados = linha.split(";");

                String nome = dados[0];
                int idade = Integer.parseInt(dados[1]);
                String profissao = dados[2];

                // Criando objeto
                Pessoa pessoa = new Pessoa(nome, idade, profissao);

                // Exibindo XML
                System.out.println(pessoa.toXML());
                System.out.println();
            }

            leitor.close();

        } catch (Exception e) {

            System.out.println("Erro: " + e.getMessage());
        }
    }
}