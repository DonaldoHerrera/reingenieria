package com.google.android.gms.cast.framework.media;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.framework.C0645m;
import com.google.android.gms.cast.framework.C0662n;
import com.google.android.gms.cast.framework.C0663o;
import java.util.ArrayList;
import java.util.List;

public final class y extends ArrayAdapter<MediaTrack> implements OnClickListener {
    private final Context a;
    private int b;

    public y(Context context, List<MediaTrack> list, int i) {
        int i2 = C0662n.cast_tracks_chooser_dialog_row_layout;
        if (list == null) {
            list = new ArrayList<>();
        }
        super(context, i2, list);
        this.b = -1;
        this.a = context;
        this.b = i;
    }

    public final MediaTrack a() {
        int i = this.b;
        if (i < 0 || i >= getCount()) {
            return null;
        }
        return (MediaTrack) getItem(this.b);
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        z zVar;
        String str;
        if (view == null) {
            view = ((LayoutInflater) this.a.getSystemService("layout_inflater")).inflate(C0662n.cast_tracks_chooser_dialog_row_layout, viewGroup, false);
            zVar = new z(this, (TextView) view.findViewById(C0645m.text), (RadioButton) view.findViewById(C0645m.radio));
            view.setTag(zVar);
        } else {
            zVar = (z) view.getTag();
        }
        if (zVar == null) {
            return null;
        }
        zVar.b.setTag(Integer.valueOf(i));
        zVar.b.setChecked(this.b == i);
        view.setOnClickListener(this);
        MediaTrack mediaTrack = (MediaTrack) getItem(i);
        String name = mediaTrack.getName();
        if (TextUtils.isEmpty(name)) {
            if (mediaTrack.I() == 2) {
                str = this.a.getString(C0663o.cast_tracks_chooser_dialog_closed_captions);
            } else {
                if (!TextUtils.isEmpty(mediaTrack.H())) {
                    String displayLanguage = C0648c.a(mediaTrack).getDisplayLanguage();
                    if (!TextUtils.isEmpty(displayLanguage)) {
                        str = displayLanguage;
                    }
                }
                name = this.a.getString(C0663o.cast_tracks_chooser_dialog_default_track_name, new Object[]{Integer.valueOf(i + 1)});
            }
            zVar.a.setText(str);
            return view;
        }
        str = name;
        zVar.a.setText(str);
        return view;
    }

    public final void onClick(View view) {
        this.b = ((Integer) ((z) view.getTag()).b.getTag()).intValue();
        notifyDataSetChanged();
    }
}
