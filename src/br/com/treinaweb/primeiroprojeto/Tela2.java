package br.com.treinaweb.primeiroprojeto;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Tela2 extends Activity {

  @Override
  public void onCreate(Bundle savedInstanceState){
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_tela2);

    Button btn = (Button) findViewById(R.id.buttonVoltar);
      btn.setOnClickListener(clickListener);
  }

  private OnClickListener clickListener = new OnClickListener() {

    @Override
    public void onClick(View arg0) {
      // TODO Auto-generated method stub
      finish();
    }
  };
}