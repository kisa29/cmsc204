
public class TreeNode<T> 
{

	T data;
	TreeNode<T> rightChild;
	TreeNode<T> leftChild;


	public TreeNode(T dataNode) 
	{
		data=dataNode;
		rightChild=null;
		leftChild=null;

	}

	public TreeNode(TreeNode<T> node) 
	{
		data=node.data;
		rightChild=node.rightChild;
		leftChild=node.leftChild;

	}

	public T getData() 
	{
		return data;

	}



}
