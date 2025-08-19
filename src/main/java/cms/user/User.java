/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cms.user;

public abstract class User {
    private int id;
    private String nome;
    private String email;
    private String password;

    public User(int id, String nome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    // checagem de senha
    public boolean checkPassword(String senha) {
        return java.util.Objects.equals(this.password, senha);
    }

    // Força cada subclasse a declarar seu "papel"
    public abstract String getRole();
}
