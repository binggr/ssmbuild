package com.binggr.contoller;

import com.binggr.pojo.Books;
import com.binggr.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author: bing
 * @date: 2020/9/8 19:13
 */

@Controller
@RequestMapping("/book")
public class BookController {

    /**
     * controller调 service
     */
    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    /**
     * 查询所有书籍，返回一个书籍页面
     * @param model
     * @return
     */
    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> list = bookService.queryAllBook();
        model.addAttribute("list",list);
        return "allBook";

    }

    /**
     * 跳转添加书籍页面
     * @return
     */
    @RequestMapping("/toAddBook")
    public String toAddPaper(){
        return "addBook";
    }

    /**
     * 添加书籍的请求
     * @param books
     * @return
     */
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addBook=>"+books);
        bookService.addBook(books);
        return "redirect:/book/allBook";
    }

    /**
     * 跳转至修改图书页面
     * @return
     */
    @RequestMapping("/toUpdateBook")
    public String toUpadatePaper(int id,Model model){
       Books books = bookService.queryBookById(id);
        model.addAttribute("QBook",books);
        return  "updateBook";
    }

    /**
     * 根据id修改书籍
     * @param books
     * @return
     */
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook=>"+books);
        bookService.updateBook(books);
        return "redirect:/book/allBook";
    }

    /**
     * 根据id删除书籍
     * @param id
     * @return
     */
    @RequestMapping("/deleteBook/{bookId}")
    public String deleteBook(@PathVariable("bookId") int id){
        bookService.deleteBookById(id);
        return "redirect:/book/allBook";
    }


}
