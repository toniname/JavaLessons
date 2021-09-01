package java_core_grom.mateAkademi.treni.forsobes.Exercise2;

/*Вам дается список городов. Каждое прямое сообщение между двумя городами имеет свою транспортную стоимость (целое число больше 0).
Цель - найти пути минимальной стоимости между парами городов. Предположим, что стоимость каждого пути
(которая представляет собой сумму затрат всех прямых соединений, принадлежащих этому пути)
не превышает 200000. Название города представляет собой строку, содержащую символы a, ..., z, и составляет не
более 10, длинные символы 2)
s [количество тестов <= 10]
n [количество городов <= 10000]
NAME-[название города]
p [количество соседей города NAME]
nr cost [nr - индекс города, подключенного к NAME (индекс первого города равен 1)]
            [cost - стоимость перевозки]
r [количество путей для поиска <= 100]
NAME1 NAME2 [NAME1 - источник, NAME2 - место назначения]
[пустая строка, разделяющая тесты]*/
public class Graph {
    private final int[][] mass; // connected vertex matrix
    Vertex[] vertexList;  // vertex list
    private int count;   // counter

    private final BreadthFirstSearch breadthFirstSearch = new BreadthFirstSearch();

    public Graph() {  //creation of zero arrays, lists

        int maxN = 10;// number of vertices (with a margin)
        vertexList = new Vertex[maxN];
        mass = new int[maxN][maxN];
        count = 0;
    }

    public void addVertex(Name name) { // adds vertex names by counter
        vertexList[count++] = new Vertex(name);
    }

    public void addEdge(int start, int end, int val) { //adding graph parameters for demo
            mass[start][end] = val;
            mass[end][start] = val;


    }

    public int check(int v) { //checking visited cities
        for (int i = 0; i < count; i++) {
            if (mass[v][i] == 1 && !vertexList[i].isVisited ) {
                return i;

            }
        }
        return -1;
    }

    public void passInWidth(int count) { //breadth first search method
        System.out.println(vertexList[count].name);
        vertexList[count].isVisited = true;
        breadthFirstSearch.insert(count);

        int vertex;

        while (!breadthFirstSearch.isEmpty()) {
            int temp = breadthFirstSearch.remove();

            while ((vertex = check(temp)) !=-1){
                System.out.println(vertexList[vertex].name);
                vertexList[vertex].isVisited = true;
                breadthFirstSearch.insert(vertex);
            }
        }
        for (int i = 0; i < count; i++) {
            vertexList[i].isVisited = false;
        }

    }

}
