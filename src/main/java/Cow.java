//USE @OVERRIDE. ITS NOT NEEDED BUT IT SHOULD BECOME A HABIT
public class Cow {
    private String name;
    private int age;
    private double weight;

    public Cow(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name + ", " + age + " - " + weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cow cow = (Cow) obj;
        return age == cow.age &&
               Double.compare(cow.weight, weight) == 0 &&
               name.equals(cow.name);
    }
}
