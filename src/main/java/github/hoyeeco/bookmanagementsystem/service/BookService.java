package github.hoyeeco.bookmanagementsystem.service;

import github.hoyeeco.bookmanagementsystem.pojo.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookService {
    public List<Book> findAllBooks();
    public Book findBookById(Integer id);
    public void addBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(Integer id);
    public List<Book>searchBooks(Book book);
    public List<Book>searchBookByStr(String searchStr);
    public void deleteBooks(int[] ids);
}
