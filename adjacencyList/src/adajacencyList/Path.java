package adajacencyList;
/**
 * Path
 * 
 *   A simple method for tracking Paths in an adjacency list.
 *   
 *   @author Jeremy Morris
 *   @version 20121009
 */

public class Path implements Comparable<Path>{

	/*
	 * Declaring these private members final means that
	 * they cannot be changed - they are immutable once they've
	 * been assigned in the constructor.
	 */
	private final String endpoint;
	private final double cost;
	
	public Path(String nodename, double cost) {
		this.endpoint=nodename;
		this.cost=cost;
	}
	
	/*
	 * getEndPoint
	 * 
	 * @return the name of the endpoint for this path
	 */
	public String getEndpoint() {
		return this.endpoint;
	}
	
	/*
	 * getCost
	 * 
	 * @return the cost for this path
	 */
	public double getCost() {
		return this.cost;
	}
	

	/*
	 * compareTo
	 * 
	 *   Paths are ordered by their cost.  We return a positive
	 *   value if our cost is greater than the one we're comparing
	 *   to, a negative cost if it's less than, and 0 when they
	 *   are actually equal.
	 *   
	 *   Cast this to int since compareTo must return an int.
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Path other) {
		if (this.cost>other.getCost()) {
			return 1;
		}
		else if (this.cost<other.getCost()) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	/*
	 * toString
	 * 
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Path [end=" + endpoint + ", cost=" + cost + "]";
	}

	/*
	 * hashCode
	 * 
	 * This is the autogenerated hashCode method from eclipse
	 * (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) cost;
		result = prime * result + ((endpoint == null) ? 0 : endpoint.hashCode());
		return result;
	}


	/*
	 * equals
	 * 
	 * Two paths are equal when their endpoint is the same and
	 * they have the same cost.
	 * (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		boolean eq = true;
		if ((obj == null) || (getClass() != obj.getClass()))
			eq=false;
		else {
			Path other = (Path) obj;
			if ((cost != other.cost) || (!endpoint.equals(other.endpoint))) {
				eq=false;
			}
		}
		return eq;
	}
	
	
}
