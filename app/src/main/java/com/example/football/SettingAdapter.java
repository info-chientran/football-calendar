package com.example.football;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import java.util.List;
import java.util.Map;

public class SettingAdapter extends BaseExpandableListAdapter {

    private List<GroupObj> ListGroup;
    private Map<GroupObj, List<ItemObjSetting>> ListItem;

    public SettingAdapter(List<GroupObj> listGroup, Map<GroupObj, List<ItemObjSetting>> listItem) {
        ListGroup = listGroup;
        ListItem = listItem;
    }

    @Override
    public int getGroupCount() {
        if (ListGroup != null){
            return ListGroup.size();
        }
        return 0;
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        if (ListGroup != null && ListItem != null){
            return ListItem.get(ListGroup.get(groupPosition)).size();
        }
        return 0;
    }

    @Override
    public Object getGroup(int groupPosition) {
        return ListGroup.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return ListItem.get(ListGroup.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        GroupObj groupObj = ListGroup.get(groupPosition);
        return groupObj.getId();
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        ItemObjSetting itemObjSetting = ListItem.get(ListGroup.get(groupPosition)).get(childPosition);
        return itemObjSetting.getId();
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    //text_Setting_Group
    //lv_group
    @Override
    public View getGroupView(int groupPosition, boolean b, View convertView, ViewGroup viewGroup) {
        if (convertView == null){
            convertView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.theme_group, viewGroup, false);
            TextView textViewGroup = convertView.findViewById(R.id.text_Setting_Group);
            GroupObj groupObj = ListGroup.get(groupPosition);
            textViewGroup.setText(groupObj.getId());
        }
        return convertView;
    }

    //text_Setting_Item
    //language_group
    @Override
    public View getChildView(int groupPosition, int childPosition, boolean b, View convertView, ViewGroup viewGroup) {
        if (convertView == null){
            convertView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.language_group, viewGroup, false);
            TextView textViewItem = convertView.findViewById(R.id.text_Setting_Item);
            ItemObjSetting itemObjSetting = ListItem.get(ListGroup.get(groupPosition)).get(childPosition);
            textViewItem.setText(itemObjSetting.getId());
        }
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
