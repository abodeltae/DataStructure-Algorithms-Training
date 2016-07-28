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
public class KMP {
    public static void main(String[] args) {
        System.out.println(contains("ood","dododododododabooddododod"));
    }
    
    public static boolean contains(String pattern,String text){
                int[] grid = createPatternGrid(pattern);
                int j=0;
                int i=0;
                while (i<text.length()){
                        if(text.charAt(i)==pattern.charAt(j)){
                            if(j==pattern.length()-1)return true;
                            j++;
                            i++;
                            continue;
                        }else{
                            if(j>0){
                                j=grid[j-1];
                            }
                            else{
                                i++;
                            }
                        }
            
                 }
         return false;
    }
    public static int [] createPatternGrid(String pattern){
        int len=pattern.length();
        int ret[]=new int [len];
        ret[0]=0;
        int i=1;
        int j=0;
        
        while(i<len){
            if(pattern.charAt(i)==pattern.charAt(j)){
                ret[i]=j+1;
                j++;
                i++;
            }else{
                if(j>0){
                    j=ret[j-1];
                }else{
                    ret[i]=0;
                    i++;
                }
            }
        }
        
        return ret;
    }
}
