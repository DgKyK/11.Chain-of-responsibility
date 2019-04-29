public class MealCooker extends Meal {

    public MealCooker(boolean confirm, MealMaker nextStage) {
        super(confirm, nextStage);
        this.currentSituation = "Cooking";
    }

    @Override
    public void info(String action) {
        System.out.println("Processing : " + action);
        nextStage.makeMeal();
    }
}
