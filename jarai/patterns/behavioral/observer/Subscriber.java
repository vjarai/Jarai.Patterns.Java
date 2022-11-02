package jarai.patterns.behavioral.observer;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Subscriber implements PropertyChangeListener {


    public void propertyChange(PropertyChangeEvent evt) {

        System.out.println(evt.getPropertyName() + " Property changed from '" + evt.getOldValue() + "' to '" + evt.getNewValue() + "'.");
    }


}

