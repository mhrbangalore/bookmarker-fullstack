package com.mohan.bookmarks_api_backend.service;

import com.mohan.bookmarks_api_backend.domain.Bookmark;
import com.mohan.bookmarks_api_backend.domain.BookmarkMapper;
import com.mohan.bookmarks_api_backend.domain.dto.BookmarkDto;
import com.mohan.bookmarks_api_backend.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;
    private final BookmarkMapper bookmarkMapper;

    @Transactional(readOnly = true)
    public Page<BookmarkDto> getBookmarks(Integer page){
        int pageNo = page < 0 ? 1 : page - 1;
        Pageable pageable = PageRequest.of(pageNo, 5, Sort.Direction.DESC, "createdAt");
        Page<BookmarkDto> bookmarkDtoPage = bookmarkRepository.findAll(pageable).map(bookmarkMapper::mapToDto);
        return bookmarkDtoPage;
    }
}
