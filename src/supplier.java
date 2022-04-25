import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        Supplier<String []> movie=()->new String[]{"movie1","movie2","movie3"};
        String[] movielist=movie.get();
        for(String i:movielist)
        {
            System.out.println(i);
        }


    }
}
