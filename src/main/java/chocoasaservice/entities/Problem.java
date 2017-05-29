package chocoasaservice.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tandrieux on 26/05/2017.
 */
public class Problem {
	private int id = -1;
	private String xml;

	private List<Solution> solutions;

	public Problem(String xml) {
		solutions = new ArrayList<>();
		this.xml = xml;
	}

	public void solve() {

	}
}
