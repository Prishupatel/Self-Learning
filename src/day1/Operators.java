package day1;

public class Operators {
    public static void main (String [] args){
        int a=10;
        int b=20;
                //Arithmetic statement --> + - * / %
        System.out.println("<--------Arithmetic Operators---------->");
        System.out.println("Sum of a and b is: " +(a+b));
        System.out.println("Diff of a and b is: " +(a-b));
        System.out.println("Mul of a and b is: " +(a*b));
        System.out.println("Div of a and b is: " +(a/b));
        System.out.println("Per of a and b is: " +(a%b));

                // Relational operators --> comparison operator == <> <= >= !=
               //Always return boolean value
        System.out.println("<--------Relational  Operators---------->");
        System.out.println(a<b); //true
        System.out.println(a==b);//false
        System.out.println(a>b); //false
        System.out.println(a>=b); //false
        System.out.println(a<=b); //true
        System.out.println(a!=b); //true

           //Logical operators ---> && || !
         // works between two boolean

        boolean x= true;
        boolean y= false;

        System.out.println("<--------Logical  Operators---------->");
        System.out.println(x && y); //false
        System.out.println(x || y); //true
        System.out.println(!x); //false
        System.out.println(!y); //true

        //Increment/decrement operators ++ --
        a=10;
        a++;   //a=a+1; we can also write way
        System.out.println("<--------Increment/decrement  Operators---------->");
        System.out.println(a);

        b=20;
        b--;   //b=b-1; we can also write this way
        System.out.println(b);

    }
}
