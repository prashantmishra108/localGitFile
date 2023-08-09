package Algorithms.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class InorderTraversal {
	public static void main(String[] args) {
		
	SubtreeCheck tree = new SubtreeCheck();
		
		// TREE 1
		/* Construct the following tree
			26
			/ \
			10	 3
		  /	 \	 \
		4	  6   3
		\
		 30 */
		
		tree.root1 = new NodeInt(26);
		tree.root1.right = new NodeInt(3);
		tree.root1.right.right = new NodeInt(3);
		//tree.root1.right.left = new NodeInt(5);//[4, 30, 10, 6, 26, 5, 3, 3]
		tree.root1.left = new NodeInt(10);
		tree.root1.left.left = new NodeInt(4);
		tree.root1.left.left.right = new NodeInt(30);
		tree.root1.left.right = new NodeInt(6);
		
		System.out.println(inorderTraversal(tree.root1));//[4, 30, 10, 6, 26, 3, 3]
	}
    public static List<Integer> inorderTraversal(NodeInt root1) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        inorderTraversal(root1, ret);
        return ret;
    }
	/* Construct the following tree
	26
	/ \
	10	 3
  /	 \	 \
4	  6   3
\
 30 */

    public static void inorderTraversalRec(NodeInt root, ArrayList<Integer> ret) {
        if (root == null) {
            return;
        }

        inorderTraversalRec(root.left, ret);

        ret.add(root.data);

        inorderTraversalRec(root.right, ret);       
    }
    
    public static void inorderTraversal(NodeInt root, ArrayList<Integer> ret) {
        if (root == null) {
            return;
        }

        NodeInt cur = root;    
        Stack<NodeInt> s = new Stack<NodeInt>();

        while (true) {
            // å› ä¸ºæ˜¯inorder,æ‰€ä»¥è¦�ä¸€ç›´å…ˆå¤„ç�†å·¦èŠ‚ç‚¹ï¼Œæ‰€ä»¥æˆ‘ä»¬å¿…é¡»æ‰¾åˆ°æœ€æœ€å·¦è¾¹è¿™ä¸€ä¸ªèŠ‚ç‚¹ï¼Œ
            // å�¦åˆ™æ˜¯ä¸�å¤„ç�†çš„ï¼Œä¹Ÿå°±æ˜¯ä¸€ç›´åŽ‹æ ˆã€‚
            while (cur != null) {
                s.push(cur);
                cur = cur.left;
            }

            // å¦‚æžœæ ˆç©ºï¼Œè¡¨æ˜Žæ²¡æœ‰ä»»ä½•éœ€è¦�å¤„ç�†çš„å…ƒç´ äº†.
            if (s.isEmpty()) {
                break;
            }
            
            /*
             *        1
             *       / \
             *      2   6
             *     / \
             *    3   5
             *   / 
             *  4     
             *  
             *  ä¾‹å¦‚ï¼š1, 2, 3, 4ä¼šå…¥æ ˆã€‚
             *  4ï¼Œ3ï¼Œ2é™†ç»­å¼¹å‡º
             *  
             *  ç„¶å�Žä¼šè½¬å�‘2çš„å�³èŠ‚ç‚¹ï¼Œ5. 5å¤„ç�†å®Œå�Žï¼Œä¼šç»§ç»­å¼¹æ ˆï¼Œä¹Ÿå°±æ˜¯1. 
             *  æœ€å�Žå¤„ç�†6.
             *  
             * */

            // å› ä¸ºæ‰€æœ‰çš„å·¦èŠ‚ç‚¹å…¨éƒ¨å·²ç»�åŠ å…¥æ ˆä¸­äº†ï¼Œå¼€å§‹å¤„ç�†æ ˆé¡¶çš„å…ƒç´ ï¼Œ
            // æˆ–è€…æ˜¯å�³å­�æ ‘æ˜¯ç©ºçš„ï¼Œé‚£ä¹ˆå¼¹å‡ºä¸€ä¸ªä¹‹å‰�çš„èŠ‚ç‚¹æ�¥å¤„ç�†
            cur = s.pop();

            // å¤„ç�†å½“å‰�èŠ‚ç‚¹ï¼ˆå·¦èŠ‚ç‚¹ä¸Žæ ¹èŠ‚ç‚¹ ï¼‰
            ret.add(cur.data);

            // å¤„ç�†äº†å·¦èŠ‚ç‚¹ä¸Žæ ¹èŠ‚ç‚¹ï¼Œå†�å¤„ç�†å�³å­�æ ‘ã€‚
            cur = cur.right;
        }
    }
}
