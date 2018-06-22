package org.Obywatelecki;

public class Entity {

    private int age;
    private String name;
    private String sex;

    public Entity(int age, String name, String sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
    }

    @Override
    public int hashCode() {
        int hash = 1;
        hash = hash * 5 ^ name.hashCode();
        hash = hash * 4 ^ sex.hashCode();
        hash = hash * 3 ^ age;
        return hash;
    }

}
