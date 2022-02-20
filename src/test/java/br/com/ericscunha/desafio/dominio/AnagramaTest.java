package br.com.ericscunha.desafio.dominio;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramaTest {

    @Test
    public void contaAnagrama() {
        // Teste "ovo"
        int qtdAnagrama1 = Anagrama.contaAnagrama("ovo");
        assertEquals(2, qtdAnagrama1);

        // Teste ifailuhkqq
        int qtdAnagrama2 = Anagrama.contaAnagrama("ifailuhkqq");
        assertEquals(3, qtdAnagrama2);
    }
}