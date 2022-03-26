package cn.ffxivsc.ssmp_demo.service;

import cn.ffxivsc.ssmp_demo.domain.Book;
import cn.ffxivsc.ssmp_demo.domain.ResultData;

public interface IBookService {
    boolean addBook(Book book);
    boolean setBook(Book book);
    boolean delBook(Integer id);
    Book getBook(Integer id);
}
