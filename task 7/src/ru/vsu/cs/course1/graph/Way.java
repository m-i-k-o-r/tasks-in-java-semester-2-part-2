package ru.vsu.cs.course1.graph;

public class Way {
    private Integer point;
    private Way past;

    public Integer point(){
        return point;
    }

    public Way past(){
        return past;
    }

    public Way (Integer point, Way past){
        this.point = point;
        this.past = past;
    }

    public Way (Integer point){
        this.point = point;
        this.past = null;
    }
}
