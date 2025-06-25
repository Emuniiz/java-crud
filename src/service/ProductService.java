public class ProductService {
    private ProductRepository repo = new ProductRepository();

    public void createProduct(int id, String name, double price) {
        Product product = new Product(id, name, price);
        repo.save(product);
    }

    public void listProducts() {
        for (Product p : repo.findAll()) {
            System.out.println(p);
        }
    }

    public void deleteProduct(int id) {
        repo.delete(id);
    }

    public void updateProduct(int id, String newName, double newPrice) {
        Product p = repo.findById(id);
        if (p != null) {
            p.setName(newName);
            p.setPrice(newPrice);
        }
    }
}
