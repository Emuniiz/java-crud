package main;

import java.util.Scanner;
import service.ProductService;

public class Main {
    public static void main(String[] args) {
        ProductService service = new ProductService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Criar produto");
            System.out.println("2. Listar produtos");
            System.out.println("3. Atualizar produto");
            System.out.println("4. Deletar produto");
            System.out.println("0. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    service.createProduct(id, nome, preco);
                    break;
                case 2:
                    service.listProducts();
                    break;
                case 3:
                    System.out.print("ID do produto a atualizar: ");
                    int idUpdate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Novo nome: ");
                    String newName = scanner.nextLine();
                    System.out.print("Novo preço: ");
                    double newPrice = scanner.nextDouble();
                    service.updateProduct(idUpdate, newName, newPrice);
                    break;
                case 4:
                    System.out.print("ID do produto a deletar: ");
                    int idDelete = scanner.nextInt();
                    service.deleteProduct(idDelete);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
