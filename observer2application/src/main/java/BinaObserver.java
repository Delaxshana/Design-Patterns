/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Delaxshana
 */
public class BinaObserver implements Observer{
        public void update(Subject subject){
        String s=Integer.toHexString(subject.getState());
        System.out.println("Binary- Observer receives a state change of the subject. Status is " + s);
                
    }
}
