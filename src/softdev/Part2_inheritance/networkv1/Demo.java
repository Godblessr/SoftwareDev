package softdev.Part2_inheritance.networkv1;

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

    }
}