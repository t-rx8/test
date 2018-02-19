
public class part01 {

	public static void main(String[] args) {
		String name="すけさん";
		int lv = 80;
		System.out.println("魔王が"+"世界を滅ぼそうとしています");
		System.out.println(name+"はレベル"+lv+"のツワモノだ");
		System.out.println(name+"は魔王を倒しました！");
		if(lv > 50){
		  System.out.println("レベル"+ lv +"なので倒せました");
		}else{
			System.out.println("レベル"+ lv + "なので苦戦しました");
		}
		System.out.println("GAME CLEAR!");

	}

}
