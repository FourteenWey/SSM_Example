package cn.ffxivsc.ssmp_demo.service.impl;

import cn.ffxivsc.ssmp_demo.domain.Book;
import cn.ffxivsc.ssmp_demo.mapper.BookMapper;
import cn.ffxivsc.ssmp_demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    public BookMapper bookMapper ;

    @Override
    public boolean addBook(Book book) {
        return bookMapper.addBook(book) == 1;
    }

    @Override
    public boolean setBook(Book book) {
        return bookMapper.setBook(book) == 1;
    }

    @Override
    public boolean delBook(Integer id) {
        return bookMapper.delBook(id) == 1;
    }

    @Override
    public Book getBook(Integer id) {
        return bookMapper.getBook(id);
    }
}
