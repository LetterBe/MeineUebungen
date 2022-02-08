package de.neuefische.interfaces;

import java.util.Objects;

public class HistoryStudent implements Student {

    private final int id;
    private final String name;

    public HistoryStudent(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HistoryStudent that = (HistoryStudent) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "{id: " + getId() + ", name: " + getName() + "}";
    }
}
