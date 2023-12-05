package jarai.patterns.gof.behavioral.observer;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Beobachter implements PropertyChangeListener {


    public void propertyChange(PropertyChangeEvent evt) {

        System.out.println(evt.getPropertyName() + " Property changed from '" + evt.getOldValue() + "' to '" + evt.getNewValue() + "'.");
    }


}

