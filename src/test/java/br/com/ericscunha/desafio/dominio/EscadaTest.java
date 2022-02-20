package br.com.ericscunha.desafio.dominio;

import org.junit.Test;

import static org.junit.Assert.*;

public class EscadaTest {

    @Test
    public void montaDegraus() {
        String escada = Escada.montaDegraus(6);
        String escadaref = "     *" + "\n" +
                           "    **" + "\n" +
                           "   ***" + "\n" +
                           "  ****" + "\n" +
                           " *****" + "\n" +
                           "******";
        assertEquals(escadaref, escada);
    }
}