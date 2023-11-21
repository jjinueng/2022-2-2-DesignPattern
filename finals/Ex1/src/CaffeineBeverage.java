public abstract class CaffeineBeverage {
    //System.out.println("water boiling..");
    //System.out.println("cup pouring..");
    final void prepareRecipe() {
        boilWater();
        brew();
        pourCup();
        addCondiments();
    }
    abstract void brew();
    abstract void addCondiments();
    void boilWater() {
        System.out.println("water boiling..");
    }
    void pourCup() {
        System.out.println("cup pouring..");
    }

}
