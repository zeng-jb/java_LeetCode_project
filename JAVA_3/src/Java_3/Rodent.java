package Java_3;

class Rodent0{
	public String name="Rodent";
	public void show() {
		System.out.println(name);
	}
}

class Mouse extends Rodent0{
	public String hisname="Mouse";
	public Mouse(){
		super.name=hisname;
	}
	
	public void show() {
		System.out.println(hisname);
	}
}

class Gerbil extends Rodent0{
	public String hisname="Gerbil";
	public Gerbil(){
		super.name=hisname;
	}
	
	public void show() {
		System.out.println(hisname);
	}
}

class Hamster extends Rodent0{
	public String hisname="Hamster";
	public Hamster(){
		super.name=hisname;
	}
	
	public void show() {
		System.out.println(hisname);
	}
}

public class Rodent {

	public static void main(String argc[]) {
	
		Rodent0 Mouse=new Mouse();
		Mouse.show();
		
		Rodent0 Gerbil=new Gerbil();
		Gerbil.show();
		
		Rodent0 Hamster=new Hamster();
		Hamster.show();
		
		Rodent0[] Rodent=new Rodent0[3];
		for(int i=0;i<3;i++) {
			Rodent[i]=new Rodent0();
			Rodent[i].name="name"+i;
			//System.out.println(Rodent[i].name);
			Rodent[i].show();
		}
}
}
