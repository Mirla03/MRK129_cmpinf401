package mrk129_lab8;

import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;;

public class RecordList {
	
	private class Node {
		
		Record data;
		
		Node next;

	public Node(Record dataValue) {
			
		next = null;
		
		data = dataValue;
		}
	
	
	}

	private Node head;

	public RecordList() {
		
		head = new Node(null);
	}

	public int indexOf(String name) {
		Node currentNode = head;
		int index = 0;
		
			while (currentNode.next != null && !currentNode.next.data.getName().equals(name)) {
			currentNode = currentNode.next;
			index++;
		}
			
		if (currentNode.next == null) {
			return -1;
	
		}else {
			return index;
		
		}
	}
	
	public int add(Record data) {
		Node node = new Node(data);
		
		if (head.next == null) {
			head.next = node;
			return 0;
		}
		
		if (data.getTime() < head.next.data.getTime()) 
			node.next = head.next;
			head.next = node;
			return 0;
		}

	    public void print() {
	     
	        Node currentNode = head.next;
	       
	        while (currentNode != null) {
	            System.out.println(currentNode.data.getName() + ", " + currentNode.data.getTime());
	            currentNode = currentNode.next;
	        }
	      
	        System.out.println();
	    }

	   
	    public void writeToFile(String filename) {
	      
	    	try{
	            
	    		FileWriter fileWriter = new FileWriter(filename);
	            Node currentNode = head.next;
	         
	            while (currentNode != null){
	             
	            	fileWriter.append(currentNode.data.getName());
	                fileWriter.append(",");
	                fileWriter.append(""+currentNode.data.getTime());
	                fileWriter.append('\n');
	                currentNode = currentNode.next;
	            }
	           
	            fileWriter.close();
	       
	    	} catch (IOException e){
	        
	    		e.printStackTrace();
	       
	        }
	    
	    }
	    
}
