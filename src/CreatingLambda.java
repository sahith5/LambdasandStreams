public class CreatingLambda {

    interface  intr
    {
        public String greet(String S);
    }
    interface interface1{
        public void nogreet();
    }
    interface   Square{
        public int sq(int i);
    }
    public void square(int i,Square s)
    {
        System.out.println(s.sq(i));
    }

    public void nogreet(interface1 int1)
    {
        int1.nogreet();
    }
    public void greeting(String name,intr s)
    {String result=s.greet(name);
     System.out.println(result);
    }

    public static void main(String[] args) {

        CreatingLambda sc=new CreatingLambda();

        sc.greeting("name",(String S)->S.isEmpty()?"you miss something":"hello"+S);
        sc.nogreet(()->System.out.println("hello iam not greeting"));

        sc.square(3,(int i)->i*i);




    }
}

//Design Patterns - Singleton, Factory, Abstract Factory, Builder
