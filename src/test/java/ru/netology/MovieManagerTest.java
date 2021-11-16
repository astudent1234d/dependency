package ru.netology;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class MovieManagerTest {
        private Movie first = new Movie("Film1", "Genre1");
        private Movie second = new Movie("Film2", "Genre2");
        private Movie third = new Movie("Film3", "Genre3");
        private Movie fourth = new Movie("Film4", "Genre4");
        private Movie fifth = new Movie("Film5", "Genre5");
        private Movie sixth = new Movie("Film6", "Genre6");
        private Movie seventh = new Movie("Film7", "Genre7");
        private Movie eight = new Movie("Film8", "Genre8");
        private Movie ninth = new Movie("Film9", "Genre9");
        private Movie tenth = new Movie("Film10", "Genre10");
        private Movie eleventh = new Movie("Film11", "Genre11");


        MovieManager manager = new MovieManager();

        @BeforeEach
        public void setUp() {
            manager.add(first);
            manager.add(second);
            manager.add(third);
            manager.add(fourth);
            manager.add(fifth);
            manager.add(sixth);
            manager.add(seventh);
            manager.add(eight);
            manager.add(ninth);
            manager.add(tenth);
            manager.add(eleventh);

        }

        @Test
        public void shouldGetAllFilms(){
            Movie[] expected = new Movie[]{
                    eleventh,
                    tenth,
                    ninth,
                    eight,
                    seventh,
                    sixth,
                    fifth,
                    fourth,
                    third,
                    second};
            Movie[] actual = manager.getAll();
            assertArrayEquals(expected, actual);
        }

        @Test
        public void shouldAddFilm(){
            manager.add(first);
            Movie[] expected = new Movie[]{
                    first,
                    eleventh,
                    tenth,
                    ninth,
                    eight,
                    seventh,
                    sixth,
                    fifth,
                    fourth,
                    third};
            Movie[] actual = manager.getAll();
            assertArrayEquals(expected, actual);
        }



    }

