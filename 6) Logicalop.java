class Logicalop{
    
    public static void main(String[] args)
    { 
        boolean a = true,b = false;
        int num1 = 10,num2 = 5,num3 = 9, num4 = 29;
        System.out.println("&&:   "+(a&&b)); //logical AND(&&)
        System.out.println("||:   "+(a||b)); //logical OR(||)
        System.out.println("!(&&):"+!(a && b));//logical NOT(!)
        System.out.println("> && <"+!((num1>num3)&&(num3<num4)));
        System.out.println("> && !== :"+((num4>num2)&&!(num3==num1)));
        System.out.println("!(<=):"+!(num4<=num1));
    }
}

OUTPUT:

&&:   false
||:   true
!(&&):true
> && <false
> && !== :true
!(<=): true
