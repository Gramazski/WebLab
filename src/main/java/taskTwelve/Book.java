package taskTwelve;

/**
 * Created by gs on 26.10.2016.
 */
public class Book {
    private String title;
    private String author;
    private int price;
    private static int edition;

    public Book(String title, String author, int price, int edition){
        this.title = title;
        this.author = author;
        this.price = price;
        this.edition = edition;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public void setEdition(int edition){
        this.edition = edition;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public int getPrice(){
        return price;
    }

    public int getEdition(){
        return edition;
    }

    @Override
    public int hashCode(){
        return title.hashCode() * 17 + author.hashCode() * 29 + price * 19;
    }

    @Override
    public String toString(){
        return "title=" + title + ", author=" + author
                + "\nprice=" + price + ", edition=" + edition;
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }

        Book book = (Book)object;
        if(book.price != price){
            return false;
        }

        if(book.author == null){
            if(author != null){
                return false;
            }
        } else{
            if(!book.author.equals(author)){
                return false;
            }
        }

        if(book.title == null){
            if(title != null){
                return false;
            }
        } else{
            if(!book.title.equals(title)){
                return false;
            }
        }

        return true;
    }
}
