package app_controller.oop.builder_pattern;

public class MumtozRestaurant {

    private final String manti;
    private final String honim;
    private final String mastava;
    private final String shorva;
    private final String palov;
    private final String kabob;

    private MumtozRestaurant(String manti, String honim, String mastava, String shorva, String palov, String kabob) {
        this.manti = manti;
        this.honim = honim;
        this.mastava = mastava;
        this.shorva = shorva;
        this.palov = palov;
        this.kabob = kabob;
    }

//    public MumtozRestaurant() {
//    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("MumtozRestaurant{");
        if (manti != null) result.append("manti='").append(manti).append('\'').append(", ");
        if (honim != null) result.append("honim='").append(honim).append('\'').append(", ");
        if (mastava != null) result.append("mastava='").append(mastava).append('\'').append(", ");
        if (shorva != null) result.append("shorva='").append(shorva).append('\'').append(", ");
        if (palov != null) result.append("palov='").append(palov).append('\'').append(", ");
        if (kabob != null) result.append("kabob='").append(kabob).append('\'');
        result.append('}');
        return result.toString();
    }

    public static class Builder implements MumtozRestaurantBuilder {
        private String manti;
        private String honim;
        private String mastava;
        private String shorva;
        private String palov;
        private String kabob;


        @Override
        public MumtozRestaurantBuilder manti(String manti) {
            this.manti = manti;
            return this;
        }

        @Override
        public MumtozRestaurantBuilder honim(String honim) {
            this.honim = honim;
            return this;
        }

        @Override
        public MumtozRestaurantBuilder mastava(String mastava) {
            this.mastava = mastava;
            return this;
        }

        @Override
        public MumtozRestaurantBuilder shorva(String shorva) {
            this.shorva = shorva;
            return this;
        }

        @Override
        public MumtozRestaurantBuilder palov(String palov) {
            this.palov = palov;
            return this;
        }

        @Override
        public MumtozRestaurantBuilder kabob(String kabob) {
            this.kabob = kabob;
            return this;
        }

        @Override
        public MumtozRestaurant build() {
            return new MumtozRestaurant(manti, honim, mastava, shorva, palov, kabob);
        }
    }
}
