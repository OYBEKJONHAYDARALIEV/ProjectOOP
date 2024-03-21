package app_controller.oop.oop_abstraction.abstract_class_practice;

public abstract class General {

    String generalName;
    String generalAge;

    public General(String generalName, String generalAge) {
        this.generalName = generalName;
        this.generalAge = generalAge;
    }

    abstract void wakeUpAt5();
    abstract void practicalTasks();
    abstract void reading2Hours();

    void extraPracticalTasks(){
        System.out.println("Do extra 2 hour Practical Task every day");
    }

}
