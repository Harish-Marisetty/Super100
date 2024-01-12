// Library Management System
// Design a set of classes to represent a library system. Include classes like `Book`, `Library`, and `Member`. 
// Implement functionalities such as borrowing and returning books, tracking available books, and member subscriptions.


// 1) Follow the conepts of OOP
// 2) Must use the concepts of OOP to implement the above task
// 3) Maintain code modularity/reusability 
// Note: Use Object arrays for ease of implementation (optional)

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming");
        Library PecLibrary  = new Library();
        Member member1 = new Member("Harish");

        PecLibrary.addbook(book1);
        PecLibrary.addmember(member1);

        
    }
    
}

class Book{
    public boolean available;
    public String title;

    public Book(String title){
        this.title = title;
    }

    // borrowing a book

    void borrow(){
        if(available){
            available = false;
            System.out.println("Print " + title + " is borrowd");
        }
        else
            System.out.println("Sorry your required book is not available");
        
    }
    
    // returning a book back

    void returnbook(){
        available = true;
        System.out.println("Thank you for returning the Book");
    }

}

class Library{
    public List<Book> books;
    public List<Member> members;

    public void addbook(Book book){
        books.add(book);
    }
    public void removebook(Book book){
        books.remove(book);
    }
    public void addmember(Member member){
        members.add(member);
    }
    public void removebook(Member member){
        members.remove(member);
    }



}

class Member{
    public String name;
    public List<Book> borrowedbooks;

    public Member(String name){
        this.name = name;
    }
    public void borrowBook(Book book){
        if(book.available){
            borrowedbooks.add(book);
            System.out.println("book is borrowd");
        }
        else
            System.out.println("you cannot borrow this book");
    }
    public void returnBook(Book book){
        borrowedbooks.remove(book);
        System.out.println("Book is returned");
    }

}
