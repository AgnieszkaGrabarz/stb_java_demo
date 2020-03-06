package model;

public class User {

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Boolean likeIceCream;

    public User(String firstName, String lastName, String email, int age, Boolean likeIceCream) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.likeIceCream = likeIceCream;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public Boolean getLikeIceCream() {
        return likeIceCream;
    }

    public void introduceYourself() {
        System.out.println("Hi! My name is " + firstName + " " + lastName);
    }

    Boolean isAdult() {
        if (age > 18) {
            return true;
        } else {
            return false;
        }
    }

    public void metodaZParametrem(String paramter) {
        System.out.println("Paramter metody: " + paramter);
    }

    public void metodaZParametrem(String paramter, String parametr2) {
        System.out.println("Paramter metody: " + paramter + " parametr 2 " + parametr2);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", likeIceCream=" + likeIceCream +
                '}';
    }
}
