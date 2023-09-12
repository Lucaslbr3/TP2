/**
 *
 * @author estudiante
 */
import java.util.ArrayList;
public class Principal {
    public static void main(String[] args) {
    	int x;
    	float f;
    	double d;
    	String c;
        ArrayList<Float> vector = new ArrayList<Float>();
   	vector.add(3.4f); 
   	vector.add(3.5f); 
   	vector.add(3.6f); 
   	vector.add(3.8f); 
    	x=3;
    	f=3.4f;
    	d=3.4d;
    	c="hola";
   	 
    	System.out.println(+x);
    	System.out.println(+f);
    	System.out.println(+d);
    	System.out.println(c);
        for(float h: vector){
            System.out.println(h);
        }
    	
   	 
	}


}
