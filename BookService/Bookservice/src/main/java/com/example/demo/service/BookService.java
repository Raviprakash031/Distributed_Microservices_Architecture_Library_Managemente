package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepo;
	public String addBook(Book book) {
		Book book1=bookRepo.save(book);
		if(book1!=null) {
			return "added successfilly";
		}
		return "something went wrong";
		
	}
	public String deleteBook(Book book) {
		try {
			bookRepo.delete(book);
		}catch(Exception e){
			return e.getMessage();
			
		}
		return "deleted successfully";
	}
	public List<Book> getAll(){
		List<Book> book=bookRepo.findAll();
		return book;
	}
	public String removeBook(int id) {
		bookRepo.deleteById(id);
		return "deleted Successfilly";
	}

}
