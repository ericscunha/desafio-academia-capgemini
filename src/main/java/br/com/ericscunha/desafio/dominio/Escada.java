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
     * @return Retorna a escada montada
     */
    public static String montaDegraus(int numeroDegraus) {
        String str = "*";
        String formatoStr;
        String degrau;
        StringBuilder escada = new StringBuilder();
        boolean valido = true;

        do {
            try {
                formatoStr = "%"+numeroDegraus+"."+numeroDegraus+"s";
                if(numeroDegraus==0){ // Não aceita zero como valor válido
                    System.out.println("Informe um número válido maior que 0.");
                    valido = false;
                }
                else if(numeroDegraus>0) {
                    // Loop que monta a escada de acordo com a quantidade degraus
                    for(int i = 1; i <= numeroDegraus;i++){
                        degrau = str.repeat(i);
                        degrau = String.format(formatoStr, degrau);
                        escada.append(degrau);
                        if(i < numeroDegraus) escada.append("\n");
                    }
                    valido = false;
                }
            }
            catch(InputMismatchException e){
                System.out.println("Informe um número válido maior que 0.");
                numeroDegraus = 0;
            }
        }while (valido);
        return escada.toString();
    }
}

