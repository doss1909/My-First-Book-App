package com.das.serviceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.das.DTO.BookDTO;
import com.das.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	Map<Integer, BookDTO> bookStorage = new HashMap<>();

	@Override
	public BookDTO addBook(BookDTO bookDto) {
		bookStorage.put(bookDto.getId(), bookDto);
		return bookDto;
	}

	@Override
	public String deleteBookById(Integer id) {

		boolean containsKey = bookStorage.containsKey(id);
		if (containsKey) {
			BookDTO remove = bookStorage.remove(id);
			return "record is deleted with id" + id;
		}
		return null;
	}

	@Override
	public BookDTO getBookById(Integer id) {
		BookDTO bookDTO = bookStorage.get(id);
		return bookDTO;
	}

	@Override
	public List<BookDTO> getAllBooks() {

		List<BookDTO> records = new ArrayList<BookDTO>();

		List<Entry<Integer, BookDTO>> collect = bookStorage.entrySet().stream().collect(Collectors.toList());
		for (Entry<Integer, BookDTO> data : collect) {

			BookDTO book = data.getValue();
			records.add(book);

		}

		return records;
	}

}
