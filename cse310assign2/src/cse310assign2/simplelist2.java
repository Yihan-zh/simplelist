package cse310assign2;

/**
	 *Name: Yihan Zhang
	 *Class ID: 253
	 *Assignment 1
	 *This is a class for array. .......
	 *This class allows you to add,remove,search,count and return entire array as String
*/
public class simplelist2 {
    /**
	 The global variables: the array 
	 */
	int[] list;
	/**
	count the number of valid element in an array
	 */
	int count;

	/**
	 * class constructor
	 */
	public simplelist2() {
		list = new int[10];
		count = 0;
	}
   
	/**
	 * add the input to the first position of array after moving existing elements backward
	 */
	public void add(int number) {
	    int size = list.length;
	    
	    if(count == size) {
		    
		    size = (int) (size + size * 0.5);
		    int[] templist = new int[size];
		    for(int index = 0; index < count; index++) {
		    
		    templist[index] = list [index];
		    }
		    list = new int[size];
		    list = templist;
		    }
		    
	    
		for(int index = (size-1); index > 0; index--) {
			list[index] = list[index-1];
		}
		list[0] = number;
		count++;
	}

	/**
	 * remove the element which is equal to input, elements behind it moving forward
	 */
	public void remove(int number) {
	boolean foundnumber;
	int index;
	index = 0;
	foundnumber=false;
	int size = list.length;
	int empty = 0;
    empty = size - count;

	while( index < count) {

	
		
		if(list[index] == number) {
				
				foundnumber=true;
				
			}
		
		
		if((foundnumber)&&(index<(size-1))) {
			list[index] = list[index + 1];
		}
		if(foundnumber) {
			list[size-1] = 0;
			
		}
	
			index++;
		
		
	}
	if(foundnumber) {
		count--;
	}
	
	 if(empty >= (double) (size * 0.25)) {
		    
		    size = (int) (size * 0.75);
		    int[] templist = new int[size];
		    for(int indexx = 0; indexx < count; indexx++) {
		    
		    templist[indexx] = list [indexx];
		    }
		    list = new int[size];
		    list = templist;
		    }
   
	}

	/**
	 * show the number of valid elements in array
	 */
	public int count() {
		return count;
	}

	/**
	 * return entire array as string
	 * */
	public String toString() {
	String array;
	array = "";
	array += list[0];
	for(int index = 1; index < count; index++) {
		array += " " + list[index]; 
	}

	return array;
	}

	/**
	*search element which is equal to input and return the position of it.
	*if no found, then return -1.
	*/
	public int search(int number) {
	int result;
	result = -1;

		for(int index = 0; index < count; index++) {
			if(list[index] == number) {
				result = index;
			}
		}

		return result;

	}
	
	public void append(int number) {
        int size = list.length;
	    
	    if(count == size) {
	    
	    size = (int) (size + size * 0.5);
	    int[] templist = new int[size];
	    for(int index = 0; index < count; index++) {
	    
	    templist[index] = list [index];
	    }
	    list = new int[size];
	    list = templist;
	    }
	    
		
		list[count] = number;
		count++;
	}
	
	/** return fist number*/
	public int first() {
		return list[0];
	}
	/** return size of array*/
	public int size() {
		return list.length;
	}


}
