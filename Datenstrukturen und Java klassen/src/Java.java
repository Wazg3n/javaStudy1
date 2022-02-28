
public class Java {
	public static void main (String[] args) {

Kunde k1 = new Kunde("Steffi" , "Weber");
Kunde k2 = k1;
Kunde k3 = new Kunde("Steffi" , "Weber");
System.out.println(k1 == k2);
System.out.println(k1 == k3);
	}
}
