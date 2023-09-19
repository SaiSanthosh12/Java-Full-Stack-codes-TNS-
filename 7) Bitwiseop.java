class Bitwiseop{
    
    public static void main(String[] args)
    { 
        int num1 = 5, num2 = 10;
        System.out.println("&:   "+(num1&num2)); // Bitwise AND
        System.out.println("|:   "+((num1)|(num2))); //Bitwise OR
        System.out.println("^:   "+(num1^num2)); //Bitwise XOR
        System.out.println("<<   "+(num1<<2)); // Bitwise Left Shift
        
/*5 Left Shift 2 [5<<2 :  5-(0101) =  { (2^3)*0 + (2^2)*1 + (2^1)*0 + (2^0)*1} ]
0101 << 2 = 010100 = 20 { (2^5)*0 + (2^4)*1 + (2^3)*0 + (2^2)*1 + (2^1)*0 + (2^0) }
        */
        System.out.println(">>   "+(num1>>2)); // Bitwise Right Shift [ 0101 >> 2 = 0001 = 1]
       
    }
}

Output:

&:   0
|:   15
^:   15
<<   20
>>   1
