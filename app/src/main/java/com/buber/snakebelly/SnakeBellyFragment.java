package com.buber.snakebelly;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by t1004800 on 8/24/2016.
 */
public class SnakeBellyFragment extends Fragment {
    private TextView mTextView;
    private ImageView mImageView;

    public static SnakeBellyFragment newInstance() {
        return new SnakeBellyFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRetainInstance(true);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_snake_belly, container, false);
        mTextView = (TextView) v.findViewById(R.id.snake_belly_text);
        mImageView = (ImageView) v.findViewById(R.id.snake_belly_image);
//        mImageView.setImageResource(R.drawable.elv_guy1);

        return v;
    }
}
