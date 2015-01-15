package com.acc.rahul.srcLinkedList;


public class LinkedListReadOperation {

	/**
	 * Returns the length of singly linked list
	 * 
	 * @param headNode
	 * @return
	 */
	public int getSLListLength(SLLNode headNode){
		int length=0;
		SLLNode currentNode=headNode;
		while(currentNode!=null){
			length++;
			currentNode=currentNode.getNext();
		}		
		return length;
	}
	
	/**
	 * Prints the singly linked list
	 * 
	 * @param headNode
	 */
	public void printSLListLength(SLLNode headNode){
		SLLNode currentNode=headNode;
		while(currentNode!=null){
			System.out.print(currentNode.getData());
			currentNode=currentNode.getNext();
			if(currentNode!=null){
			System.out.print("-->");
	    	}	
		}	
		System.out.println();
	}
	
	/**
	 * Returns the length of doubly linked list
	 * 
	 * @param headNode
	 * @return
	 */
	public int getDLListLength(DLLNode headNode){
		int length=0;
		DLLNode currentNode=headNode;
		while(currentNode!=null){
			length++;
			currentNode=currentNode.getNext();
		}		
		return length;
	}
	
	/**
	 * Prints the doubly linked list
	 * 
	 * @param headNode
	 */
	public void printDLListLength(DLLNode headNode){
		DLLNode currentNode=headNode;
		while(currentNode!=null){
			System.out.print(currentNode.getData());
			currentNode=currentNode.getNext();
			if(currentNode!=null){
			System.out.print("<-->");
	    	}	
		}	
		System.out.println();
	}
	
	/**
	 * Returns the length of circular linked list
	 * 
	 * @param headNode
	 * @return
	 */
	public int getCLListLength(CLLNode headNode){
		int length=0;
		CLLNode currentNode=headNode;
		while(currentNode!=null){
			length++;
			currentNode=currentNode.getNext();
			if(currentNode==headNode){
				break;
			}
		}		
		return length;
	}
	
	/**
	 * Prints the circular linked list
	 * 
	 * @param headNode
	 */
	public void printCLListLength(CLLNode headNode){
		CLLNode currentNode=headNode;
		while(currentNode!=null){
			System.out.print(currentNode.getData()+"-->");
			currentNode=currentNode.getNext();
			if(currentNode==headNode){
			System.out.print("("+currentNode.getData()+" as headNode)"); 
			break;
	    	}	
		}
		System.out.println();
	}
	

	/**
	 *  This method finds the nth Node from the end.
	 *  
	 * @param headNode
	 * @param n
	 * @return SLLNode
	 */
	public SLLNode findNthNodeFromEnd(SLLNode headNode , int n){
		
		SLLNode pNthNode = headNode, pTemp = headNode;
		int count=0;
		while(pTemp!=null){
			count++;
			if(n<count){
				pNthNode=pNthNode.getNext();			
			}
			pTemp=pTemp.getNext();
		}
		if(count>=n){
			System.out.println("count"+count); 
			return pNthNode;
		}
		return null;		
	}
	
	/**
	 * This method check presence of loop in a list.
	 * This is also known as Floyd Cycle finding algorithm.
	 * @param headNode
	 * @return boolean
	 */
	public boolean isLinkedListContainsLoop(SLLNode headNode){
		SLLNode slowPtr=headNode, fastPtr=headNode;
		
		while(slowPtr!=null && fastPtr !=null){
			fastPtr = fastPtr.getNext();
			if(fastPtr==slowPtr){
				return true;
			}
			if(fastPtr==null){
				return false;
			}	
			fastPtr = fastPtr.getNext();
			if(fastPtr==slowPtr){
				return true;
			}
			slowPtr= slowPtr.getNext();
		}
		return false;
	}
	
	/**
	 *This method finds the beginning of loop. 
	 * 
	 * @param headNode
	 * @return
	 */
	public SLLNode findBeginofLoop(SLLNode headNode){
		SLLNode slowPtr=headNode, fastPtr=headNode;
		boolean loopExists=false;
		int slowCount=0, fastCount=0;
		while(slowPtr!=null && fastPtr !=null){
			slowPtr = slowPtr.getNext();
			slowCount++;
			fastPtr = fastPtr.getNext();
			fastCount++;
			if(fastPtr!=null){
				fastPtr = fastPtr.getNext();
				fastCount++;
			}	
			if(fastPtr==slowPtr){
				loopExists=true;
				break;
			}
		}
		System.out.println("slowcount, fastCount"+ slowCount +","+fastCount);
		if(loopExists){
		  slowPtr = headNode;
		  while(slowPtr!=fastPtr){
		   fastPtr = fastPtr.getNext();
		   slowPtr = slowPtr.getNext();
		  }
		  return slowPtr;
		}
		return null;
	}
	
	
	/**
	 *This method finds the length of loop. 
	 * 
	 * @param headNode
	 * @return int
	 */
	public int findLoopLength(SLLNode headNode){
		SLLNode slowPtr=headNode, fastPtr=headNode;
		boolean loopExists=false;
		int lengthCounter=0;
		while(slowPtr!=null && fastPtr !=null){
			slowPtr= slowPtr.getNext();
			fastPtr = fastPtr.getNext();
			if(fastPtr!=null){
				fastPtr = fastPtr.getNext();
			}	
			if(fastPtr==slowPtr){
				loopExists=true;
				break;
			}
		}
		if(loopExists){
		  slowPtr = slowPtr.getNext();
		  lengthCounter++;
		  while(slowPtr!=fastPtr){
		   slowPtr = slowPtr.getNext();
		   lengthCounter++;
		  }
		  return lengthCounter;
		}
		return 0;
	}

	/**
	 * This method finds the intersecting node of two singly linked list.
	 * 
	 * @param headNode1
	 * @param headNode2
	 * @return SLLNode
	 */
	public SLLNode findIntersectingNode(SLLNode list1, SLLNode list2){
		
		SLLNode headNode1=list1,headNode2=list2;
		int l1=	this.getSLListLength(headNode1);
		int l2=this.getSLListLength(headNode2);
		int diff = l1-l2;
		if(diff<0){
			headNode1= list2;
			headNode2= list1;
			diff= l2-l1;
		}
		for(int i=0;i<diff;i++){
			headNode1=headNode1.getNext();
		}
		
		while(headNode1!=null && headNode2!=null){ 
			if(headNode1==headNode2){
				return headNode1;
			}
			headNode1=headNode1.getNext();
			headNode2=headNode2.getNext();
		}
		return null;
	}
	
	/**
	 * this method finds the middle node from the linked list.
	 * 
	 * @param headNode
	 * @return
	 */
	public SLLNode findMiddleNode(SLLNode headNode){
		SLLNode fastPtr,slowPtr;
		fastPtr=slowPtr=headNode;
		boolean flag=false;
		while(fastPtr.getNext()!=null){
			if(flag==false){
				fastPtr=fastPtr.getNext();
				flag=true;
			}
			else if(flag==true){
				fastPtr=fastPtr.getNext();
				slowPtr = slowPtr.getNext();
				flag=false;
			}	
		}
		return slowPtr;
	}
	
	/**
	 * this method finds the middle node from the linked list.
	 * 
	 * @param headNode
	 * @return
	 */
	public DLLNode findMiddleDLLNode(DLLNode headNode){
		DLLNode fastPtr,slowPtr;
		fastPtr=slowPtr=headNode;
		boolean flag=false;
		while(fastPtr.getNext()!=null){
			if(flag==false){
				fastPtr=fastPtr.getNext();
				flag=true;
			}
			else if(flag==true){
				fastPtr=fastPtr.getNext();
				slowPtr = slowPtr.getNext();
				flag=false;
			}	
		}
		return slowPtr;
	}
	
	/**
	 * This method prints the linked list from end.
	 * @param headNode
	 */
	public void printLinkedListFromEnd(SLLNode headNode){
		if(headNode==null)
			return;
		printLinkedListFromEnd(headNode.getNext());
		System.out.print(headNode.getData()+"<--");
	}
	
	/**
	 * Checks whether the list is even or not.
	 * @param headNode
	 * @return
	 */
	public boolean isLinkedListEven(SLLNode headNode){
		
		while(headNode!=null && headNode.getNext()!=null){
			headNode= headNode.getNext().getNext();
		}
		if(headNode==null){
			return true; 
		}
	 return false;
	}
	
	/**
	 * This method reverses the list element in pair
	 * @param headNode
	 */
	public void reversePairByRecursion(SLLNode headNode){
		SLLNode temp;
		if(headNode==null || headNode.getNext()==null){
			return;
		}
		temp = headNode.getNext();
		headNode.setNext(temp.getNext());
		temp.setNext(headNode);
		reversePairByRecursion(headNode.getNext());
	}
	
	/**
	 * In-order traversal of BST.
	 * 
	 * @param root
	 */
	public void inOrderTraversalofBST(DLLNode root) {
		if(root == null) {
			return;
		}
		inOrderTraversalofBST(root.getPrevious());
		System.out.print(root.getData() + " ");
		inOrderTraversalofBST(root.getNext());
	}
	
}
