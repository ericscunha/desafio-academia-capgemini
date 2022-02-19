package br.com.ericscunha.desafio.dominio;

/**
 * Classe responsável pela entrada de cadastro da Questão 02. Tem como principal objetivo
 * validar a senha de acordo com os requisitos apresentados para senha forte.
 * Reunindo os metódos de Cadastro de usuário e validação de senha.
 */
public class Cadastro {
    /**
     * Executa o procedimento de validação da senha
     * e executa o registro do usuário na classe Usuario se for uma senha válida.
     *
     * @param nome nome do usuário que será registrado
     * @param senha senha do usuário que será registrado.
     * @return Retorna TRUE se a senha for válida. O que indica que o usuário foi inserido.
     *
     */
    public static boolean cadastroUsuario(String nome, String senha) {
        boolean senhaValida;
        senhaValida = validaSenha(senha);
        if (senhaValida) {
            Usuario user1 = new Usuario(nome, senha);
            System.out.println(user1);
        }
        return senhaValida;
    }

    /**
     * Valida a senha informada, chamando os metodos que validam os requisitos especificados de:
     * - Tamanho da senha
     * - Quantidade mínima de digitos
     * - Quantidade mínima de letras minusculas
     * - Quantidade mínima de letras maiusculas
     * - Quantidade de caracteres especiais
     *
     * @param senha captura a senha informada pelo usuário que será validada
     * @return retorna se é uma senha válida
     */
    private static boolean validaSenha(String senha) {
        boolean senhaValida = true;

        /* Valida a senha quanto ao tamanho */
        int countChar = 0;
        int minChar = 6;
        countChar = tamanhoSenha(senha, minChar); // Retorna a quantidade de caracteres necessário para uma senha forte
        if(countChar > 0) {
            System.out.println("Senha Fraca! Adicione pelo menos " + countChar + " caracteres para tornar uma senha segura.");
            senhaValida = false;
        }

        /* Valida se possui digito */
        int countDig = 0;
        int minDig = 1;
        countDig = digitoSenha(senha,minDig);
        if(countDig < minDig) {
            System.out.println("Atenção! Uma senha forte precisa ter no mínimo " + minDig + " número(s).");
            senhaValida = false;
        }

        /* Valida se possui letra maiuscula */
        int countUpper = 0;
        int minUpper = 1;
        countUpper = letraSenha(senha,minUpper,"U");
        if(countUpper < minUpper) {
            System.out.println("Atenção! Uma senha forte precisa ter no mínimo " + minUpper + " letra(s) maiusculas.");
            senhaValida = false;
        }

        /* Valida se possui letra maiuscula */
        int countLower = 0;
        int minLower = 1;
        countLower = letraSenha(senha,minLower,"L");
        if(countLower < minLower) {
            System.out.println("Atenção! Uma senha forte precisa ter no mínimo " + minLower + " letra(s) minusculas.");
            senhaValida = false;
        }

        /* Valida se possui uma quantidade minima de caracteres especias !@#$%^&*()-+ */
        int countEspecial = 0;
        int minEspecial = 1;
        countEspecial = especialSenha(senha,minEspecial);
        if(countEspecial < minEspecial) {
            System.out.println("Atenção! Uma senha forte precisa ter no mínimo " + minEspecial + " caracter especial !@#$%^&*()-+");
            senhaValida = false;
        }

        return senhaValida; // Retorna se a senha é valida ou não
    }

    /**
     * Esse metodo retorna a quantidade de caracteres necessários para completar o mínimo.
     * Se retornar zero é porque tem igual ou mais carcteres que o minimo
     *
     * @param senha captura a senha que será validada
     * @param minChar captura a quantidade mínima de caracteres da senha
     * @return retorna a quantidade de caracteres que faltam para o mínimo
     * */
    public static int tamanhoSenha(String senha, int minChar) {
        int qtdChar = 0; /* Identifica a quantidade de Caracteres necessários */

        /* Verifica se a senha possui menos cararteres do que o pretendido, caso tenha, retorna a
         * quantidade de caracteres necessários para o mínimo */
        if(senha.length() < minChar) {
            qtdChar = (minChar-senha.length());
        }
        return qtdChar; // Reorna a quantidade de caracteres que faltam para o mínimo
    }

    /**
     * Verifica se a senha possui uma quantidade de digitos especficiadas
     *
     * @param senha captura a senha que será validada
     * @param quantidade captura a quantidade mínima de digitos da senha
     * @return retorna a quantidade encontrada (até o mínimo).
     */
    private static int digitoSenha(String senha, int quantidade) {
        char[] charSenha = senha.toCharArray(); // Cria um array de char a partir da varíavel senha
        int checaQtd = 0; // Identifica quantos digitos forem encontrados

        // Loop de verificação dos caracteres
        for(int i = 0; i < charSenha.length; i++){
            /* Verifica se o caracter é um digito */
            if(Character.isDigit(charSenha[i])) {
                checaQtd++; // incrementa a variável sempre que localizar um digito
                /* Para o loop se a quantidade encontrada for maior ou igual ao parametro minimo */
                if(checaQtd >= quantidade) break;
            }
        }
        return checaQtd; // Retorna a quantidade encontrada
    }

    /**
     * Verifica se a senha possui uma quantidade de letras maiusculas ou minusculas
     *
     * @param senha captura a senha que será validada
     * @param quantidade captura a quantidade de caracteres mínimos deve ter a condição
     * @param tipo Tipo = "U" - Uppercase ou "L" - Lowercase. Referencial para o tipo de validação.
     * @return retorna a quantidade de caracteres que atenderam o requisito (até o mínimo).
     */
    private static int letraSenha(String senha, int quantidade, String tipo) {
        char[] charSenha = senha.toCharArray(); // Cria um array de char a partir da varíavel senha
        int checaQtd = 0; // Identifica quantos digitos forem encontrados

        // Loop de verificação dos caracteres
        for(int i = 0; i < charSenha.length; i++){
            /* Verifica se o caracter é um digito */
            if (!Character.isDigit(charSenha[i])) {
                /* Verifica se o caracter é uma letra Maiuscula ou Minuscula de acordo
                 * com o parametro "tipo" */
                if(((tipo.equals("U")) && (Character.isUpperCase(charSenha[i]))) || // Testa UpperCase se tipo = "U"
                        ((tipo.equals("L")) && (Character.isLowerCase(charSenha[i])))) { // Testa LowerCase se tipo = "L"
                    checaQtd++; // incrementa a variável sempre que localizar um digito

                    /* Para o loop se a quantidade encontrada for maior ou igual ao parametro minimo */
                    if (checaQtd >= quantidade) break;
                }
            }
        }
        return checaQtd; // Retorna a quantidade encontrada
    }

    /**
     * Verifica se a senha possui caracteres especiais
     *
     * @param senha captura a senha que será validada
     * @param quantidade captura a quantidade de caracteres mínimos deve ter a condição
     * @return retorna a quantidade de caracteres especiais encontrados (até o minimo)
     */
    private static int especialSenha(String senha, int quantidade) {
        String[] charEspecial = {"!","@","#","$","%","^","&","*","(",")","-","+"};
        int checaQtd = 0; // Identifica quantos digitos forem encontrados

        // Loop de verificação dos caracteres
        for(int i = 0; i < charEspecial.length; i++){
            /* Verifica se o caracter é um digito */
            if (senha.contains(charEspecial[i])){
                checaQtd++; // incrementa a variável sempre que localizar um digito
                /* Para o loop se a quantidade encontrada for maior ou igual ao parametro minimo */
                if (checaQtd >= quantidade) break;
            }
        }
        return checaQtd; // Retorna a quantidade encontrada
    }
}
