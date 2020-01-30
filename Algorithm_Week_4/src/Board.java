public class Board {

    // create a board from an n-by-n array of tiles,
    private int[][] tilesArr; 
    public Board(int[][] tiles)
    {
    	tilesArr = tiles.clone();
    }
                                           
    // string representation of this board
    public String toString()
    {
    	StringBuffer sb = new StringBuffer(tilesArr.length);
    	for (int i=0;i<tilesArr.length;i++)
    	{
    		sb.append("\n");
    		StringBuffer tmp = new StringBuffer();
    		for(int j=0;j<tilesArr[i].length;j++)
    		{
    			tmp.append(tilesArr[i][j]);
    			tmp.append(" ");
    		}
    		sb.append(tmp.toString().trim());
    	}
    	return sb.toString();
    }

    // board dimension n
    public int dimension()
    {
    	return tilesArr.length;
    }

    // number of tiles out of place
    public int hamming()
    {
    	return 0;
    }

    // sum of Manhattan distances between tiles and goal
    public int manhattan()
    {
    	return 0;
    }

    // is this board the goal board?
    public boolean isGoal()
    {
    	return false;
    }

    // does this board equal y?
    public boolean equals(Object y)
    {
    	return false;
    }

    // all neighboring boards
    public Iterable<Board> neighbors()
    {
    	return null;
    }

    // a board that is obtained by exchanging any pair of tiles
    public Board twin()
    {
    	return null;
    }

    // unit testing (not graded)
    public static void main(String[] args)
    {
    	
    }

}