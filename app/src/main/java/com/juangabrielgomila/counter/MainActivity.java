package com.juangabrielgomila.counter; /** Nobre asignado al paquete en AS */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener { /** Se hereda de la clase principal, conservando ciertos atributos*/

    //Variable para sostener el valor entero que vamos a mostrar
    private int value = 0;

    //Variables para los 6 botones y la text view
    private TextView textView;
    private Button btnAdd, btnTake, btnGrow, btnShrink, btnHide, btnReset;



    @Override /** Indica que una declaración de método está destinada a anular una declaración de método en un supertipo. */
    protected void onCreate(Bundle savedInstanceState) { /** Se llama cuando se crea por primera vez la actividad. Aquí es donde se debe hacer toda la configuración estática normal: crear vistas, vincular datos a listas, etc. */
        super.onCreate(savedInstanceState); /** Cuando anulamos un método, tenemos la opción de reemplazar completamente el método en nuestra clase, o de extender el método existente de la clase padre. Al llamar super.onCreate(savedInstanceState);, le dice a la VM Dalvik que ejecute su código además del código existente en onCreate () de la clase padre. Si omite esta línea, solo se ejecuta su código . El código existente se ignora por completo. */
        setContentView(R.layout.activity_main); /** Se usa con un recurso de diseño que define su UI*/

        textView = (TextView) findViewById(R.id.text_view); /** Muestra texto al usuario y, opcionalmente, le permite editarlo mediante programación. */

        btnAdd = (Button) findViewById(R.id.btnAdd); /**Se llama al objeto reconociendolo por su id antes asignado. */
        btnTake = (Button) findViewById(R.id.btnTake); /**Se llama al objeto reconociendolo por su id antes asignado. */
        btnGrow = (Button) findViewById(R.id.btnGrow); /**Se llama al objeto reconociendolo por su id antes asignado. */
        btnShrink = (Button) findViewById(R.id.btnShrink); /**Se llama al objeto reconociendolo por su id antes asignado. */
        btnHide = (Button) findViewById(R.id.btnHide); /**Se llama al objeto reconociendolo por su id antes asignado. */
        btnReset = (Button) findViewById(R.id.btnReset); /**Se llama al objeto reconociendolo por su id antes asignado. */

        btnAdd.setOnClickListener(this); /** El sistema ejecuta el código en el que escribe onClick(View)después de que el usuario presiona el botón. */
        btnTake.setOnClickListener(this); /** Registra una devolución de llamada que se invocará cuando se haga clic y se mantenga presionada esta vista. En esta vista se puede hacer clic cuantas veces se desee. */
        btnGrow.setOnClickListener(this); /** Registra una devolución de llamada que se invocará cuando se haga clic y se mantenga presionada esta vista. En esta vista se puede hacer clic cuantas veces se desee. */
        btnShrink.setOnClickListener(this); /** Registra una devolución de llamada que se invocará cuando se haga clic y se mantenga presionada esta vista. En esta vista se puede hacer clic cuantas veces se desee. */
        btnHide.setOnClickListener(this); /** Registra una devolución de llamada que se invocará cuando se haga clic y se mantenga presionada esta vista. En esta vista se puede hacer clic cuantas veces se desee. */
        btnReset.setOnClickListener(this); /** Registra una devolución de llamada que se invocará cuando se haga clic y se mantenga presionada esta vista. En esta vista se puede hacer clic cuantas veces se desee. */

    }

    @Override /** Indica que una declaración de método está destinada a anular una declaración de método en un supertipo. */
    public void onClick(View view) { /** Este método se llama cuando el usuario toca el elemento (en el modo táctil), o selecciona el elemento con las teclas de navegación o la bola de seguimiento y presiona la tecla “Entrar” adecuada o la bola de seguimiento.*/
        Log.i("Main Activity", "onClick: "+view.getId());

        float scale;

        switch (view.getId()){
            case R.id.btnAdd:
                value++;
                textView.setText(""+value);
                break;

            case R.id.btnTake:
                value--;
                textView.setText(""+value);
                break;

            case R.id.btnReset:
                value = 0;
                textView.setText(""+value);
                break;


            case R.id.btnGrow:
                scale = textView.getTextScaleX();
                scale = scale +1;
                textView.setTextScaleX(scale);
                break;


            case R.id.btnShrink:
                scale = textView.getTextScaleX();
                scale = scale -1;
                textView.setTextScaleX(scale);
                break;


            case R.id.btnHide:
                if (textView.getVisibility() == View.VISIBLE){
                    /**En este caso, la vista está visible y debe ocultarla....*/
                    textView.setVisibility(View.INVISIBLE);
                    btnHide.setText("Mostrar");
                }else {
                    /**En este caso, la vista está invisible, ahora debe mostrarla...*/
                    textView.setVisibility(View.VISIBLE);
                    btnHide.setText("Ocultar");
                }
                break;
        }
    }
}
