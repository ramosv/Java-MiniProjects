public class Book {
    private String title;
    private int size;
    private int year;
    
    public Book(String t,int s, int y)
    {
        this.title =t;
        this.size = s;
        this.year = y;
    }
    public String getTitle()
    {
        return this.title;
    }
    public int getSize()
    {
        return this.size;
    }
    public int getYear()
    {
        return this.year;
    }
    public String toString()
    {
        return this.title + ", " + this.size + " pages, "+ this.year;
    }
    
}