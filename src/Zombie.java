public class Zombie {
    //フィールド
    private final String name;
    private final int health;
    private final int strength;
    private final String feature;

    //コンストラクター
    public Zombie(String name, int health, int strength, String feature){
        this.name=name;
        this.health=health;
        this.strength =strength;
        this.feature = feature;
    }

    //ゲッター
    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getStrength() {
        return this.strength;
    }

    public String getFeature() {
        return this.feature;
    }

    //ゾンビ名だけ表示させるメソッド
    public void dispName(){
        System.out.println("["+getName()+"]");
        System.out.println("-------------------");
    }

    //ゾンビの詳細情報を表示させるメソッド
    public void dispZombieInfo(){
        System.out.println("["+getName()+"]\n\r\sHealth:"+getHealth()+"\n\r\sStrength:"+getStrength()+"\n\r\sFeature:"+getFeature());
        System.out.println("-------------------");
    }

}
