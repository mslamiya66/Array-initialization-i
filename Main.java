/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
    
        int [] a=new int [5];

         // Initialize the array elements with values
         a[0] = 10;
         a[1] = 20;
         a[2] = 30;
         a[3] = 40;
         a[4] = 50;
         
         a[3]=89;

         
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
             System.out.println("length" +a.length);
             
        

    }
}