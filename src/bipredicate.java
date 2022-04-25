import java.util.function.BiPredicate;

class movies
{
    String name;
    int collections;
    movies(String s,int collections)
    {
        this.name=s;
        this.collections=collections;
    }
    public int getCollections()
    {
        return collections;
    }



}


public class bipredicate {
    public static void main(String[] args) {
        movies movie1=new movies("hello1",200);
        movies movie2=new movies("hello2",30);
        BiPredicate<movies,movies> moviecomp=(m1,m2)->m1.getCollections()>m2.getCollections();
        System.out.println(moviecomp.test(movie1,movie2));



    }
}
