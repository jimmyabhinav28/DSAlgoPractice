package dev.abhinav;

import java.util.ArrayList;

import dev.abhinav.graphs.GraphUtils;
import dev.abhinav.matrix.MatrixUtils;

public class MainRunner {

	public static void main(String[] args) {

//		testDFSIterativeWithAdjacencyMatrix();
//		testDFSIterativeWithAdjacencyList();
//		testDFSRecursiveWithAdjacencyMatrix();
//		testDFSRecursiveWithAdjacencyList();
//		testBFSIterativeWithAdjacencyMatrix();
		testBFSIterativeWithAdjacencyList();
	}
	
	private static void testDFSIterativeWithAdjacencyMatrix()
	{
		int adjancencyMatrix[][]=GraphUtils.constructGraphAdjacencyMatrixFromInput();
//		int startNodeIndex=0;
		int startNodeIndex=2;
		MatrixUtils.print2DMatrix(adjancencyMatrix);
		
		
		GraphUtils.printDFSGivenAdjacencyMatrix(adjancencyMatrix,startNodeIndex);
	}
	
	private static void testDFSIterativeWithAdjacencyList()
	{
		ArrayList<ArrayList<Integer>> adjacencyList=GraphUtils.constructGraphAdjancencyListFromInput();
		int startNodeIndex=0;
//		int startNodeIndex=2;
		GraphUtils.printAdjacencyList(adjacencyList);
		GraphUtils.printDFSGivenAdjancencyList(adjacencyList, startNodeIndex);
	}
	
	private static void testDFSRecursiveWithAdjacencyMatrix()
	{
		int adjancencyMatrix[][]=GraphUtils.getSampleAdjacencyMatrix();
//		int startNodeIndex=0;
		int startNodeIndex=2;
		MatrixUtils.print2DMatrix(adjancencyMatrix);
		GraphUtils.printDFSGivenAdjacencyMatrixRecursive(adjancencyMatrix, startNodeIndex);
	}
	
	private static void testDFSRecursiveWithAdjacencyList()
	{
		int adjacencyMatrix[][]=GraphUtils.getSampleAdjacencyMatrix();
		ArrayList<ArrayList<Integer>> adjacencyList=GraphUtils.convertAdjacencyMatrixToAdjacencyList(adjacencyMatrix);
//		int startNodeIndex=0;
		int startNodeIndex=2;
		GraphUtils.printAdjacencyList(adjacencyList);
		GraphUtils.printDFSGivenAdjacencyListRecursive(adjacencyList, startNodeIndex);
	}
	
	private static void testBFSIterativeWithAdjacencyMatrix()
	{
		int adjacencyMatrix[][]=GraphUtils.getSampleAdjacencyMatrix();
//		int startNodeIndex=0;
		int startNodeIndex=2;
//		GraphUtils.printAdjacencyList(adjacencyList);
		GraphUtils.printBFSIterativeGivenAdjacencyMatrix(adjacencyMatrix, startNodeIndex);
	}
	
	private static void testBFSIterativeWithAdjacencyList()
	{
		int adjacencyMatrix[][]=GraphUtils.getSampleAdjacencyMatrix();
		ArrayList<ArrayList<Integer>> adjacencyList=GraphUtils.convertAdjacencyMatrixToAdjacencyList(adjacencyMatrix);
		int startNodeIndex=0;
//		int startNodeIndex=2;
		GraphUtils.printBFSIterativeGivenAdjacencyList(adjacencyList, startNodeIndex);
	}
}
