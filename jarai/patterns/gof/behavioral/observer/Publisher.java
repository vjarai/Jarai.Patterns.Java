package jarai.patterns.gof.behavioral.observer;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Publisher {
    private String news;

    private PropertyChangeSupport support;

    public Publisher() {

        setSupport(new PropertyChangeSupport(this));
    }

    public void addPropertyChangeListener(PropertyChangeListener pcl) {

        getSupport().addPropertyChangeListener(pcl);
    }

    public void removePropertyChangeListener(PropertyChangeListener pcl) {

        getSupport().removePropertyChangeListener(pcl);
    }

    public void setNews(String value) {
        getSupport().firePropertyChange("news", this.news, value);
        this.news = value;
    }

    public PropertyChangeSupport getSupport() {
        return support;
    }

    public void setSupport(PropertyChangeSupport support) {
        this.support = support;
    }
}
