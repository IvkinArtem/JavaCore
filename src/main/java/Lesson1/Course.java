package Lesson1;

public class Course {
    private Obstacles obstacles[];

    public Course(Obstacles ... obstacles) {
        this.obstacles = obstacles;
    }
    public void doIt(Team team){
        for (Obstacles obstacles : obstacles) {
            team.doIt(obstacles);
            //obstacle.doIt(team);
        }
    }
}