
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

/**
 *
 * @author macstudent
 */
public class Encryption1 {
    void Encryption1(){
        java.lang.String name = "ZANIL";
        java.lang.String newname = "";
        char[] namechar = name.toCharArray();
        for (int i = 0; i < namechar.length; i++)
        {
            if ((i % 2) == 0)
            {
            newname +=  Character.toString( (char)(((int)namechar[i])+1));
            }
            else
            {
                newname +=  Character.toString( (char)(((int)namechar[i])+2));
            }
        }
        System.out.println(newname);
    }

  

}
