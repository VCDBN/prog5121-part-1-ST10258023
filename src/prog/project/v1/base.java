/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prog.project.v1;

import javax.swing.JOptionPane;

/**
 *
 * @author jared
 */ 
public class base {
    
    private  static String userNameTemp;
    private static String passwordTemp;
      
    
    public static String userName()
    {
      String user="";
    
      
      var show =JOptionPane.showConfirmDialog(null,"Welcome would you like to set up an account");//asks the user if they would like to set up an account
      
      if (show == JOptionPane.YES_OPTION)
      {
      user= JOptionPane.showInputDialog("Set a user name");//asks user to set auser name
      
           if(!user.contains("_"))
           {
             JOptionPane.showMessageDialog(null,"please create a user name with a underscore");//determains if user name contains a underscore
             userName();
           }
           if (user.isBlank()||user.length()<=5)
           {
             JOptionPane.showMessageDialog(null,"invalid user name (to long)");//determains if the user name is too long
             userName();
           }
           else
           {
             userNameTemp = user;
             Pass(); 
            
           }
           
        
    }
        else if(show==JOptionPane.NO_OPTION)
        {
             var check =JOptionPane.showConfirmDialog(null,"would you like to sign into your account");//asks the user if they would like to set up an account
      
             if (check == JOptionPane.YES_OPTION)
             {
                String name1;
                name1 = JOptionPane.showInputDialog(null,"please enter your user name");
                if(name1 == userNameTemp)
                {
                  String user1 = JOptionPane.showInputDialog(null, "please enter your password");
                  if(user1== passwordTemp) 
                  {
                       
                  }
                  else
                  {
                      JOptionPane.showMessageDialog(null, "please eneter a valid password");
                      userName();
                  }
                }
                else
                {
                  JOptionPane.showMessageDialog(null, "please eneter a valid user name");
                  userName();  
                }
             }
             else if(check==JOptionPane.NO_OPTION)
             {
              userName(); 
             }
    
             }
        return null;
    }


    private static void name() {
         
        String name = "";
        name =JOptionPane.showInputDialog("enter your name");//asks user to enter their name
           if (name.isBlank()||name.length()<2)
           {
             JOptionPane.showMessageDialog(null,"invalid name (blank)");//determains if the name field is blank
             name();
           }
           else
           {
               surname();
           }
        
          
    }

    private static void surname() {
       
        String surname ="";
           surname =JOptionPane.showInputDialog("enter your surname");//asks the user to eneter their surname
           if(surname.isBlank()||surname.length()<2)//must still edit//
           {
             JOptionPane.showMessageDialog(null,"invalid surname (blank)");//determains if the surname field is blank 
             surname();
           }
           else
           {
              JOptionPane.showMessageDialog(null,"proccess complete");
              userName(); 
           }
    }

    public static String Pass() {
        String pass1 = "";
        pass1 = JOptionPane.showInputDialog("set a password");//asks the user to set a password
        if(pass1.isBlank()||pass1.length()<=8)
        {
            JOptionPane.showMessageDialog(null, "password is too short");//determains if the psssword is too short
            Pass();
        }
        if(!pass1.contains("1")&&!pass1.contains("2")&&!pass1.contains("3")&&!pass1.contains("4")&&!pass1.contains("5")&&!pass1.contains("6")&&!pass1.contains("7")&&!pass1.contains("8")&&!pass1.contains("9")&&!pass1.contains("0"))
        {
           JOptionPane.showMessageDialog(null, "please enter a password that contain atlest 1 number");//determins if the password contains a number
           Pass();
        }
        if(!pass1.contains("!")&&!pass1.contains("@")&&!pass1.contains("#")&&!pass1.contains("$")&&!pass1.contains("%")&&!pass1.contains("&")&&!pass1.contains("*")&&!pass1.contains("?"))
        {
           JOptionPane.showMessageDialog(null, "please use a special character such as !, @, #, $, %, &, *, ? in your password");//determains if the password contains a special character
           Pass();
        }
        if(!pass1.contains("A")&&!pass1.contains("B")&&!pass1.contains("C")&&!pass1.contains("D")&&!pass1.contains("E")&&!pass1.contains("F")&&!pass1.contains("G")&&!pass1.contains("H")&&!pass1.contains("I")&&!pass1.contains("J")&&!pass1.contains("K")&&!pass1.contains("L")&&!pass1.contains("M")&&!pass1.contains("N")&&!pass1.contains("0")&&!pass1.contains("P")&&!pass1.contains("Q")&&!pass1.contains("R")&&!pass1.contains("S")&&!pass1.contains("T")&&!pass1.contains("U")&&!pass1.contains("V")&&!pass1.contains("W")&&!pass1.contains("X")&&!pass1.contains("Y")&&!pass1.contains("Z"))
        {
           JOptionPane.showMessageDialog(null, "please enter a password that contains a capital letter");//determains if the password contains a capitsl letter
        }
        else
        {
         passwordTemp = pass1;
         name();
        }
        return null;
    

    
      }
    }
   
    

  
