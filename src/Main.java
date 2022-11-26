import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        System.out.println("****Zombies List****\n--------------------");

        Map<String, Zombie> zombieList = new HashMap<>();
        zombieList.put("A", new Zombie("Walker", 30, 20, "彼らはかつてこの地区の住人だった。"));
        zombieList.put("B", new Zombie("Boomer", 50, 90, "生存者に胆汁を浴びせることができる。"));
        zombieList.put("C", new Zombie("Tank", 100, 95, "ありとあらゆるもの…車でさえも弾き飛ばして進撃することができる。"));

        //ZombieListを一覧表示する
        for (Zombie val : zombieList.values()) {
            val.dispName();
        }

        //Boomerの情報をキーから得る
        zombieList.get("B").dispZombieInfo();


        //存在しないキーを指定して、自分で設定した例外を起こす
        try {
            if (zombieList.get("D") == null) {
                throw new NoSuchKeyException("このキーに対応するゾンビは登録されていません。");
            }
        } catch (NoSuchKeyException e) {
            System.out.println(e.getErrMsg());
        }
    }
}
