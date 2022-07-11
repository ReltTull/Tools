public class Saw extends Tool{
    TreeBlock tr;
    @Override
    void using() {
        cut(tr, 20);

    }
    void cut(TreeBlock tr, int cut) {
        tr.state -= cut;
        System.out.print("Tree block size: " + tr.state);
    }
}
