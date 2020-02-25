package ru.kpfu.itis.demo_1_jpa.actions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.kpfu.itis.demo_1_jpa.data.PostDB;
import ru.kpfu.itis.demo_1_jpa.dto.PostDto;
import ru.kpfu.itis.demo_1_jpa.jpa.Repo;

@Component
public class AddActionImpl implements AddAction {
    private Repo repo;

    @Autowired
    public AddActionImpl(Repo repo) {
        this.repo = repo;
    }

    @Override
    public void addNote(PostDto pdto) {
        PostDB post = repo.save(post.Builder()
                .title(pdto.getTitle())
                .text(pdto.getText())
                .build());
        pdto.setId(post.getId());
    }

}
