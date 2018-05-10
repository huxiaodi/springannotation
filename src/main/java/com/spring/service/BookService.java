package com.spring.service;

import com.spring.dao.BookDao;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:41 2018/4/26
 */
@ToString
@Service
public class BookService {
    /**
     *     @Qualifier("bookDao2")
     *     @Primary
     *     @Autowired(Require = false)
     *
     */
    @Qualifier("bookDao")
    @Autowired
    private BookDao bookDao;


}
