public class RockPlanet extends Planet{
    private boolean habitable;

    public RockPlanet(int RockPlanet, String RockPlanets, boolean habitable){}

    public boolean isHabitable() {
            return habitable;
    }

    public void setHabitable(boolean habitable) {
        this.habitable = habitable;
    }

    @Override
    public String toString() {
        return "RockPlanet{" +
                "habitable=" + habitable +
                '}';
    }
}
