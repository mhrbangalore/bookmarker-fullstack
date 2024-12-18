package com.mohan.bookmarks_api_backend.domain.dto;

import com.mohan.bookmarks_api_backend.domain.Bookmark;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookmarkDto {

    private Long id;
    private String title;
    private String url;
    private Instant createdAt;

}
