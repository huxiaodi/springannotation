package com.spring.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

/**
 * @Description：
 * @Author:hudi
 * @Date: Created in 16:41 2018/4/26
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Repository
public class BookDao {
    private String info = "1";

}
