package softdev.Part2_inheritance.networkv3;

public class Demo {
    public static void main(String[] args) {
        Post mp = new MessagePost("Jeff", "Java is very cool!");
        mp.like();
        mp.like();
        mp.display();
        System.out.println("*************************************");
        NewsFeed newsFeed = new NewsFeed();
        newsFeed.addPost(mp);
        newsFeed.addPost(new PhotoPost("Mia", "World.jpeg", "Java rules the world!"));
    //    newsFeed.addPost(new Post("Koen")); // unwanted behaviour???
        newsFeed.show();

        mp.handlePost();
        mp = new PhotoPost("Mia", "World.jpeg", "Java rules the world!");
        mp.handlePost();

        Post post = new MessagePost("Nobody","Java rules!");
        System.out.println(post.toString()); //1
        post = new PhotoPost("An", "world.jpg", "Hello world!");
        System.out.println(post.toString()); //2
    }
}
