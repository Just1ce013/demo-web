package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class PostService {
    public ArrayList<Post> listAllPosts(){
        ArrayList<Post> posts = new ArrayList<>();
        posts.add(new Post("ААААААААААА"));
        posts.add(new Post("НУ ТАКОЕ"));
        posts.add(new Post("КАРОЧ"));
        return posts;
    }
}
