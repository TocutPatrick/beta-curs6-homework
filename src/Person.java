public class Person {

    private String name;
    private Integer age;
    private Boolean married;

    public Person(String name, Integer age, Boolean married){
        this.name = name;
        this.age = age;
        this.married = married;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean isMarried() {
        return married;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", married=" + married +
                '}';
    }
}
