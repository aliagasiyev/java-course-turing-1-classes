package az.edu.turing.module02.part02.MiniProject;

import java.util.*;

public class Family {
    private Human father;
    private Human mother;
    private List<Human> children = new ArrayList<>();
    private Set<Pet> pet = new HashSet<>();
    public Family() {
    }

    public Family(Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        mother.setFamily(this);
        father.setFamily(this);
    }

    public Family(Human father, Human mother, Pet pet) {
        this.father = father;
        this.mother = mother;
        this.pet.add(pet);
    }
    public void addChild(Human child) {
        if (!children.contains(child)) {
            children.add(child);
            child.setFamily(this);
        }
    }

    public boolean deleteChild(int index) {
        if (children == null || index < 0 || index >= children.size())
            return false;
        else {
            children.remove(index);
            return true;
        }
    }

    public boolean deleteChild(Human child) {
        if (children.contains(child)) {
            children.remove(child);
            return true;
        }
        return false;
    }
    public int countFamily() {
        int count = 0;
        if (mother != null) count++;
        if (father != null) count++;
        if (children != null) count += children.size();
        return count;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public List<Human> getChildren() {
        return children;
    }

    public void setChildren(List<Human> children) {
        this.children = children;
    }

    public Set<Pet> getPet() {
        return pet;
    }

    public void setPet(Set<Pet> pet) {
        this.pet = pet;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Family family = (Family) o;
        return Objects.equals(father, family.father) && Objects.equals(mother, family.mother) &&
                Objects.equals(children, family.children) && Objects.equals(pet, family.pet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(father, mother, children, pet);
    }

    @Override
    public String toString() {
        return "Family{" +
                "father=" + father +
                ", mother=" + mother +
                ", children=" + children +
                ", pet=" + pet +
                '}';
    }
}