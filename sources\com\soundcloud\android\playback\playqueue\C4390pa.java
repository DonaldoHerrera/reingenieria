package com.soundcloud.android.playback.playqueue;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import com.soundcloud.android.ia.i;
import java.util.Collections;

/* renamed from: com.soundcloud.android.playback.playqueue.pa reason: case insensitive filesystem */
/* compiled from: PlayQueueAdapter */
class C4390pa extends C5407WEa<Va> {
    private final fb g;
    private final C4384ma h;
    private a i;

    C4390pa(fb fbVar, C4378ja jaVar, C4384ma maVar) {
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(a.TRACK.ordinal(), fbVar), new C5693cFa(a.HEADER.ordinal(), jaVar), new C5693cFa(a.MAGIC_BOX.ordinal(), maVar)});
        this.g = fbVar;
        this.h = maVar;
    }

    public long a(int i2) {
        return ((Va) h().get(i2)).d();
    }

    /* access modifiers changed from: 0000 */
    public void d(int i2, int i3) {
        Collections.swap(h(), i2, i3);
        a(i2, i3);
    }

    public int f(int i2) {
        return ((Va) g(i2)).a().ordinal();
    }

    /* renamed from: a */
    public void b(C5378VEa vEa, int i2) {
        super.b(vEa, i2);
        ImageView imageView = (ImageView) vEa.itemView.findViewById(i.overflow_button);
        if (imageView != null) {
            imageView.setOnTouchListener(new C4375i(this, vEa));
        }
    }

    public /* synthetic */ boolean a(C5378VEa vEa, View view, MotionEvent motionEvent) {
        a aVar = this.i;
        if (aVar != null) {
            aVar.a(vEa);
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        this.i = aVar;
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        this.g.a(aVar);
    }

    /* access modifiers changed from: 0000 */
    public void a(a aVar) {
        this.h.a(aVar);
    }
}
