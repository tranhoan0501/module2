package _13_Java_Collection_Framework;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int select = 0;
        do {
            System.out.println("-------Quản lý sản phầm-------");
            System.out.println("1. Danh sách sản phẩm");
            System.out.println("2. Thêm sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xoá sản phẩm");
            System.out.println("5. Tìm sản phẩm");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("8. Exit");
            System.out.print("Please input number: ");
            select = Integer.parseInt(scanner.nextLine());
            switch (select){
                case 1: //danh sách
                    productManager.displayProduct();
                    break;
                case 2: //Thêm sản phẩm
                    System.out.print("Nhập id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Nhập tên sản phẩm: ");
                    String name = scanner.nextLine();
                    System.out.print("Nhập giá sản phẩm: ");
                    int price = Integer.parseInt(scanner.nextLine());
                    productManager.addProduct(new Product(id,name,price));
                    break;
                case 3:// cập nhật sản phẩm
                    System.out.print("Nhập id sản phẩm cần sửa: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nhập tên mới: ");
                    String newName = scanner.nextLine();
                    System.out.print("Nhập giá mới: ");
                    int newPrice = scanner.nextInt();
                    scanner.nextLine();
                    productManager.updateProduct(newId, newName, newPrice);
                    System.out.println("Đã cập nhật");
                    break;
                case 4:// xoá sản phẩm
                    System.out.print("Nhập id sản phẩm cần xoá: ");
                    int idProduct = scanner.nextInt();
                    scanner.nextLine();
                    if (productManager.deleteProduct(idProduct)){
                        System.out.println("Xoá thành công sản phẩm " + idProduct);
                    }else {
                        System.out.println("Không tìm thấy sản phẩm có id " + idProduct + "để xoá");
                    }
                    break;
                case 5:// Tìm kiếm sản phẩm
                    System.out.print("Nhập tên sản phẩm cần tìm: ");
                    String searchName = scanner.nextLine();
                    scanner.nextLine();
                    Product foundProduct = productManager.searchProduct(searchName);
                    if (foundProduct != null){
                        System.out.println("Đã tìm thấy sản phẩm có tên " + searchName);
                    }else {
                        System.out.println("Không tìm thấy sản phẩm có tên " + searchName);
                    }
                    break;
                case 6:// Sắp xếp tăng dần theo giá nếu là true
                    productManager.sort(true);
                    break;
                case 7:// Sắp xếp giảm  dần theo giá nếu là true
                    productManager.sort(false);
                    break;
                case 8:
                    System.out.println("Đã thoát chương trình");
                    System.exit(0);


            }
        }while (true);
    }
}
