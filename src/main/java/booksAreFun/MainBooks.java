package booksAreFun;

import java.util.ArrayList;
import java.util.List;

public class MainBooks {
    public static void main(String[] args) {

        Books books = new Books("The Hobbit",new Arthur("J.R.R fuckface","Gofuckyourself@gmail.com",'M'));

        books.findAuthor();

        System.out.println(books.getArthur().getName());





        //====================================================================
    }
}
