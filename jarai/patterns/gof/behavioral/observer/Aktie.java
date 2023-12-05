package jarai.patterns.gof.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Aktie {
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private double kurs;

    public void addPropertyChangeListener(PropertyChangeListener pcl) {

        propertyChangeSupport.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {

        propertyChangeSupport.removePropertyChangeListener(pcl);
    }

    public void setKurs(double value) {
        propertyChangeSupport.firePropertyChange("news", this.kurs, value);
        this.kurs = value;
    }


}
