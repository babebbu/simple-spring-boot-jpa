package com.example.spring;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping
    public Object list() {
        return bookRepository.findAll();
    }

    @PostMapping
    public Object create(@RequestBody Book book) {
        return bookRepository.save(book);
    }

}
