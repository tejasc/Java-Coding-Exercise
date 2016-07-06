package linkedlistPackage;

public class MyLinkedList {
	
// Create list of nodes and each nodes contains some sort of data.
	//  Head 						tail
//		|	 						|
	// Node(data) -> Node(data) -> Node (data)
	// Add node
	// Delete node
	//Find Node
	Node head;
	Node tail;
	
	
	
	
	public void add(Node node)
	
	{
		// Scenario 1: We have empty link list
		// Scenario 2: Non Empty Linked list  Add (Node 17)  to  [Node (10) -> Node(6)]
		// To add new node old tail need to point our new node and we need to update tail with out new node
		
		if(tail == null)
		{
			head = node;
			tail = node;
			//Only one element in that list
		}
		
		
	else{
		tail.nextNode = node;
		
		tail = node;    // update tail to new node
		
		}
			
	}
	

}
