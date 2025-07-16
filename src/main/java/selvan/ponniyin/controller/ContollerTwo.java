package selvan.ponniyin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import selvan.ponniyin.dto.Books;
import selvan.ponniyin.repo.BooksRepo;

@RestController
public class ContollerTwo {


    @Autowired
    BooksRepo booksRepo;



    @GetMapping("/ping/{Id}")
    public Books ping(@PathVariable String  Id){
        Books bookone = new Books("The Da Vinci Code","Dan Brown");
        System.out.println(Id);
        return bookone;
    }




    @PostMapping("/postABook")
    public Books addBookOne(@RequestBody Books books){
        return booksRepo.save(books);
    }





    @PostMapping("/addBook")
    public ResponseEntity<Books> addBook(@RequestParam String bookname,@RequestParam String Author){

        Books freshbook = booksRepo.save(new Books(bookname,Author));
        return ResponseEntity.ok(freshbook);

    }
}
