import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    private static Library cityLibrary;
    private ArrayList<String> booksList;

    private Library(){
        if (cityLibrary != null) {
            throw new RuntimeException("use getCityLibrary method");
        }

        booksList = new ArrayList<>(Arrays.asList("Head first java","Effective java","Thinking in java","Design patterns"));
    }

    public static Library getCityLibrary() {
        if(cityLibrary == null){
            synchronized (Library.class) {
                if(cityLibrary == null){
                    cityLibrary = new Library();
                }
            }
        }

        return cityLibrary;
    }

    public void showBooksList() {
        System.out.println("Available books :");
        for (String book:booksList
             ) {
            System.out.println(book);
        }
    }
}
