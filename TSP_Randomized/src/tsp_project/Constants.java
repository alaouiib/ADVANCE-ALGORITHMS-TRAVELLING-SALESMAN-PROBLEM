/**
 * 
 */
package tsp_project;

/**
 * @author walid
 *
 */
public interface Constants {
	static final int number_of_cities = 9;
	static final int distance_min = 50;
	static final int distance_max = 500;
	static final int starting_point = 0;
	
	/* Array of cities */
	public static City[] cities = new City[number_of_cities];
	/* Matrix of distances between cities */
	public static int[][] dis_matrix = new int[number_of_cities][number_of_cities];
	/* Arrays of candidate paths */
	public static String[] candidate_paths = new String[Path.numberOfPossiblePaths()];
	public static City[][] paths = new City[Path.numberOfPossiblePaths()][number_of_cities + 1];
	
	/* We store in this matrix the cities left to accomplish the path */
	public static int[] visited = new int[Randomized.nodesNumber()];
	/* We store in this array the tree nodes (cities) */
	public static City[] nodes = new City[Randomized.nodesNumber()];
	/* We store in this array the parent nodes of nodes in the array node_cost */
	public static int[] origin = new int[Constants.nodes.length];
}
