/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bibekmainali
 */
public class Book {
    private String author;
    private String publisher;
    private String title;
    private int pages;
    
    public Book(){
        
    }
    
    
    
    
    public Book(String author, String publisher, String title, int pages){
        this.author = author;
        this.publisher = publisher;
        this.title = title;
        this.pages = pages;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getPublisher(){
        return publisher;
    }
    
    public String getTitle(){
        return title;
    }
    
    public int getPages(){
        return pages;
    }
    
    public String toString(){
        return "Author of the book: "+ author +". Publisher of the book:  "+  publisher + ". Title of the book: "+ title + ". "
                + "Number of pages in the book: "+ pages;
    }
    
}
