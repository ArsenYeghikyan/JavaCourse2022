package Beginner.OOP.hw3;

public  class Book {

 private Author author;
 private Content content;
 private Title title;


    public Book(Author author, Content content, Title title) {
        this.author = author;
        this.content = content;
        this.title = title;
    }

  public void show(){

      System.out.println(author.getBookAuthor()+" "+ content.getContent()+" "+title.getBookTitle());

  }



}
