package com.glc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class AppTest 
{
    //Test case 1: Given that I visit the site, when I first start, I expect my list to be empty.

    @Test
    public void EmptyList()
    {
        //setup
        int list=0;
        //execute
        ReadList read =  new ReadList();
        int result = read.getBook();
        //assert
        assertEquals(list, result);
    }

    // Test Case 2: Given that I have an empty list, when I add the first book to my list,
    // ten I expect numberRead to return 1.

    @Test
    public void FirstBook()
    {
        int list=1;
        Book book1=new Book("The Hobbit by J.R.R", "Tolkein", 320, 1937);
        ReadList read=new ReadList("May 22, 1992",5);
        read.addBook(read,book1);   
        int result=read.numberRead();
        assertEquals(list, result);    
    }

    //Test Case 3: Given that I have an empty list, when I add additional books to the list,
    // I expect the numberRead to return the total number of books in my list.

    @Test
    public void AddingBook(){
        int list=2;
        Book book1=new Book("The Hobbit by J.R.R", "Tolkein", 320, 1937);
        Book book2=new Book("Alices Adventures in Wonderland", "Lewis Carroll", 544 , 1865);
        ReadList read=new ReadList("January 1, 2020",5);
        ReadList read1=new ReadList("May 22, 1992",5);
        read.addBook(read,book1);
        read.addBook(read1,book2);   
        int result=read.numberRead();
        assertEquals(list, result);  
    }
    



}
