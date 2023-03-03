package com.mycode.newapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements RecycleViewAdapter.OnPlayerListener {

    RecycleViewAdapter recycle_adapter;
    RecyclerView RV;
    ArrayList <TransferMarket>transferMarketList=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RV=findViewById(R.id.Rec_view1);
        recycle_adapter=new RecycleViewAdapter(transferMarketList,this);
        RecyclerView.LayoutManager myLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        RV.setLayoutManager(myLayoutManager);
        RV.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.HORIZONTAL));
        RV.setAdapter(recycle_adapter);
        insertData();
    }
    void insertData(){
        int image=R.drawable.salah_icon;
        int c_logo=R.drawable.liv;
        int flag=R.drawable.egy;
        int icon=R.drawable.salah_run;
        String info= getString(R.string.salah_info);
        String name=getString(R.string.salah_name);
        String value=getString(R.string.salah_value);
        String position=getString(R.string.rw);
        String nation=getString(R.string.egypt);
        String club=getString(R.string.liverpool);
        String age=getString(R.string.salah_age);
        TransferMarket transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.messi_icon;
        c_logo=R.drawable.paris;
        flag=R.drawable.arg;
        icon=R.drawable.ankaramessi;
        info=getString(R.string.messi_info);

        name=getString(R.string.messi_name);
        value=getString(R.string.messi_value);
        position=getString(R.string.rw);
        nation=getString(R.string.argentina);
        club=getString(R.string.psg);
        age=getString(R.string.messi_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.vini;
        c_logo=R.drawable.rma;
        flag=R.drawable.brazil;
        icon=R.drawable.vini_run;
        info=getString(R.string.vini_info);

        name=getString(R.string.vini_name);
        value=getString(R.string.vini_value);
        position=getString(R.string.lw);
        nation=getString(R.string.brazil);
        club=getString(R.string.rma);
        age=getString(R.string.haaland_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.cr7;
        c_logo=R.drawable.manu;
        flag=R.drawable.port;
        icon=R.drawable.cr7_run1;
        info=getString(R.string.cr7_info);
        name=getString(R.string.cr7_name);
        value=getString(R.string.ronaldo_value);
        position=getString(R.string.cf);
        nation=getString(R.string.portugal);
        club=getString(R.string.man_united);
        age=getString(R.string.cr7_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.lewa;
        c_logo=R.drawable.barcelona;
        flag=R.drawable.pol;
        icon=R.drawable.lewa_stand;
        info=getString(R.string.lewa_info);
        name=getString(R.string.lewa_name);
        value=getString(R.string.lewa_value);
        position=getString(R.string.cf);
        nation=getString(R.string.poland);
        club=getString(R.string.barca);
        age=getString(R.string.lewa_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.benz;
        c_logo=R.drawable.rma;
        flag=R.drawable.france;
        icon=R.drawable.benz_run;
        info=getString(R.string.benz_info);
        name=getString(R.string.benz_name);
        value=getString(R.string.benz_value);
        position=getString(R.string.cf);
        nation=getString(R.string.france);
        club=getString(R.string.rma);
        age=getString(R.string.lewa_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.kevin;
        c_logo=R.drawable.manc;
        flag=R.drawable.belg;
        icon=R.drawable.kevin_run;
        info=getString(R.string.kdb_info);
        name=getString(R.string.kdb_name);
        value=getString(R.string.kdb_value);
        position=getString(R.string.am);
        nation=getString(R.string.belgium);
        club=getString(R.string.man_city);
        age=getString(R.string.kdb_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.kimmich;
        c_logo=R.drawable.bayern;
        flag=R.drawable.germany;
        icon=R.drawable.kimmich_stand;
        info=getString(R.string.kim_info);
        name=getString(R.string.kim_name);
        value=getString(R.string.kim_value);
        position=getString(R.string.dm);
        nation=getString(R.string.germany);
        club=getString(R.string.bayern);
        age=getString(R.string.kim_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.haaland;
        c_logo=R.drawable.manc;
        flag=R.drawable.nor;
        icon=R.drawable.haaland_celeb2;
        name=getString(R.string.haaland_name);
        info=getString(R.string.haaland_info);
        value=getString(R.string.haaland_value);
        position=getString(R.string.cf);
        nation=getString(R.string.norway);
        club=getString(R.string.man_city);
        age=getString(R.string.haaland_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.son;
        c_logo=R.drawable.spurs;
        flag=R.drawable.korea;
        icon=R.drawable.son_celeb;
        info=getString(R.string.son_info);
        name=getString(R.string.son_name);
        value=getString(R.string.son_value);
        position=getString(R.string.lw);
        nation=getString(R.string.south_korea);
        club=getString(R.string.spurs);
        age=getString(R.string.salah_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.kante;
        c_logo=R.drawable.chelsea;
        flag=R.drawable.france;
        icon=R.drawable.kante_run3;
        info=getString(R.string.kante_info);
        name=getString(R.string.kante_name);
        value=getString(R.string.kante_value);
        position=getString(R.string.dm);
        nation=getString(R.string.france);
        club=getString(R.string.chelsea);
        age=getString(R.string.kdb_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.dona;
        c_logo=R.drawable.paris;
        flag=R.drawable.italy;
        icon=R.drawable.dona_stand;
        info=getString(R.string.dona_info);
        name=getString(R.string.dona_name);
        value=getString(R.string.messi_value);
        position=getString(R.string.gk);
        nation=getString(R.string.italy);
        club=getString(R.string.psg);
        age=getString(R.string.dona_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);

        image=R.drawable.martinelli;
        c_logo=R.drawable.arsenal;
        flag=R.drawable.brazil;
        icon=R.drawable.martinelli_run;
        info=getString(R.string.martin_info);
        name=getString(R.string.martin_name);
        value=getString(R.string.kante_value);
        position=getString(R.string.lw);
        nation=getString(R.string.brazil);
        club=getString(R.string.arsenal);
        age=getString(R.string.martin_age);
        transferMarket=new TransferMarket(image,name,value,position,club,nation,age,c_logo,flag,icon,info);
        transferMarketList.add(transferMarket);
    }

    @Override
    public void OnPlayerClick(int position) {
        TransferMarket t;
        t=transferMarketList.get(position);
        HomeActivity.image=t.getIcon();
        HomeActivity2.s=t.getInfo();
        Intent intent=new Intent(this,TabbedPlayerActivity.class);
        startActivity(intent);


    }
}