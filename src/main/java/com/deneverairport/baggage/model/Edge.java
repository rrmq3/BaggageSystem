package com.deneverairport.baggage.model;

public class Edge {
	private final String id;
	private final Vertex source;
	private final Vertex destination;
	private final int weight;
	public int ravindra;
	public String addedInGit;

	public Edge(String id, Vertex source, Vertex destination, int weight) {
		this.id = id;
		this.source = source;
		this.destination = destination;
		this.weight = weight;

	}
		//I have commented this to make sure my local git tracks the changes
		// Can I?
	public String getId() {
		return id;
	}

	public Vertex getDestination() {
		return destination;
	}

	public Vertex getSource() {
		return source;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public String toString() {
		return source + " " + destination;
	}

}
