package ru.netology;

public class MovieManager {
    private Movie[] films = new Movie[0];
    private int numberOfFilms = 10;

    public MovieManager() {
    }

    public MovieManager(int numberOfFilms) {
        this.numberOfFilms = numberOfFilms;
    }

    public void add(Movie film) {
        int length = films.length + 1;
        Movie[] tmp = new Movie[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Movie[] getAll() {
        int resultLenght;
        if (films.length > numberOfFilms) {
            resultLenght = numberOfFilms;
        } else {
            resultLenght = films.length;
        }
        Movie[] result = new Movie[resultLenght];
        for (int i = 0; i < resultLenght; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}

