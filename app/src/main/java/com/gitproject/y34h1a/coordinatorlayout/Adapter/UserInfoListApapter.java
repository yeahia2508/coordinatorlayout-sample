package com.gitproject.y34h1a.coordinatorlayout.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gitproject.y34h1a.coordinatorlayout.R;

/**
 * Created by y34h1a on 1/13/16.
 */
public class UserInfoListApapter extends RecyclerView.Adapter<UserInfoAdapterVH> {

    @Override
    public UserInfoAdapterVH onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycleview_item, parent, false);

        return new UserInfoAdapterVH(itemView);
    }

    @Override
    public void onBindViewHolder(UserInfoAdapterVH holder, int position) {
        // Add server Data with your views.
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
