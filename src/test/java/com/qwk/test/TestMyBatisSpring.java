package com.qwk.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.qwk.dao.BookDaoI;
import com.qwk.entity.Book;

public class TestMyBatisSpring {
	@Test
	public void test(){
		 //初始化容器
        ApplicationContext ctx=new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //获得bean
       /* BookDaoI bookDao = ctx.getBean("bookDao",BookDaoI.class);*/
        BookDaoI bookDao = ctx.getBean(BookDaoI.class);
        //访问数据库
        List<Book> books = bookDao.getAllBook();
        for (Book book : books) {
            System.out.println(book.getBookName());
        }
        assertNotNull(books);
	}
}
