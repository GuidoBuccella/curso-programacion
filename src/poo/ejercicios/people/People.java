package poo.ejercicios.people;

public class People {
    private String name;
    private int age;
    private int budget;

    public People(String name, int age, int budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }

    //GETTER NAME
    public String getName() {
        return name;
    }
    //SETTER NAME
    public void setName(String name) {
        this.name = name;
    }
    //GETTER AGE
    public int getAge() {
        return age;
    }
    //SETTER AGE
    public void setAge(int age) {
        this.age = age;
    }
    //GETTER BUDGET
    public int getBudget() {
        return budget;
    }
    //SETTER BUDGET
    public void setBudget(int budget) {
        this.budget = budget;
    }


}
