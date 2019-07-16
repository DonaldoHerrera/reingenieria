package com.soundcloud.android.comments;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.soundcloud.android.comments.m reason: case insensitive filesystem */
/* compiled from: CommentInputRenderer.kt */
public final class C2898m implements TextWatcher {
    final /* synthetic */ a a;
    final /* synthetic */ T b;

    C2898m(a aVar, T t) {
        this.a = aVar;
        this.b = t;
    }

    private final void a(Editable editable) {
        for (int length = editable.length(); length >= 1; length--) {
            int i = length - 1;
            if (C7471uYa.a((Object) editable.subSequence(i, length).toString(), (Object) "\n")) {
                editable.replace(i, length, " ");
            }
        }
    }

    public void afterTextChanged(Editable editable) {
        if (editable != null) {
            a(editable);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        C6781kVa e = this.a.g.e();
        Pa pa = new Pa(String.valueOf(charSequence), this.b.d(), this.b.h(), this.b.f(), this.b.c());
        e.a(pa);
    }
}
