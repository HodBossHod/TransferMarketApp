package com.mycode.newapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {


    List<TransferMarket> transferlist;
    OnPlayerListener mOnPlayerListener;
    public RecycleViewAdapter(List<TransferMarket> transferlist,OnPlayerListener onPlayerListener) {
        this.transferlist = transferlist;
        this.mOnPlayerListener=onPlayerListener;
    }

    @NonNull

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup Parent,int ViewType) {
        View v= LayoutInflater.from(Parent.getContext()).inflate(R.layout.player_items,Parent,false);
        return new MyViewHolder(v,mOnPlayerListener);
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder,int position) {
        TransferMarket transferMarket=transferlist.get(position);
        viewHolder.player_photo.setImageResource(transferMarket.getPhoto());
        viewHolder.name.setText(transferMarket.getName());
        viewHolder.value.setText(transferMarket.getValue());
        viewHolder.position.setText(transferMarket.getPosition());
        viewHolder.club.setText(transferMarket.getClub());
        viewHolder.nation.setText(transferMarket.getNation());
        viewHolder.age.setText(transferMarket.getAge());
        viewHolder.c_logo.setImageResource(transferMarket.getcLogo());
        viewHolder.n_logo.setImageResource(transferMarket.getnLogo());
    }

    @Override
    public int getItemCount() {
        return transferlist.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name;
        TextView position;
        TextView value;
        ImageView player_photo;
        TextView club;
        TextView nation;
        TextView age;
        ImageView c_logo;
        ImageView n_logo;
        OnPlayerListener OnPlayerListener;
        public MyViewHolder(View view,OnPlayerListener OnPlayerListener) {
            super(view);
            name=view.findViewById(R.id.Name);
            value=view.findViewById(R.id.Value);
            position=view.findViewById(R.id.description);
            player_photo=view.findViewById(R.id.playerphoto);
            club=view.findViewById(R.id.club);
            nation=view.findViewById(R.id.nation);
            age=view.findViewById(R.id.age);
            c_logo=view.findViewById(R.id.clublogo);
            n_logo=view.findViewById(R.id.nationlogo);
            this.OnPlayerListener=OnPlayerListener;
            view.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            OnPlayerListener.OnPlayerClick(getAdapterPosition());
        }
    }

    public interface OnPlayerListener{
        void OnPlayerClick(int position);
    }
}
