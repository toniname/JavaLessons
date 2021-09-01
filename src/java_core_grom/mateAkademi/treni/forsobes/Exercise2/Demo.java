package java_core_grom.mateAkademi.treni.forsobes.Exercise2;

public class Demo {

    public static void main(String[] args) {

        Graph graph = new Graph();

        graph.addVertex(Name.GDANSK);
        graph.addVertex(Name.BYDGOSZCZ);
        graph.addVertex(Name.TORUN);
        graph.addVertex(Name.WARSZAWA);

        graph.addEdge(0,1, 1);
        graph.addEdge(1,2, 1);
        graph.addEdge(0,2, 3);
        graph.addEdge(2,3, 4);
        graph.addEdge(1,3, 1);


        //graph.passInDeep(0, 1);
        graph.passInWidth(0);


        int[][] city = {{ 0, 1, 3, 5 },
                        { 1, 0, 1, 4 },
                        { 3, 1, 0, 1 },
                        { 5, 4, 1, 0 }};


    }

}
