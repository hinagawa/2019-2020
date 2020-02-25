package ru.kpfu.itis.demo_1_jpa.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.kpfu.itis.demo_1_jpa.data.PostDB;

import java.util.List;
import java.util.stream.Collectors;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostDto {
    private Long id;
    private String title;
    private String text;
    public static PostDto from (PostDB post){
        return PostDto.builder()
                .id(post.getId())
                .title(post.getTitle())
                .text(post.getText())
                .build();
    }

    public static List<PostDto> from (List<PostDB> postList) {
        return postList.stream().map(PostDto::from).collect(Collectors.toList());
    }
}
