
public class Main {
    //Today I start to know about Dynamic Programming
        //Notes:
        //1. Problem
        //2. State
        //3. State Transition Equation

    //Fib with Dynamic Programming
        //Problem: F(n)=?
        //State: F(i)=F(i-1)+F(i-2)     Initialization: F(1)=0, F(2)=1      Return: F(n)
        //State Transition Equation: F(i)=F(i-1) + F(i-2)
    //1. Write with an array        Space Complexity: O(n)
    public static int FibWith1Array(int n){
        int[] Fib = new int[100];
        Fib[0] = 0;
        Fib[1] = 1;
        for(int i=2;i<100;i++){
            Fib[i] = Fib[i-1]+Fib[i-2];
        }
        return Fib[n];
    }

    //2. Write without an array     Space Complexity: O(1)
    public static int FibWithout1Array(int n){
        int Fib1 = 0;
        int Fib2 = 1;
        int Fib = 0;
        for(int i=1;i<=n;i++){
            Fib = Fib1+Fib2;
            Fib1=Fib2;
            Fib2=Fib;
        }
        return Fib;
    }




}
