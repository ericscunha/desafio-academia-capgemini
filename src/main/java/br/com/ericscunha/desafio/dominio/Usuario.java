package br.com.ericscunha.desafio.dominio;

/**
 * Classe de registro do usuário e senha utilizados na classe Cadastro
 */
public class Usuario  {
    /* atributos da classe */
    private String nome;
    private String senha;

    /* Construtor */
    public Usuario() {

    }

    public Usuario(String nome, String senha) {
        super();
        this.nome = nome;
        this.senha = senha;
    }

    /* Getters and Setters */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
