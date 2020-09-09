package com.binggr.service;

import com.binggr.pojo.Books;

import java.util.List;

/**
 * @author: bing
 * @date: 2020/9/8 16:55
 */
public interface BookService {
    /**
     * 增加一本书
     * @param book
     * @return
     */
    int addBook(Books book);

    /**
     * 删除一本书
     * @param id
     * @return
     */
    int deleteBookById(int id);

    /**
     * 更新一本书
     * @param books
     * @return
     */
    int updateBook(Books books);

    /**
     * 查询一本书
     * @param id
     * @return
     */
    Books queryBookById(int id);

    /**
     * 查询全部的书
     * @return
     */
    List<Books> queryAllBook();

    /**
     * 通过名字查询书籍
     * @param bookName
     * @return
     */
    Books queryBookByName(String bookName);
}
