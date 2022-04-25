import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Streamexamples {
    public static void main(String[] args) {
        List<Integer> arr1= Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer>arrsq=arr1.stream().map((i)->i*i).filter((i)->i%2==0).collect(Collectors.toList());
        for(int i=0;i<arrsq.size();i++)
        {
            System.out.println(arrsq.get(i));

        }

        Stream<String> m1=Stream.of("heelo","hello1","hello2","hello3");
        Stream<String> m2=m1.distinct();
        System.out.println(m2.collect(Collectors.toList()));
        List<String>validmovies=m1.filter((String s)->s.length()>5).collect(Collectors.toList());
        Set<String> setvalidmovies=m1.filter((String s)->s.length()>5).collect(Collectors.toSet());
//        Map<String ,String> moviemap=m1.collect(Collectors.toMap(,))
//findany,findfirts,anymatch;
        for (String validmoviename : validmovies) {
            System.out.println(validmoviename);
        }


    }
}
