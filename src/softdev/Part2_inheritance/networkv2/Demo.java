package softdev.Part2_inheritance.networkv2;

public class Demo {
    public static void main(String[] args) {
        MessagePost messagePost = new MessagePost("Jeff", "Java is cool!");
        messagePost.like();
        messagePost.like();
        messagePost.like();
        messagePost.like();
        System.out.println(messagePost.getText());
        messagePost.display();
        PhotoPost photoPost = new PhotoPost("John", "world.jpeg", "Java rules the world!");
        Post post = new Post("John");
        post = messagePost; // substitutability
        //  post = photoPost;
        //  messagePost.likes++;
        ((MessagePost) post).getText(); // be careful with type casting
    }
}
