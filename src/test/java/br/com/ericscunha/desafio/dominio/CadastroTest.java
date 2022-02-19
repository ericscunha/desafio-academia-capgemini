package br.com.ericscunha.desafio.dominio;

import org.junit.Test;

import static org.junit.Assert.*;

public class CadastroTest {

    @Test
    public void cadastroUsuario() {
        // Teste válido
        boolean senhaValida1 = Cadastro.cadastroUsuario("Debora", "Ya3&ab");
        assertEquals(true, senhaValida1);

        // Teste Inválido - TamanhoSenha
        boolean senhaValida2 = Cadastro.cadastroUsuario("Debora", "Ya3");
        assertEquals(false, senhaValida2);

        // Teste Inválido - Ausência de digito
        boolean senhaValida3 = Cadastro.cadastroUsuario("Debora", "Abc$df");
        assertEquals(false, senhaValida3);

        // Teste Inválido - Ausência de letra minuscula
        boolean senhaValida4 = Cadastro.cadastroUsuario("Debora", "ABC$D3");
        assertEquals(false, senhaValida4);

        // Teste Inválido - Ausência de letra maiuscula
        boolean senhaValida5 = Cadastro.cadastroUsuario("Debora", "abc$d3");
        assertEquals(false, senhaValida5);

       // Teste Inválido - Ausência de caracter especial
        boolean senhaValida6 = Cadastro.cadastroUsuario("Debora", "Abc5d3");
        assertEquals(false, senhaValida6);

       // Teste Inválido - sem senha
        boolean senhaValida7 = Cadastro.cadastroUsuario("Debora", "");
        assertEquals(false, senhaValida7);
    }

    @Test
    public void tamanhoSenha() {
        int senha1 = Cadastro.tamanhoSenha("Ya3", 6);
        assertEquals(3, senha1);

        int senha2 = Cadastro.tamanhoSenha("Ya3&ab", 6);
        assertEquals(0, senha2);
    }
}