/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author nazeer
 */
public class TrieClass {
    public static void main(String[] args) {
        Trie trie=new Trie();
        trie.addWord("abood");
        trie.addWord("hello");
        System.out.println(trie.contains("hel"));

    }
    static class Trie {
        TrieNode root;
        public Trie(){
            root=new TrieNode();
            root.c="";
            
        }
        public void addWord(String word){
            TrieNode current= root;
            int i=0;
            while ( i<word.length()){
                if (current.subChars.containsKey(word.charAt(i))){
                    current=current.subChars.get(word.charAt(i));
                    i++;
                }
                else{
                    TrieNode nTrieNode=new TrieNode();
                    nTrieNode.c=word.charAt(i)+"";
                    if(i==word.length()-1)nTrieNode.isEndOFWord=true;
                    current.subChars.put(word.charAt(i), nTrieNode);
                    current=nTrieNode;
                    i++;
                }
            }
        }
        
        public boolean contains(String word){
             int i=0;
             char c=word.charAt(i);
             TrieNode current=root.subChars.get(c);
             while(current!=null){
                    if(current.isEndOFWord)return true;
                    i++;
                    if(i>=word.length())return false;
                    c=word.charAt(i);
                    current=current.subChars.get(c);
             }
             return false;
    }
    class TrieNode{
        HashMap<Character,TrieNode>subChars=new HashMap<>();
        boolean isEndOFWord=false;
        String c="";
        
    }
    
}
}
