package br.com.ericscunha.desafio.dominio;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Classe responsável pelos metódos da Questão 03. Tem como principal objetivo
 * identificar as substrings de uma palavra e os pares dessas substrings que representam um
 * anagrama.
 */
public class Anagrama {
    /**
     * Metodo principal que verifica quantos anagramas são formados a partir das substrings de uma palavra.
     * Por padrão, o metodo transforma todos os caracteres em Lowercase, para determinar os anagrams possieis.
     *
     * @param palavra texto informado que será considerado para determinar os anagramas
     * @return retorna a quantidade de anagramas formados a partir da substrings de 'palavra'
     */
    public static int contaAnagrama(String palavra) {
        // converte em lowercase para garantir a comparação adequada das letras
        palavra = palavra.toLowerCase();
        // Captura as substrings de uma palavra e grava em uma Array
        String[] listaSubstring = capturaSubstring(palavra).toArray(new String[0]);
        String substrBase; // Variável de referência
        String substrAtual; // Variável que será comparada
        int qtdAnagrama = 0;

        // Loop que checa verifica as substrings registradas no vetor e compara entres elas.
        for(int i=0;i <= listaSubstring.length-1; i++) {
            substrBase = listaSubstring[i];
            // Pega a próxima substring a partir da posição da referência
            for(int j=i+1; j <= listaSubstring.length-1; j++){
                substrAtual = listaSubstring[j];
                // checa se são anagramas entre si
                if (checaAnagrama(substrBase, substrAtual))
                    qtdAnagrama++; // Se for, acresenta 1 a contagem
            }
        }
        return qtdAnagrama; // Retorna a quantidade de Anagramas identificado
    }

    /**
     * Quebra a palavra informado em todas as subtrings possíveis que há nela.
     *
     * @param palavra texto informado que será quebrado em substrings
     * @return retorna uma lista de substrings da palavra informada
     */
    private static List<String> capturaSubstring(String palavra) {
        List<String> resultado = new ArrayList<>();
        String substr;

        for(int i = 0; i <= palavra.length();i++){
            for(int j = i + 1; j <= palavra.length();j++){
                substr = palavra.substring(i,j);
                if (substr.length() < palavra.length())
                    resultado.add(substr);
            }
        }
        return resultado;
    }

    /**
     * Checa se duas palavras são anagramas.
     *
     * @param palavra1 texto primário para identificação de anagrama
     * @param palavra2 texto secundário para identificação de anagrama
     * @return retorna TRUE se for um angrama ou FALSE se não for anagrama.
     */
    private static boolean checaAnagrama(String palavra1,String palavra2) {
        /* Se as substrings selecionadas possuirem tamanhos diferentes, não é Anagrama  */
        if(palavra1.length() != palavra2.length())
            return false;

        // Converte as substrings em char
        char[] char1 = palavra1.toCharArray();
        char[] char2 = palavra2.toCharArray();

        // Ordena as variaveis char para simplificar a comparação
        Arrays.sort(char1);
        Arrays.sort(char2);

        // gera novas strings baseadas nos caracteres ordenados, para verificar se são iguais
        String novaPalavra1 = new String(char1);
        String novaPalavra2 = new String(char2);

        return novaPalavra1.equals(novaPalavra2); // compara as novas palavras formas e retorna se são iguais
    }
}
