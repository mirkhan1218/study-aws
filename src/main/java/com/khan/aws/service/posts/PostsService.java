package com.khan.aws.service.posts;

import com.khan.aws.web.domain.posts.PostRepository;
import com.khan.aws.web.dto.PostsSaveRequestDto;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostRepository postRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {

        return postRepository.save(requestDto.toEntity()).getId();
    }
}
