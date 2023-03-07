package jarai.patterns.gof.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Publisher {
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private String news;

    public void addPropertyChangeListener(PropertyChangeListener pcl) {

        propertyChangeSupport.addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {

        propertyChangeSupport.removePropertyChangeListener(pcl);
    }

    public void setNews(String value) {
        propertyChangeSupport.firePropertyChange("news", this.news, value);
        this.news = value;
    }


}
