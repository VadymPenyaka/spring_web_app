package penyaka.petprojects.spring_webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import penyaka.petprojects.spring_webapp.service.BookService;

@Controller
public class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @RequestMapping("/books")
    public String getBooks (Model model) {
        model.addAttribute("books", bookService.findAll());
        return "books";
    }
}
