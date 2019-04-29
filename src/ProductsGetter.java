public class ProductsGetter extends Meal{

    public ProductsGetter(boolean confirm, MealMaker nextStage) {
        super(confirm, nextStage);
        this.currentSituation = "Getting products";
    }

    @Override
    public void info(String action) {
        System.out.println("Processing : " + action);
        nextStage.makeMeal();
    }
}
