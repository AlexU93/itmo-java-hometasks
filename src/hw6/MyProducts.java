package hw6;

public class MyProducts {
    int maxProtein;
    int maxFat;
    int maxCarbohydrates;
    int maxCalories;
    Product[] productArr = new Product[4]; // Вызов конструктора из класса Product // Какой из 4-х?


    public void addProduct(Product product) {
        for (int i = 0; i < productArr.length; i++) {
            if (productArr[i] != null) {
                productArr[i] = product;
                return;
            } else if (productArr[i].fats > 30) {
                System.out.println("В продукте" + productArr[i].productName + "превышение жиров");
            } else if (productArr[i].calories > 50) {
                System.out.println("В продукте" + Product.productName + "превышение калорий");
            }
        }
    }

    public
}
