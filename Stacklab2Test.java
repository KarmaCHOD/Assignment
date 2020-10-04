public class Stacklab2Test{
	public static void main(String[] args){
		Stacklab2 obj = new Stacklab2();

		obj.push(1);
		obj.push(3);
		obj.push(4);
		obj.push(5);

		assert(obj.isEmpty() == false);
		assert(obj.size() == 4);
		assert(obj.pop() == 5);
		assert(obj.size() == 3);
		assert(obj.top() == 4);
		System.out.println("All test cases passed ");
		System.out.println("Size of array is "+obj.size());
		
	}	
}