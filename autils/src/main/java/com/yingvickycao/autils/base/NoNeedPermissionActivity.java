package com.yingvickycao.autils.base;

public class NoNeedPermissionActivity extends BaseActivity {
    @Override
    protected boolean isNeedCheckPermission() {
        return false;
    }
}