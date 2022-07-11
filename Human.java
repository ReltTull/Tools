public class Human {
    Tool tool;
    Materials materials;

    public Human(Tool t, Materials m) {
        tool = t;
        materials = m;
    }


    void useTool() {
        System.out.println("Human using tool.");
        tool.using();
    }
}
