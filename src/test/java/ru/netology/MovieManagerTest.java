package ru.netology;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MovieManagerTest {

    @Test
    void add() {
        MovieManager manager;
        manager = new MovieManager();
        Movie first = new Movie("New Film");
        Movie two = new Movie("New Film2");
        Movie three = new Movie("New Film3");
        Movie four = new Movie("New Film4");
        manager.add(first);
        manager.add(two);
        manager.add(three);
        manager.add(four);




        Movie[] actual = manager.getAll();
        Movie[] expected = new Movie[]{four,three,two,first};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
        System.out.println(Arrays.toString(manager.getAll()));
    }
}