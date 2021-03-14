package com.chao.Service;

import com.chao.pojo.Books;

import java.util.List;


public interface BookService {

    //增加一本书
    int addBook(Books book);
    //删除一本书
    int deleteBook(int id);
    //修改一本书
    int updateBook(Books book);
    //查询一本书
    Books queryBookById(int id);
    //查询所有的书
    List<Books> queryAllBook();
}
