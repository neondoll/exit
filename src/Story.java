// =======история=======
public class Story {
    private Scene start_story;
    public Scene current_scene;

    Story() {
        start_story = new Scene(
                "пробуждение",
                "Вы очнулись в незнакомом помещении\n"
                        + "Перед вами 3 двери с номерами: 1, 2 и 3\n"
                        + "Над дверями написано \"Дверь из которой можно выбраться - не крайняя\"\n"
                        + "В какую дверь пойдете?\n"
                        + "(1)левая дверь\n"
                        + "(2)средняя дверь\n"
                        + "(3)правая дверь",
                3);
        start_story.direction[0] = new Scene(
                "Game over",
                "Вы прошли в пропасть...",
                0);
        start_story.direction[1] = new Scene(
                "следующая комната",
                "Вы в следующей комнате\n"
                        + "Выход отсюда возможен через 2 двери\n"
                        + "Дверь справа под номером 1, дверь слева под номером 2\n"
                        + "Над дверью слева написано \"Выход в двери под номером 2\"\n"
                        + "В какую дверь пойдете?\n"
                        + "(1)левая дверь\n"
                        + "(2)правая дверь",
                2);
        start_story.direction[1].direction[0] = new Scene(
                "Выход",
                "Вы на улице!",
                0);
        start_story.direction[1].direction[1] = new Scene(
                "Game over",
                "Вы смело открыли правую дверь. Но за ней вас подстерегала гигантская подземная жаба, которая проглотила вас целиком!",
                0);
        start_story.direction[2] = new Scene(
                "Game over",
                "Пройдя в эту дверь, она захлопнулась. Выхода нет.",
                0);
        current_scene = start_story;
    }

    public void go(int num) {
        if (num <= current_scene.direction.length)
            current_scene = current_scene.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из " + current_scene.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_scene.direction.length == 0;
    }
}