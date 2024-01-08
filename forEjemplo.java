public class forEjemplo {
    public static void main(String[] args) {
        int[] numeros={2, 5, 8, 10, 3};
        int suma = 0;
        int longitudArray = numeros.length;
        System.out.println("La longitud del arreglo es: " + longitudArray);


        //saber la posicion
        //for (int i = 0; i < longitudArray; i=i+1) {
            // System.out.println("i vale: " + i); 
             //System.out.println("El valor en la posicion " + i + " vale: " + numeros[i]);  
        //}  


        // avanza cada dos
        //for (int i = 0; i < longitudArray; i = i + 2){
            //System.out.println("El valor en la posicion " + i + " vale: " + numeros[i]);
        //}

        for (int i = 2; i < longitudArray; i = i + 2){
            System.out.println("El valor en la posicion " + i + " vale: " + numeros[i]);
        }
    }
}
