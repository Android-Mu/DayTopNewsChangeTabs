package com.example.mjj.daytopnewschangetabs.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mjj.daytopnewschangetabs.R;

/**
 * Description：ViewPager切换的Fragment
 * <p>
 * Created by Mjj on 2016/11/19.
 */
public class NewsFragment extends Fragment {

    private String name = "Default";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        if(null != bundle) {
            name = bundle.getString("title_name");
        }
        View frView = inflater.inflate(R.layout.fragment_news, null);
        TextView textView = (TextView) frView.findViewById(R.id.tv_fg);
        textView.setText(name);
        return frView;
    }
}
