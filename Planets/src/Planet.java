import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Planet {

        private int orbitTime;
        private ArrayList <Moon> moons;
        private String designation;

    public Planet() {}
    public Planet (int orbitTime, String designation){}

    public String getDesignation(){
        return null;
    }
    public void setDesignation(java.lang.String designation) {
        this.designation = designation;
    }
    public int getOrbitTime(){
        return 0;
    }

    public void setOrbitTime(int orbitTime) {
        this.orbitTime = orbitTime;
    }

    public void addMoons(Moon moons) {
        return;
    }
    public List<Moon> getMoons(){
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return orbitTime == planet.orbitTime &&
                Objects.equals(moons, planet.moons) &&
                Objects.equals(designation, planet.designation);
    }

    public String toString() {
        return null;
    }
}
