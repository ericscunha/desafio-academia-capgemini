package br.com.ericscunha.desafio.dominio;

import java.util.InputMismatchException;
import java.util.Scanner;

import static br.com.ericscunha.desafio.dominio.Escada.*;
import static br.com.ericscunha.desafio.dominio.Cadastro.*;

/**
 * Classe responsável por criar os menus de acesso as questões e
 * executar as classes referentes a cada questão do desafio
 */

public class Questao {
    /**
     * Executa a rotina de montar o menu e chamar as questões de acordo com a seleção
     * do usuário
     */
    public static void escolheQuestao() {
        Scanner scan = new Scanner(System.in);
        int numeroQuestao;
        boolean valido = true;

        do {
            try {
                montaMenu(); // Chama o metodo que monta o menu
                numeroQuestao = scan.nextInt(); // Captura a seleção da opção;

                System.out.println("Você selecionou a questão: " + numeroQuestao);
                /* Verifica a opção selecionada e executa ação correspondente */
                // Verifica se o usuário deseja sair do sistema
                if (numeroQuestao == 0) {
                    System.out.println("A aplicação será encerrada!");
                    valido = false;
                    System.exit(0);
                }
                // Verifica se questão selecionada é válida e executa a questão
                else if ((numeroQuestao > 0) && (numeroQuestao <= 3)) {
                    // Executa a questão de acordo com o informado pelo usuário
                    valido = executaQuestao(numeroQuestao);

                    if (valido) {
                        // Verifica se o usuário que voltar ao menu principal ou sair
                        valido = retornaMenu();
                    }
                } else if (numeroQuestao > 3) {
                    System.out.println("Informe um número válido para as opções apresentadas [1, 2, 3, 0]");
                }
            } catch (InputMismatchException e)  {
                // Em caso de entrada inválida, informa o erro e volta ao menu principal
                System.out.println("Informe um número válido para as opções apresentadas [1, 2, 3, 0]");
                escolheQuestao();
            }
        } while (valido);
    }

    /**
     * Monta o menu principal
     */
    private static void montaMenu() {
        System.out.println("Informe a opção que deseja acessar?");
        System.out.println("[ 1 ] - Desafio Questão 1 (Escada)");
        System.out.println("[ 2 ] - Desafio Questão 2 (Senha)");
        System.out.println("[ 3 ] - Desafio Questão 3 (Anagrama)");
        System.out.println("[ 0 ] - Encerrar aplicação");
    }

    /**
     * Verifica se o usuário deseja retornar ao Menu ou sair da aplicação
     */
    private static boolean retornaMenu() {
        Scanner scan = new Scanner(System.in);
        boolean resultado = false; // váriavel de controle para identificar se deseja retornar ao menu principal

        // Captura a opção do usuário
        System.out.println("Para retornar ao menu principal informe 9. Para encerrar informe 0.");
        int opcao = scan.nextInt();

        if (opcao == 9) resultado = true; // Informa que deseja retorna ao menu principal
        else if (opcao == 0) System.exit(0); // Sair do sistema
        else resultado = retornaMenu(); // Executa novamente se for um número inválido

        return resultado;
    }

    /**
     * Responsável por executar os metódos das questões referentes a seleção do usuário (numeroQuestao).
     * retornando se houve uma execução válida.
     *
     * @param numeroQuestao Captura o número da questão desejada pelo usuário
     * @return Retorna se houve uma execução válida
     */
    private static boolean executaQuestao(Integer numeroQuestao) {
        Scanner scan = new Scanner(System.in);
        boolean valido = false;

        // Verifica qual a questão selecionada
        if (numeroQuestao == 1) {
            // Imprime o título da questão e captura quantidade de degraus desejado
            System.out.println("Questão 1 - Informe a quantidade de degraus que deseja:");
            int n = scan.nextInt();
            // Executa o metodo que monta a escada de acordo com o número de degraus informado
            String escada = montaDegraus(n);
            if(!escada.isEmpty()) {
                System.out.println("Escada:");
                System.out.println(escada);
                System.out.printf("Escada com %o degrau(s) construída com sucesso!!!\n%n", n);
            }
            valido = true;
        } else if (numeroQuestao == 2) {
            /* Executa uma simulação de cadastro e valida a senha */
            // Imprime o título da questão
            System.out.println("Questão 2 - Valida senha forte.");
            // Solicita e captura o nome do cadastro
            System.out.println("Informe o nome do usuário:");
            String nome = scan.next();
            // Solicita e captura a senha informada
            System.out.println("Informe a senha do usuário:");
            String senha = scan.next();

            // Valida a senha e retorna se é válida ou não
            boolean senhaValida = cadastroUsuario(nome, senha);
            if(senhaValida)
                System.out.println("Senha Forte! Cadastro realizado com sucesso!");
            valido = true;
        } else if (numeroQuestao == 3) {

            valido = false;
        }
        return valido;
    }
}
