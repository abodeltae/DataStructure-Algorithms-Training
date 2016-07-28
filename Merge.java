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
public class Merge {

    
   static  int nums []={10,9,8,7,6,1,2,3,4,5,7,23,68,9,23,0};
    static int temp[]=new int [nums.length];

    public static void main(String[] args) {
        sort(nums,temp,0,nums.length-1);
        for (int i = 0; i <nums.length; i++) {
            System.out.println(nums[i]);
            
        }
    }
    
    private static void sort(int nums[],int temp[],int start,int last) {
        if(start>=last)return;
        int mid=(start+last)/2;   
            sort(nums,temp,start,mid);       
            sort(nums,temp,mid+1,last);
            merge(nums,temp,start,mid,last);
            
    }

    private static void merge(int[] nums, int[] temp, int start, int mid, int last) {
        int i=start;
        int j=mid+1;
        int cur=start;
        while(i<=mid&&j<=last){
            
            if(nums[i]<nums[j]){
                temp[cur++]=nums[i++];
            }else{
                temp[cur++]=nums[j++];
            }
            
        }
        while(i<=mid){
                            temp[cur++]=nums[i++];
        }
        while(j<=last){
                            temp[cur++]=nums[j++];
        }
        
        for (int k = start; k <=last; k++) {
            nums[k]=temp[k];
            
        }
        
    }
    
}
