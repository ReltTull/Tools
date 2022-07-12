public class Program {
    public static void main(String[] args) {
        TreeBlock treeBlock = new TreeBlock(100);
        Saw saw = new Saw(treeBlock);
        new Human(saw, treeBlock).useTool();
    }



}
