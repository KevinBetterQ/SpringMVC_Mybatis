package com.qwk.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.qwk.dao.BookDaoI;
import com.qwk.entity.Book;

@Service
public class BookService {
	@Resource
	BookDaoI bookDaoI;
	public List<Book> getAllBook() {
		return bookDaoI.getAllBook();
	}
}
