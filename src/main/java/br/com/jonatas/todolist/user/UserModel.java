package br.com.jonatas.todolist.user;

import lombok.Data;

/**
 * @Data faz todos os setters e getters de uma vez
 * @Setter somente set
 * @Getter somente get
 */

@Data
public class UserModel {
    
    /**
     * caso eu não utilize um modificador
     * por padrão ele recebe public
     * 
     * CUIDADO
     * ao não colocar public
     * na primeira vez que tentei um post
     *  retornou null
     */

    // public String name;
    // public String username;
    // public String password;

    private String name;
    private String username;
    private String password;


    /**
     * forma de disponibiliza os métodos de uma classe
     */
    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public void setUsername(String username) {
    //     this.username = username;
    // }

    // public String getUsername() {
    //     return username;
    // }

    // public String getPassword() {
    //     return password;
    // }

    // public void setPassword(String password) {
    //     this.password = password;
    // }


}
