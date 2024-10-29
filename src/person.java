public class person {
    String name;
    int hit;
    int hp;

    public person(String name, int hit, int hp) {
        this.name = name;
        this.hit = hit;
        this.hp = hp;
    }

    public void attack(person enemy) {
        enemy.hp -= this.hit;
        System.out.println(this.name + "攻擊" + enemy.name + this.hit);
        System.out.println(this.name + this.hp + enemy.name + enemy.hp);
        System.out.println();
    }

    public void win(person loser1,person loser2) {
        if (this.hp >= 0) {
            System.out.println(this.name + "win");
        } else if (loser1.hp >= 0) {
            System.out.println(loser1.name + "win");
        } else if (loser2.hp >= 0) {
            System.out.println(loser2.name + "win");
        }
    }
}
