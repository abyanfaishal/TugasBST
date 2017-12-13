package tugasBST;

/**
 *
 * @author Abyan Faishal
 */
public class Main1 {
    public static void main(String [] args){
        BinarySearchTree y = new BinarySearchTree();
        y.put(1, 'a');
        y.put(5, 'c');
        y.put(3, 'b');
        y.put(8, 'd');
        System.out.println("Element diurutkan dari yang paling kecil: ");
        y.ascend();
        System.out.println();
        
        System.out.println("Get element d: ");
        System.out.println(y.get(8));
        System.out.println();
        
        System.out.println("Remove element a: ");
        y.remove(1);
        y.ascend();
    }
}
