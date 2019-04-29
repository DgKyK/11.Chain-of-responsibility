public class TestClass {
    public static void main(String[] args) {
        Meal complect = new MealComplector(true);
        Meal cooker = new MealCooker(true, complect);
        Meal products = new ProductsGetter(true,cooker);

        products.makeMeal();
    }
}
