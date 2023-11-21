package assignment_김지윤_2191074;

public class Toast {
    private StringBuffer name;
    private int kcal;
    public Toast() {
        name = new StringBuffer();
        kcal = 0;
    }
    public void serve() {
        System.out.println("주문한 토스트 : " + name + " 토스트");
        System.out.println("칼로리 : " + kcal + "Kcal");
    }
    public StringBuffer getName() {
        return name;
    }
    public int getKcal() {
        return kcal;
    }
    public void addTopping(ToppingDecorator topping) {
        addName(topping.Name());
        addKcal(topping.Kcal());
    }
    public void addName(String name) {
        this.name.insert(0, name);
    }
    public void addKcal(int kcal) {
        this.kcal += kcal;
    }
}