package com.homeworks.lessons5.refactorInheritence;

/*public class RefactorInheritance {

    public void processing(String author1, String author2,
                           String author3, String author4,
                           int countOfpages, String nameBook,
                           Boolean isUpdated, int year, int volume ) {
//        do something with book
    }

    public void processing(String author1, String author2,
                           String author3, String author4,
                           int startPage, int endPage,
                           String nameArticle,
                           Boolean isUpdated, int year, int volume ) {


//        do something with article

//        Заменить параметры на класс Reference, предложить рефакторинг
    }*/

public class RefactorInheritance extends Reference {


    public RefactorInheritance(String author1, String author2, String author3, String author4, int countOfpages,
                               String nameBook, Boolean isUpdated, int year, int volume, int startPage, int endPage, String nameArticle) {
        super(author1, author2, author3, author4, countOfpages, nameBook, isUpdated, year, volume, startPage, endPage,
                nameArticle);
    }

    public RefactorInheritance(String author1, String author2, String author3, String author4, int countOfpages,
                               String nameBook, Boolean isUpdated, int year, int volume) {
        super(author1, author2, author3, author4, countOfpages, nameBook, isUpdated, year, volume);
    }

    public void processing(Book book) {
//        do something with book


    }

    public void processing(Article article) {


//        do something with article

//        Заменить параметры на класс Reference, предложить рефакторинг

    }
}


