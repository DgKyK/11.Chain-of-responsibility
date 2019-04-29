public abstract class Meal implements MealMaker {
    protected String currentSituation;
    protected boolean confirm;
    protected MealMaker nextStage;

    public Meal(Boolean confirm, MealMaker nextStage) {
        this.nextStage = nextStage;
        this.confirm = confirm;
    }

    public void makeMeal() {
        if (confirm) {
            info(currentSituation);
        }
    }

    public abstract void info(String currentSituation);
}
