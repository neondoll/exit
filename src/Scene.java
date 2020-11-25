//=======ситуация=======
public class Scene {
    Scene[] direction;
    String subject, text;

    public Scene(String subject, String text, int variants) {
        this.subject = subject;
        this.text = text;
        direction = new Scene[variants];
    }
}