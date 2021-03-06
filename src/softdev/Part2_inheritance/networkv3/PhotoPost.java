package softdev.Part2_inheritance.networkv3;

import java.util.ArrayList;

/**
 * This class stores information about a post in a social network news feed.
 * The main part of the post consists of a photo and a caption.
 * Other data, such as author and time, are also stored.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 0.3
 */
public class PhotoPost extends Post
{
    private final String filename;  // the name of the image file
    private final String caption;   // a one line image caption

    /**
     * Constructor for objects of class PhotoPost.
     * 
     * @param author    The username of the author of this post.
     * @param filename  The filename of the image in this post.
     * @param caption   A caption for the image.
     */
    public PhotoPost(String author, String filename, String caption)
    {
        super(author);
        this.filename = filename;
        this.caption = caption;
    }

    /**
     * Return the file name of the image in this post.
     * 
     * @return The post's image file name.
     */
    public String getImageFile()
    {
        return filename;
    }

    /**
     * Return the caption of the image of this post.
     * 
     * @return The image's caption.
     */
    public String getCaption()
    {
        return caption;
    }

    /**
     * Display the details of this post.
     * 
     * (Currently: Print to the text terminal. This is simulating display 
     * in a web browser for now.)
     */
    public void display()
    {
        System.out.println("  [" + filename + "]");
        System.out.println("  " + caption);
        super.display();
    }

    public void handlePost() {
        System.out.println("I am handling a Photo post!");
    }

    @Override
    public String toString() {
        return "PhotoPost{" +
                "filename='" + filename + '\'' +
                ", caption='" + caption + '\'' +
                '}';
    }

}
