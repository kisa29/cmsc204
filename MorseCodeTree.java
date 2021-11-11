import java.util.ArrayList;

public class MorseCodeTree implements LinkedConverterTreeInterface<String>
{
	private TreeNode<String> root;


	public MorseCodeTree()
	{
		// call the build tree
		root=null;
		buildTree();
	}

	@Override
	public TreeNode<String> getRoot() {
		// TODO Auto-generated method stub
		return  root;
	}

	@Override
	public void setRoot(TreeNode<String> newNode) {
		// TODO Auto-generated method stub

		root= new TreeNode <String>(newNode);
	}

	@Override
	public LinkedConverterTreeInterface<String> insert(String code, String result) {
		// TODO Auto-generated method stub

		// add a new node
		addNode((TreeNode<String>) root, code, result);
		return this;
	}

	@Override
	public void addNode(TreeNode<String> root, String code, String letter) {
		// TODO Auto-generated method stub

		if (((String) code).length()== 1) 
		{
			// traverse left 
			if(((String) code).charAt(0)=='.') 
			{
				root.leftChild=new TreeNode<String>(letter);
			}
			else
				//traverse left
			{
				root.rightChild= new TreeNode<String>(letter);
			}

		}
		else 
			if(((String) code).charAt(0)=='.') 
			{
				addNode(root.leftChild, code.substring(1), letter);
			}
			else
				addNode(root.rightChild,  code.substring(1), letter);



	}

	@Override
	public String fetch(String code) {
		// TODO Auto-generated method stub
		System.out.println("fetching code" + code);

		String letter= fetchNode( root, code);
		return letter;
	}

	@Override
	public String fetchNode(TreeNode<String> root, String code) {
		// TODO Auto-generated method stub
		if (code.length()== 1) 
		{
			if( code.charAt(0)=='.') 
			{
				return root.leftChild.getData();
			}
			else
			{
				return root.rightChild.getData();
			}

		}
		else 
			if(code.charAt(0)=='.') 
			{
				// call recursive method

				return fetchNode(root.leftChild,  code.substring(1));
			}
			else

				return  fetchNode(root.rightChild,   code.substring(1));


	}

	@Override
	public LinkedConverterTreeInterface<String> delete(String data) throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LinkedConverterTreeInterface<String> update() throws UnsupportedOperationException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buildTree() 
	{
		// TODO Auto-generated method stub
		// build the tree

		setRoot(new TreeNode<String>(""));
		//root=  new TreeNode<String>("");

		insert(".", "e");
		insert("-", "t");

		insert("..", "i");
		insert(".-", "a");
		insert("-.", "n");
		insert("--", "m");

		insert("...", "s");
		insert("..-", "u");
		insert(".-.", "r");
		insert(".--", "w");
		insert("-..", "d");
		insert("-.-", "k");
		insert("--.", "g");
		insert("---", "o");


		insert("....", "h");
		insert("...-", "v");
		insert("..-.", "f");
		insert(".-..", "l");
		insert(".--.", "p");
		insert(".---", "j");
		insert("-...", "b");
		insert("-..-", "x");
		insert("-.-.", "c");
		insert("-.--", "y");
		insert("--..", "z");
		insert("--.-", "q");
	}

	@Override
	public ArrayList<String> toArrayList() {
		// TODO Auto-generated method stub
		ArrayList <String> list = new ArrayList<>();

		LNRoutputTraversal((TreeNode<String>) root, list);

		return list;
	}

	@Override
	public void LNRoutputTraversal(TreeNode<String> root, ArrayList<String> list) 
	{
		// TODO Auto-generated method stub

		if(root!=null) 
		{
			// call the recursive method to go through the binary tree

			LNRoutputTraversal(root.leftChild, list);
			list.add(root.getData());
			LNRoutputTraversal(root.rightChild, list);

		}
	}



}


