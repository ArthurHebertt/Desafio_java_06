package desafio7;

public class Ninja {
    private String nome;
    private String vila;
    private int idade;

    public Ninja() {
    }

    public Ninja(String nome, String vila, int idade) {
        this.nome = nome;
        this.vila = vila;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getVila() {
        return vila;
    }

    public int getIdade() {
        return idade;
    }

    public String toString () {
        return "Nome: " + nome + " idade: " + idade + " vila: " + vila;
    }
}
