public class Saw extends Tool{
    // класс пило, с методом cut для работы с блоком дерева, где уменьшается TreeBlock.state.
    TreeBlock tr = new TreeBlock(10);

    public Saw(TreeBlock treeBlock) {
        super();
        treeBlock = tr;
    }


    @Override
    void using() {
        cut(tr);

    }

    void cut(TreeBlock block) {
        block.state /= 2;
        System.out.print("Tree block size: " + tr.state);
    }
}
