package com.binggr.service;

import com.binggr.dao.BookMapper;
import com.binggr.pojo.Books;

import java.util.List;

/**
 * @author: bing
 * @date: 2020/9/8 17:00
 */
public class BookServiceImpl implements BookService{

    /**
     * Service调用Dao层
     * @param book
     * @return
     */
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books book) {
        return bookMapper.addBook(book);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> queryAllBook() {
        return bookMapper.queryAllBook();
    }

    public Books queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
