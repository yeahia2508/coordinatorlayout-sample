package com.gitproject.y34h1a.coordinatorlayout.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.gitproject.y34h1a.coordinatorlayout.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by y34h1a on 1/13/16.
 */
public class UserInfoAdapterVH extends RecyclerView.ViewHolder {
    public CircleImageView ivProfilePic;
    public TextView userName;
    public TextView userUniversity;

    public UserInfoAdapterVH(View itemView) {
        super(itemView);
        ivProfilePic = (CircleImageView) itemView.findViewById(R.id.ivProfilePic);
        userName = (TextView) itemView.findViewById(R.id.tvName);
        userUniversity = (TextView) itemView.findViewById(R.id.tvUniversity);
    }
}
