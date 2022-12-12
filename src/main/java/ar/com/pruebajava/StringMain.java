package ar.com.pruebajava;

public class StringMain {

	public static void main(String[] args) {
		
		// La clase String

        /*  metodos/funciones:
         
            length()
            toUpperCase()
            toLowerCase()
            starstWith("")
            endsWith("")
            indexOf("")
            subString(1,5)
            trim()
            equals()
            compareTo
          */
        //clase String + nombre = "texto entre comillas dobles";
        String mensaje = "   hola mundo   "; //el tipo de dato string va entre comillas dobles
        System.out.println(mensaje.length());//nos saca la longitud del string
        
        String mensajeMay = mensaje.toUpperCase(); //nos modifica el texto todo a mayusculas
        System.out.println(mensajeMay);
        
        System.out.println(mensajeMay.trim());//nos elimina los espacios en blanco que esten demas al principio y al final
        mensajeMay = mensajeMay.trim();
        
        String otro = "HOLA mundo";
        if (mensajeMay.equals(otro)) {//nos compara la igualdad, en este caso MensajeMay con otro
        	System.out.println("verdadero!!");
        }else  {
        	System.out.println("falso");
        }
        
        if (mensajeMay.equalsIgnoreCase(otro)) {//nos compara la igualdad, ignorando mayusculas y minusculas
        	System.out.println("verdadero!!");
        }else  {
        	System.out.println("falso");
        }
        
        
	}

}
