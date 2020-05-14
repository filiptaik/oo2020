package game;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        Menu menu = new Menu();

        GameObject[] objects = new GameObject[2];
        objects[0] = player;
        objects[1] = menu;


        for(GameObject obj : objects){
            obj.draw();
        }
    }
}
