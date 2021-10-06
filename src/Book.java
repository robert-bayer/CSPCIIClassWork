/**
 * Creating a Book object storing Title, Author, and Number of pages
 * @Author Robert Bayer
 * @Date 09/03/2021
 * @Version 0.0.1
 */

public class Book {
    private String Title;
    private String Author;
    private int Pages;

    /**
    *Mutator to change the Author of the book
    *@Param author is the author of the book.
     */
    public void setAuthor(String Author) { this.Author = Author; }

    /**
     *Mutator to change the Title of the book
     *@Param title is the title of the book.
     */
    public void setTitle(String Title){
        this.Title = Title;
    }

    /**
     *Mutator to change the Number of pages of the book
     *@Param pages is the number of pages of the book.
     */
    public void setPages(int pages){
        this.Pages = pages;
    }

    /**
     * Accessor to return the Author of the book.
     */
    public String getAuthor(){
        return Author;
    }

    /**
     * Accessor to return the Title of the book.
     */
    public String getTitle(){
        return Title;
    }

    /**
     * Accessor to return the number of pages of the book.
     */
    public int getPages() { return Pages; }
}
