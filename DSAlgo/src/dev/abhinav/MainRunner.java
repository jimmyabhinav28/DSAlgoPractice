package dev.abhinav;

import java.util.ArrayList;

import dev.abhinav.graphs.GraphUtils;
import dev.abhinav.matrix.MatrixUtils;

public class MainRunner {

	public static void main(String[] args) {

//		testDFSIterativeWithAdjacencyMatrix();
//		testDFSIterativeWithAdjacencyList();
		testDFSRecursiveWithAdjacencyMatrix();
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
}
