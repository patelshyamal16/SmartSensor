package com.example.SmartSensor.HomeScreen;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.SmartSensor.R;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.ArrayList;

public class ImageAdapter extends RecyclerView.Adapter<ImageAdapter.ViewHolder> {

    private ArrayList<String> imageList;

    public ImageAdapter(ArrayList<String> imageList, ImageFragment context) {
        this.imageList = imageList;
        this.context = context;
    }

    private ImageFragment context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // loading the images from the position
        Glide.with(holder.itemView.getContext()).load(imageList.get(position)).into(holder.imageView);


        String imagename = imageList.get(position);
        String[] imagereal = imagename.split("/");

        String imagename2 = imagereal[7];

        String[] imagereal2 = imagename2.split(".j");

        String str = imagereal2[0];
        String strNew = str.replace("%3A", ":");
        String[] Time = strNew.split("",9);
        String Date = strNew.substring(0,8);
        String time = "Time: "+ Time[8]+"\n";
        Date d = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("E MMM d, yyyy");

        try {
            d = dateFormat.parse(Date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String dates = dateFormat.format(d);

        String finalname = time+ "Date: "+dates;
        holder.textView.setText(finalname);
    }

    @Override
    public int getItemCount() {
        return imageList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.item);
            textView = itemView.findViewById(R.id.text);
        }
    }
}