package jarai.patterns.gof.behavioral.iterator;

import java.util.NoSuchElementException;


public class RecordContainer implements Iterable<String> {
    String[] daten;

    public RecordContainer(String[] daten) {
        this.daten = daten;
    }

    @Override
    public java.util.Iterator<String> iterator() {
        return new Iterator();
    }

    public class Iterator implements java.util.Iterator<String> {
        private int aktuellePosition = 0;

        public boolean hasNext() {
            return aktuellePosition < daten.length;
        }

        public String next() throws NoSuchElementException {
            if (hasNext())
                return daten[aktuellePosition++];
            else
                throw new NoSuchElementException();
        }

    }
}