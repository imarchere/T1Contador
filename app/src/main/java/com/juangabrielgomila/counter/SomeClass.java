package com.juangabrielgomila.counter; /** Se nombra a la paquetería */

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by JuanGabriel on 6/11/17.
 */

public class SomeClass { /** Se inicia la clase principal y se nombra, esta es la principal forma de organización de los ficheros de código */

    int day; /** Declaramos una variable tipo Int (Entero) llamada "day" */


    public void aMethod(){ /** El método público se ejecuta pero no devuelve ningún tipo de dato, utilizaremos el valor ‘void’ (vacío) para el tipo de dato a devolver. */

        final String stringNice = "S"; /** Localiza Cadenas en la vista */

        class AnonymousClass{ /** Se crea una clase independiente*/
            int holaQueAse; /** Se declara una variable del tipo Int */

            public AnonymousClass(){ /** Se determina qué la clase será Pública */

            }

            private void sayHello(){ /** Se inicializa un nuevo método */
                Log.i("HOLA", "sayHello: "+stringNice+holaQueAse+day); /** Envía un "INFO", mensaje de registro. */

            }

        }



    }




    public class InnerClass{ /** Inicializa la clase */
        int age; /** Declara varriable Age */
        String name; /** Age será tipo Cadena */

        public InnerClass(){

        }

        public int addOne(){ /** Se regresará el valor dado con +1 de resultado */
            return age+1;
        }

        public void innerMethod(){
            day = day+1;
        }
    }


}



/*public class OtherClass{

}*/