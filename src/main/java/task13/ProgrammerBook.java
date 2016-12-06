package task13;

import taskTwelve.Book;

/**
 * Created by gs on 26.10.2016.
 */
public class ProgrammerBook extends Book {
    private String language;
    private int level;

    public ProgrammerBook(String title, String author, int price, int edition, String language, int level){
        super(title, author, price, edition);
        this.language = language;
        this.level = level;
    }

    public void setLanguage(String language){
        this.language = language;
    }

    public void setLevel(int level){
        this.level = level;
    }

    public String getLanguage(){
        return language;
    }

    public int getLevel(){
        return level;
    }

    @Override
    public int hashCode(){
        return super.hashCode() + language.hashCode() * 7 + level * 11;
    }

    @Override
    public String toString(){
        return super.toString() + ", language: '" + language + "', level: " + level + "'.";
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object == null || this.getClass() != object.getClass()){
            return false;
        }

        if(!super.equals(object)){
            return false;
        }

        ProgrammerBook book = (ProgrammerBook) object;
        if(level != book.level){
            return false;
        }
        if(book.language == null){
            if(language != null){
                return false;
            }
        }else {
            if(!book.language.equals(language)){
                return false;
            }
        }

        return true;
    }
}
