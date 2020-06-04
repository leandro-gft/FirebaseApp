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
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import br.com.gft.firebaseapp.R;
import br.com.gft.firebaseapp.model.Usuario;

public class MainActivity extends AppCompatActivity {


    private DatabaseReference referencia = FirebaseDatabase.getInstance().getReference();
    private FirebaseAuth usuario = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Utilização de filtros
        DatabaseReference usuarios = referencia.child("usuarios");

        //pelo id
//        DatabaseReference usuarioPesquisa = usuarios.child("-M90G8K5pcizRP8bsqYh");

        //pelo nome
//        Query usuarioPesquisa = usuarios.orderByChild("nome").equalTo("Ana");

        //filtrar primeiros ou os ultimos
//        Query usuarioPesquisa = usuarios.orderByKey().limitToFirst(2);
//        Query usuarioPesquisa = usuarios.orderByKey().limitToLast(3);

        //entre dois valores
//        Query usuarioPesquisa = usuarios.orderByChild("idade").startAt(20).endAt(50);

        //filtrar palavras
        Query usuarioPesquisa = usuarios.orderByChild("nome").startAt("A").endAt("A"+"\uf8ff");


        usuarioPesquisa.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                Log.i("Dados usuario", dataSnapshot.getValue().toString());

//                Usuario dadosUsuario = dataSnapshot.getValue(Usuario.class);
//                Log.i("Dados usuario", "nome: " +dadosUsuario.getNome()+
//                        " idade: "+ dadosUsuario.getIdade());
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        //Gera identificador unico
//        DatabaseReference usuarios = referencia.child("usuarios").push();
//        Usuario u1 = new Usuario("Ana","Paula",10);
//        Usuario u2 = new Usuario("Beatriz","Santos",20);
//        Usuario u3 = new Usuario("Carlos","Silva",30);
//        Usuario u4 = new Usuario("Daniel","Oliveira",40);
//        Usuario u5 = new Usuario("Eduardo","Matos",50);
//        Usuario u6 = new Usuario("Felipe","Lima",60);
//        Usuario u7 = new Usuario("Gabriela","Azevedo",70);
//
//        usuarios.setValue(u7);



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
//        if (usuario.getCurrentUser() != null){
//            Log.i("CurrentUser", "Usuario logado");
//        } else {
//            Log.i("CurrentUser", "Usuario não logado");
//        }

    }
}
