/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Delaxshana
 */
public class TestObserver {
    public static void main(String args[]){
    Observer o1=new DeObserver();
    Observer o2= new BinaObserver();
    Subject sub= new SubjectImpl();
    sub.registerObserver(o1);
    sub.unregisterObserver(o1);
    sub.notifyObserver();
        sub.setState(15);
    sub.getState();
   
   
    
    }
}
