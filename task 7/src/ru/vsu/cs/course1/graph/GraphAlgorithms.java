package ru.vsu.cs.course1.graph;

import java.util.*;
import java.util.function.Consumer;

public class GraphAlgorithms {

    /**
     * Поиск в ширину, реализованный с помощью очереди
     * (начальная вершина также включена)
     * @param graph граф
     * @param from Вершина, с которой начинается поиск
     */

    public static Way bfs(Graph graph, int[] arrExceptions, int from, int before) {
        boolean[] visited = new boolean[graph.vertexCount()];
        Queue<Way> queue = new LinkedList<Way>();
        queue.add(new Way(from));
        visited[from] = true;

        for(int i = 0; i < arrExceptions.length; i++){
            visited[arrExceptions[i]] = true;
        }
        while (queue.size() > 0) {
            Way curr = queue.remove();
            if(curr.point() != before) {
                for (Integer v : graph.adjacencies(curr.point())) {
                    if (!visited[v]) {
                        queue.add(new Way(v, curr));
                        visited[v] = true;
                    }
                }
            } else {
                return curr;
            }
        }
        return null;
    }
}
