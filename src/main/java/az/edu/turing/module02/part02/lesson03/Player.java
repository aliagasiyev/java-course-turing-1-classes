package az.edu.turing.module02.part02.lesson03;

import java.util.Objects;

public class Player {
    public final long id;
    public final String name;
    public final int score;

    public Player(long id, String name, int score) {
        this.id = id;
        this.score = score;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("{id=%d, name='%s', score=%d}", id, name, score);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return score == player.score && Objects.equals(name, player.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, name);
    }
}
