public class genshinGenerateCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] characters = {"Albedo", "Aloy", "Amber", "Itto", "Barbara", "Beidou", "Bennett", "Chongyun", "Diluc", "Diona", "Eula", "Fischl", "Ganyu", "Gorou", "Hu Tao", "Jean", "Kazuha", "Kaeya", "Ayaka", "Ayato", "Keqing", "Klee", "Sara", "Lisa", "Mona", "Ningguang", "Noelle", "Qiqi", "Raiden", "Razor", "Rosaria", "Kokomi", "Sayu", "Shenhe", "Sucrose", "Tarantula", "Thoma", "Traveler", "Venti", "Xiangling", "Xiao", "Xingqiu", "Xinyan", "Yae", "Yanfei", "Yoimiya", "Yun Jin", "Zhongli"};

		
		for(int i = 0; i < 2; i++)
		{
			int randomNum = (int) (Math.random() * 48);
			System.out.println(characters[randomNum]);
		}
	}
}
