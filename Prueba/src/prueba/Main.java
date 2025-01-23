package prueba;

public class Main {

    public static void main(String[] args) {
        double[][] array = new double[2][5];
        
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                array[i][j] = (int)(Math.random() * 100);
            }
        }
        
        
        System.out.println("Arreglo inicial");
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.println(array[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("\nSuma");
        for (int i = 0; i < array[0].length; i++){
            for (int j = 0; j < array[0].length; j++){
                System.out.println(array[0][i] + " + " + array[1][j] + " = " + (array[0][i] + array[1][j]));
            }
            System.out.println("");
        }
    }
    
}
