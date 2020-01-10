package com.johnabbott.librarySystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.johnabbott.librarySystem.model.Book;
import com.johnabbott.librarySystem.service.BookService;


@Controller
public class LibrarySystemController {

	@Autowired
	BookService service;

	@RequestMapping(value = "/getcomputerbook", method = RequestMethod.GET)
	public ModelAndView getComputerBookList() {
		ModelAndView modelView = new ModelAndView("computer-book-list");

		List<Book> computerBooks = service.getBooks();
		modelView.addObject("computerbookList", computerBooks);
		modelView.addObject("book", new Book());
		
		return modelView;
	}

	@RequestMapping(value = "/getnovelbook", method = RequestMethod.GET)
	public ModelAndView getNovelBookList() {
		ModelAndView modelView = new ModelAndView("novel-book-list");

		List<Book> novelBooks = service.getNovelBooks();
		modelView.addObject("novelbookList", novelBooks);
		
		return modelView;
	}

	@RequestMapping(value = "saveBook", method= RequestMethod.POST)
	public String saveBook(@ModelAttribute("book") Book book) {
		if(service.addBook(book))
			return "redirect:/getcomputerbook";
		else {
			return "ErrorPage";
		}
	}
	
	@RequestMapping(value = "editbook")
	public ModelAndView editBook(@RequestParam("bookId") int bookId) {
		ModelAndView mv = new ModelAndView("update-book");
		Book fetchedBook = service.getBookById(bookId);
		mv.addObject("editedbook", fetchedBook);
		return mv;
	}

	@RequestMapping(value = "updatebook")
	public String updateBook(@ModelAttribute("editedbook") Book editbook) {
		if (service.updateBook(editbook)) {
			return "redirect:/getcomputerbook";
		} else {
			return "ErrorPage";
		}
	}

}
