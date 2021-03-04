package com.daniel.second.domain.posts;


import org.aspectj.lang.annotation.After;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @After("")
    public void cleanup(){
        postsRepository.deleteAll();
    }

    @Test
    public void save(){
        String title = "테스트 제목";
        String content = "테스트 본문";

        postsRepository.save(Posts.builder().title(title)
                .content(content).author("lbg@gmail.com").build());

        List<Posts> postsList = postsRepository.findAll();

        Posts posts = postsList.get(0);
        Assertions.assertThat(posts.getTitle()).isEqualTo(title);
        Assertions.assertThat(posts.getContent()).isEqualTo(content);
    }
}
