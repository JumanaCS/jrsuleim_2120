// HW3 Jumana Suleiman 

import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;


public class AdventureSer{

	// saves game 
	public static void Save(Dungeon i){
		try{
			FileOutputStream fO = new FileOutputStream(name: "SaveGame.dat");
			ObjectOutputStream o = new ObjectOutputStream(fO);
			o.writeObject(i);
			fO.close()
			o.close(); 
		}

		// exceptions
		catch(Exception e){
			System.out.print("fail");
			e.printStackTrace();
		}
	}

	// loads in saved game
	public static Dungeon Load(String file){
		try{
			FileInputStream fI = new FileInputStream(name: "SaveGame.dat");
			ObjectInputStream in = new ObjectInputStream(fI);
			Dungeon save = (Dungeon) in.readObject();
			fI.close();
			in.close();

			return save;
		}
		// exceptions
		catch(Exception e){
			e.printStackTrace();
		}
	}
	
}
