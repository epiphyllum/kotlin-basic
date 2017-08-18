package com.mohammad.kotlin.learning.classes;

/**
 * Created by mohammadmoradyar on 6/27/17.
 */
public class CustomerJava {

    private int id;
    private String name;
    private String email;

    public CustomerJava(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void prettyPrint() {
        System.out.println("ID : " + id);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerJava that = (CustomerJava) o;

        if (id != that.id) return false;
        if (!name.equals(that.name)) return false;
        return email.equals(that.email);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "CustomerJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        System.out.println(new CustomerJava(0, "mohammad", "mohammad@gmail.com"));
    }
}
