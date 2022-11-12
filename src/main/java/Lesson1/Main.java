package Lesson1;

public class Main {
    public static void main(String[] args) {

            Course c = new Course(new Obstacles[] {
                    new Cross(5),
                    new Wall(3),
                    new Swimming(7)
            }); // Создаем полосу препятствий
            Team team = new Team("Чемпион",
                    new Cat("Gav", 10, 12, 0),
                    new Dog("Jordan", 20, 5, 15),
                    new Cat("Miu", 9, 14, 0),
                    new Human("Balu", 50, 50, 50));  // Создаем команду
            team.getTeamInfo();

            c.doIt(team);               // Просим команду пройти полосу
            team.showResults();         // Показываем результаты


    }
}
