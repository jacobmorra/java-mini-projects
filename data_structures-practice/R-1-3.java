/*
Write a short Java method, isMultiple, that takes two long values, n and m, and
returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
*/

public class R_13{
	private long n;
	private long m;
	
	public R_13(long n, long m){
		this.n=n;
		this.m=m;
	}
	
	public boolean isMultiple(){
	  //if there is no remainder when n divides by m, n is a multiple of m
		if (n%m == 0){
			return true;
		}
		//otherwise, there is a remainder and n is not a multiple of m
		else{
			return false;
		}
	}
}
