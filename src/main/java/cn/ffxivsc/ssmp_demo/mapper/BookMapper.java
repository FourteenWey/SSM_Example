package cn.ffxivsc.ssmp_demo.mapper;

import cn.ffxivsc.ssmp_demo.domain.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookMapper {
    Integer addBook(Book book);
    Integer setBook(Book book);
    Book getBook(@Param("id") Integer id);
    Integer delBook(@Param("id") Integer id);
}
