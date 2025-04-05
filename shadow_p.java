public class shadow_p {
    static int x = 90; // This will be shadowing to line 6
    public static void main(String[] args) {
        System.out.println(x);// print 90
        int x = 40; // print 40
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
    
}
