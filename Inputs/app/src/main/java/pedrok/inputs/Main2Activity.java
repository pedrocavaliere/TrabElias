package pedrok.inputs;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {

    private Button botaoDialog;
    private AlertDialog.Builder dialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoDialog = (Button) findViewById(R.id.botao_id1);


        botaoDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog = new AlertDialog.Builder(Main2Activity.this);
                dialog.setTitle("PIKA");
                dialog.setMessage("Escolhe ai menó");

                dialog.setNegativeButton("Não",
                        new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                Toast.makeText(getApplicationContext(), "Apertou não", Toast.LENGTH_SHORT).show();
                            }
                        });
                dialog.setPositiveButton("Sim",
                        new DialogInterface.OnClickListener(){
                            @Override
                            public void onClick(DialogInterface dialog, int which){
                                Toast.makeText(getApplicationContext(), "Apertou sim", Toast.LENGTH_SHORT).show();
                            }
                        });
                dialog.create();
                dialog.show();

            }
        });




    }
}
