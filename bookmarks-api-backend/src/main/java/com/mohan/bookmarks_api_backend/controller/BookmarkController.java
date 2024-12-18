package com.mohan.bookmarks_api_backend.controller;

import com.mohan.bookmarks_api_backend.domain.Bookmark;
import com.mohan.bookmarks_api_backend.domain.dto.BookmarkDto;
import com.mohan.bookmarks_api_backend.service.BookmarkService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookmarks")
@RequiredArgsConstructor
public class BookmarkController {

    private final BookmarkService service;

    @GetMapping
    public Page<BookmarkDto> getBookmarks(@RequestParam(name = "page", defaultValue = "1") Integer page){
        Page<BookmarkDto> response = service.getBookmarks(page);
        return response;
//        return service.getBookmarks(page);
    }
}
