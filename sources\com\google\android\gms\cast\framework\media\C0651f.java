package com.google.android.gms.cast.framework.media;

import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import androidx.fragment.app.C0361c;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaStatus;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.gms.cast.MediaTrack.a;
import com.google.android.gms.cast.framework.C0635c;
import com.google.android.gms.cast.framework.C0636d;
import com.google.android.gms.cast.framework.C0645m;
import com.google.android.gms.cast.framework.C0662n;
import com.google.android.gms.cast.framework.C0663o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.google.android.gms.cast.framework.media.f reason: case insensitive filesystem */
public class C0651f extends C0361c {
    private boolean a;
    private List<MediaTrack> b;
    private List<MediaTrack> c;
    private long[] d;
    /* access modifiers changed from: private */
    public Dialog e;
    private C0650e f;
    private MediaInfo g;
    private long[] h;

    public static C0651f Qb() {
        return new C0651f();
    }

    private final void Rb() {
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.cancel();
            this.e = null;
        }
    }

    /* access modifiers changed from: private */
    public final void a(y yVar, y yVar2) {
        long[] jArr;
        if (!this.a || !this.f.m()) {
            Rb();
            return;
        }
        ArrayList arrayList = new ArrayList();
        MediaTrack a2 = yVar.a();
        if (!(a2 == null || a2.G() == -1)) {
            arrayList.add(Long.valueOf(a2.G()));
        }
        MediaTrack a3 = yVar2.a();
        if (a3 != null) {
            arrayList.add(Long.valueOf(a3.G()));
        }
        long[] jArr2 = this.d;
        if (jArr2 != null && jArr2.length > 0) {
            HashSet hashSet = new HashSet();
            for (MediaTrack G : this.c) {
                hashSet.add(Long.valueOf(G.G()));
            }
            for (MediaTrack G2 : this.b) {
                hashSet.add(Long.valueOf(G2.G()));
            }
            for (long j : this.d) {
                if (!hashSet.contains(Long.valueOf(j))) {
                    arrayList.add(Long.valueOf(j));
                }
            }
        }
        long[] jArr3 = new long[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            jArr3[i] = ((Long) arrayList.get(i)).longValue();
        }
        Arrays.sort(jArr3);
        this.f.a(jArr3);
        Rb();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a = true;
        this.c = new ArrayList();
        this.b = new ArrayList();
        this.d = new long[0];
        C0636d a2 = C0635c.a(getContext()).c().a();
        if (a2 == null || !a2.b()) {
            this.a = false;
            return;
        }
        this.f = a2.g();
        C0650e eVar = this.f;
        if (eVar == null || !eVar.m() || this.f.g() == null) {
            this.a = false;
            return;
        }
        long[] jArr = this.h;
        if (jArr != null) {
            this.d = jArr;
        } else {
            MediaStatus i = this.f.i();
            if (i != null) {
                this.d = i.i();
            }
        }
        MediaInfo mediaInfo = this.g;
        if (mediaInfo == null) {
            mediaInfo = this.f.g();
        }
        if (mediaInfo == null) {
            this.a = false;
            return;
        }
        List Y = mediaInfo.Y();
        if (Y == null) {
            this.a = false;
            return;
        }
        this.c = a(Y, 2);
        this.b = a(Y, 1);
        if (!this.b.isEmpty()) {
            List<MediaTrack> list = this.b;
            a aVar = new a(-1, 1);
            aVar.b(getActivity().getString(C0663o.cast_tracks_chooser_dialog_none));
            aVar.a(2);
            aVar.a("");
            list.add(0, aVar.a());
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        int a2 = a(this.b, this.d, 0);
        int a3 = a(this.c, this.d, -1);
        y yVar = new y(getActivity(), this.b, a2);
        y yVar2 = new y(getActivity(), this.c, a3);
        Builder builder = new Builder(getActivity());
        View inflate = getActivity().getLayoutInflater().inflate(C0662n.cast_tracks_chooser_dialog_layout, null);
        ListView listView = (ListView) inflate.findViewById(C0645m.text_list_view);
        ListView listView2 = (ListView) inflate.findViewById(C0645m.audio_list_view);
        TabHost tabHost = (TabHost) inflate.findViewById(C0645m.tab_host);
        tabHost.setup();
        if (yVar.getCount() == 0) {
            listView.setVisibility(4);
        } else {
            listView.setAdapter(yVar);
            TabSpec newTabSpec = tabHost.newTabSpec("textTab");
            newTabSpec.setContent(C0645m.text_list_view);
            newTabSpec.setIndicator(getActivity().getString(C0663o.cast_tracks_chooser_dialog_subtitles));
            tabHost.addTab(newTabSpec);
        }
        if (yVar2.getCount() <= 1) {
            listView2.setVisibility(4);
        } else {
            listView2.setAdapter(yVar2);
            TabSpec newTabSpec2 = tabHost.newTabSpec("audioTab");
            newTabSpec2.setContent(C0645m.audio_list_view);
            newTabSpec2.setIndicator(getActivity().getString(C0663o.cast_tracks_chooser_dialog_audio));
            tabHost.addTab(newTabSpec2);
        }
        builder.setView(inflate).setPositiveButton(getActivity().getString(C0663o.cast_tracks_chooser_dialog_ok), new u(this, yVar, yVar2)).setNegativeButton(C0663o.cast_tracks_chooser_dialog_cancel, new w(this));
        Dialog dialog = this.e;
        if (dialog != null) {
            dialog.cancel();
            this.e = null;
        }
        this.e = builder.create();
        return this.e;
    }

    public void onDestroyView() {
        if (getDialog() != null && getRetainInstance()) {
            getDialog().setDismissMessage(null);
        }
        super.onDestroyView();
    }

    private static ArrayList<MediaTrack> a(List<MediaTrack> list, int i) {
        ArrayList<MediaTrack> arrayList = new ArrayList<>();
        if (list != null) {
            for (MediaTrack mediaTrack : list) {
                if (mediaTrack.X() == i) {
                    arrayList.add(mediaTrack);
                }
            }
        }
        return arrayList;
    }

    private static int a(List<MediaTrack> list, long[] jArr, int i) {
        if (!(jArr == null || list == null)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                int length = jArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    if (jArr[i3] == ((MediaTrack) list.get(i2)).G()) {
                        return i2;
                    }
                }
            }
        }
        return i;
    }
}
