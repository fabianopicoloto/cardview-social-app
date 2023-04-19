package com.example.cardviewsocialapp.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardviewsocialapp.R;
import com.example.cardviewsocialapp.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);
        //Definir Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);
        //Definir Adapter
        this.criarPostagens();
        PostagemAdapter adapter = new PostagemAdapter(postagens);
        recyclerPostagem.setAdapter(adapter);

    }
    public void criarPostagens() {
        Postagem postagem = new Postagem("Fabiano Picoloto", "#tbt #viagem", R.drawable.img_1);
        this.postagens.add(postagem);
        postagem = new Postagem("Lucas Tafael", "#urban #industrial", R.drawable.img_2);
        this.postagens.add(postagem);
        postagem = new Postagem("Gleisson Dias", "#natureza", R.drawable.img_3);
        this.postagens.add(postagem);
        postagem = new Postagem("Letícia Raquel", "Que foto linda!", R.drawable.img_4);
        this.postagens.add(postagem);
    }

}