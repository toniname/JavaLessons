package com.homeworks.lessons5.refactorInheritence;

public class Reference {
    private String author1;
    private String author2;
    private String author3;
    private String author4;
    private int countOfpages;
    private String nameBook;
    private Boolean isUpdated;
    private int year;
    private int volume;
    private int startPage;
    private int endPage;
    private String nameArticle;


    public Reference(String author1, String author2, String author3, String author4, int countOfpages, String nameBook,
                     Boolean isUpdated, int year, int volume, int startPage, int endPage, String nameArticle) {
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.author4 = author4;
        this.countOfpages = countOfpages;
        this.nameBook = nameBook;
        this.isUpdated = isUpdated;
        this.year = year;
        this.volume = volume;
        this.startPage = startPage;
        this.endPage = endPage;
        this.nameArticle = nameArticle;
    }

    public Reference(java.lang.String author1, java.lang.String author2, java.lang.String author3, java.lang.String author4,
                     int countOfpages, java.lang.String nameBook, Boolean isUpdated, int year, int volume) {
        this.author1 = author1;
        this.author2 = author2;
        this.author3 = author3;
        this.author4 = author4;
        this.countOfpages = countOfpages;
        this.nameBook = nameBook;
        this.isUpdated = isUpdated;
        this.year = year;
        this.volume = volume;
    }

    public class Book extends Reference {
        public Book(String author1, String author2, String author3, String author4, int countOfpages, String nameBook,
                    Boolean isUpdated, int year, int volume) {
            super(author1, author2, author3, author4, countOfpages, nameBook, isUpdated, year, volume);
        }
    }

    public class Article extends Reference {
        public Article(String author1, String author2, String author3, String author4, int countOfpages, String nameBook,
                       Boolean isUpdated, int year, int volume, int startPage, int endPage, String nameArticle) {
            super(author1, author2, author3, author4, countOfpages, nameBook, isUpdated, year, volume, startPage,
                    endPage, nameArticle);
        }
    }
}


