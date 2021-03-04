package com.daniel.second.dto;

import com.daniel.second.domain.posts.Posts;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
@AllArgsConstructor
@Builder
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    public Posts toEntity() {
        return Posts.builder().title(title).content(content).author(author).build();
    }
}
