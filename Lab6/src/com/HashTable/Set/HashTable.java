package com.HashTable.Set;

import java.util.ArrayList;
import java.util.LinkedList;
/**
 * Class to hold generic liked list function to add and search function
 * @author Zahi Masarwa
 */

/**
 * class that accept generic
 * @param <E>   generic Type
 */
public class HashTable <E>{
    private ArrayList<LinkedList<E>> hashTable;     //private hashtable
    int tableSize;      //hold the table sie

    /**
     * contractor to initialize the hash table
     */
    public HashTable(){
        tableSize=25;       //initialize the table size
        hashTable = new ArrayList<LinkedList<E>>(tableSize);        //initialize the hashtable
        for (int i= 0; i < tableSize; i++) {        //loop to fill the hash table with empty linkedlist
            hashTable.add(new LinkedList<E>());
        }
    }

    /**
     * the hash method to find index to hash
     * @param key generic type key to hash
     * @return  the index we need
     */
    private int hash(E key) {
        int h = key.hashCode();     //hash the key found
        h = h % tableSize;     //find the new place of the index
        if (h < 0) {        //is the index under 0
            h = -h;     //decrement the index
        }
        return h;       //return the index
    }

    /**
     * method to a generic type in it
     * @param temp  the object that i want to add
     * @return  return true or false if it was successful to add
     */
    public boolean add ( E temp) {
        int index = hash(temp);
        hashTable.get(index).add(temp);
        return true;
    }

    /**
     * method to search an object in the hashtable
     * @param temp  object to search
     * @return  true or false if the object is found
     */
    public boolean search (E temp){
        for (int i = 0; i<hashTable.size(); i++) {      //loop on the hash table
            if (hashTable.get(i).isEmpty()){        //if the place I am looking at is empty
                continue;       //continue to do nothing
            }else {

                int index=hash(temp);       //hash the object to find
                if (hashTable.get(index).contains(temp)) {      //if the hashtable contain the oject
                    return true;        //return true if found

                } else {
                    index++;        //add index
                }
            }
        }
        return false;       //return false if not found
    }


}
