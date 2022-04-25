import java.util.concurrent.RecursiveTask;
interface  i1{
    public  int ismovie(MethodReferencing m);
}
interface i2{
    public int ismovie(int a);
}
public class MethodReferencing {


    public  int isvalidmovie(int id)
    {
        return 1;
    }

    public static void main(String[] args) {
        int b=0;
        MethodReferencing obj1=new MethodReferencing();
        i1 labda1=(m1)->{
           int k= m1.isvalidmovie(25);
            return  b+1;
        };
        MethodReferencing m1=new MethodReferencing();
       System.out.println(labda1.ismovie(m1));

       MethodReferencing obj2=new MethodReferencing();
       i2 lambda2=obj2::isvalidmovie;
       System.out.println(lambda2.ismovie(2));

    }
}
