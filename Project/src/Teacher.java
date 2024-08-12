import java.io.Serializable;

public class Teacher implements Serializable {
    private String name;
    private String subject;
    private int experience;

    // Constructor
    public Teacher(String name, String subject, int experience) {
        this.name = name;
        this.subject = subject;
        this.experience = experience;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Teacher [Name: " + name + ", Subject: " + subject + ", Experience: " + experience + " years]";
    }
}
