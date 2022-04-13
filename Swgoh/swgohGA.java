public class swgohGA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String charList[] = {"Kenobi", "Grievous", "Veers", "Piett", "Starck", "Dark Trooper", "Range Trooper", "JML", "Gas", "Vader", "CLS", "JKL", "JTR", "Chewie", "R2", "Fives", "3po", "Raid Han", "JKA", "Chewpio", "Nest", "JKR", "Mothma", "Hoda", "Drevan", "Malak", "B1", "Wampa", "Bossk", "Old Ben", "Dbastila", "Padme", "Lando", "Rex", "Traya", "Rolo", "Wedge", "Leia", "Arc", "Thrawn", "Biggs", "Magna", "Hk", "Cholo", "Shaak", "Droideka", "LS Bastila", "Ahsoka", "Greef", "Pao", "Echo", "Sion", "B2", "Yoda", "Palp", "Mando", "Jolee", "BB8", "Asajj", "Nihilus", "Sith Empire Trooper", "Res Hero Finn", "Res Hero Poe", "Nute", "Alpha", "Baze", "Chirrut", "Tarkin", "Kru", "Jango", "Boba", "Ackbar", "Chirpa", "Mission", "Hoth Scout", "Dooku", "Jyn", "Bad Finn", "Sun Fac", "Ig88", "Geo Spy", "Cassian", "Wat", "Wicket", "Paploo", "Zaalbar", "Canderous", "Carth", "Juhani", "K2", "Elder", "Dengar", "Ezra", "Embo", "Plo Koon", "Maul", "STH", "Armorer", "Poggle", "Chopper", "Sabine", "Cara", "Mace", "Geo Soldier", "Teebo", "Res Trooper", "Phasma", "Kylo", "Scav Rey", "Zeb", "Hera", "Kanan", "FOO", "FOTP", "Kuiil", "Vet Han", "Royal Guard", "TFP", "Bad Poe", "Vet Chewie", "Farmboy", "Res Pilot"};
		//String charList[] = {"Aayla Secura","Admiral Ackbar","Admiral Piett","Ahsoka Tano","Fulcrum","Holdo","Arc","Asajj Ventress","Aurra","B1","B2 Super Battle Droid","Barriss Offee","Bastila","DBastila","Baze","BB-8","Biggs Darklighter","Bistan","Bo kapoop","Boba Fett","Bodhi","Bossk","3po","Cad Bane","Canderous","Cholo","Phasma","Cara","Carth","Cassian","Cody","Chewie","Chirpa","Chief Nebit","Chirrut","Chopper","Clone Sergeant","CW chewie","Starck","CAT","CLS","CUP","Dooku","CT-21-0408Echo","CT-5555Fives","CT-7567Rex","Dark Trooper","Malak","Darth Maul","Better Maul","Nihilus","Drevan","Darth Sidious","Sion","Traya","Darth Vader","Dathcha","Death Trooper","Dengar","Krennic","Droideka","Good Batch Echo","Eeth Koth","Embo","Palp","Nest","Ewok Elder","Ewok Scout","Ezra Bridger","Fennec Shand","Finn","First Order Executioner","First Order Officer","FOSFTPFOSPFOPFSOFP","First Order Stormtrooper","First Order TIE Pilot","Gamorrean Guard","Gar Suxon","Garazeb Zeb Orrelios","General Grievous","Hux","General Kenobi","GAS","General Veers","Alpha","Geonosian Soldier","Geo spy","Grand Admiral Thrawn","Grand Master Yoda","Grand Moff Tarkin","Greedo","Greef","Raid Han","Hera","Hoda","HK-47","Hoth Rebel Scout","Hoth Rebel Soldier","Good Batch Hunter","IG-100 MagnaGuard","IG 11","IG-86 Sentinel Droid","IG-88","Ima-Gun Di","IPD","Imperial Super Commandpoop","Jango","Jawa Engineer","Jawa","Jawa Scavenger","Jedi Consular","Jedi Knight Anakin","Jedi Knight Guardian","JKL","JKR","JMK","JML","Jolee","Juhani","Jyn","K2","Kanan Jarrus","KAM","Kit Fisto","Kuiil","Kylo Ren","KRU","L3","Lando Calrissian","Lobot","Logray","Lord Vader","Luke Skywalker (Farmboy)","Luminara Unduli","Mace Windu","Magmatrooper","Mission","Mob Enforcer","Gideon","Mothma","Talzan","Nightsister Acolyte","Nightsister Initiate","Nightsister Spirit","Zombie","Nute Gunray","Obi-Wan Kenobi (Old Ben)","Old Daka","Omega","Padme","Pao","Paploo","Plo Koon","Poe Dameron","Poggle the Lesser","Princess Leia","Qi'ra","Qui-Gon Jinn","R2-D2","Range Pooper","Rolo","Res hero Finn","Res hero Poe","Resistance Pilot","Resistance Trooper","GL Rey","Rey (Jedi Training)","Rey (Scavenger)","Rose","Royal Guard","Sabine Wren","Savage Opress","Scarif Rebel Pathpooper","Shaak","Shorepooper","Sith Assassin","Sith Empire Pooper","SEE","Sith Marauder","Red sith pooper","Snowtrooper","Stormpooper","Stormtrooper Han","Sun Fac","SLKR","T3","Talia","Good Batch Tech","Teebo","Armorer","Good Mando","Bad Mando","Chewpio","Tie Fighter Pooplot","Tusken Raider","Tusken Shaman","Ugnaught","URoRRuR'R'R","Vandor","Veteran Smuggler Chewbacca","Veteran Smuggler Han Solo","Visas Poop","Wampoop","Wat Tampoop","Wedge Antilles","Wicket","Good batch Wrecker","Young Han poop","Young Lando poop","Zaalbar","Zam Wesell"};
		
		int input = 33;
		
		int countList[] = new int[input];
		
		for(int i = 0; i < countList.length; i++)
		{
			countList[i] = -1;
		}
		
		boolean dupe = false;
		
		while(input != 0)
		{
			int temp = (int) (Math.random() * charList.length);
			
			for(int i = 0; i < countList.length; i++)
			{
				if(countList[i] == temp)
				{
					dupe = true;
				}
			}
			
			if(dupe == false)
			{
				countList[input - 1] = temp;
				input--;
			}
			
			dupe = false;
		}
		
		for(int i= 0; i < countList.length; i++)
		{
			System.out.println(charList[countList[i]]);
		}
		
	}

}
