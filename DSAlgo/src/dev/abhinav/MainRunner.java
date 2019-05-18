package dev.abhinav;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dev.abhinav.arrayQ.Array2;
import dev.abhinav.graphs.UndirectedUnweightedGraphUtils;
import dev.abhinav.matrix.MatrixUtils;

public class MainRunner {

	public static void main(String[] args) {

//		testDFSIterativeWithAdjacencyMatrix();
//		testDFSIterativeWithAdjacencyList();
//		testDFSRecursiveWithAdjacencyMatrix();
//		testDFSRecursiveWithAdjacencyList();
//		testBFSIterativeWithAdjacencyMatrix();
//		testBFSIterativeWithAdjacencyList();
		testSortArrayHavingOnlyThreeValues();
	}
	
	private static void testSortArrayHavingOnlyThreeValues()
	{
		List<Integer> array=new ArrayList<Integer>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(1);
		array.add(3);
		array.add(2);
		
		List<Integer> sortedArray=Array2.sortArrayHavingOnlyThreeValues(array);
		System.out.println(sortedArray.toString());
		
	}
	private static void testDFSIterativeWithAdjacencyMatrix()
	{
		int adjancencyMatrix[][]=UndirectedUnweightedGraphUtils.constructGraphAdjacencyMatrixFromInput();
//		int startNodeIndex=0;
		int startNodeIndex=2;
		MatrixUtils.print2DMatrix(adjancencyMatrix);
		
		
		UndirectedUnweightedGraphUtils.printDFSGivenAdjacencyMatrix(adjancencyMatrix,startNodeIndex);
	}
	
	private static void testDFSIterativeWithAdjacencyList()
	{
		ArrayList<ArrayList<Integer>> adjacencyList=UndirectedUnweightedGraphUtils.constructGraphAdjancencyListFromInput();
		int startNodeIndex=0;
//		int startNodeIndex=2;
		UndirectedUnweightedGraphUtils.printAdjacencyList(adjacencyList);
		UndirectedUnweightedGraphUtils.printDFSGivenAdjancencyList(adjacencyList, startNodeIndex);
	}
	
	private static void testDFSRecursiveWithAdjacencyMatrix()
	{
		int adjancencyMatrix[][]=UndirectedUnweightedGraphUtils.getSampleAdjacencyMatrix();
//		int startNodeIndex=0;
		int startNodeIndex=2;
		MatrixUtils.print2DMatrix(adjancencyMatrix);
		UndirectedUnweightedGraphUtils.printDFSGivenAdjacencyMatrixRecursive(adjancencyMatrix, startNodeIndex);
	}
	
	private static void testDFSRecursiveWithAdjacencyList()
	{
		int adjacencyMatrix[][]=UndirectedUnweightedGraphUtils.getSampleAdjacencyMatrix();
		ArrayList<ArrayList<Integer>> adjacencyList=UndirectedUnweightedGraphUtils.convertAdjacencyMatrixToAdjacencyList(adjacencyMatrix);
//		int startNodeIndex=0;
		int startNodeIndex=2;
		UndirectedUnweightedGraphUtils.printAdjacencyList(adjacencyList);
		UndirectedUnweightedGraphUtils.printDFSGivenAdjacencyListRecursive(adjacencyList, startNodeIndex);
	}
	
	private static void testBFSIterativeWithAdjacencyMatrix()
	{
		int adjacencyMatrix[][]=UndirectedUnweightedGraphUtils.getSampleAdjacencyMatrix();
//		int startNodeIndex=0;
		int startNodeIndex=2;
//		GraphUtils.printAdjacencyList(adjacencyList);
		UndirectedUnweightedGraphUtils.printBFSIterativeGivenAdjacencyMatrix(adjacencyMatrix, startNodeIndex);
	}
	
	private static void testBFSIterativeWithAdjacencyList()
	{
		int adjacencyMatrix[][]=UndirectedUnweightedGraphUtils.getSampleAdjacencyMatrix();
		ArrayList<ArrayList<Integer>> adjacencyList=UndirectedUnweightedGraphUtils.convertAdjacencyMatrixToAdjacencyList(adjacencyMatrix);
		int startNodeIndex=0;
//		int startNodeIndex=2;
		UndirectedUnweightedGraphUtils.printBFSIterativeGivenAdjacencyList(adjacencyList, startNodeIndex);
	}
}
