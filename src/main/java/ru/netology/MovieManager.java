package ru.netology;

public class MovieManager {

    private Movie[] films = new Movie[0];

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
        Movie[] result = new Movie[films.length];
//         int [] resultLength;
//        if (!films.equals(10)) {
//            resultLength = NumberOfDisplayed;
//        } else {
//            resultLength =
//        }
//         = new [resultLength];
        // перебираем массив в прямом порядке,
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}

