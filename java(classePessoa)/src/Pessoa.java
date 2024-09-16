public class Pessoa {
    // Atributos encapsulados
    private String nome;
    private int idade;
    private String endereco;
    private String telefone;
    private String email;
    private String cpf;
    private String rg;
    private String nacionalidade;
    private String estadoCivil;
    private String profissao;

    // Construtor
    public Pessoa(String nome, int idade, String endereco, String telefone, String email, String cpf,
                  String rg, String nacionalidade, String estadoCivil, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.telefone = telefone;
        this.email = email;
        this.cpf = cpf;
        this.rg = rg;
        this.nacionalidade = nacionalidade;
        this.estadoCivil = estadoCivil;
        this.profissao = profissao;
    }

    // Métodos getters e setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }

    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getRg() { return rg; }
    public void setRg(String rg) { this.rg = rg; }

    public String getNacionalidade() { return nacionalidade; }
    public void setNacionalidade(String nacionalidade) { this.nacionalidade = nacionalidade; }

    public String getEstadoCivil() { return estadoCivil; }
    public void setEstadoCivil(String estadoCivil) { this.estadoCivil = estadoCivil; }

    public String getProfissao() { return profissao; }
    public void setProfissao(String profissao) { this.profissao = profissao; }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", estadoCivil='" + estadoCivil + '\'' +
                ", profissao='" + profissao + '\'' +
                '}';
    }
}
