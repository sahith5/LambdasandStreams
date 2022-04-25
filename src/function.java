import java.util.function.Function;

class  movie
{
    String name;
    public movie(String S)
    {
        this.name=S;
        System.out.println("Movie Created");
    }
    public String getname()
    {
        return name;
    }
}
public class function {
    public static void main(String[] args) {
        Function<String,movie> function1 =(s)->new movie(s);
        movie m1=function1.apply("movie1");
        movie m2=function1.apply("movie2");
        m1.getname();
        m2.getname();
        //premitive function IntFunction(Classtype) ()
        //andthem and compoese are twi inbuilt functions
        //bifunctions (A B C )->RETURN TYPE C
    }
}
