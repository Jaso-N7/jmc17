package learn.s12.util;

import java.util.*;

public class QueryList <T extends QueryItem> {

    private final List<T> items;

    public QueryList(List<T> items) {
	this.items = items;
    }

    /**
     * Try to find a match in the list
     *
     * @param items Any list to be passed
     * @param {string} field The field to match on
     * @param {string} value The value of the field
     *
     * @return List<S> A list of matches where <S extends QueryItem>
     */
    public static <S extends QueryItem> List<S> getMatches(List<S> items,
							   String field,
							   String value) {

	List<S> matches = new LinkedList<>();
	for (var item : items) {
	    if (item.matchFieldValue(field, value)) {
		matches.add(item);
	    }
	}

	return matches;
    }

    /**
     * Try to find a match in the list
     *
     * @param {string} field The field to match on
     * @param {string} value The value of the field
     *
     * @return List<T> A list of matches
     */
    public List<T> getMatches(String field, String value) {

	List<T> matches = new LinkedList<>();
	for (var item : items) {
	    if (item.matchFieldValue(field, value)) {
		matches.add(item);
	    }
	}

	return matches;
    }
}
