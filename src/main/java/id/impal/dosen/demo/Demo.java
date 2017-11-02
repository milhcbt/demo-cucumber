/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.impal.dosen.demo;

/**
 *
 * @author iman
 */
public class Demo {
    public static void main(String[]args){
        System.out.println("test demo");
    }
    
    public static String addUser(String user){
        if (user.equals("badu"))
            return "user sukses dimasukan";
        else
            return "duplicate";
                
    }
}
