package springboot.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import springboot.domain.posts.Posts;

@Getter
@NoArgsConstructor
public class PostsSaveRequestDto {
    private String title;
    private String content;
    private String author;

    @Builder
    public PostsSaveRequestDto(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    public Posts toEntity() { // 데이터와 맞닿은 핵심 클래스
        // 수 많은 서비스 클래스나 비즈니스 로직들이 Entity 클래스를 기준으로 동작함.
        return Posts.builder()
                .title(title)
                .content(content)
                .author(author)
                .build();
    }
}
