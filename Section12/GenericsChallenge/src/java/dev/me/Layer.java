package dev.me;

import java.util.*;

public class Layer <T extends Mappable> {

    private List<T> elements;

    public Layer(List<T> elements) {
	this.elements = elements;
    }

    public void renderLayer() {

	for (T element : elements) {
	    element.render();
	    System.out.println();
	}
    }
}
