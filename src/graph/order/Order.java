package graph.order;

import java.util.ArrayList;
import java.util.List;

public class Order {
	public List<Hope> hope;

	public List<Hope> getHope() {
		return hope;
	}

	public void setHope(List<Hope> hope) {
		this.hope = new ArrayList<>(hope);
	}
}
