package aster.unicauca.practice_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    FragmentContactos fragContactos;
    FragmentMusica fragMusica;
    FragmentInformacion fragInformacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragContactos = new FragmentContactos();



        getSupportFragmentManager().beginTransaction().add(R.id.contenedorFragment, fragContactos).commit();
    }

    public void onClick(View view) {
        fragMusica = new FragmentMusica();
        fragInformacion = new FragmentInformacion();
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        int s = view.getId();
        int x = view.getId();
        switch (view.getId())
        {
            case R.id.cardContactos:
                transaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, fragContactos);
                break;
            case R.id.cardMusica:
                transaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, fragMusica);
                break;
            case R.id.cardInfo:
                transaction = getSupportFragmentManager().beginTransaction().replace(R.id.contenedorFragment, fragInformacion);
                break;

        }
        transaction.commit();
    }
}