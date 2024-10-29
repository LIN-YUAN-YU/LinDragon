
public class Main {
    public static void main(String[] args) {
        person thunder = new thunder("雷系", 2, 10);
        person water = new water("水系", 2, 10);
        person rock = new person("岩系", 2, 20);
        int down = 0;
        while(down < 2){
            thunder.attack(water);
            water.attack(rock);
            rock.attack(thunder);
            if (thunder.hp <= 0 || water.hp <= 0 || rock.hp <= 0){
                down += 1;
            }
        }
        thunder.win(water,rock);
    }
}