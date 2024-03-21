package app_controller.oop.builder_pattern;

public interface MumtozRestaurantBuilder {
    MumtozRestaurantBuilder manti(String manti);
    MumtozRestaurantBuilder honim(String honim);
    MumtozRestaurantBuilder mastava(String mastava);
    MumtozRestaurantBuilder shorva(String shorva);
    MumtozRestaurantBuilder palov(String palov);
    MumtozRestaurantBuilder kabob(String kabob);
    MumtozRestaurant build();
}
