import java.util.Scanner;

//=======игра=======
public class Game {
    public static Story story;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Добро пожаловать в квест \"Выход\".");
        story = new Story();
        while (true) {
            System.out.println("=============" + story.current_scene.subject + "==============");
            System.out.println(story.current_scene.text);
            if (story.isEnd()) {
                System.out.println("====================the end!===================");
                return;
            }
            story.go(in.nextInt());
        }
    }
}