package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MovieManagerLessTenTest {
    MovieManager manager = new MovieManager();
    private Movie first = new Movie("Film1", "Genre1");
    private Movie second = new Movie("Film2", "Genre2");
    private Movie third = new Movie("Film3", "Genre3");
    private Movie fourth = new Movie("Film4", "Genre4");
    private Movie fifth = new Movie("Film5", "Genre5");

    @Test
    public void shouldGetAllWithMovieMoreTen() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);

        Movie[] expected = new Movie[]{
                fifth,
                fourth,
                third,
                second,
                first};
        Movie[] actual = manager.getAll();
        assertArrayEquals(expected, actual);
    }
}