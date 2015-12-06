package com.challengers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.List;

@SpringBootApplication
public class BookstoreClientApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(BookstoreClientApplication.class, args);

        RestTemplate restTemplate = new RestTemplate();

        // get single book by isbn
        Book book = restTemplate.getForObject("http://localhost:8084/book/isbn/isbn2", Book.class);
        System.out.println(book.getIsbn());

        // get all books - one way by specifying array of books(Preferred)
         Book[] bookArray = restTemplate.getForObject("http://localhost:8084/book/getbooks", Book[].class);
        System.out.println(bookArray.length);

        // get all books - another way by fetching json and then convert it into list of books
        ObjectMapper objectMapper = new ObjectMapper();
        String bookJson = restTemplate.getForObject("http://localhost:8084/book/getbooks", String.class);
        List<Book> bookList = objectMapper.readValue(bookJson, new TypeReference<List<Book>>() {});
        System.out.println(bookList.size());
        

        /*
        UserControllerMethods userController = new UserControllerMethods();

        //Checking login
        System.out.println("Checking user Login.");
        boolean loginResult = userController.userLogin("sandesh", "sandesh");
        System.out.println(loginResult);

        //Check user register
        System.out.println("Checking user register.");
        User user = new User("hulk", "greenStuff", "Bruce", "M", "Banner", "410 Firwood Place", "Plano", "75075", "Texas", "United States");
        String registerResult = userController.userRegister(user);
        System.out.println(registerResult);

        //Check user update
        System.out.println("Checking user update.");
        User userUpdate = new User("hulk", "greenStuff", "Sandesh", "Sanjeev", "Achar", "410 Firwood Place", "Plano", "75075", "Texas", "United States");
        String updateResult = userController.userUpdate(userUpdate);
        System.out.println(updateResult);
        */

       /* //Check for book controller
        BookControllerMethods bookController = new BookControllerMethods();

        //Check to get all books
        bookController.getAllBooks();

        //Check to find book by title
        bookController.getBookByTitle("NoSQL");

        //Check to find book by isbn
        bookController.getBookByISBN("abc123456789");

        //Check to find book by language
        bookController.getBookBylanguage("English");

        //Check to find books by author
        bookController.getBookByAuthorName("John Benoit");

        //Check to find books by publisher
        bookController.getBookByPublisherName("abc publications");*/
    }
}
