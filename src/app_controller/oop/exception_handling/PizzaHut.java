package app_controller.oop.exception_handling;

public class PizzaHut {

    String pizzaName;
    String orderDestination;
    int pizzaSize;
    String courierName;
    String courierId;

    public PizzaHut(String pizzaName, String orderDestination, int pizzaSize, String courierName, String courierId) {
        this.pizzaName = pizzaName;
        this.orderDestination = orderDestination;
        this.pizzaSize = pizzaSize;
        this.courierName = courierName;
        this.courierId = courierId;
    }

    @Override
    public String toString() {
        return "PizzaHut{" +
                "pizzaName='" + pizzaName + '\'' +
                ", orderDestination='" + changeDestination() + '\'' +
                ", pizzaSize=" + pizzaSize +
                ", courierName='" + courierName + '\'' +
                ", courierId='" + courierId + '\'' +
                '}';
    }

    private String changeDestination(){
       return this.orderDestination =  this.orderDestination.toUpperCase() + " destination";
    }
}
