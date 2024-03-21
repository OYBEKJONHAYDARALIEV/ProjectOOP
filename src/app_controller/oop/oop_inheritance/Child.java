package app_controller.oop.oop_inheritance;

public class Child extends Father {


    String schoolKnowledge;
    String schoolKnowledge2;

    public Child(String companies, String cars, String houses, String schoolKnowledge) {
        super(companies, cars, houses);
        this.schoolKnowledge = schoolKnowledge;
        System.out.println("Birinchi kontruktor");
    }

    public Child(String companies, String cars, String houses, String schoolKnowledge, String schoolKnowledge2) {
        this(companies, cars, houses, schoolKnowledge);
        this.schoolKnowledge = schoolKnowledge;
        System.out.println("Ikkinchi kontruktor");
    }

    void studySkills() {
        System.out.println("Top studySkills in School");
    }


    @Override
    void companyControlling() {
        // bu joyda hohlagancha o'zgartish kiritsangiz bo'ladi
    }

    void Test() {

        // FatherLife instance variable
//        String companies1= super.companies;

        // FatherLife method
        super.companyControlling();

    }

}
