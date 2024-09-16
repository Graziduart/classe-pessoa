public class Main {
    public static void main(String[] args) {
        // Criar e preencher duas instâncias de Pessoa
        Pessoa pessoa1 = new Pessoa("João Silva", 30, "Rua das Flores, 123", "1234-5678", "joao.silva@example.com",
                "123.456.789-00", "MG-12.345.678", "Brasileiro", "Solteiro", "Engenheiro");

        Pessoa pessoa2 = new Pessoa("Maria Oliveira", 25, "Avenida Brasil, 456", "9876-5432", "maria.oliveira@example.com",
                "987.654.321-00", "SP-98.765.432", "Brasileira", "Casada", "Arquiteta");

        // Exibir informações das pessoas
        System.out.println(pessoa1);
        System.out.println(pessoa2);
    }
}