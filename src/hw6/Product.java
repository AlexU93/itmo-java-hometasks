package hw6;

public class Product {
    String productName;
    int protein;
    int fats;
    int carbohydrates;
    int calories;

    public Product() {
        this.productName = "Неизвестный продукт";
    }

    public Product(String productName, int protein, int carbohydrates, int calories) {
        this.productName = productName;
        this.calories = calories;
        this.carbohydrates = carbohydrates;
        this.protein = protein;
    }

    public Product(String productName, int protein, int carbohydrates, int calories, int fats) {
        this(productName,protein,carbohydrates,calories);
        this.fats = fats;
    }

    public Product(String productName) {
        this.productName = productName;
    }

    public void setCalories (int calories) {
        if (calories<=0){
            throw new IllegalArgumentException("Значение должно быть больше 0");
        }
        this.calories = calories;
    }

    public int getCalories (){
        return calories;
    }

}
