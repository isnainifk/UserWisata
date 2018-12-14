package com.example.windows10.userwisata;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.util.SortedList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.example.windows10.userwisata.Model.GetWisata;
import com.example.windows10.userwisata.Model.Wisata;
import com.example.windows10.userwisata.Rest.ApiClient;
import com.example.windows10.userwisata.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

public class LayarListWisata extends AppCompatActivity

{
    private RecyclerView mRecyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager mLayoutManager;
    Context mContext;
    ApiInterface mApiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layar_list_wisata);

        mContext = getApplicationContext();
        mRecyclerView = (RecyclerView) findViewById(R.id.list_data_wisata);
//        WisataAdapter wisataAdapter = new WisataAdapter(this, Wisata);
        mLayoutManager = new LinearLayoutManager(mContext);
        mRecyclerView.setLayoutManager(mLayoutManager);
//        final WisataAdapter wisataAdapter = new WisataAdapter(this, Wisata);
//        mRecyclerView.setAdapter(mAdapter);


//        mRecyclerView.setOnLongClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Wisata wisata = Wisata[position];
//                Wisata.toggleFavorite();
//
//                // This tells the GridView to redraw itself
//                // in turn calling your MovieAdapter's getView method again for each cell
//                mAdapter.notifyDataSetChanged();
//            }
//        });

        dapatkanData();
    }

    private void dapatkanData() {
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        Call<GetWisata> mWisataCall = mApiInterface.getWisata();
        mWisataCall.enqueue(new SortedList.Callback<GetWisata>() {
            @Override
            public void onResponse(Call<GetWisata> call, Response<GetWisata> response) {
                Log.d("GetWisata",String.valueOf(response.body().getResult()));
                List<Wisata> listWisata = response.body().getResult();
                mAdapter = new WisataAdapter(listWisata, LayarListWisata.this);
                mRecyclerView.setAdapter(mAdapter);
            }
            @Override
            public void onFailure(Call<GetWisata> call, Throwable  t) {
                Log.d("Get Wisata",t.getMessage());
            }
        });
    }
}
