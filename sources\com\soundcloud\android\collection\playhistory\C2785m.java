package com.soundcloud.android.collection.playhistory;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.C0361c;
import androidx.fragment.app.C0370l;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.view.customfontviews.b;

/* renamed from: com.soundcloud.android.collection.playhistory.m reason: case insensitive filesystem */
/* compiled from: ClearPlayHistoryDialog */
public class C2785m extends C2418ZW implements OnClickListener {
    private a b;

    /* renamed from: com.soundcloud.android.collection.playhistory.m$a */
    /* compiled from: ClearPlayHistoryDialog */
    interface a {
        void a();
    }

    public void a(C0370l lVar) {
        C5232QGa.a((C0361c) this, lVar, "ClearPlayHistory");
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View a2 = new b(getActivity()).c(p.collections_play_history_clear_dialog_title).b(p.collections_play_history_clear_dialog_message).a();
        androidx.appcompat.app.C0325l.a aVar = new androidx.appcompat.app.C0325l.a(getActivity());
        aVar.b(a2);
        aVar.c(p.collections_play_history_clear_dialog_button, (OnClickListener) this);
        aVar.a(p.btn_cancel, (OnClickListener) null);
        return aVar.a();
    }

    public C2785m a(a aVar) {
        this.b = aVar;
        return this;
    }
}
