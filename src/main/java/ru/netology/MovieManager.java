package ru.netology;

public class MovieManager {

    private int numberOfFilms = 10;

    private Movie[] films = new Movie[numberOfFilms];

    public MovieManager(){
        this.numberOfFilms=numberOfFilms;
    }
    public MovieManager(int numberOfFilms){
        this.numberOfFilms=numberOfFilms;
    }

    public void add(Movie film) {
        // создаём новый массив размером на единицу больше
        int length = films.length + 1;
        Movie[] tmp = new Movie[length];
        // itar + tab
        // копируем поэлементно
        // for (int i = 0; i < items.length; i++) {
        //   tmp[i] = items[i];
        // }
        System.arraycopy(films, 0, tmp, 0, films.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public Movie[] getAll() {
        Movie[] resultLenght = new Movie[numberOfFilms];
        int number = 0;
        for (int i = 0; i < numberOfFilms; i++) {
            int index = films.length - i - 1;
            if (films[index] != null) {
                resultLenght[number] = films[index];
                number += 1;
            }
        }
        Movie[] result = new Movie[number];
        System.arraycopy(resultLenght, 0, result, 0, number);
        return result;
    }
}

