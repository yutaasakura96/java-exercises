// Create a class with the name Calculator. The class needs two fields (instance variables) with names floor of type Floor and carpet of type Carpet.
public class Calculator {
    Carpet carpet;
    Floor floor;

    public static void main(String[] args) {
        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }

    public Calculator(Floor floor, Carpet carpet) {
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost() {
        return carpet.getCost() * floor.getArea();
    }
}