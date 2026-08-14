public class factorial{
    public static long compute(int n){
        if(n<0) throw new IllegalArgumentException("Negative number not alloowed");
            long result=1;
            for(int i=2;i<=n;i++){
                result*=i;
            }
            return result;
        }
        public static void main(String[] args){
            int number=9;
            long factorial=compute(number);
            System.out.println("Find Factorial");
            System.out.println("Factorial of "+number+"is: "+factorial);
        }
    }
