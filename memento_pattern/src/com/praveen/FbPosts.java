package com.praveen;

import java.util.ArrayList;

public class FbPosts {
    ArrayList<Post> posts = new ArrayList<Post>();

    public void addPost(Post post) {
        posts.add(post);
    }

    public ArrayList<Post> getPosts() {
        return (ArrayList<Post>) posts.clone();
    }

    public PostMemento save() {
        return new PostMemento(getPosts());
    }

    public void revert(PostMemento postMemento){
        posts = postMemento.getPosts();
    }

    @Override
    public String toString() {
        return "FbPosts{" +
                "posts=" + posts +
                '}';
    }

    static class PostMemento {
        ArrayList<Post> posts;

        public PostMemento(ArrayList<Post> posts) {
            this.posts = posts;
        }

        private ArrayList<Post> getPosts() {
            return posts;
        }
    }
}
