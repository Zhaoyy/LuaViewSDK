package com.taobao.luaview.view;

import com.taobao.luaview.userdata.ui.UDImageView;
import com.taobao.luaview.userdata.ui.UDView;
import com.taobao.luaview.view.imageview.LVBaseImageView;
import com.taobao.luaview.view.interfaces.ILVView;

import org.luaj.vm2.Globals;
import org.luaj.vm2.LuaValue;
import org.luaj.vm2.Varargs;

/**
 * LuaView-ImageView
 *
 * @author song
 * @date 15/8/20
 */
public class LVImageView extends LVBaseImageView implements ILVView {
    private UDImageView mLuaUserdata;

    public LVImageView(Globals globals, LuaValue metaTable, Varargs varargs) {
        super(globals.getContext());
        this.mLuaUserdata = new UDImageView(this, globals, metaTable, varargs);
        init();
    }

    private void init() {
        this.setScaleType(ScaleType.FIT_XY);//默认FIT_XY
    }

    @Override
    public UDView getUserdata() {
        return mLuaUserdata;
    }
}
