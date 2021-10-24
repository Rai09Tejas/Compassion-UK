package com.example.android.compassion;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardContentAdapter extends RecyclerView.Adapter {

    //Variables
    ArrayList<CardContent> list;

    //Constructer
    public CardContentAdapter(ArrayList<CardContent> list){
        this.list = list;
    }


    //Override Methods
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view;
        if(viewType==0) {
            view = inflater.inflate(R.layout.card_newspons, parent, false);
            return new RecyclerI1T1(view);
        }
        else if(viewType==1) {
            view = inflater.inflate(R.layout.card_bday, parent, false);
            return new RecyclerT2(view);
        }
        else if(viewType==2) {
            view = inflater.inflate(R.layout.card_article, parent, false);
            return new RecyclerI1T1(view);
        }
        else if(viewType==3) {
            view = inflater.inflate(R.layout.card_weather, parent, false);
            return new RecyclerT2(view);
        }
        else if(viewType==4) {
            view = inflater.inflate(R.layout.card_anni, parent, false);
            return new RecyclerI1T2(view);
        }
        else if(viewType==5) {
            view = inflater.inflate(R.layout.card_newpic, parent, false);
            return new RecyclerI1T1(view);
        }
        else if(viewType==6) {
            view = inflater.inflate(R.layout.card_thankyou, parent, false);
            return new RecyclerT1(view);
        }
        else if(viewType==7) {
            view = inflater.inflate(R.layout.card_pray, parent, false);
            return new RecyclerT2(view);
        }
        else
            //video
            view = inflater.inflate(R.layout.card_video, parent, false);
            return new RecyclerI1T1(view);

    }



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        int colorcode = getRandomColor();

        if(list.get(position).getType().toLowerCase().contains("newspons")){
            ((RecyclerI1T1) holder).T1.setText(list.get(position).getmText1());
            ((RecyclerI1T1) holder).I1.setImageResource(list.get(position).getImgVidId());
            ((RecyclerI1T1) holder).T2.setBackgroundColor((holder.itemView.getResources().getColor(colorcode,null)));
            ((RecyclerI1T1) holder).L3.setBackgroundColor((holder.itemView.getResources().getColor(colorcode,null)));
        }
        else if(list.get(position).getType().toLowerCase().contains("bday")){
            ((RecyclerT2) holder).t1.setText(list.get(position).getmText1());
            ((RecyclerT2) holder).t2.setText(list.get(position).getmText2());
            ((RecyclerT2) holder).L1.setBackgroundColor((holder.itemView.getResources().getColor(colorcode,null)));
        }
        else if(list.get(position).getType().toLowerCase().contains("article")){
            ((RecyclerI1T1) holder).T1.setText(list.get(position).getmText1());
            ((RecyclerI1T1) holder).I1.setImageResource(list.get(position).getImgVidId());
            ((RecyclerI1T1) holder).T1.setBackgroundColor((holder.itemView.getResources().getColor(colorcode,null)));
        }
        else if(list.get(position).getType().toLowerCase().contains("weather")){
            ((RecyclerT2) holder).t1.setText(list.get(position).getmText1());
            ((RecyclerT2) holder).t2.setText(list.get(position).getmText2());
            ((RecyclerT2) holder).L2.setBackgroundColor((holder.itemView.getResources().getColor(colorcode,null)));
            ((RecyclerT2) holder).L3.setBackgroundColor((holder.itemView.getResources().getColor(colorcode,null)));
        }
        else if(list.get(position).getType().toLowerCase().contains("anni")){
            ((RecyclerI1T2) holder).T1.setText(list.get(position).getmText1());
            ((RecyclerI1T2) holder).T2.setText(list.get(position).getmText2());
            ((RecyclerI1T2) holder).I1.setImageResource(list.get(position).getImgVidId());
            ((RecyclerI1T2) holder).L1.setBackgroundColor((holder.itemView.getResources().getColor(colorcode,null)));
        }
        else if(list.get(position).getType().toLowerCase().contains("newpic")){
            ((RecyclerI1T1) holder).T1.setText(list.get(position).getmText1());
            ((RecyclerI1T1) holder).T2.setBackgroundColor((holder.itemView.getResources().getColor(colorcode,null)));
            ((RecyclerI1T1) holder).I1.setImageResource(list.get(position).getImgVidId());
        }
        else if(list.get(position).getType().toLowerCase().contains("thankyou")){
            ((RecyclerT1) holder).t1.setText(list.get(position).getmText1());
            ((RecyclerT1) holder).t2.setTextColor((holder.itemView.getResources().getColor(colorcode,null)));
            ((RecyclerT1) holder).t3.setBackgroundColor(holder.itemView.getResources().getColor(colorcode,null));
        }
        else if(list.get(position).getType().toLowerCase().contains("pray")){
            ((RecyclerT2) holder).t1.setText(list.get(position).getmText1());
            ((RecyclerT2) holder).t2.setText(list.get(position).getmText2());
            ((RecyclerT2) holder).L1.setBackgroundColor((holder.itemView.getResources().getColor(colorcode,null)));
        }
        else if(list.get(position).getType().toLowerCase().contains("video")) {
                //video
                ((RecyclerI1T1) holder).T1.setText(list.get(position).getmText1());
                ((RecyclerI1T1) holder).I1.setImageResource(list.get(position).getImgVidId());
            }
    }


    @Override
    public int getItemCount() {
        return list.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(list.get(position).getType().contains("newspons")){
            return 0;
        }
        else if(list.get(position).getType().toLowerCase().contains("bday")){
            return 1;
        }
        else if(list.get(position).getType().toLowerCase().contains("article")){
            return 2;
        }
        else if(list.get(position).getType().toLowerCase().contains("weather")){
            return 3;
        }
        else if(list.get(position).getType().toLowerCase().contains("anni")){
            return 4;
        }
        else if(list.get(position).getType().toLowerCase().contains("newpic")){
            return 5;
        }
        else if(list.get(position).getType().toLowerCase().contains("thankyou")){
            return 6;
        }
        else if(list.get(position).getType().toLowerCase().contains("pray")){
            return 7;
        }
        else
            //video
            return 8;
    }

    //Random Colors Class
    private int getRandomColor(){
        List<Integer> colorcode = new ArrayList<>();

        colorcode.add(R.color.orange);
        colorcode.add(R.color.gray);
        colorcode.add(R.color.green);
        colorcode.add(R.color.brown);
        colorcode.add(R.color.yellow);
        colorcode.add(R.color.red);

        Random random = new Random();
        int num = random.nextInt(colorcode.size());
        return colorcode.get(num);
    }

    //Recycler ViewHolders
    class RecyclerI1T2 extends RecyclerView.ViewHolder {
        TextView T1,T2;
        ImageView I1;
        LinearLayout L1;
        public RecyclerI1T2(@NonNull View itemView) {
            super(itemView);
            L1 = (LinearLayout) itemView.findViewById(R.id.give_color);
            T1 = (TextView) itemView.findViewById(R.id.t1);
            T2 = (TextView) itemView.findViewById(R.id.t2);
            I1 = (ImageView) itemView.findViewById(R.id.I1);
        }
    }

    class RecyclerI1T1 extends RecyclerView.ViewHolder {
        TextView T1,T2;
        ImageView I1;
        LinearLayout L3;
        public RecyclerI1T1(@NonNull View itemView) {
            super(itemView);
            T1 = (TextView) itemView.findViewById(R.id.t1);
            T2 = (TextView) itemView.findViewById(R.id.give_color);
            L3 = (LinearLayout) itemView.findViewById(R.id.give_color2);
            I1 = (ImageView) itemView.findViewById(R.id.I1);
        }
    }

    class RecyclerT2 extends RecyclerView.ViewHolder {
        TextView t1, t2;
        LinearLayout L1, L2, L3;
        public RecyclerT2(@NonNull View itemView) {
            super(itemView);
            L1 = (LinearLayout) itemView.findViewById(R.id.give_color);
            t1 = (TextView) itemView.findViewById(R.id.t1);
            t2 = (TextView) itemView.findViewById(R.id.t2);
            L2 = (LinearLayout) itemView.findViewById(R.id.wc_1);
            L3 = (LinearLayout) itemView.findViewById(R.id.wc_2);
        }
    }

    class RecyclerT1 extends RecyclerView.ViewHolder {
        TextView t1,t2;
        LinearLayout t3;
        public RecyclerT1(@NonNull View itemView) {
            super(itemView);
            t1 = (TextView) itemView.findViewById(R.id.t1);
            t2 = (TextView) itemView.findViewById(R.id.ty_color);
            t3 = (LinearLayout) itemView.findViewById(R.id.ty_color_2);
        }
    }

}
