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
        PostDto pdto=new PostDto();
        pdto= pdto.builder()
                .id((Long) post.getId())
                .title(post.getTitle())
                .text(post.getText())
                .build();
        return pdto;
    }

    public static List<PostDto> from (List<PostDB> postList) {
        return postList.stream().map(PostDto::from).collect(Collectors.toList());
    }

    public Object getTitle() {
        return title;
    }

    public void setTitle(Object title) {
        this.title = (String) title;
    }

    public Object getText() {
        return text;
    }

    public void setText(Object text) {
        this.text = (String) text;
    }

    public void setId(Object id) {
        this.id = (Long) id;
    }

    public Object getId() {
        return id;
    }
}
