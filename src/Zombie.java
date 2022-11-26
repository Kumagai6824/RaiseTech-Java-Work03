public class Zombie {
    //フィールド
    private final String name;
    private final int health;
    private final int strength;
    private final String feature;
    
    //コンストラクター
    public Zombie(String name, int health, int strength, String feature) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.feature = feature;
    }

    //ゾンビ名だけ表示させるメソッド
    public void dispName() {
        System.out.println("[" + name + "]");
        System.out.println("-------------------");
    }

    //ゾンビの詳細情報を表示させるメソッド
    public void dispZombieInfo() {
        System.out.println("[" + name + "]\n\r\sHealth:" + health + "\n\r\sStrength:" + strength + "\n\r\sFeature:" + feature);
        System.out.println("-------------------");
    }

}
