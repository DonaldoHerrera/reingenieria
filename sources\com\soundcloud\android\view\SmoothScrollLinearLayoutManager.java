package com.soundcloud.android.view;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.s;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0014B\u000f\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB'\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\"\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000e\u001a\u00020\u0006H\u0016R\u000e\u0010\n\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/view/SmoothScrollLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "verticalSnapPreference", "(Landroid/content/Context;IZI)V", "scrollToPositionInMiddle", "", "position", "smoothScrollToPosition", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "TopSnappedSmoothScroller", "base_release"}, mv = {1, 1, 15})
/* compiled from: SmoothScrollLinearLayoutManager.kt */
public class SmoothScrollLinearLayoutManager extends LinearLayoutManager {
    /* access modifiers changed from: private */
    public int H = -1;

    /* compiled from: SmoothScrollLinearLayoutManager.kt */
    private final class a extends M {
        final /* synthetic */ SmoothScrollLinearLayoutManager o;

        public a(SmoothScrollLinearLayoutManager smoothScrollLinearLayoutManager, Context context) {
            C7471uYa.b(context, "context");
            this.o = smoothScrollLinearLayoutManager;
            super(context);
        }

        public PointF a(int i) {
            return this.o.a(i);
        }

        /* access modifiers changed from: protected */
        public int j() {
            return this.o.H;
        }
    }

    public SmoothScrollLinearLayoutManager(Context context) {
        C7471uYa.b(context, "context");
        super(context);
    }

    public void l(int i) {
        f(i, h() / 2);
    }

    public void a(RecyclerView recyclerView, s sVar, int i) {
        C7471uYa.b(recyclerView, "recyclerView");
        Context context = recyclerView.getContext();
        C7471uYa.a((Object) context, "recyclerView.context");
        a aVar = new a(this, context);
        aVar.c(i);
        b((r) aVar);
    }

    public SmoothScrollLinearLayoutManager(Context context, int i, boolean z, int i2) {
        C7471uYa.b(context, "context");
        super(context, i, z);
        this.H = i2;
    }
}
