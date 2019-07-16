package defpackage;

import android.text.Layout.Alignment;

/* renamed from: gp reason: default package and case insensitive filesystem */
/* compiled from: Cea708Cue */
final class C1334gp extends Uo implements Comparable<C1334gp> {
    public final int o;

    public C1334gp(CharSequence charSequence, Alignment alignment, float f, int i, int i2, float f2, int i3, float f3, boolean z, int i4, int i5) {
        super(charSequence, alignment, f, i, i2, f2, i3, f3, z, i4);
        this.o = i5;
    }

    /* renamed from: a */
    public int compareTo(C1334gp gpVar) {
        int i = gpVar.o;
        int i2 = this.o;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
