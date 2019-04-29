public class TestClass {
    public static void main(String[] args) {
        MealComplector complect = new MealComplector(true);
        MealCooker cooker = new MealCooker(true, complect);
        ProductsGetter products = new ProductsGetter(true,cooker);

        products.makeMeal();
    }
}
