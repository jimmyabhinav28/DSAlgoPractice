package dev.abhinav.graphs;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class GraphUtils {
	/*
	 * assumption is that all values are integer values
	 */

	public static int[][] getSampleAdjacencyMatrix() {
		int[][] adjacencyMatrix = { { 0, 1, 0, 1, 0, 0 }, { 1, 0, 0, 0, 0, 1 }, { 0, 0, 0, 0, 1, 0 },
				{ 1, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 0, 0 }, { 0, 1, 0, 0, 0, 0 } };
		return adjacencyMatrix;
	}
	
	public static ArrayList<ArrayList<Integer>> convertAdjacencyMatrixToAdjacencyList(int[][] adjacencyMatrix)
	{
		ArrayList<ArrayList<Integer>> adjacencyList=new ArrayList<ArrayList<Integer>>();	
		for(int i=0;i<adjacencyMatrix.length;i++)
		{
			ArrayList<Integer> listt=new ArrayList<Integer>();
			for(int j=0;j<adjacencyMatrix[i].length;j++)
			{
				if(adjacencyMatrix[i][j]==1)
					listt.add(j);
			}
			adjacencyList.add(listt);
		}
		
		return adjacencyList;
	}

	public static int[][] constructGraphAdjacencyMatrixFromInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input number of nodes.");
		int numberOfNodes = scanner.nextInt();
		if (numberOfNodes <= 0) {
			System.out.println("Invalid input. Terminating");
			scanner.close();
			return null;
		}

		int adjancencyMatrix[][] = new int[numberOfNodes][numberOfNodes];

		System.out.println("Enter 1 if the nodes are connected else enter 0");
		for (int i = 0; i < numberOfNodes; i++) {
			for (int j = 0; j < numberOfNodes; j++) {
				System.out.println("Are nodes " + i + " and " + j + " connected (Enter 0/1)");
				int x = scanner.nextInt();
				if (x != 0 && x != 1) {
					System.out.println("Invalid input. Terminating");
					scanner.close();
					return null;
				}
				adjancencyMatrix[i][j] = x;
			}
		}
		scanner.close();
		return adjancencyMatrix;
	}

	public static void printDFSGivenAdjacencyMatrix(int[][] adjancencyMatrix, int startNodeIndex) {
		int n = adjancencyMatrix[0].length;
		boolean visited[] = new boolean[n];
		Stack<Integer> dfsStack = new Stack<Integer>();

		dfsStack.push(startNodeIndex);
		visited[startNodeIndex] = true;
		while (!dfsStack.isEmpty()) {
			int element = dfsStack.peek().intValue();
			// mark this guy as processed
			dfsStack.pop();
			visited[element] = true;
			System.out.println("Visited node" + element);

			for (int i = 0; i < n; i++) {
				// do not consider self edges
				if (i == element)
					continue;

				if (adjancencyMatrix[element][i] == 1 && visited[i] == false)
					dfsStack.push(i);
			}
		}
	}

	public static ArrayList<ArrayList<Integer>> constructGraphAdjancencyListFromInput() {
		ArrayList<ArrayList<Integer>> adjacencyList = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of nodes in graph");
		int numberOfNodes = scanner.nextInt();

		if (numberOfNodes < 1) {
			System.out.println("Graph must have atleast 1 node. Terminating");
			scanner.close();
			return null;
		}

		adjacencyList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < numberOfNodes; i++) {
			ArrayList<Integer> listOfAdjacentNodes = new ArrayList<Integer>();
			for (int j = 0; j < numberOfNodes; j++) {

				System.out.println("Are nodes " + i + " and " + j + " connected (Enter 0/1)");
				int x = scanner.nextInt();
				if (x != 0 && x != 1) {
					System.out.println("Invalid input. Terminating");
					scanner.close();
					return null;
				}
				if (x == 1)
					listOfAdjacentNodes.add(j);
			}
			adjacencyList.add(listOfAdjacentNodes);
		}

		scanner.close();
		return adjacencyList;
	}

	public static void printDFSGivenAdjancencyList(ArrayList<ArrayList<Integer>> adjacencyList, int startNodeIndex) {
		Stack<Integer> dfsStack = new Stack<Integer>();
		boolean visited[] = new boolean[adjacencyList.size()];

		dfsStack.push(startNodeIndex);
		visited[startNodeIndex] = true;

		while (!dfsStack.isEmpty()) {
			int element = dfsStack.peek();
			dfsStack.pop();

			System.out.println("Visited node " + element);
			ArrayList<Integer> nodesAdjacentToPoppedNode = adjacencyList.get(element);
			for (Integer i : nodesAdjacentToPoppedNode) {
				if (!visited[i.intValue()]) {
					dfsStack.push(i);
					visited[i.intValue()] = true;
				}
			}

		}
	}

	public static void printAdjacencyList(ArrayList<ArrayList<Integer>> adjacencyList) {
		for (ArrayList<Integer> listt : adjacencyList)
			System.out.println(listt.toString());
	}

	public static void printDFSGivenAdjacencyMatrixRecursive(int[][] adjancencyMatrix, int startNodeIndex) {
		boolean visited[] = new boolean[adjancencyMatrix.length];
		printDFSGivenAdjacencyMatrixRecursiveVariant(adjancencyMatrix, visited, startNodeIndex);

	}

	private static void printDFSGivenAdjacencyMatrixRecursiveVariant(int[][] adjacencyMatrix, boolean[] visited,
			int startNodeIndex) {

		if (visited[startNodeIndex])
			return;// end of recursion
		else {
			visited[startNodeIndex] = true;
			System.out.println("Visited " + startNodeIndex);
			for (int i = 0; i < adjacencyMatrix.length; i++) {
				if (adjacencyMatrix[startNodeIndex][i] == 1)
					printDFSGivenAdjacencyMatrixRecursiveVariant(adjacencyMatrix, visited, i);
			}
		}

	}

	public static void printDFSGivenAdjacencyListRecursive(ArrayList<ArrayList<Integer>> adjacencyList, int startNodeIndex) {
		boolean visited[] = new boolean[adjacencyList.size()];
		printDFSGivenAdjacencyListRecursiveVariant(adjacencyList, visited,startNodeIndex);

	}
	private static void printDFSGivenAdjacencyListRecursiveVariant(ArrayList<ArrayList<Integer>> adjacencyList, boolean[] visited,int startNodeIndex) {

		if (visited[startNodeIndex])
			return;// end of recursion
		else {
			visited[startNodeIndex] = true;
			System.out.println("Visited " + startNodeIndex);
			for (int i = 0; i < adjacencyList.get(startNodeIndex).size(); i++) {
				printDFSGivenAdjacencyListRecursiveVariant(adjacencyList, visited, adjacencyList.get(startNodeIndex).get(i).intValue());
			}
		}

	}
//
//	public static void printBFSIterativeGivenAdjacencyMatrix()
//	{
//		
//	}
//	
//	public static void printBFSIterativeGivenAdjacencyMatrix()
//	{
//		
//	}
//	
//	public static void printBFSIterativeGivenAdjacencyMatrix()
//	{
//		
//	}
}
