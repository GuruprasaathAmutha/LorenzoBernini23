package selvan.ponniyin.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import selvan.ponniyin.dto.Books;
import selvan.ponniyin.repo.BooksRepo;

@Controller
public class ContollerTwo {


    @Autowired
    BooksRepo booksRepo;



    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return ResponseEntity.ok("pong");
    }


    @PostMapping("/addBook")
    public ResponseEntity<Books> addBook(@RequestParam String bookname,@RequestParam String Author){

        Books freshbook = booksRepo.save(new Books(bookname,Author));
        return ResponseEntity.ok(freshbook);

    }
}
