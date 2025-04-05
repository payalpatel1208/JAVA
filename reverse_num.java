// reverse the number using java:


public class reverse_num {
    public static void main(String[] args) {
        int a = 2345;
        int count = 0 ;
        while (a>0) {
            int rem =  a % 10;
            a /= 10;

            count = count * 10 + a;
            System.out.println(rem);
        }
       
    }
}
