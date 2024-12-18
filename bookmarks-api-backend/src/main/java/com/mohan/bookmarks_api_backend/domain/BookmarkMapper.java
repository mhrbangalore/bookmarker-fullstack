package com.mohan.bookmarks_api_backend.domain;

import com.mohan.bookmarks_api_backend.domain.dto.BookmarkDto;
import org.springframework.stereotype.Component;

@Component
public class BookmarkMapper {

    public BookmarkDto mapToDto(Bookmark bookmark){
        BookmarkDto dto = new BookmarkDto();
        dto.setId(bookmark.getId());
        dto.setTitle(bookmark.getTitle());
        dto.setUrl(bookmark.getUrl());
        dto.setCreatedAt(bookmark.getCreatedAt());
        return dto;
    }
}
