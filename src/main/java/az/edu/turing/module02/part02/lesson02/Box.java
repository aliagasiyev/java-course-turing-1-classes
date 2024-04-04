package az.edu.turing.module02.part02.lesson02;

import java.util.Objects;

public class Box<E> {
    private E data;
    private E data1;
    private E data2;


    public Box(E data, E data1, E data2) {
        this.data = data;
        this.data1 = data1;
        this.data2 = data2;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public E getData1() {
        return data1;
    }

    public void setData1(E data1) {
        this.data1 = data1;
    }

    public E getData2() {
        return data2;
    }

    public void setData2(E data2) {
        this.data2 = data2;
    }

    @Override
    public String toString() {
        return "Box{" +
                "data=" + data +
                ", data1=" + data1 +
                ", data2=" + data2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(data, box.data) && Objects.equals(data1, box.data1) && Objects.equals(data2, box.data2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, data1, data2);
    }
}

