package app_controller.oop.oop_constructor.product;

public class ProductController {

    public static void main(String[] args) {


        Product product1 = new Product("Daftar", "Luks market", 5000);
        Product product2 = new Product("Mouse", "Texno market", 67000);
        Product product3 = new Product("Butsa", "Sport market", 120000);
        Product product4 = new Product("Laptop", "Media market", 8000000);
        Product product5 = new Product("Olma", "Meva bozor", 12000);

        Product[] allProducts = { product1, product2, product3, product4, product5};

        for (int i = 0; i < allProducts.length; i++){
            System.out.println(i+1 + " . " + allProducts[i]);
        }


    }

}
