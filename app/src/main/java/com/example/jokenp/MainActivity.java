package com.example.jokenp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionadoPedra (View view){
       this.opcaoSelecionada("pedra");
    }
    public void selecionadoPapel (View view){
        this.opcaoSelecionada("papel");
    }
    public void selecionadoTesoura (View view){
        this.opcaoSelecionada("tesoura");
    }
    public void opcaoSelecionada (String opcaoSelecioanda){
        ImageView imageResultado = findViewById(R.id.imageResultado);
        int numero = new Random().nextInt(3);
        String [] opcoes = {"pedra", "papel", "tesoura"};
        String opcaoApp = opcoes [numero];
        switch (opcaoApp){
            case "pedra" :
                imageResultado.setImageResource(R.drawable.pedra);
                break;
            case "papel" :
                imageResultado.setImageResource(R.drawable.papel);
                break;
            case "tesoura" :
                imageResultado.setImageResource(R.drawable.tesoura);
                break;
        }
        System.out.println( "Item Selecioanado" + numero );

    }
}