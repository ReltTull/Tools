public class TreeBlock extends Materials{
    // класс деревянный блок, с исходным состоянием state = 100. Этот блок будет пилиться пилой saw.
    int state = 100;
    public TreeBlock(int st) {
        st = state;
    }

    @Override
    void showInfo() {
        System.out.println(state);
    }
}
