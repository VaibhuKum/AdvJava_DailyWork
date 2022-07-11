package com.cdac.app;

import java.util.ArrayList;
import java.util.List;

import com.cad.dao.GenericDao;
import com.cdac.entity.Author;
import com.cdac.entity.Book;

public class BookAuthorExample {
	
	public static void main(String[] args) {
		GenericDao dao = new GenericDao();
		
		//adding Authors one by one
		/*Author author = new Author();
		author.setName("Elisabeth Robson");
		author.setEmail("elisa@gmail.com");
		dao.save(author);*/
		
		//adding books along with authrs details
		/*Book book = new Book();
		book.setName("Head of first pattern");
		book.setCost(2500);
		
		List<Author> authors = new ArrayList<Author>();
		authors.add((Author) dao.fetchById(Author.class, 1));
		authors.add((Author) dao.fetchById(Author.class, 2));
		
		book.setAuthors(authors);
		dao.save(book);*/
		
		//assuming that first we want to add the book
		/*Book book = new Book();
		book.setName("Head First JavaScript");
		book.setCost(1500);
		dao.save(book);*/
		
		//then mention the authors of this book which already given
		/*Book book = (Book) dao.fetchById(Book.class, 2);
		List<Author> authors = new ArrayList<Author>();
		authors.add((Author) dao.fetchById(Author.class, 1));
		authors.add((Author) dao.fetchById(Author.class, 2));
		
		book.setAuthors(authors);
		
		dao.save(book);*/
		
		//adding book along with author
		Book book =new Book();
		book.setName("Groovy 2 Cookbook");
		book.setCost(3200);
		
		Author author1 = new Author();
		author1.setName("Andrey Adamovich");
		author1.setEmail("andrey@gmail.com");
		
		Author author2 = new Author();
		author2.setName("jeams Flandencio");
		author2.setEmail("jeams@gmail.com");
		
		List<Author> list = new ArrayList<Author>();
		list.add(author1);
		list.add(author2);
		
		book.setAuthors(list);
		
		dao.save(book);
	}

}
