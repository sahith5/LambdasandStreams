import java.util.function.IntPredicate;
import java.util.function.Predicate;

class isvalid{

    public boolean function(int i)
    {
        return true;
    }
    public int getNumber()
    {
        return  25;
    }
    public String getString()
    {
        return  "hello";
    }

}


public class predicate {
    public static void main(String[] args) {
//        Predicate<Integer> ishigh=(Integer a)->a>4?true:false;
//        System.out.println(ishigh.test(10));
//        Predicate<String> isempty=(String s)->s.isEmpty()?true:false;
//        System.out.println(isempty.test("  "));

        Predicate<isvalid> isvalidpnumber=( t)-> (t.getNumber()>10)?true:false;
       System.out.println( isvalidpnumber.test(new isvalid()));
        Predicate<isvalid>isvalidString=(t)->t.getString().length()>2?true:false;
        System.out.println(isvalidString.test(new isvalid()));

        Predicate<isvalid> isvalidnumberisvalidString=isvalidString.and(isvalidpnumber);
       System.out.println( isvalidnumberisvalidString.test(new isvalid()));
       Predicate<Integer> findeven =(Integer a)->a%2==0?true:false;
       System.out.println(findeven.test(2));
        IntPredicate iseven=(int a)->a%2==0;
    }

}