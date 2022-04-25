class hello{
    public String Sayhello()
    {
        System.out.println("hello world");
        return "hello world";
    }
    public String Saygoodmorning()
    {
        return "good mroning";
    }
}
interface interface1{
    public String function (hello h);
}

public class Lamdaexample1 {
    public static void main(String[] args) {
        hello h=new hello();

        interface1 i1=(S)->S.Sayhello();
        String S1=i1.function(h);

        System.out.println();
        System.out.println(S1);
    }
}

