package com.vipapp.appmark2.items.setting.item;

import android.content.Context;
import androidx.annotation.StringRes;

import com.vipapp.appmark2.items.SettingsItem;
import com.vipapp.appmark2.items.setting.type.SettingTitleType;
import com.vipapp.appmark2.utils.wrapper.Str;

public class SettingTitleItem extends SettingsItem {

    private int title_res;

    public SettingTitleItem(@StringRes int title_res) {
        super(null, new SettingTitleType());
        this.title_res = title_res;
    }

    @Override
    public String getSettingTitle(Context ctx) {
        return Str.get(title_res);
    }

    @Override
    public String getSettingSubtitle(Context ctx) {
        return null;
    }

}
