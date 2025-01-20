package prueba;

import java.util.HashSet;
import java.util.Set;

public class Prueba {

    public static void main(String[] args) {
        Set<String> set = new HashSet();
        
        for (int i = 1; i <= 16; i++)
            set.add("Palabra" + i);
        
        System.out.print(set);
    }
    
}
