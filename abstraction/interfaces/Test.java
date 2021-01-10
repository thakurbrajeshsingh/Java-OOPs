package smartProgramming.abstraction.interfaces;

public class Test implements I1 {
public void show() {
	System.out.println("Interface 1");
	}

public void display(){
	System.out.println("hello");
}

public static void main(String[] arg) {
	Test t=new Test();
	t.show();             //objects of interfaces not be created
	t.display();
	}
}
