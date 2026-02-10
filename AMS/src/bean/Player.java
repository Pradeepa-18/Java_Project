package bean;

public class Player {
    private String name;
    private int age;
    private int experience;
    private String qualification;

    public Player() {
        this.name = null;
        this.age = 0;
        this.experience = 0;
        this.qualification =null;

    }

    public Player(String name, int age, int experience, String qualification) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.qualification = qualification;
    }

    public int getExperience() {
        return experience;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", experience=" + experience +
                ", qualification='" + qualification + '\'' +
                '}';
    }
}
