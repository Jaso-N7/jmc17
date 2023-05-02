package dev.me;

public class Layer <T extends Mappable> {

    private List<T> elements;

    public Layer(ArrayList<T> elements) {
	this.elements = elements;
    }

    public void renderLayer() {

	for (var element : elements) {
	    element.render();
	}
    }
}
