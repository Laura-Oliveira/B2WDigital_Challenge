package Control;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pokemon.R;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ListPokemonRestfulActivity extends AppCompatActivity
{
    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pokemon_restful);

        retrofit = new Retrofit.Builder()
                .baseUrl("https://pokeapi.co/api/v2/")
                .addConverterFactory(GsonConverterFactory.create()).build();

        getPokemonData();
    }

    private void getPokemonData()
    {
    }
}