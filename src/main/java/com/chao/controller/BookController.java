package com.chao.controller;

import com.chao.Service.BookService;
import com.chao.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping("/index")
    public String AllBooks(Model model)
    {
        List<Books> books = bookService.queryAllBook();
        model.addAttribute("books",books);
        System.out.println(books);
        return "/pages/Client/index";
    }

}
