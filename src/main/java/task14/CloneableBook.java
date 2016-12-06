package task14;

import taskTwelve.Book;

/**
 * Created by gs on 26.10.2016.
 */
public class CloneableBook extends Book implements Cloneable {

    public CloneableBook(String title, String author, int price, int edition){
        super(title, author, price, edition);
    }

    @Override
    public CloneableBook clone(){
        return new CloneableBook(super.getTitle(), super.getAuthor(), super.getPrice(), super.getEdition());
    }
}
