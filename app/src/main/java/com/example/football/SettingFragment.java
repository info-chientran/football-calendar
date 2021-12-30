package com.example.football;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SettingFragment extends Fragment {

    private ExpandableListView listView;
    private List<GroupObj> ListGroup;
    private Map<GroupObj, List<ItemObjSetting>>  ListItem;
    private SettingAdapter settingAdapter;





    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        //switch screen to login
//        view.findViewById(R.id.accountSetting).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), Login.class);
//                startActivity(intent);
//            }
//        });

//        listView = view.findViewById(R.id.lv_Setting);
//        ListItem = getListItem();
//        ListGroup = new ArrayList<>(ListItem.keySet());
//        settingAdapter = new SettingAdapter(ListGroup, ListItem);
//        listView.setAdapter(settingAdapter);


        return view;
    }
//    private Map<GroupObj, List<ItemObjSetting>> getListItem(){
//        Map<GroupObj, List<ItemObjSetting>>listMap = new HashMap<>();
//        GroupObj groupobject1 = new GroupObj (1,"Language");
//        GroupObj groupobject2 = new GroupObj (1,"Theme");
//
//        List<ItemObjSetting> objectlist1 = new ArrayList<>();
//        List<ItemObjSetting> objectlist2 = new ArrayList<>();
//        objectlist1.add(new ItemObjSetting(1,"English"));
//        objectlist1.add(new ItemObjSetting(1,"Việt Nam"));
////        objectlist2.add(new ItemObjSetting(3,"Light"));
////        objectlist2.add(new ItemObjSetting(4,"Dark"));
//        listMap.put(groupobject1,objectlist1);
//        listMap.put(groupobject2,objectlist2);
//        return listMap;
//    }
}