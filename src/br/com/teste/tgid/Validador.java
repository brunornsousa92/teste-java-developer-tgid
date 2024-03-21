package br.com.teste.tgid;

public class Validador {

    public static boolean isCpfValido(String cpf) {
    	if (cpf.length() != 11) {
            return false;
        }
        return true;
    }

    public static boolean isCnpjValido(String cnpj) {
    	if (cnpj.length() != 14) {
            return false;
        }
        return true;
    }

}
