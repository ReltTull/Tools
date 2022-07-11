public class Program {
    public static void main(String[] args) {
        Saw saw = new Saw();
        TreeBlock treeBlock = new TreeBlock();
        new Human(saw, treeBlock).useTool();
    }



}
