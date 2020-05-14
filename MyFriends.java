/*
 * Lina Breunlin
 * Module 02 Lab
 * Part B
 * 
 * This program uses and array list and it's associated methods to help the user create a list of friends
* Test cases
Enter Friends           FriendList                          Remove      Number to remove        New list
Rachel, Thalia, Nick    1. Rachel 2. Thalia 3. Nick           Y             1                   1. Thalia, 2. Nick
Rachel, Thalia, Nick    1. Rachel 2. Thalia 3.Nick            N             N/A                 glad to see you are keeping all your friends
N                       Please make some friends and come back
5                       Please make some friends and come back                      

 */
package myfriends;

import java.util.ArrayList; 
import java.util.Scanner;

public class MyFriends 
{

    
    public static void main(String[] args) 
    {
     
    //declare variables
    String addFriendsAnswer;
    boolean addFriends;
    String friendName;
    String cancelFriendAnswer;
    int friendNumber;
    ArrayList<String> friends = new ArrayList<>(); 
    
    Scanner in = new Scanner (System.in); 
        
    System.out.println("Welcome to the friend list generator!");
    System.out.println ("Would you like to create a friend list? Please enter Y for yes or N for No:");
    if (in.hasNext());
    {
        addFriendsAnswer = in.next();
        if (addFriendsAnswer.equals("Y"))
        {
          addFriends = true; 
          
            while (addFriends == true)
            {
               System.out.println("Please enter your friend's name. Or type Q to quit: ");
               friendName = in.next();
               if (friendName.equals("Q"))
                        {
                            addFriends = false;
                        }//end if
               friends.add(friendName);            
            }//end while
        }//end if
        else 
        {
            System.out.println("Please make some friends and come back later!");
            return;
        }
    }
        
      //output the current friend list
      System.out.println("Your current friend list:");
      for (int i = 0; i < friends.size() -1; i++) //size -1 because the last value in the list is always the quit value?
      {
        System.out.println((i + 1) + "." + " " + friends.get(i)); //format numbering of friend list because having a friend at the 0 spot might be confusing for a non programmer
      }
      
      System.out.println("Would you like to remove any friends from your friend list?");
      
      cancelFriendAnswer = in.next();
      
       if (cancelFriendAnswer.equals("Y"))
      {
          System.out.println("Please enter the number of the friend you wish to remove: ");
          friendNumber = in.nextInt();
          friends.remove(friendNumber - 1);
          System.out.println("Your new friend list:");
             for (int i = 0; i < friends.size() -1; i++)
            {
                System.out.println((i + 1) + "." + " " + friends.get(i)); //format numbering of friend list because having a friend at the 0 spot might be confusing for a non programmer
            }//end for    
      }
      else
      {
          System.out.println("Glad to see you are keeping all of your friends! Go give them a hug!");
      }
      
      System.out.println("Thaank you for using the friend list generator!");
     
      
      

        
        
   
    
}
}


/*
 if (cancelFriendAnswer.equals("Y"))
      {
          System.out.println("Please enter the number of the friend you wish to remove: ");
          friendNumber = in.nextInt();
          friends.remove(friendNumber - 1);
          System.out.println("Your current friend list:");
             for (int i = 0; i < friends.size() -1; i++)
            {
                System.out.println((i + 1) + "." + " " + friends.get(i)); //format numbering of friend list because having a friend at the 0 spot might be confusing for a non programmer
            }    
      }
      else
      {
          System.out.println("Glad to see you are keeping all of your friends! Go give them a hug!");
      }
      
      System.out.println("Thaank you for using the friend list generator!");
      
*/