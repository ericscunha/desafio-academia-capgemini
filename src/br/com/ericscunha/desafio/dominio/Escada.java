package br.com.ericscunha.desafio.dominio;

import java.util.InputMismatchException;

/**
 * Classe responsável pela Questão 01. Tem como principal objetivo
 * exibir uma escada representa por * com base e altura iguais à
 * quantidade de degraus informados pelo usuário.
 */
public class Escada {
    /**
     * Metodo principal de montagem da escada.
     *
     * @param numeroDegraus captura a quantidade de degraus da escada que terminará sua base e altura.
     */
    public static void montaDegraus(int numeroDegraus) {
        String str = "*";
        String formatoStr;
        String degrau;
        boolean valido = true;

        do {
            try {
                formatoStr = "%"+numeroDegraus+"."+numeroDegraus+"s";
                if(numeroDegraus==0){ // Não aceita zero como valor válido
                    System.out.println("Informe um número válido maior que 0.");
                    valido = false;
                }
                else if(numeroDegraus>0) {
                    System.out.println("Montando a escada:");
                    // Loop que monta a escada de acordo com a quantidade degraus
                    for(int i = 1; i <= numeroDegraus;i++){
                        degrau = str.repeat(i);
                        degrau = String.format(formatoStr, degrau);
                        System.out.println(degrau);
                    }
                    System.out.printf("Escada com %o degrau(s) construída com sucesso!!!\n%n", numeroDegraus);
                    valido = false;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Informe um número válido maior que 0.");
                numeroDegraus = 0;
            }
        }while (valido);
    }
}

