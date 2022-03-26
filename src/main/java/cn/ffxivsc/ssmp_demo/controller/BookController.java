package cn.ffxivsc.ssmp_demo.controller;

import cn.ffxivsc.ssmp_demo.domain.Book;
import cn.ffxivsc.ssmp_demo.domain.ResultData;
import cn.ffxivsc.ssmp_demo.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @PostMapping
    public ResultData addBook(@RequestBody Book book){
        boolean isAdd = bookService.addBook(book);
        if(isAdd){
            return ResultData.build(1);
        }else{
            return ResultData.build(0);
        }
    }

    @PutMapping
    public ResultData setBook(@RequestBody Book book){
        boolean isSet = bookService.setBook(book);
        if(isSet){
            return ResultData.build(1);
        }else{
            return ResultData.build(0);
        }
    }
    @DeleteMapping("{id}")
    public ResultData delBook(@PathVariable Integer id){
        boolean isDel = bookService.delBook(id);
        if(isDel){
            return ResultData.build(1);
        }else{
            return ResultData.build(0);
        }
    }
    @GetMapping("{id}")
    public ResultData getBook(@PathVariable Integer id){
        Book book = bookService.getBook(id);
        if(book != null){
            return ResultData.build(1,book);
        }else{
            return ResultData.build(0);
        }
    }
}
