package app_controller.oop.oop_constructor.worker;

public class Worker {
    String ismi;
    String familyasi;
    int yoshi;
    String lavozimi;
    int ishgaKirganYili;
    public Worker ( String  ismi , String familyasi , int yoshi , String lavozimi, int ishgaKirganYili){
        this.ismi = ismi;
        this.familyasi = familyasi;
        this.yoshi = yoshi;
        this.lavozimi = lavozimi;
        this.ishgaKirganYili = ishgaKirganYili;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "ismi='" + ismi + '\'' +
                ", familyasi='" + familyasi + '\'' +
                ", yoshi=" + yoshi +
                ", lavozimi='" + lavozimi + '\'' +
                ", ishgaKirganYili=" + ishgaKirganYili +
                '}';
    }
}
