package yandex2;

import java.util.Comparator;
import java.util.Map.Entry;

/**
 *
 * @author ASK
 */
class EntryComparator implements Comparator<Entry<String, Integer>> {

    @Override
    public int compare(Entry<String, Integer> arg0, Entry<String, Integer> arg1) {
	// Compare the values.
	return arg0.getValue().compareTo(arg1.getValue());
    }
}
