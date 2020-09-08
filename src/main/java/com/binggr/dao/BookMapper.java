package com.binggr.dao;

import com.binggr.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author: bing
 * @date: 2020/9/8 16:25
 */
public interface BookMapper {
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
    int deleteBookById(@Param("bookId") int id);

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
    Books queryBookById(@Param("bookId") int id);

    /**
     * 查询全部的书
     * @return
     */
    List<Books> queryAllBook();
}
