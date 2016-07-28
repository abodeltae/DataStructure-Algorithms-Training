/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author nazeer
 */
public class QuickSort {
    
    public void sort(int x[]){
        sort(x,0,x.length-1);
    }
    
    private void sort(int[] x, int low, int high) {
        if(low>=high )return;
        int i=low;
        int j=high;
        int pivot=x[low];
        while(i<j){
       
            while(x[j]>pivot)
                j--;//j stops onan item thats smaller than the pivot
                 while(x[i]<=pivot&&i<j)
                i++;//i stops on an item thats larger than the pivot
            if(i<j){
                int Ivalue=x[i];
                int Jvalue=x[j];
                swap(x,i,j);
                for (int k = 0; k < x.length; k++) {
                   // System.out.println(x[k]);
                    
                }
            }            
        }
        if(pivot>x[i])swap(x,low,i);
        
        if(low<i)sort(x,low,i-1);
        if(j<high)sort(x,j+1,high);
        
        
    }
    void swap(int []x,int i,int j){
    int temp=x[i];
    x[i]=x[j];
    x[j]=temp;
}

    
}
