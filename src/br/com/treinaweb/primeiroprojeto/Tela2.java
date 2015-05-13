package br.com.treinaweb.primeiroprojeto;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Tela2 extends Activity {

	public void onCreate(Bundle savedInstanceState){
		  super.onCreate(savedInstanceState);
		  setContentView(R.layout.activity_tela2);

		  Intent intent = getIntent();
		  Bundle args = intent.getExtras();

		  String nome = args.getString("nome");

		  TextView viewNome = (TextView) findViewById(R.id.textViewAluno);
		  viewNome.setText("Aluno:" + nome);

		  Button btnVoltar = (Button) findViewById(R.id.buttonVoltar);
		  btnVoltar.setOnClickListener(clickListener);
		}

  private OnClickListener clickListener = new OnClickListener() {

    @Override
    public void onClick(View arg0) {
      // TODO Auto-generated method stub
      finish();
    }
  };
}