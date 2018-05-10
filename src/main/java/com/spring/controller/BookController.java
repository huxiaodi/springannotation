package com.spring.controller;

import com.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:41 2018/4/26
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
}
