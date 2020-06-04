package br.com.gft.firebaseapp.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import br.com.gft.firebaseapp.R;

public class MainActivity extends AppCompatActivity {


//    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    private FirebaseAuth usuario = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Salvando e atualizando dados
//        referencia.child("usuarios").child("003").child("nome").setValue("Claudia");
//        referencia.child("usuarios").child("003").child("sobrenome").setValue("Sacchi");

//        DatabaseReference usuarios = referencia.child("usuarios");
//        usuarios.child("004").child("nome").setValue("Jamilton");
//        usuarios.child("004").child("sobrenome").setValue("Damasceno");

//        DatabaseReference usuarios = referencia.child("usuarios");
//        Usuario usuario = new Usuario("Jamilton","Damasceno",30);
//        usuarios.child("004").setValue(usuario);

//        DatabaseReference produtos = referencia.child("produtos");
//        Produto produto = new Produto("Notebook i7 1TB 8GB", "Asus", 2500.00);
//        produtos.child("003").setValue(produto);

        //Recuperando dados
    //        DatabaseReference usuarios = referencia.child("usuarios").child("001");
    //        usuarios.addValueEventListener(new ValueEventListener() {
    //            @Override
    //            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
    //                Log.i("FIREBASE", dataSnapshot.getValue().toString());
    //            }
    //
    //            @Override
    //            public void onCancelled(@NonNull DatabaseError databaseError) {
    //
    //            }
    //        });

        //Cadastro de usuarios
//        usuario.createUserWithEmailAndPassword("lpsacchi@gmail.com", "123456").
//                addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()){
//                            Log.i("CreateUser", "Sucesso ao cadastrar usuario");
//                        }else{
//                            Log.i("CreateUser", "Erro ao cadastrar usuario");
//                        }
//                    }
//                });


        //Desloga o usuario
//        usuario.signOut();

        //Loga o usuario
//        usuario.signInWithEmailAndPassword("lpsacchi@gmail.com", "123456").
//                addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//            @Override
//            public void onComplete(@NonNull Task<AuthResult> task) {
//                if (task.isSuccessful()){
//                    Log.i("signIn", "Usuario logado com sucesso");
//                } else {
//                    Log.i("signIn", "Erro ao logar o usuário");
//                }
//            }
//        });

        //Verifica usuario logado
        if (usuario.getCurrentUser() != null){
            Log.i("CurrentUser", "Usuario logado");
        } else {
            Log.i("CurrentUser", "Usuario não logado");
        }

    }
}
