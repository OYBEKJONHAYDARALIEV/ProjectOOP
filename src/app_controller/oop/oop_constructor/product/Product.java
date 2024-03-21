package app_controller.oop.oop_constructor.product;

public class Product {

    String mahsulotNomi;
    String mahsulotDokonNomi;
    int mahsulotNarxi;

    public Product(String mahsulotNomi, String mahsulotDokonNomi, int mahsulotNarxi) {
        this.mahsulotNomi = mahsulotNomi;
        this.mahsulotDokonNomi = mahsulotDokonNomi;
        this.mahsulotNarxi = mahsulotNarxi;
    }

    @Override
    public String toString() {
        return "Product ->  : [ " +
                "mahsulotNomi -> =" + mahsulotNomi + '\'' +
                ", mahsulotDokonNomi -> ='" + mahsulotDokonNomi + '\'' +
                ", mahsulotNarxi -> =" + mahsulotNarxi +
                " ]";
    }


}
