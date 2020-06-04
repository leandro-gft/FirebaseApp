package br.com.gft.firebaseapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import br.com.gft.firebaseapp.R;
import br.com.gft.firebaseapp.model.Produto;
import br.com.gft.firebaseapp.model.Usuario;

public class MainActivity extends AppCompatActivity {


    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        referencia.child("usuarios").child("003").child("nome").setValue("Claudia");
//        referencia.child("usuarios").child("003").child("sobrenome").setValue("Sacchi");

//        DatabaseReference usuarios = referencia.child("usuarios");
//        usuarios.child("004").child("nome").setValue("Jamilton");
//        usuarios.child("004").child("sobrenome").setValue("Damasceno");

//        DatabaseReference usuarios = referencia.child("usuarios");
//        Usuario usuario = new Usuario("Jamilton","Damasceno",30);
//        usuarios.child("004").setValue(usuario);

        DatabaseReference produtos = referencia.child("produtos");
        Produto produto = new Produto("Notebook i7 1TB 8GB", "Asus", 2500.00);
        produtos.child("003").setValue(produto);
    }
}
