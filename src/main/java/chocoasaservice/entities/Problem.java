package main.java.imta.chocoasaservice.entities;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tandrieux on 26/05/2017.
 */
public class Problem {
	private int id;
	private String xml;

	private List<Solution> solutions;

	public Problem() {
		solutions = new ArrayList<>();
	}
}
