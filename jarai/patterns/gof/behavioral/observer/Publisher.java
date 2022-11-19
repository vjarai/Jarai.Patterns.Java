package jarai.patterns.gof.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Publisher {
    private String news;

    private final PropertyChangeSupport propertyChangeSupport;

    public Publisher() {

        propertyChangeSupport = new PropertyChangeSupport(this);
    }

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
