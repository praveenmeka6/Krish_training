package com.praveen;

public class Application {
    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        FbPosts fbPosts = new FbPosts();

        fbPosts.addPost(new Post("Trip"));
        fbPosts.addPost(new Post("Festival"));
        careTaker.save(fbPosts);
        System.out.println(fbPosts);

        fbPosts.addPost(new Post("Annual sports event"));
        careTaker.save(fbPosts);
        System.out.println(fbPosts);

        fbPosts.addPost(new Post("Party"));
        careTaker.save(fbPosts);
        System.out.println(fbPosts);

        fbPosts.addPost(new Post("Concert"));
        careTaker.save(fbPosts);
        System.out.println(fbPosts);

        careTaker.revert(fbPosts);
        System.out.println(fbPosts);

        careTaker.revert(fbPosts);
        System.out.println(fbPosts);

        careTaker.revert(fbPosts);
        System.out.println(fbPosts);

        careTaker.revert(fbPosts);
        System.out.println(fbPosts);

        careTaker.revert(fbPosts);
        System.out.println(fbPosts);
    }
}
