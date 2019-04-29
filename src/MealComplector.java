public class MealComplector extends Meal {

    public MealComplector(boolean confirm) {
        super(confirm, null);
        this.currentSituation = "Complecting";
    }

    @Override
    public void info(String action) {
        System.out.println("Processing : " + currentSituation);
    }
}
