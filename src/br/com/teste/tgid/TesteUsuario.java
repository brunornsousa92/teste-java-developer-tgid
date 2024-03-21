package br.com.teste.tgid;

public class TesteUsuario {

    public static void main(String[] args) {
        // Criação de um objeto Empresa
        String nomeEmpresa = "Empresa X";
        String emailEmpresa = "contato@empresax.com";
        String cnpjEmpresa = "12345678901234";
        Empresa empresa = new Empresa(nomeEmpresa, emailEmpresa, cnpjEmpresa);

        // Teste da validação da Empresa
        if (empresa.isValid()) {
            System.out.println("Empresa válida: " + nomeEmpresa);
        } else {
            System.out.println("Empresa inválida: " + nomeEmpresa);
        }

        // Criação de um objeto Cliente
        String nomeCliente = "Cliente Y";
        String emailCliente = "contato@clientey.com";
        String cpfCliente = "12345678901";
        Cliente cliente = new Cliente(nomeCliente, emailCliente, cpfCliente);

        // Teste da validação do Cliente
        if (cliente.isValid()) {
            System.out.println("Cliente válido: " + nomeCliente);
        } else {
            System.out.println("Cliente inválido: " + nomeCliente);
        }
    }

}