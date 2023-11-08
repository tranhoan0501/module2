package _13_Java_Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager {
    static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"banhmy",10000));
        products.add(new Product(2,"thit",100000));
        products.add(new Product(3,"mytom",5000));
        products.add(new Product(4,"traicay",20000));
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public void updateProduct(int id, String name, int price){
        for (Product product : products){
            if (product.getId() == id){
                product.name = name;
                product.price = price;
                return;
            }
        }
    }
    public boolean deleteProduct(int id){
        for (Product product : products) {
            if (product.getId() == id) {
                products.remove(product);
                return true; // Xóa thành công
            }
        }
        return false; // Không tìm thấy sản phẩm cần xóa
    }
    public void displayProduct(){
        System.out.println("-------Danh sách sản phẩm-------");
        for (Product product : products){
            System.out.println(product);
        }
    }
    public Product searchProduct(String name){
        for (Product product : products){
            if (product.getName().equals(name)){
                return product;
            }
        }//equals là phương thức ss bằng nhau nếu đúng trả về true và ngc lại
        return null;
    }

    public void sort(boolean isASC) {
        Collections.sort(products, (o1, o2) -> isASC ? (int)(o1.getPrice() - o2.getPrice()) : (int)(o2.getPrice() - o1.getPrice()));
    }//Collections được sử dụng để sắp xếp một danh sách
    // Biểu thức lambda này nhận hai đối tượng o1 và o2 (đại diện cho hai sản phẩm trong danh sách) và trả về một giá trị nguyên.


}
