
package javaapplication1;


public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x[]={2,0,6,4,34,234,234,7,234,82,82,992,346234,82,95,23,};
       (new QuickSort()).sort(x);
        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
            
        }
    }
    
}
