package streams;

/**
 * created by maksimkharmak , 5.08.21
 */
public class Staff {
   private String name;
   private int experience;
   private Positions position;

   public Staff(String name,int experience,Positions position){
       this.name = name;
       this.experience = experience;
       this.position = position;
   }

    @Override
    public String toString() {
        return "Staff{" +
                "name='" + name + '\'' +
                ", experience=" + experience +
                ", position=" + position +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public Positions getPosition() {
        return position;
    }

    public void setPosition(Positions position) {
        this.position = position;
    }
}
