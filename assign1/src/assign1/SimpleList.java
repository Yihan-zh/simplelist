/**
 *Name: Yihan Zhang
 *Class ID: 253
 *Assignment 1
 *This is a class for array. 
 *This class allows you to add,remove,search,count and return entire array as String
*/
package assign1;


public class SimpleList {
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
public SimpleList() {
	list = new int[10];
	count = 0;
}

/**
 * add the input to the first position of array after moving existing elements backward
 */
public void add(int number) {
	
	for(int index = 9; index > 0; index--) {
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

while( index < count) {

	
	
	if(list[index] == number) {
			count--;
			foundnumber=true;
			
		}
	
	
	if((foundnumber)&&(index<9)) {
		list[index] = list[index + 1];
	}
	if(foundnumber) {
		list[9] = 0;
	}
	index++;
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
for(int index = 0; index < count; index++) {
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


}
