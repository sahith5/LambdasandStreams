import java.util.function.Consumer;
import java.util.function.Predicate;

class moviename
{
     int collections;

    public int getCollections() {
        return collections;
    }
}




public class consumer {


    public static void main(String[] args) {

        Consumer<moviename> printcollections=(m)->System.out.println(m.getCollections());
        moviename m1=new moviename();
        m1.collections=200;
        moviename m2=new moviename();
        m2.collections=300;
        Consumer<moviename>firstsecond=printcollections.andThen(printcollections);

        printcollections.accept(m1);
        Predicate<moviename>isbigcollections=(m)->m1.getCollections()>100?true:false;
        if(isbigcollections.test(m1))
        {
            System.out.println("yes it is big cinemaa");
        }

        }


}
