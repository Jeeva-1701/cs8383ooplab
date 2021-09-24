
public class FloatSumExample1 {  
    public static void main(String[] args) {  
        Float f1 =67345.827f;  
        Float f2 =9843.981f;  
        // returns the sum of f1 and f2  
        Float f3 = Float.sum(f1,f2);  
        System.out.println("Number I = "+f1);  
        System.out.println("Number II = "+f2);  
        System.out.println("{Sum of two numbers = "+f3);  
        System.out.println();  
        //passing negative number  
        Float f4 = -6567.76f;  
        System.out.println("Number III = "+f4);  
        Float f5 = Float.sum(f3,f4);  
        System.out.println("Sum of three numbers = "+f5);  
  
    }  
}  
