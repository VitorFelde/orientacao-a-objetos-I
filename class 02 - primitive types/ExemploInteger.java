public class ExemploInteger {
	public static void main (String args []){
			String s1 = "10";
			System.out.println ("s1 = " + s1);
			
			//converter de String pra int
			int i1 = Integer.parseInt(s1);
			System.out.println ("i1 = " + i1);
			
			//converter de Integer/int para String
			Integer i2 = 5;
			s1 = i2.toString();//esse funciona
			s1 = Integer.toString(i2);//esse funciona
			int x = 2;
			// s1 = x.toString(); --- nao funciona pois é int (tipo primitivo)
			s1 = Integer.toString(x);//esse funciona
			
			//converter de Integer para float
			float f1 = i2.floatValue() / 3;
			System.out.println ("f1 = " + f1);
			System.out.println ("f1 = " + String.format("%.02f", f1));
			
			
			//float f2 = Integer.floatValue(x)/5;
			//System.out.println ("f2 = " + f2);
	
			//comparações
			Integer i3 = 3;
			int i4 = 3;
			System.out.println (i3 == i4); //retornar boolean
			System.out.println (i3.equals(i4));//retornar boolean
	
	
	}
}
