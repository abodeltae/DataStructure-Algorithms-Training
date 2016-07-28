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
public class BascalTriangle {
    public static void main(String[] args) {
        int [][]triangle=buildit(7);
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[triangle.length-1].length-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]+" ");;
                
            }
            System.out.println("");
            
        }
        
    }
    
    static int [][] buildit(int n){
                if(n<=0)return null;

        int [][]ret=new int[n][];
        ret[0]=new int[1];
        ret[0][0]=1;
        for (int i = 1; i < n; i++) {
            ret[i]=new int[i+1];
            for (int j = 0; j < ret[i].length; j++) {
                int sum=0;
                if(j>0)
                sum+=ret[i-1][j-1];
                if(j<ret[i].length-1)
                    sum+=ret[i-1][j];
                ret[i][j]=sum;
                
            }
        }
        return ret;
    }
}
