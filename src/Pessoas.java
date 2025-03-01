/*
Está classe armazena informações como, data de nascimento e nome.
 */

import java.time.LocalDate;

public class Pessoas {
    protected String nome;
    protected LocalDate dataNascimento;
    
    public Pessoas(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }
}
