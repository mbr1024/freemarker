package org.yexiaomo.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.yexiaomo.freemarker.bean.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * 因为我们要返回的是页面，所以只能使用 @Controller
 */
@Controller
public class BookController {

    @GetMapping("/book")
    public String user(Model model) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "西游记", "吴承恩"));
        books.add(new Book(2, "三国演义", "罗贯中"));
        books.add(new Book(4, "红楼梦", "曹雪芹"));
        books.add(new Book(3, "水浒传", "施耐庵"));
        model.addAttribute("books", books);
        model.addAttribute("username", "yexiaomo");
        return "book";
    }
}
