package com.gom.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {

    private Context context;
    private List<UserTest> userList;


    public UserAdapter(Context context, List<UserTest> userList) {
        this.context = context;
        this.userList = userList;

    }

    @NonNull
    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bind(userList.get(position));
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView textViewID, textViewName, textViewMoney;

        public ViewHolder(View view){
            super(view);
            textViewID = view.findViewById(R.id.id);
            textViewName = view.findViewById(R.id.name);
            textViewMoney = view.findViewById(R.id.money);
        }

        void bind(final UserTest userTest) {
            textViewID.setText(Integer.toString(userTest.getNum()));
            textViewName.setText(userTest.getUser().getUserName());
            textViewMoney.setText(String.valueOf(userTest.getUser().getMoney()));
        }
    }




}
