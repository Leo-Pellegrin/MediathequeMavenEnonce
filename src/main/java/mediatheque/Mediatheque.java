package mediatheque;

import java.util.LinkedList;
import java.util.List;


public class Mediatheque {
	private final List<Item> items = new LinkedList<>();

	public void addItem(Item i) {
		items.add(i);
	}

	public void printCatalogue(){
		Visitor v = new VisitorImpressionAll();
		for (Item i : items) {
			i.accept(v);
		}
	}

	public void  printOnlyCD(){
		Visitor v = new VisitorImpressionCD();
		for (Item i : items) {
			i.accept(v);
		}
	}

	public void printOnlyBook(){
		Visitor v = new VisitorImpressionBook();
		for (Item i : items) {
			i.accept(v);
		}
	}
}
