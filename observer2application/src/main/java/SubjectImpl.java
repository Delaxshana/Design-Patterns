
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Delaxshana
 */
public class SubjectImpl implements Subject{
    ArrayList arrList;
    private int value;
    public void SubjectImpl(){
        arrList =new ArrayList();
    }
    public void registerObserver(Observer o){
        arrList.add(o);
    }
    public void unregisterObserver(Observer o){
            arrList.remove(arrList.indexOf(o));
    }
    public void notifyObserver(){
        int i;
        for(i=0;i<arrList.size();i++)
        { 
             Observer obs = (Observer)arrList.get(i);
             obs.update(this);
        }
    }
    public void setState(int value){
          this.value=value;
    }
    public int getState(){
        return value;
    }
    
}
