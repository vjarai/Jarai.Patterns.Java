package jarai.patterns.gof.behavioral.iterator;

import java.util.Arrays;
import java.util.NoSuchElementException;


public class IterableContainer implements Iterable<String> {
    String[] records;

    public IterableContainer(String[] records) {
        this.records = records;
    }

    @Override
    public java.util.Iterator<String> iterator() {
        return Arrays.stream(records).iterator();
    }

    public class Iterator implements java.util.Iterator<String> {
        private int aktuellePosition = 0;

        public boolean hasNext() {
            return aktuellePosition < records.length;
        }

        public String next() throws NoSuchElementException {
            if (hasNext())
                return records[aktuellePosition++];
            else
                throw new NoSuchElementException();
        }

    }
}