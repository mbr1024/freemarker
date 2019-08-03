package org.yexiaomo.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.yexiaomo.freemarker.bean.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * 因为我们要返回的是页面，所以只能使用 @Controller
 */
@Controller
public class BookController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    @GetMapping("/book")
    public String user(Model model) {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "西游记", "吴承恩"));
        books.add(new Book(2, "三国演义", "罗贯中"));
        books.add(new Book(4, "红楼梦", "曹雪芹"));
        books.add(new Book(3, "水浒传", "施耐庵"));
        books.add(new Book(3, "水浒传11", "施耐庵11"));
        books.add(new Book(3, "水浒传1122", "施耐庵1122"));
        model.addAttribute("books", books);
        model.addAttribute("username", "yexiaomo");
        return "book";
    }
}
