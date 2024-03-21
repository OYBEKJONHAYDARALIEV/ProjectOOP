package app_controller.oop.oop_constructor.metro;

public class Metro {
    String yonalishBekati;
    String ohirgiBekat;
    double yoldaYurishVaqti;
    String liniyaRaqami;

    public Metro( String yonalishBekati , String ohirgiBekat , double yoldaYurishVaqti , String liniyaRaqami ){
        this.yonalishBekati  = yonalishBekati;
        this.ohirgiBekat = ohirgiBekat;
        this.yoldaYurishVaqti = yoldaYurishVaqti;
        this.liniyaRaqami = liniyaRaqami;
        System.out.println("Parametr CONSTRUCTOR");
    }

    public Metro(){
        System.out.println("No parametr CONSTRUCTOR");
    }

    @Override
    public String toString() {
        return "Metro{" +
                "yonalishBekati='" + yonalishBekati + '\'' +
                ", ohirgiBekat='" + ohirgiBekat + '\'' +
                ", yoldaYurishVaqti=" + yoldaYurishVaqti +
                ", liniyaRaqami='" + liniyaRaqami + '\'' +
                '}';
    }
}
