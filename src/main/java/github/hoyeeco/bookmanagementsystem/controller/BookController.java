package github.hoyeeco.bookmanagementsystem.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import github.hoyeeco.bookmanagementsystem.pojo.Book;
import github.hoyeeco.bookmanagementsystem.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/books")
    public ModelAndView findAllBooks(){
        List<Book> books = bookService.findAllBooks();
        ModelAndView mv = new ModelAndView();
        mv.addObject("books",books);
        mv.setViewName("booklist");
        return mv;
    }
    @GetMapping("/book/{id}")
    public ModelAndView findBooksById(@PathVariable("id") Integer id){
        Book book = bookService.findBookById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("book",book);
        mv.setViewName("bookdetail");
        return mv;
    }
    @GetMapping("/addBook")
    public String addBook(){//跳转至添加图书页面
        return "addBook";
    }
    @PostMapping("/addBook")
    public ModelAndView addBook(Book book){
        bookService.addBook(book);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/books"); //添加成功后回到图书列表
        return mv;
    }
    @GetMapping("/toupdatebook/{id}")
    public ModelAndView toUpdateBook(@PathVariable("id") int id){
        Book book = bookService.findBookById(id);
        ModelAndView mv = new ModelAndView();
        mv.addObject("book",book);
        mv.setViewName("updateBook");
        return mv;
    }
    @PostMapping("/updateBook")
    public ModelAndView updateBook(Book book){
        bookService.updateBook(book);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/books");
        return mv;
    }
    @GetMapping("/deleteBook/{id}")
    public ModelAndView deleteBook(@PathVariable("id") int id){
        bookService.deleteBook(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/books");
        return mv;
    }
    @GetMapping("/searchBooks")
    public ModelAndView searchBooks(Book book){
        List<Book> books = bookService.searchBooks(book);
        ModelAndView mv = new ModelAndView();
        mv.addObject("books",books);
        mv.setViewName("booklist");
        return mv;
    }
    @GetMapping("/bookPage")
    public ModelAndView bookpage(@RequestParam(value = "start",defaultValue = "1")int start,
                                 @RequestParam(value = "size",defaultValue = "3")int size){
        PageHelper.startPage(start,size, "id asc");
        List<Book> books = bookService.findAllBooks();
        PageInfo<Book> page = new PageInfo<>(books);
        ModelAndView mv = new ModelAndView();
        mv.addObject("page",page);
        mv.setViewName("booklistPage");
        return mv;
    }
    @GetMapping("/deleteBooks")
    public ModelAndView deleteBooks(int[] id){
        bookService.deleteBooks(id);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("redirect:/books");//删除成功后回到图书列表
        return mv;
    }
    @RequestMapping("/searchBookByStr")
    public String searchBookByStr(@RequestParam(value="searchStr")String searchStr, Model model){
        List<Book> books = bookService.searchBookByStr(searchStr);
        model.addAttribute("books",books);
        return "booklist";
    }

}
