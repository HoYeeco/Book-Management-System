package github.hoyeeco.bookmanagementsystem.service;

import github.hoyeeco.bookmanagementsystem.mapper.BookMapper;
import github.hoyeeco.bookmanagementsystem.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;

    @Override
    public List<Book> findAllBooks(){
        return bookMapper.findAllBooks();
    }

    @Override
    public Book findBookById(Integer id) {
        return bookMapper.findBookById(id);
    }

    @Override
    public void addBook(Book book) {
        bookMapper.addBook(book);
    }

    @Override
    public void updateBook(Book book) {
        bookMapper.updateBook(book);
    }

    @Override
    public void deleteBook(Integer id) {
        bookMapper.deleteBook(id);
    }

    @Override
    public List<Book> searchBooks(Book book) {
        return bookMapper.searchBooks(book);
    }

    @Override
    public List<Book> searchBookByStr(String searchStr) {
        return bookMapper.searchBookByStr(searchStr);
    }

    @Override
    public void deleteBooks(int[] ids){
    bookMapper.deleteBooks(ids);}
}
