package br.com.teste.tgid;

public class TesteUsuario {

    public static void main(String[] args) {
        // Cria��o de um objeto Empresa
        String nomeEmpresa = "Empresa X";
        String emailEmpresa = "contato@empresax.com";
        String cnpjEmpresa = "12345678901234";
        Empresa empresa = new Empresa(nomeEmpresa, emailEmpresa, cnpjEmpresa);

        // Teste da valida��o da Empresa
        if (empresa.isValid()) {
            System.out.println("Empresa v�lida: " + nomeEmpresa);
        } else {
            System.out.println("Empresa inv�lida: " + nomeEmpresa);
        }

        // Cria��o de um objeto Cliente
        String nomeCliente = "Cliente Y";
        String emailCliente = "contato@clientey.com";
        String cpfCliente = "12345678901";
        Cliente cliente = new Cliente(nomeCliente, emailCliente, cpfCliente);

        // Teste da valida��o do Cliente
        if (cliente.isValid()) {
            System.out.println("Cliente v�lido: " + nomeCliente);
        } else {
            System.out.println("Cliente inv�lido: " + nomeCliente);
        }
    }

}