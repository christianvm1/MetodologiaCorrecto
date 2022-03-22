/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sample;

/**
 *
 * @author chris
 */
public class MasGrande {
    public static int max(int[] a)
    {
        int i = 0;
        int m;
        
        if(a == null)
        {
            a = new int[0];
            m = 0;
        }
        else if(a.length == 0)
        {
            m = 0;
        }
        else
        {
            m = a[0];
        }   
        
        for (i=0;i<a.length;i++)
        {
            if(a[i]>m)
                m=a[i];
        }
        return m;
    }
}
