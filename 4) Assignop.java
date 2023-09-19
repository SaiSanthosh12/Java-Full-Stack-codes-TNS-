public class Assignop{
    
    public static void main(String[] args)
    { 
        int a =10,b =5;
        System.out.println("=:"+(a=b)); //Assignment operators
        System.out.println("+=:"+(a+=b));//Adddition Assignment op
         System.out.println("-=:"+(a-=b));//Subtraction Assignment op
        System.out.println("*=:"+(a*=b));// Multiplication Assignment 
        System.out.println("/=:"+(a/=b));//Division Assignment
        System.out.println("%=:"+(a%=b));//Modulus Assignment
    }
}

output:

 =:5
+=:10
-=:5
*=:25
/=:5
%=:0
