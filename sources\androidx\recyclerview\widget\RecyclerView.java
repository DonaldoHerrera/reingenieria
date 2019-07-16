package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup implements C1599pc, C1259ec {
    private static final int[] a = {16843830};
    private static final int[] b = {16842987};
    static final boolean c;
    static final boolean d = (VERSION.SDK_INT >= 23);
    static final boolean e = (VERSION.SDK_INT >= 16);
    static final boolean f = (VERSION.SDK_INT >= 21);
    private static final boolean g = (VERSION.SDK_INT <= 15);
    private static final boolean h = (VERSION.SDK_INT <= 15);
    private static final Class<?>[] i;
    static final Interpolator j = new Y();
    private l A;
    private final int[] Aa;
    boolean B;
    private C1352hc Ba;
    boolean C;
    private final int[] Ca;
    boolean D;
    final int[] Da;
    boolean E;
    private final int[] Ea;
    private int F;
    final int[] Fa;
    boolean G;
    final List<ViewHolder> Ga;
    boolean H;
    private Runnable Ha;
    private boolean I;
    private final b Ia;
    private int J;
    boolean K;
    private final AccessibilityManager L;
    private List<j> M;
    boolean N;
    boolean O;
    private int P;
    private int Q;
    private e R;
    private EdgeEffect S;
    private EdgeEffect T;
    private EdgeEffect U;
    private EdgeEffect V;
    f W;
    private int aa;
    private int ba;
    private VelocityTracker ca;
    private int da;
    private int ea;
    private int fa;
    private int ga;
    private int ha;
    private k ia;
    private final int ja;
    private final q k;
    private final int ka;
    final o l;
    private float la;
    private SavedState m;
    private float ma;
    C0407a n;
    private boolean na;
    C0415i o;
    final u oa;
    final oa p;
    C0430y pa;
    boolean q;
    a qa;
    final Runnable r;
    final s ra;
    final Rect s;
    private m sa;
    private final Rect t;
    private List<m> ta;
    final RectF u;
    boolean ua;
    a v;
    boolean va;
    i w;
    private b wa;
    p x;
    boolean xa;
    final ArrayList<h> y;
    fa ya;
    private final ArrayList<l> z;
    private d za;

    public static class LayoutParams extends MarginLayoutParams {
        ViewHolder a;
        final Rect b = new Rect();
        boolean c = true;
        boolean d = false;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.a.getLayoutPosition();
        }

        public boolean b() {
            return this.a.isUpdated();
        }

        public boolean c() {
            return this.a.isRemoved();
        }

        public boolean d() {
            return this.a.isInvalid();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Creator<SavedState> CREATOR = new ea();
        Parcelable c;

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                classLoader = i.class.getClassLoader();
            }
            this.c = parcel.readParcelable(classLoader);
        }

        /* access modifiers changed from: 0000 */
        public void a(SavedState savedState) {
            this.c = savedState.c;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeParcelable(this.c, 0);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static abstract class ViewHolder {
        static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        static final int FLAG_BOUND = 1;
        static final int FLAG_IGNORE = 128;
        static final int FLAG_INVALID = 4;
        static final int FLAG_MOVED = 2048;
        static final int FLAG_NOT_RECYCLABLE = 16;
        static final int FLAG_REMOVED = 8;
        static final int FLAG_RETURNED_FROM_SCRAP = 32;
        static final int FLAG_SET_A11Y_ITEM_DELEGATE = 16384;
        static final int FLAG_TMP_DETACHED = 256;
        static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        int mFlags;
        boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        long mItemId = -1;
        int mItemViewType = -1;
        WeakReference<RecyclerView> mNestedRecyclerView;
        int mOldPosition = -1;
        RecyclerView mOwnerRecyclerView;
        List<Object> mPayloads = null;
        int mPendingAccessibilityState = -1;
        int mPosition = -1;
        int mPreLayoutPosition = -1;
        o mScrapContainer = null;
        ViewHolder mShadowedHolder = null;
        ViewHolder mShadowingHolder = null;
        List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public ViewHolder(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                this.mPayloads = new ArrayList();
                this.mUnmodifiedPayloads = Collections.unmodifiableList(this.mPayloads);
            }
        }

        /* access modifiers changed from: 0000 */
        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((FLAG_ADAPTER_FULLUPDATE & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        /* access modifiers changed from: 0000 */
        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        /* access modifiers changed from: 0000 */
        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        /* access modifiers changed from: 0000 */
        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        /* access modifiers changed from: 0000 */
        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        /* access modifiers changed from: 0000 */
        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        /* access modifiers changed from: 0000 */
        public boolean doesTransientStatePreventRecycling() {
            return (this.mFlags & 16) == 0 && C1778vc.y(this.itemView);
        }

        /* access modifiers changed from: 0000 */
        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.c(this);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        /* access modifiers changed from: 0000 */
        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        /* access modifiers changed from: 0000 */
        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & FLAG_ADAPTER_POSITION_UNKNOWN) != 0 || isInvalid();
        }

        /* access modifiers changed from: 0000 */
        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            return (this.mFlags & 16) == 0 && !C1778vc.y(this.itemView);
        }

        /* access modifiers changed from: 0000 */
        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        /* access modifiers changed from: 0000 */
        public boolean isTmpDetached() {
            return (this.mFlags & FLAG_TMP_DETACHED) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        /* access modifiers changed from: 0000 */
        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((LayoutParams) this.itemView.getLayoutParams()).c = true;
            }
        }

        /* access modifiers changed from: 0000 */
        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                this.mWasImportantForAccessibilityBeforeHidden = C1778vc.j(this.itemView);
            }
            recyclerView.a(this, 4);
        }

        /* access modifiers changed from: 0000 */
        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.a(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        /* access modifiers changed from: 0000 */
        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.b(this);
        }

        /* access modifiers changed from: 0000 */
        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            this.mIsRecyclableCount = z ? this.mIsRecyclableCount - 1 : this.mIsRecyclableCount + 1;
            int i = this.mIsRecyclableCount;
            if (i < 0) {
                this.mIsRecyclableCount = 0;
                StringBuilder sb = new StringBuilder();
                sb.append("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ");
                sb.append(this);
                Log.e("View", sb.toString());
            } else if (!z && i == 1) {
                this.mFlags |= 16;
            } else if (z && this.mIsRecyclableCount == 0) {
                this.mFlags &= -17;
            }
        }

        /* access modifiers changed from: 0000 */
        public void setScrapContainer(o oVar, boolean z) {
            this.mScrapContainer = oVar;
            this.mInChangeScrap = z;
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        /* access modifiers changed from: 0000 */
        public boolean shouldIgnore() {
            return (this.mFlags & FLAG_IGNORE) != 0;
        }

        /* access modifiers changed from: 0000 */
        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewHolder{");
            sb.append(Integer.toHexString(hashCode()));
            sb.append(" position=");
            sb.append(this.mPosition);
            sb.append(" id=");
            sb.append(this.mItemId);
            sb.append(", oldPos=");
            sb.append(this.mOldPosition);
            sb.append(", pLpos:");
            sb.append(this.mPreLayoutPosition);
            StringBuilder sb2 = new StringBuilder(sb.toString());
            if (isScrap()) {
                sb2.append(" scrap ");
                sb2.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb2.append(" invalid");
            }
            if (!isBound()) {
                sb2.append(" unbound");
            }
            if (needsUpdate()) {
                sb2.append(" update");
            }
            if (isRemoved()) {
                sb2.append(" removed");
            }
            if (shouldIgnore()) {
                sb2.append(" ignored");
            }
            if (isTmpDetached()) {
                sb2.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(" not recyclable(");
                sb3.append(this.mIsRecyclableCount);
                sb3.append(")");
                sb2.append(sb3.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb2.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb2.append(" no parent");
            }
            sb2.append("}");
            return sb2.toString();
        }

        /* access modifiers changed from: 0000 */
        public void unScrap() {
            this.mScrapContainer.c(this);
        }

        /* access modifiers changed from: 0000 */
        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public static abstract class a<VH extends ViewHolder> {
        private final b a = new b();
        private boolean b = false;

        public long a(int i) {
            return -1;
        }

        public void a(VH vh, int i, List<Object> list) {
            b(vh, i);
        }

        public void a(RecyclerView recyclerView) {
        }

        public boolean a(VH vh) {
            return false;
        }

        public abstract int b();

        public int b(int i) {
            return 0;
        }

        public abstract VH b(ViewGroup viewGroup, int i);

        public void b(VH vh) {
        }

        public abstract void b(VH vh, int i);

        public void b(c cVar) {
            this.a.unregisterObserver(cVar);
        }

        public void b(RecyclerView recyclerView) {
        }

        public void c(VH vh) {
        }

        public final boolean c() {
            return this.a.a();
        }

        public void d(VH vh) {
        }

        public final boolean d() {
            return this.b;
        }

        public final void e() {
            this.a.b();
        }

        public final VH a(ViewGroup viewGroup, int i) {
            try {
                C1777vb.a("RV CreateView");
                VH b2 = b(viewGroup, i);
                if (b2.itemView.getParent() == null) {
                    b2.mItemViewType = i;
                    return b2;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } finally {
                C1777vb.a();
            }
        }

        public final void b(int i, int i2) {
            this.a.c(i, i2);
        }

        public final void c(int i) {
            this.a.b(i, 1);
        }

        public final void d(int i) {
            this.a.c(i, 1);
        }

        public final void e(int i) {
            this.a.d(i, 1);
        }

        public final void c(int i, int i2) {
            this.a.d(i, i2);
        }

        public final void a(VH vh, int i) {
            vh.mPosition = i;
            if (d()) {
                vh.mItemId = a(i);
            }
            vh.setFlags(1, 519);
            C1777vb.a("RV OnBindView");
            a(vh, i, vh.getUnmodifiedPayloads());
            vh.clearPayload();
            android.view.ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof LayoutParams) {
                ((LayoutParams) layoutParams).c = true;
            }
            C1777vb.a();
        }

        public void a(boolean z) {
            if (!c()) {
                this.b = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void a(c cVar) {
            this.a.registerObserver(cVar);
        }

        public final void a(int i, Object obj) {
            this.a.a(i, 1, obj);
        }

        public final void a(int i, int i2, Object obj) {
            this.a.a(i, i2, obj);
        }

        public final void a(int i, int i2) {
            this.a.a(i, i2);
        }
    }

    static class b extends Observable<c> {
        b() {
        }

        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).b(i, i2);
            }
        }

        public void d(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).c(i, i2);
            }
        }

        public void a(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a(i, i2, obj);
            }
        }

        public void b(int i, int i2) {
            a(i, i2, null);
        }

        public void a(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((c) this.mObservers.get(size)).a(i, i2, 1);
            }
        }
    }

    public static abstract class c {
        public void a() {
        }

        public void a(int i, int i2) {
        }

        public void a(int i, int i2, int i3) {
        }

        public void a(int i, int i2, Object obj) {
            a(i, i2);
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2) {
        }
    }

    public interface d {
        int a(int i, int i2);
    }

    public static class e {
        /* access modifiers changed from: protected */
        public EdgeEffect a(RecyclerView recyclerView, int i) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class f {
        private b a = null;
        private ArrayList<a> b = new ArrayList<>();
        private long c = 120;
        private long d = 120;
        private long e = 250;
        private long f = 250;

        public interface a {
            void a();
        }

        interface b {
            void a(ViewHolder viewHolder);
        }

        public static class c {
            public int a;
            public int b;
            public int c;
            public int d;

            public c a(ViewHolder viewHolder) {
                a(viewHolder, 0);
                return this;
            }

            public c a(ViewHolder viewHolder, int i) {
                View view = viewHolder.itemView;
                this.a = view.getLeft();
                this.b = view.getTop();
                this.c = view.getRight();
                this.d = view.getBottom();
                return this;
            }
        }

        public void a(long j) {
            this.d = j;
        }

        public abstract boolean a(ViewHolder viewHolder, ViewHolder viewHolder2, c cVar, c cVar2);

        public abstract boolean a(ViewHolder viewHolder, c cVar, c cVar2);

        public abstract void b();

        public abstract boolean b(ViewHolder viewHolder);

        public abstract boolean b(ViewHolder viewHolder, c cVar, c cVar2);

        public long c() {
            return this.c;
        }

        public abstract boolean c(ViewHolder viewHolder, c cVar, c cVar2);

        public long d() {
            return this.f;
        }

        public abstract void d(ViewHolder viewHolder);

        public long e() {
            return this.e;
        }

        public void e(ViewHolder viewHolder) {
        }

        public long f() {
            return this.d;
        }

        public abstract boolean g();

        public c h() {
            return new c();
        }

        public abstract void i();

        /* access modifiers changed from: 0000 */
        public void a(b bVar) {
            this.a = bVar;
        }

        public final void c(ViewHolder viewHolder) {
            e(viewHolder);
            b bVar = this.a;
            if (bVar != null) {
                bVar.a(viewHolder);
            }
        }

        public c a(s sVar, ViewHolder viewHolder, int i, List<Object> list) {
            c h = h();
            h.a(viewHolder);
            return h;
        }

        public c a(s sVar, ViewHolder viewHolder) {
            c h = h();
            h.a(viewHolder);
            return h;
        }

        static int a(ViewHolder viewHolder) {
            int i = viewHolder.mFlags & 14;
            if (viewHolder.isInvalid()) {
                return 4;
            }
            if ((i & 4) == 0) {
                int oldPosition = viewHolder.getOldPosition();
                int adapterPosition = viewHolder.getAdapterPosition();
                if (!(oldPosition == -1 || adapterPosition == -1 || oldPosition == adapterPosition)) {
                    i |= 2048;
                }
            }
            return i;
        }

        public final boolean a(a aVar) {
            boolean g = g();
            if (aVar != null) {
                if (!g) {
                    aVar.a();
                } else {
                    this.b.add(aVar);
                }
            }
            return g;
        }

        public boolean a(ViewHolder viewHolder, List<Object> list) {
            return b(viewHolder);
        }

        public final void a() {
            int size = this.b.size();
            for (int i = 0; i < size; i++) {
                ((a) this.b.get(i)).a();
            }
            this.b.clear();
        }
    }

    private class g implements b {
        g() {
        }

        public void a(ViewHolder viewHolder) {
            viewHolder.setIsRecyclable(true);
            if (viewHolder.mShadowedHolder != null && viewHolder.mShadowingHolder == null) {
                viewHolder.mShadowedHolder = null;
            }
            viewHolder.mShadowingHolder = null;
            if (!viewHolder.shouldBeKeptAsChild() && !RecyclerView.this.m(viewHolder.itemView) && viewHolder.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
            }
        }
    }

    public static abstract class h {
        @Deprecated
        public void a(Canvas canvas, RecyclerView recyclerView) {
        }

        public void a(Canvas canvas, RecyclerView recyclerView, s sVar) {
            a(canvas, recyclerView);
        }

        @Deprecated
        public void b(Canvas canvas, RecyclerView recyclerView) {
        }

        public void b(Canvas canvas, RecyclerView recyclerView, s sVar) {
            b(canvas, recyclerView);
        }

        @Deprecated
        public void a(Rect rect, int i, RecyclerView recyclerView) {
            rect.set(0, 0, 0, 0);
        }

        public void a(Rect rect, View view, RecyclerView recyclerView, s sVar) {
            a(rect, ((LayoutParams) view.getLayoutParams()).a(), recyclerView);
        }
    }

    public static abstract class i {
        C0415i a;
        RecyclerView b;
        private final b c = new ca(this);
        private final b d = new da(this);
        na e = new na(this.c);
        na f = new na(this.d);
        r g;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        private boolean k = true;
        private boolean l = true;
        int m;
        boolean n;
        private int o;
        private int p;
        private int q;
        private int r;

        public interface a {
            void a(int i, int i2);
        }

        public static class b {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public void A() {
            this.h = true;
        }

        /* access modifiers changed from: 0000 */
        public boolean B() {
            return false;
        }

        /* access modifiers changed from: 0000 */
        public void C() {
            r rVar = this.g;
            if (rVar != null) {
                rVar.h();
            }
        }

        public boolean D() {
            return false;
        }

        public int a(int i2, o oVar, s sVar) {
            return 0;
        }

        public int a(s sVar) {
            return 0;
        }

        public View a(View view, int i2, o oVar, s sVar) {
            return null;
        }

        public void a(int i2, int i3, s sVar, a aVar) {
        }

        public void a(int i2, a aVar) {
        }

        public void a(Rect rect, int i2, int i3) {
            c(a(i2, rect.width() + o() + p(), m()), a(i3, rect.height() + q() + n(), l()));
        }

        public void a(Parcelable parcelable) {
        }

        public void a(a aVar, a aVar2) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3) {
        }

        public void a(RecyclerView recyclerView, int i2, int i3, int i4) {
        }

        public boolean a() {
            return false;
        }

        public boolean a(LayoutParams layoutParams) {
            return layoutParams != null;
        }

        public boolean a(o oVar, s sVar, View view, int i2, Bundle bundle) {
            return false;
        }

        public boolean a(RecyclerView recyclerView, ArrayList<View> arrayList, int i2, int i3) {
            return false;
        }

        public int b(int i2, o oVar, s sVar) {
            return 0;
        }

        public int b(s sVar) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public void b(int i2, int i3) {
            this.q = MeasureSpec.getSize(i2);
            this.o = MeasureSpec.getMode(i2);
            if (this.o == 0 && !RecyclerView.d) {
                this.q = 0;
            }
            this.r = MeasureSpec.getSize(i3);
            this.p = MeasureSpec.getMode(i3);
            if (this.p == 0 && !RecyclerView.d) {
                this.r = 0;
            }
        }

        public void b(RecyclerView recyclerView) {
        }

        public void b(RecyclerView recyclerView, int i2, int i3) {
        }

        public boolean b() {
            return false;
        }

        public int c(o oVar, s sVar) {
            return 0;
        }

        public int c(s sVar) {
            return 0;
        }

        public View c(View view) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return null;
            }
            View c2 = recyclerView.c(view);
            if (c2 != null && !this.a.c(c2)) {
                return c2;
            }
            return null;
        }

        public abstract LayoutParams c();

        @Deprecated
        public void c(RecyclerView recyclerView) {
        }

        public void c(RecyclerView recyclerView, int i2, int i3) {
        }

        public int d() {
            return -1;
        }

        public int d(s sVar) {
            return 0;
        }

        public View d(View view, int i2) {
            return null;
        }

        /* access modifiers changed from: 0000 */
        public void d(int i2, int i3) {
            int e2 = e();
            if (e2 == 0) {
                this.b.c(i2, i3);
                return;
            }
            int i4 = BaseClientBuilder.API_PRIORITY_OTHER;
            int i5 = BaseClientBuilder.API_PRIORITY_OTHER;
            int i6 = Integer.MIN_VALUE;
            int i7 = Integer.MIN_VALUE;
            for (int i8 = 0; i8 < e2; i8++) {
                View d2 = d(i8);
                Rect rect = this.b.s;
                b(d2, rect);
                int i9 = rect.left;
                if (i9 < i4) {
                    i4 = i9;
                }
                int i10 = rect.right;
                if (i10 > i6) {
                    i6 = i10;
                }
                int i11 = rect.top;
                if (i11 < i5) {
                    i5 = i11;
                }
                int i12 = rect.bottom;
                if (i12 > i7) {
                    i7 = i12;
                }
            }
            this.b.s.set(i4, i5, i6, i7);
            a(this.b.s, i2, i3);
        }

        public void d(RecyclerView recyclerView) {
        }

        public boolean d(o oVar, s sVar) {
            return false;
        }

        public int e(s sVar) {
            return 0;
        }

        public void e(o oVar, s sVar) {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public int f(s sVar) {
            return 0;
        }

        /* access modifiers changed from: 0000 */
        public void f(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.b = null;
                this.a = null;
                this.q = 0;
                this.r = 0;
            } else {
                this.b = recyclerView;
                this.a = recyclerView.o;
                this.q = recyclerView.getWidth();
                this.r = recyclerView.getHeight();
            }
            this.o = 1073741824;
            this.p = 1073741824;
        }

        public View g() {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return null;
            }
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null || this.a.c(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public void g(int i2) {
        }

        public void g(s sVar) {
        }

        public void h(int i2) {
            if (d(i2) != null) {
                this.a.e(i2);
            }
        }

        public int i() {
            return this.p;
        }

        public void i(int i2) {
        }

        public int j() {
            RecyclerView recyclerView = this.b;
            a adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.b();
            }
            return 0;
        }

        public int k() {
            return C1778vc.l(this.b);
        }

        public int l(View view) {
            return ((LayoutParams) view.getLayoutParams()).a();
        }

        public int m(View view) {
            return ((LayoutParams) view.getLayoutParams()).b.right;
        }

        public int n() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public void o(View view) {
            this.a.d(view);
        }

        public int p() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int q() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int r() {
            return this.q;
        }

        public int s() {
            return this.o;
        }

        /* access modifiers changed from: 0000 */
        public boolean t() {
            int e2 = e();
            for (int i2 = 0; i2 < e2; i2++) {
                android.view.ViewGroup.LayoutParams layoutParams = d(i2).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean u() {
            return this.i;
        }

        public boolean v() {
            return this.j;
        }

        public final boolean w() {
            return this.l;
        }

        public boolean x() {
            r rVar = this.g;
            return rVar != null && rVar.e();
        }

        public Parcelable y() {
            return null;
        }

        public void z() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public int e() {
            C0415i iVar = this.a;
            if (iVar != null) {
                return iVar.a();
            }
            return 0;
        }

        public int i(View view) {
            return view.getRight() + m(view);
        }

        public int k(View view) {
            return ((LayoutParams) view.getLayoutParams()).b.left;
        }

        public int l() {
            return C1778vc.m(this.b);
        }

        public int m() {
            return C1778vc.n(this.b);
        }

        public int n(View view) {
            return ((LayoutParams) view.getLayoutParams()).b.top;
        }

        public int o() {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public void e(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.f(i2);
            }
        }

        public int h() {
            return this.r;
        }

        public int j(View view) {
            return view.getTop() - n(view);
        }

        public View c(int i2) {
            int e2 = e();
            for (int i3 = 0; i3 < e2; i3++) {
                View d2 = d(i3);
                ViewHolder i4 = RecyclerView.i(d2);
                if (i4 != null && i4.getLayoutPosition() == i2 && !i4.shouldIgnore() && (this.b.ra.d() || !i4.isRemoved())) {
                    return d2;
                }
            }
            return null;
        }

        public int g(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int h(View view) {
            Rect rect = ((LayoutParams) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int e(View view) {
            return view.getBottom() + d(view);
        }

        public static int a(int i2, int i3, int i4) {
            int mode = MeasureSpec.getMode(i2);
            int size = MeasureSpec.getSize(i2);
            if (mode == Integer.MIN_VALUE) {
                return Math.min(size, Math.max(i3, i4));
            }
            if (mode != 1073741824) {
                size = Math.max(i3, i4);
            }
            return size;
        }

        /* access modifiers changed from: 0000 */
        public void e(RecyclerView recyclerView) {
            b(MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public void b(RecyclerView recyclerView, o oVar) {
            c(recyclerView);
        }

        public void c(View view, int i2) {
            a(view, i2, (LayoutParams) view.getLayoutParams());
        }

        public void a(String str) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.a(str);
            }
        }

        public void b(r rVar) {
            r rVar2 = this.g;
            if (!(rVar2 == null || rVar == rVar2 || !rVar2.e())) {
                this.g.h();
            }
            this.g = rVar;
            this.g.a(this.b, this);
        }

        /* access modifiers changed from: 0000 */
        public void c(o oVar) {
            int e2 = oVar.e();
            for (int i2 = e2 - 1; i2 >= 0; i2--) {
                View c2 = oVar.c(i2);
                ViewHolder i3 = RecyclerView.i(c2);
                if (!i3.shouldIgnore()) {
                    i3.setIsRecyclable(false);
                    if (i3.isTmpDetached()) {
                        this.b.removeDetachedView(c2, false);
                    }
                    f fVar = this.b.W;
                    if (fVar != null) {
                        fVar.d(i3);
                    }
                    i3.setIsRecyclable(true);
                    oVar.a(c2);
                }
            }
            oVar.c();
            if (e2 > 0) {
                this.b.invalidate();
            }
        }

        public boolean f() {
            RecyclerView recyclerView = this.b;
            return recyclerView != null && recyclerView.q;
        }

        /* access modifiers changed from: 0000 */
        public void a(RecyclerView recyclerView) {
            this.i = true;
            b(recyclerView);
        }

        public View d(int i2) {
            C0415i iVar = this.a;
            if (iVar != null) {
                return iVar.c(i2);
            }
            return null;
        }

        public void f(int i2) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                recyclerView.g(i2);
            }
        }

        public int d(View view) {
            return ((LayoutParams) view.getLayoutParams()).b.bottom;
        }

        private boolean d(RecyclerView recyclerView, int i2, int i3) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int o2 = o();
            int q2 = q();
            int r2 = r() - p();
            int h2 = h() - n();
            Rect rect = this.b.s;
            b(focusedChild, rect);
            if (rect.left - i2 >= r2 || rect.right - i2 <= o2 || rect.top - i3 >= h2 || rect.bottom - i3 <= q2) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: 0000 */
        public void a(RecyclerView recyclerView, o oVar) {
            this.i = false;
            b(recyclerView, oVar);
        }

        public int f(View view) {
            return view.getLeft() - k(view);
        }

        public void b(View view) {
            b(view, -1);
        }

        public boolean a(Runnable runnable) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void b(View view, int i2) {
            a(view, i2, false);
        }

        public void b(int i2) {
            a(i2, d(i2));
        }

        public LayoutParams a(android.view.ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof LayoutParams) {
                return new LayoutParams((LayoutParams) layoutParams);
            }
            if (layoutParams instanceof MarginLayoutParams) {
                return new LayoutParams((MarginLayoutParams) layoutParams);
            }
            return new LayoutParams(layoutParams);
        }

        /* access modifiers changed from: 0000 */
        public boolean b(View view, int i2, int i3, LayoutParams layoutParams) {
            return !this.k || !b(view.getMeasuredWidth(), i2, layoutParams.width) || !b(view.getMeasuredHeight(), i3, layoutParams.height);
        }

        private static boolean b(int i2, int i3, int i4) {
            int mode = MeasureSpec.getMode(i3);
            int size = MeasureSpec.getSize(i3);
            boolean z = false;
            if (i4 > 0 && i2 != i4) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                if (size >= i2) {
                    z = true;
                }
                return z;
            } else if (mode == 0) {
                return true;
            } else {
                if (mode != 1073741824) {
                    return false;
                }
                if (size == i2) {
                    z = true;
                }
                return z;
            }
        }

        public LayoutParams a(Context context, AttributeSet attributeSet) {
            return new LayoutParams(context, attributeSet);
        }

        public void b(View view, Rect rect) {
            RecyclerView.b(view, rect);
        }

        public void c(int i2, int i3) {
            this.b.setMeasuredDimension(i2, i3);
        }

        private int[] b(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            int[] iArr = new int[2];
            int o2 = o();
            int q2 = q();
            int r2 = r() - p();
            int h2 = h() - n();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width = rect.width() + left;
            int height = rect.height() + top;
            int i2 = left - o2;
            int min = Math.min(0, i2);
            int i3 = top - q2;
            int min2 = Math.min(0, i3);
            int i4 = width - r2;
            int max = Math.max(0, i4);
            int max2 = Math.max(0, height - h2);
            if (k() != 1) {
                if (min == 0) {
                    min = Math.min(i2, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i4);
            }
            if (min2 == 0) {
                min2 = Math.min(i3, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public void a(RecyclerView recyclerView, s sVar, int i2) {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void a(View view) {
            a(view, -1);
        }

        public void a(View view, int i2) {
            a(view, i2, true);
        }

        private void a(View view, int i2, boolean z) {
            ViewHolder i3 = RecyclerView.i(view);
            if (z || i3.isRemoved()) {
                this.b.p.a(i3);
            } else {
                this.b.p.g(i3);
            }
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i3.wasReturnedFromScrap() || i3.isScrap()) {
                if (i3.isScrap()) {
                    i3.unScrap();
                } else {
                    i3.clearReturnedFromScrapFlag();
                }
                this.a.a(view, i2, view.getLayoutParams(), false);
            } else if (view.getParent() == this.b) {
                int b2 = this.a.b(view);
                if (i2 == -1) {
                    i2 = this.a.a();
                }
                if (b2 == -1) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb.append(this.b.indexOfChild(view));
                    sb.append(this.b.i());
                    throw new IllegalStateException(sb.toString());
                } else if (b2 != i2) {
                    this.b.w.a(b2, i2);
                }
            } else {
                this.a.a(view, i2, false);
                layoutParams.c = true;
                r rVar = this.g;
                if (rVar != null && rVar.e()) {
                    this.g.b(view);
                }
            }
            if (layoutParams.d) {
                i3.itemView.invalidate();
                layoutParams.d = false;
            }
        }

        public void b(o oVar) {
            for (int e2 = e() - 1; e2 >= 0; e2--) {
                if (!RecyclerView.i(d(e2)).shouldIgnore()) {
                    a(e2, oVar);
                }
            }
        }

        public int b(o oVar, s sVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.v == null || !b()) {
                return 1;
            }
            return this.b.v.b();
        }

        private void a(int i2, View view) {
            this.a.a(i2);
        }

        public void a(View view, int i2, LayoutParams layoutParams) {
            ViewHolder i3 = RecyclerView.i(view);
            if (i3.isRemoved()) {
                this.b.p.a(i3);
            } else {
                this.b.p.g(i3);
            }
            this.a.a(view, i2, layoutParams, i3.isRemoved());
        }

        public void a(int i2, int i3) {
            View d2 = d(i2);
            if (d2 != null) {
                b(i2);
                c(d2, i3);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot move a child from non-existing index:");
            sb.append(i2);
            sb.append(this.b.toString());
            throw new IllegalArgumentException(sb.toString());
        }

        public void a(View view, o oVar) {
            o(view);
            oVar.b(view);
        }

        public void a(int i2, o oVar) {
            View d2 = d(i2);
            h(i2);
            oVar.b(d2);
        }

        public void a(o oVar) {
            for (int e2 = e() - 1; e2 >= 0; e2--) {
                a(oVar, e2, d(e2));
            }
        }

        private void a(o oVar, int i2, View view) {
            ViewHolder i3 = RecyclerView.i(view);
            if (!i3.shouldIgnore()) {
                if (!i3.isInvalid() || i3.isRemoved() || this.b.v.d()) {
                    b(i2);
                    oVar.c(view);
                    this.b.p.d(i3);
                } else {
                    h(i2);
                    oVar.b(i3);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(View view, int i2, int i3, LayoutParams layoutParams) {
            return view.isLayoutRequested() || !this.k || !b(view.getWidth(), i2, layoutParams.width) || !b(view.getHeight(), i3, layoutParams.height);
        }

        public void a(View view, int i2, int i3) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect j2 = this.b.j(view);
            int i4 = i3 + j2.top + j2.bottom;
            int a2 = a(r(), s(), o() + p() + layoutParams.leftMargin + layoutParams.rightMargin + i2 + j2.left + j2.right, layoutParams.width, a());
            int a3 = a(h(), i(), q() + n() + layoutParams.topMargin + layoutParams.bottomMargin + i4, layoutParams.height, b());
            if (a(view, a2, a3, layoutParams)) {
                view.measure(a2, a3);
            }
        }

        public static int a(int i2, int i3, int i4, int i5, boolean z) {
            int i6;
            int i7 = i2 - i4;
            int i8 = 0;
            int max = Math.max(0, i7);
            if (z) {
                if (i5 < 0) {
                    if (i5 == -1) {
                        if (i3 == Integer.MIN_VALUE || (i3 != 0 && i3 == 1073741824)) {
                            i6 = max;
                        } else {
                            i3 = 0;
                            i6 = 0;
                        }
                        i8 = i3;
                        max = i6;
                        return MeasureSpec.makeMeasureSpec(max, i8);
                    }
                    max = 0;
                    return MeasureSpec.makeMeasureSpec(max, i8);
                }
            } else if (i5 < 0) {
                if (i5 == -1) {
                    i8 = i3;
                } else {
                    if (i5 == -2) {
                        if (i3 == Integer.MIN_VALUE || i3 == 1073741824) {
                            i8 = Integer.MIN_VALUE;
                        }
                    }
                    max = 0;
                }
                return MeasureSpec.makeMeasureSpec(max, i8);
            }
            max = i5;
            i8 = 1073741824;
            return MeasureSpec.makeMeasureSpec(max, i8);
        }

        public void a(View view, int i2, int i3, int i4, int i5) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Rect rect = layoutParams.b;
            view.layout(i2 + rect.left + layoutParams.leftMargin, i3 + rect.top + layoutParams.topMargin, (i4 - rect.right) - layoutParams.rightMargin, (i5 - rect.bottom) - layoutParams.bottomMargin);
        }

        public void a(View view, boolean z, Rect rect) {
            if (z) {
                Rect rect2 = ((LayoutParams) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (this.b != null) {
                Matrix matrix = view.getMatrix();
                if (matrix != null && !matrix.isIdentity()) {
                    RectF rectF = this.b.u;
                    rectF.set(rect);
                    matrix.mapRect(rectF);
                    rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
                }
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public void a(View view, Rect rect) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.j(view));
            }
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return a(recyclerView, view, rect, z, false);
        }

        public boolean a(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] b2 = b(recyclerView, view, rect, z);
            int i2 = b2[0];
            int i3 = b2[1];
            if ((z2 && !d(recyclerView, i2, i3)) || (i2 == 0 && i3 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i2, i3);
            } else {
                recyclerView.i(i2, i3);
            }
            return true;
        }

        public boolean a(View view, boolean z, boolean z2) {
            boolean z3 = this.e.a(view, 24579) && this.f.a(view, 24579);
            return z ? z3 : !z3;
        }

        @Deprecated
        public boolean a(RecyclerView recyclerView, View view, View view2) {
            return x() || recyclerView.o();
        }

        public boolean a(RecyclerView recyclerView, s sVar, View view, View view2) {
            return a(recyclerView, view, view2);
        }

        public void a(RecyclerView recyclerView, int i2, int i3, Object obj) {
            c(recyclerView, i2, i3);
        }

        public void a(o oVar, s sVar, int i2, int i3) {
            this.b.c(i2, i3);
        }

        /* access modifiers changed from: 0000 */
        public void a(r rVar) {
            if (this.g == rVar) {
                this.g = null;
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(Mc mc) {
            RecyclerView recyclerView = this.b;
            a(recyclerView.l, recyclerView.ra, mc);
        }

        public void a(o oVar, s sVar, Mc mc) {
            if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
                mc.a(8192);
                mc.n(true);
            }
            if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
                mc.a(4096);
                mc.n(true);
            }
            mc.a((Object) defpackage.Mc.b.a(b(oVar, sVar), a(oVar, sVar), d(oVar, sVar), c(oVar, sVar)));
        }

        public void a(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            a(recyclerView.l, recyclerView.ra, accessibilityEvent);
        }

        public void a(o oVar, s sVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.b;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                a aVar = this.b.v;
                if (aVar != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(View view, Mc mc) {
            ViewHolder i2 = RecyclerView.i(view);
            if (i2 != null && !i2.isRemoved() && !this.a.c(i2.itemView)) {
                RecyclerView recyclerView = this.b;
                a(recyclerView.l, recyclerView.ra, view, mc);
            }
        }

        public void a(o oVar, s sVar, View view, Mc mc) {
            mc.b((Object) defpackage.Mc.c.a(b() ? l(view) : 0, 1, a() ? l(view) : 0, 1, false, false));
        }

        public int a(o oVar, s sVar) {
            RecyclerView recyclerView = this.b;
            if (recyclerView == null || recyclerView.v == null || !a()) {
                return 1;
            }
            return this.b.v.b();
        }

        /* access modifiers changed from: 0000 */
        public boolean a(int i2, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return a(recyclerView.l, recyclerView.ra, i2, bundle);
        }

        /* JADX WARNING: Removed duplicated region for block: B:24:0x0070 A[ADDED_TO_REGION] */
        public boolean a(o oVar, s sVar, int i2, Bundle bundle) {
            int i3;
            int i4;
            RecyclerView recyclerView = this.b;
            if (recyclerView == null) {
                return false;
            }
            if (i2 == 4096) {
                i4 = recyclerView.canScrollVertically(1) ? (h() - q()) - n() : 0;
                if (this.b.canScrollHorizontally(1)) {
                    i3 = (r() - o()) - p();
                    if (i4 != 0) {
                    }
                    this.b.i(i3, i4);
                    return true;
                }
            } else if (i2 != 8192) {
                i4 = 0;
            } else {
                i4 = recyclerView.canScrollVertically(-1) ? -((h() - q()) - n()) : 0;
                if (this.b.canScrollHorizontally(-1)) {
                    i3 = -((r() - o()) - p());
                    if (i4 != 0 && i3 == 0) {
                        return false;
                    }
                    this.b.i(i3, i4);
                    return true;
                }
            }
            i3 = 0;
            if (i4 != 0) {
            }
            this.b.i(i3, i4);
            return true;
        }

        /* access modifiers changed from: 0000 */
        public boolean a(View view, int i2, Bundle bundle) {
            RecyclerView recyclerView = this.b;
            return a(recyclerView.l, recyclerView.ra, view, i2, bundle);
        }

        public static b a(Context context, AttributeSet attributeSet, int i2, int i3) {
            b bVar = new b();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Jd.RecyclerView, i2, i3);
            bVar.a = obtainStyledAttributes.getInt(Jd.RecyclerView_android_orientation, 1);
            bVar.b = obtainStyledAttributes.getInt(Jd.RecyclerView_spanCount, 1);
            bVar.c = obtainStyledAttributes.getBoolean(Jd.RecyclerView_reverseLayout, false);
            bVar.d = obtainStyledAttributes.getBoolean(Jd.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return bVar;
        }
    }

    public interface j {
        void a(View view);

        void b(View view);
    }

    public static abstract class k {
        public abstract boolean a(int i, int i2);
    }

    public interface l {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        void a(boolean z);

        boolean b(RecyclerView recyclerView, MotionEvent motionEvent);
    }

    public static abstract class m {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void a(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class n {
        SparseArray<a> a = new SparseArray<>();
        private int b = 0;

        static class a {
            final ArrayList<ViewHolder> a = new ArrayList<>();
            int b = 5;
            long c = 0;
            long d = 0;

            a() {
            }
        }

        public ViewHolder a(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<ViewHolder> arrayList = aVar.a;
            return (ViewHolder) arrayList.remove(arrayList.size() - 1);
        }

        public void b() {
            for (int i = 0; i < this.a.size(); i++) {
                ((a) this.a.valueAt(i)).a.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            this.b--;
        }

        /* access modifiers changed from: 0000 */
        public void b(int i, long j) {
            a b2 = b(i);
            b2.c = a(b2.c, j);
        }

        public void a(ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            ArrayList<ViewHolder> arrayList = b(itemViewType).a;
            if (((a) this.a.get(itemViewType)).b > arrayList.size()) {
                viewHolder.resetInternal();
                arrayList.add(viewHolder);
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean b(int i, long j, long j2) {
            long j3 = b(i).c;
            return j3 == 0 || j + j3 < j2;
        }

        private a b(int i) {
            a aVar = (a) this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i, aVar2);
            return aVar2;
        }

        /* access modifiers changed from: 0000 */
        public long a(long j, long j2) {
            return j == 0 ? j2 : ((j / 4) * 3) + (j2 / 4);
        }

        /* access modifiers changed from: 0000 */
        public void a(int i, long j) {
            a b2 = b(i);
            b2.d = a(b2.d, j);
        }

        /* access modifiers changed from: 0000 */
        public boolean a(int i, long j, long j2) {
            long j3 = b(i).d;
            return j3 == 0 || j + j3 < j2;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            this.b++;
        }

        /* access modifiers changed from: 0000 */
        public void a(a aVar, a aVar2, boolean z) {
            if (aVar != null) {
                c();
            }
            if (!z && this.b == 0) {
                b();
            }
            if (aVar2 != null) {
                a();
            }
        }
    }

    public final class o {
        final ArrayList<ViewHolder> a = new ArrayList<>();
        ArrayList<ViewHolder> b = null;
        final ArrayList<ViewHolder> c = new ArrayList<>();
        private final List<ViewHolder> d = Collections.unmodifiableList(this.a);
        private int e = 2;
        int f = 2;
        n g;
        private t h;

        public o() {
        }

        private void e(ViewHolder viewHolder) {
            if (RecyclerView.this.n()) {
                View view = viewHolder.itemView;
                if (C1778vc.j(view) == 0) {
                    C1778vc.f(view, 1);
                }
                if (!C1778vc.v(view)) {
                    viewHolder.addFlags(16384);
                    C1778vc.a(view, RecyclerView.this.ya.b());
                }
            }
        }

        public void a() {
            this.a.clear();
            i();
        }

        /* access modifiers changed from: 0000 */
        public View b(int i2, boolean z) {
            return a(i2, z, Long.MAX_VALUE).itemView;
        }

        /* access modifiers changed from: 0000 */
        public void c(View view) {
            ViewHolder i2 = RecyclerView.i(view);
            if (!i2.hasAnyOfTheFlags(12) && i2.isUpdated() && !RecyclerView.this.a(i2)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                i2.setScrapContainer(this, true);
                this.b.add(i2);
            } else if (!i2.isInvalid() || i2.isRemoved() || RecyclerView.this.v.d()) {
                i2.setScrapContainer(this, false);
                this.a.add(i2);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                sb.append(RecyclerView.this.i());
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean d(ViewHolder viewHolder) {
            if (viewHolder.isRemoved()) {
                return RecyclerView.this.ra.d();
            }
            int i2 = viewHolder.mPosition;
            if (i2 < 0 || i2 >= RecyclerView.this.v.b()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistency detected. Invalid view holder adapter position");
                sb.append(viewHolder);
                sb.append(RecyclerView.this.i());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            boolean z = false;
            if (!RecyclerView.this.ra.d() && RecyclerView.this.v.b(viewHolder.mPosition) != viewHolder.getItemViewType()) {
                return false;
            }
            if (!RecyclerView.this.v.d()) {
                return true;
            }
            if (viewHolder.getItemId() == RecyclerView.this.v.a(viewHolder.mPosition)) {
                z = true;
            }
            return z;
        }

        public void f(int i2) {
            this.e = i2;
            j();
        }

        /* access modifiers changed from: 0000 */
        public void g() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                LayoutParams layoutParams = (LayoutParams) ((ViewHolder) this.c.get(i2)).itemView.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.c = true;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void h() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                ViewHolder viewHolder = (ViewHolder) this.c.get(i2);
                if (viewHolder != null) {
                    viewHolder.addFlags(6);
                    viewHolder.addChangePayload(null);
                }
            }
            a aVar = RecyclerView.this.v;
            if (aVar == null || !aVar.d()) {
                i();
            }
        }

        /* access modifiers changed from: 0000 */
        public void i() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                e(size);
            }
            this.c.clear();
            if (RecyclerView.f) {
                RecyclerView.this.qa.a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void j() {
            i iVar = RecyclerView.this.w;
            this.f = this.e + (iVar != null ? iVar.m : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                e(size);
            }
        }

        public void b(View view) {
            ViewHolder i2 = RecyclerView.i(view);
            if (i2.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (i2.isScrap()) {
                i2.unScrap();
            } else if (i2.wasReturnedFromScrap()) {
                i2.clearReturnedFromScrapFlag();
            }
            b(i2);
        }

        private boolean a(ViewHolder viewHolder, int i2, int i3, long j) {
            viewHolder.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = viewHolder.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != Long.MAX_VALUE && !this.g.a(itemViewType, nanoTime, j)) {
                return false;
            }
            RecyclerView.this.v.a(viewHolder, i2);
            this.g.a(viewHolder.getItemViewType(), RecyclerView.this.getNanoTime() - nanoTime);
            e(viewHolder);
            if (RecyclerView.this.ra.d()) {
                viewHolder.mPreLayoutPosition = i3;
            }
            return true;
        }

        public List<ViewHolder> f() {
            return this.d;
        }

        private void f(ViewHolder viewHolder) {
            View view = viewHolder.itemView;
            if (view instanceof ViewGroup) {
                a((ViewGroup) view, false);
            }
        }

        /* access modifiers changed from: 0000 */
        public void b(ViewHolder viewHolder) {
            boolean z;
            boolean z2 = false;
            if (viewHolder.isScrap() || viewHolder.itemView.getParent() != null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Scrapped or attached views may not be recycled. isScrap:");
                sb.append(viewHolder.isScrap());
                sb.append(" isAttached:");
                if (viewHolder.itemView.getParent() != null) {
                    z2 = true;
                }
                sb.append(z2);
                sb.append(RecyclerView.this.i());
                throw new IllegalArgumentException(sb.toString());
            } else if (viewHolder.isTmpDetached()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb2.append(viewHolder);
                sb2.append(RecyclerView.this.i());
                throw new IllegalArgumentException(sb2.toString());
            } else if (!viewHolder.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = viewHolder.doesTransientStatePreventRecycling();
                a aVar = RecyclerView.this.v;
                if ((aVar != null && doesTransientStatePreventRecycling && aVar.a(viewHolder)) || viewHolder.isRecyclable()) {
                    if (this.f <= 0 || viewHolder.hasAnyOfTheFlags(526)) {
                        z = false;
                    } else {
                        int size = this.c.size();
                        if (size >= this.f && size > 0) {
                            e(0);
                            size--;
                        }
                        if (RecyclerView.f && size > 0 && !RecyclerView.this.qa.a(viewHolder.mPosition)) {
                            int i2 = size - 1;
                            while (i2 >= 0) {
                                if (!RecyclerView.this.qa.a(((ViewHolder) this.c.get(i2)).mPosition)) {
                                    break;
                                }
                                i2--;
                            }
                            size = i2 + 1;
                        }
                        this.c.add(size, viewHolder);
                        z = true;
                    }
                    if (!z) {
                        a(viewHolder, true);
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                RecyclerView.this.p.h(viewHolder);
                if (!z && !z2 && doesTransientStatePreventRecycling) {
                    viewHolder.mOwnerRecyclerView = null;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
                sb3.append(RecyclerView.this.i());
                throw new IllegalArgumentException(sb3.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        public void e(int i2) {
            a((ViewHolder) this.c.get(i2), true);
            this.c.remove(i2);
        }

        public View d(int i2) {
            return b(i2, false);
        }

        /* access modifiers changed from: 0000 */
        public n d() {
            if (this.g == null) {
                this.g = new n();
            }
            return this.g;
        }

        /* access modifiers changed from: 0000 */
        public void c(ViewHolder viewHolder) {
            if (viewHolder.mInChangeScrap) {
                this.b.remove(viewHolder);
            } else {
                this.a.remove(viewHolder);
            }
            viewHolder.mScrapContainer = null;
            viewHolder.mInChangeScrap = false;
            viewHolder.clearReturnedFromScrapFlag();
        }

        /* access modifiers changed from: 0000 */
        public int e() {
            return this.a.size();
        }

        public int a(int i2) {
            if (i2 < 0 || i2 >= RecyclerView.this.ra.a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("invalid position ");
                sb.append(i2);
                sb.append(". State ");
                sb.append("item count is ");
                sb.append(RecyclerView.this.ra.a());
                sb.append(RecyclerView.this.i());
                throw new IndexOutOfBoundsException(sb.toString());
            } else if (!RecyclerView.this.ra.d()) {
                return i2;
            } else {
                return RecyclerView.this.n.b(i2);
            }
        }

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x005f  */
        /* JADX WARNING: Removed duplicated region for block: B:78:0x01a6  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01c9  */
        /* JADX WARNING: Removed duplicated region for block: B:94:0x0202  */
        /* JADX WARNING: Removed duplicated region for block: B:95:0x0210  */
        public ViewHolder a(int i2, boolean z, long j) {
            boolean z2;
            ViewHolder viewHolder;
            ViewHolder viewHolder2;
            boolean z3;
            android.view.ViewGroup.LayoutParams layoutParams;
            LayoutParams layoutParams2;
            int i3 = i2;
            boolean z4 = z;
            if (i3 < 0 || i3 >= RecyclerView.this.ra.a()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Invalid item position ");
                sb.append(i3);
                sb.append("(");
                sb.append(i3);
                sb.append("). Item count:");
                sb.append(RecyclerView.this.ra.a());
                sb.append(RecyclerView.this.i());
                throw new IndexOutOfBoundsException(sb.toString());
            }
            boolean z5 = true;
            if (RecyclerView.this.ra.d()) {
                viewHolder = b(i2);
                if (viewHolder != null) {
                    z2 = true;
                    if (viewHolder == null) {
                        viewHolder = a(i2, z);
                        if (viewHolder != null) {
                            if (!d(viewHolder)) {
                                if (!z4) {
                                    viewHolder.addFlags(4);
                                    if (viewHolder.isScrap()) {
                                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                                        viewHolder.unScrap();
                                    } else if (viewHolder.wasReturnedFromScrap()) {
                                        viewHolder.clearReturnedFromScrapFlag();
                                    }
                                    b(viewHolder);
                                }
                                viewHolder = null;
                            } else {
                                z2 = true;
                            }
                        }
                    }
                    if (viewHolder == null) {
                        int b2 = RecyclerView.this.n.b(i3);
                        if (b2 < 0 || b2 >= RecyclerView.this.v.b()) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Inconsistency detected. Invalid item position ");
                            sb2.append(i3);
                            sb2.append("(offset:");
                            sb2.append(b2);
                            sb2.append(").");
                            sb2.append("state:");
                            sb2.append(RecyclerView.this.ra.a());
                            sb2.append(RecyclerView.this.i());
                            throw new IndexOutOfBoundsException(sb2.toString());
                        }
                        int b3 = RecyclerView.this.v.b(b2);
                        if (RecyclerView.this.v.d()) {
                            viewHolder = a(RecyclerView.this.v.a(b2), b3, z4);
                            if (viewHolder != null) {
                                viewHolder.mPosition = b2;
                                z2 = true;
                            }
                        }
                        if (viewHolder == null) {
                            t tVar = this.h;
                            if (tVar != null) {
                                View a2 = tVar.a(this, i3, b3);
                                if (a2 != null) {
                                    viewHolder = RecyclerView.this.h(a2);
                                    if (viewHolder == null) {
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("getViewForPositionAndType returned a view which does not have a ViewHolder");
                                        sb3.append(RecyclerView.this.i());
                                        throw new IllegalArgumentException(sb3.toString());
                                    } else if (viewHolder.shouldIgnore()) {
                                        StringBuilder sb4 = new StringBuilder();
                                        sb4.append("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                                        sb4.append(RecyclerView.this.i());
                                        throw new IllegalArgumentException(sb4.toString());
                                    }
                                }
                            }
                        }
                        if (viewHolder == null) {
                            viewHolder = d().a(b3);
                            if (viewHolder != null) {
                                viewHolder.resetInternal();
                                if (RecyclerView.c) {
                                    f(viewHolder);
                                }
                            }
                        }
                        if (viewHolder == null) {
                            long nanoTime = RecyclerView.this.getNanoTime();
                            if (j != Long.MAX_VALUE && !this.g.b(b3, nanoTime, j)) {
                                return null;
                            }
                            RecyclerView recyclerView = RecyclerView.this;
                            ViewHolder a3 = recyclerView.v.a((ViewGroup) recyclerView, b3);
                            if (RecyclerView.f) {
                                RecyclerView e2 = RecyclerView.e(a3.itemView);
                                if (e2 != null) {
                                    a3.mNestedRecyclerView = new WeakReference<>(e2);
                                }
                            }
                            this.g.b(b3, RecyclerView.this.getNanoTime() - nanoTime);
                            viewHolder2 = a3;
                            boolean z6 = z2;
                            if (z6 && !RecyclerView.this.ra.d() && viewHolder2.hasAnyOfTheFlags(8192)) {
                                viewHolder2.setFlags(0, 8192);
                                if (RecyclerView.this.ra.k) {
                                    int a4 = f.a(viewHolder2) | 4096;
                                    RecyclerView recyclerView2 = RecyclerView.this;
                                    RecyclerView.this.a(viewHolder2, recyclerView2.W.a(recyclerView2.ra, viewHolder2, a4, viewHolder2.getUnmodifiedPayloads()));
                                }
                            }
                            if (!RecyclerView.this.ra.d() && viewHolder2.isBound()) {
                                viewHolder2.mPreLayoutPosition = i3;
                            } else if (!viewHolder2.isBound() || viewHolder2.needsUpdate() || viewHolder2.isInvalid()) {
                                z3 = a(viewHolder2, RecyclerView.this.n.b(i3), i2, j);
                                layoutParams = viewHolder2.itemView.getLayoutParams();
                                if (layoutParams != null) {
                                    layoutParams2 = (LayoutParams) RecyclerView.this.generateDefaultLayoutParams();
                                    viewHolder2.itemView.setLayoutParams(layoutParams2);
                                } else if (!RecyclerView.this.checkLayoutParams(layoutParams)) {
                                    layoutParams2 = (LayoutParams) RecyclerView.this.generateLayoutParams(layoutParams);
                                    viewHolder2.itemView.setLayoutParams(layoutParams2);
                                } else {
                                    layoutParams2 = (LayoutParams) layoutParams;
                                }
                                layoutParams2.a = viewHolder2;
                                if (!z6 || !z3) {
                                    z5 = false;
                                }
                                layoutParams2.d = z5;
                                return viewHolder2;
                            }
                            z3 = false;
                            layoutParams = viewHolder2.itemView.getLayoutParams();
                            if (layoutParams != null) {
                            }
                            layoutParams2.a = viewHolder2;
                            z5 = false;
                            layoutParams2.d = z5;
                            return viewHolder2;
                        }
                    }
                    viewHolder2 = viewHolder;
                    boolean z62 = z2;
                    viewHolder2.setFlags(0, 8192);
                    if (RecyclerView.this.ra.k) {
                    }
                    if (!RecyclerView.this.ra.d()) {
                    }
                    z3 = a(viewHolder2, RecyclerView.this.n.b(i3), i2, j);
                    layoutParams = viewHolder2.itemView.getLayoutParams();
                    if (layoutParams != null) {
                    }
                    layoutParams2.a = viewHolder2;
                    z5 = false;
                    layoutParams2.d = z5;
                    return viewHolder2;
                }
            } else {
                viewHolder = null;
            }
            z2 = false;
            if (viewHolder == null) {
            }
            if (viewHolder == null) {
            }
            viewHolder2 = viewHolder;
            boolean z622 = z2;
            viewHolder2.setFlags(0, 8192);
            if (RecyclerView.this.ra.k) {
            }
            if (!RecyclerView.this.ra.d()) {
            }
            z3 = a(viewHolder2, RecyclerView.this.n.b(i3), i2, j);
            layoutParams = viewHolder2.itemView.getLayoutParams();
            if (layoutParams != null) {
            }
            layoutParams2.a = viewHolder2;
            z5 = false;
            layoutParams2.d = z5;
            return viewHolder2;
        }

        /* access modifiers changed from: 0000 */
        public View c(int i2) {
            return ((ViewHolder) this.a.get(i2)).itemView;
        }

        /* access modifiers changed from: 0000 */
        public void c() {
            this.a.clear();
            ArrayList<ViewHolder> arrayList = this.b;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        /* access modifiers changed from: 0000 */
        public void c(int i2, int i3) {
            int i4 = i3 + i2;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) this.c.get(size);
                if (viewHolder != null) {
                    int i5 = viewHolder.mPosition;
                    if (i5 >= i2 && i5 < i4) {
                        viewHolder.addFlags(2);
                        e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public ViewHolder b(int i2) {
            ArrayList<ViewHolder> arrayList = this.b;
            if (arrayList != null) {
                int size = arrayList.size();
                if (size != 0) {
                    int i3 = 0;
                    int i4 = 0;
                    while (i4 < size) {
                        ViewHolder viewHolder = (ViewHolder) this.b.get(i4);
                        if (viewHolder.wasReturnedFromScrap() || viewHolder.getLayoutPosition() != i2) {
                            i4++;
                        } else {
                            viewHolder.addFlags(32);
                            return viewHolder;
                        }
                    }
                    if (RecyclerView.this.v.d()) {
                        int b2 = RecyclerView.this.n.b(i2);
                        if (b2 > 0 && b2 < RecyclerView.this.v.b()) {
                            long a2 = RecyclerView.this.v.a(b2);
                            while (i3 < size) {
                                ViewHolder viewHolder2 = (ViewHolder) this.b.get(i3);
                                if (viewHolder2.wasReturnedFromScrap() || viewHolder2.getItemId() != a2) {
                                    i3++;
                                } else {
                                    viewHolder2.addFlags(32);
                                    return viewHolder2;
                                }
                            }
                        }
                    }
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public void b(int i2, int i3) {
            int i4;
            int i5;
            int i6;
            if (i2 < i3) {
                i6 = i2;
                i5 = i3;
                i4 = -1;
            } else {
                i5 = i2;
                i6 = i3;
                i4 = 1;
            }
            int size = this.c.size();
            for (int i7 = 0; i7 < size; i7++) {
                ViewHolder viewHolder = (ViewHolder) this.c.get(i7);
                if (viewHolder != null) {
                    int i8 = viewHolder.mPosition;
                    if (i8 >= i6 && i8 <= i5) {
                        if (i8 == i2) {
                            viewHolder.offsetPosition(i3 - i2, false);
                        } else {
                            viewHolder.offsetPosition(i4, false);
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            int size = this.c.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((ViewHolder) this.c.get(i2)).clearOldPosition();
            }
            int size2 = this.a.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((ViewHolder) this.a.get(i3)).clearOldPosition();
            }
            ArrayList<ViewHolder> arrayList = this.b;
            if (arrayList != null) {
                int size3 = arrayList.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    ((ViewHolder) this.b.get(i4)).clearOldPosition();
                }
            }
        }

        private void a(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    a((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                } else {
                    int visibility = viewGroup.getVisibility();
                    viewGroup.setVisibility(4);
                    viewGroup.setVisibility(visibility);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(ViewHolder viewHolder, boolean z) {
            RecyclerView.b(viewHolder);
            if (viewHolder.hasAnyOfTheFlags(16384)) {
                viewHolder.setFlags(0, 16384);
                C1778vc.a(viewHolder.itemView, (C0273Wb) null);
            }
            if (z) {
                a(viewHolder);
            }
            viewHolder.mOwnerRecyclerView = null;
            d().a(viewHolder);
        }

        /* access modifiers changed from: 0000 */
        public void a(View view) {
            ViewHolder i2 = RecyclerView.i(view);
            i2.mScrapContainer = null;
            i2.mInChangeScrap = false;
            i2.clearReturnedFromScrapFlag();
            b(i2);
        }

        /* access modifiers changed from: 0000 */
        public ViewHolder a(int i2, boolean z) {
            int size = this.a.size();
            int i3 = 0;
            int i4 = 0;
            while (i4 < size) {
                ViewHolder viewHolder = (ViewHolder) this.a.get(i4);
                if (viewHolder.wasReturnedFromScrap() || viewHolder.getLayoutPosition() != i2 || viewHolder.isInvalid() || (!RecyclerView.this.ra.h && viewHolder.isRemoved())) {
                    i4++;
                } else {
                    viewHolder.addFlags(32);
                    return viewHolder;
                }
            }
            if (!z) {
                View b2 = RecyclerView.this.o.b(i2);
                if (b2 != null) {
                    ViewHolder i5 = RecyclerView.i(b2);
                    RecyclerView.this.o.f(b2);
                    int b3 = RecyclerView.this.o.b(b2);
                    if (b3 != -1) {
                        RecyclerView.this.o.a(b3);
                        c(b2);
                        i5.addFlags(8224);
                        return i5;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("layout index should not be -1 after unhiding a view:");
                    sb.append(i5);
                    sb.append(RecyclerView.this.i());
                    throw new IllegalStateException(sb.toString());
                }
            }
            int size2 = this.c.size();
            while (i3 < size2) {
                ViewHolder viewHolder2 = (ViewHolder) this.c.get(i3);
                if (viewHolder2.isInvalid() || viewHolder2.getLayoutPosition() != i2) {
                    i3++;
                } else {
                    if (!z) {
                        this.c.remove(i3);
                    }
                    return viewHolder2;
                }
            }
            return null;
        }

        /* access modifiers changed from: 0000 */
        public ViewHolder a(long j, int i2, boolean z) {
            for (int size = this.a.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) this.a.get(size);
                if (viewHolder.getItemId() == j && !viewHolder.wasReturnedFromScrap()) {
                    if (i2 == viewHolder.getItemViewType()) {
                        viewHolder.addFlags(32);
                        if (viewHolder.isRemoved() && !RecyclerView.this.ra.d()) {
                            viewHolder.setFlags(2, 14);
                        }
                        return viewHolder;
                    } else if (!z) {
                        this.a.remove(size);
                        RecyclerView.this.removeDetachedView(viewHolder.itemView, false);
                        a(viewHolder.itemView);
                    }
                }
            }
            int size2 = this.c.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    return null;
                }
                ViewHolder viewHolder2 = (ViewHolder) this.c.get(size2);
                if (viewHolder2.getItemId() == j) {
                    if (i2 == viewHolder2.getItemViewType()) {
                        if (!z) {
                            this.c.remove(size2);
                        }
                        return viewHolder2;
                    } else if (!z) {
                        e(size2);
                        return null;
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(ViewHolder viewHolder) {
            p pVar = RecyclerView.this.x;
            if (pVar != null) {
                pVar.a(viewHolder);
            }
            a aVar = RecyclerView.this.v;
            if (aVar != null) {
                aVar.d(viewHolder);
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.ra != null) {
                recyclerView.p.h(viewHolder);
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(a aVar, a aVar2, boolean z) {
            a();
            d().a(aVar, aVar2, z);
        }

        /* access modifiers changed from: 0000 */
        public void a(int i2, int i3) {
            int size = this.c.size();
            for (int i4 = 0; i4 < size; i4++) {
                ViewHolder viewHolder = (ViewHolder) this.c.get(i4);
                if (viewHolder != null && viewHolder.mPosition >= i2) {
                    viewHolder.offsetPosition(i3, true);
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(int i2, int i3, boolean z) {
            int i4 = i2 + i3;
            for (int size = this.c.size() - 1; size >= 0; size--) {
                ViewHolder viewHolder = (ViewHolder) this.c.get(size);
                if (viewHolder != null) {
                    int i5 = viewHolder.mPosition;
                    if (i5 >= i4) {
                        viewHolder.offsetPosition(-i3, z);
                    } else if (i5 >= i2) {
                        viewHolder.addFlags(8);
                        e(size);
                    }
                }
            }
        }

        /* access modifiers changed from: 0000 */
        public void a(t tVar) {
            this.h = tVar;
        }

        /* access modifiers changed from: 0000 */
        public void a(n nVar) {
            n nVar2 = this.g;
            if (nVar2 != null) {
                nVar2.c();
            }
            this.g = nVar;
            if (this.g != null && RecyclerView.this.getAdapter() != null) {
                this.g.a();
            }
        }
    }

    public interface p {
        void a(ViewHolder viewHolder);
    }

    private class q extends c {
        q() {
        }

        public void a() {
            RecyclerView.this.a((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.ra.g = true;
            recyclerView.b(true);
            if (!RecyclerView.this.n.c()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void b(int i, int i2) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.n.b(i, i2)) {
                b();
            }
        }

        public void c(int i, int i2) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.n.c(i, i2)) {
                b();
            }
        }

        /* access modifiers changed from: 0000 */
        public void b() {
            if (RecyclerView.e) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.C && recyclerView.B) {
                    C1778vc.a((View) recyclerView, recyclerView.r);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.K = true;
            recyclerView2.requestLayout();
        }

        public void a(int i, int i2, Object obj) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.n.a(i, i2, obj)) {
                b();
            }
        }

        public void a(int i, int i2, int i3) {
            RecyclerView.this.a((String) null);
            if (RecyclerView.this.n.a(i, i2, i3)) {
                b();
            }
        }
    }

    public static abstract class r {
        private int a = -1;
        private RecyclerView b;
        private i c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g = new a(0, 0);
        private boolean h;

        public static class a {
            private int a;
            private int b;
            private int c;
            private int d;
            private Interpolator e;
            private boolean f;
            private int g;

            public a(int i, int i2) {
                this(i, i2, Integer.MIN_VALUE, null);
            }

            private void b() {
                if (this.e != null && this.c < 1) {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else if (this.c < 1) {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
            }

            public void a(int i) {
                this.d = i;
            }

            public a(int i, int i2, int i3, Interpolator interpolator) {
                this.d = -1;
                this.f = false;
                this.g = 0;
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
            }

            /* access modifiers changed from: 0000 */
            public boolean a() {
                return this.d >= 0;
            }

            /* access modifiers changed from: 0000 */
            public void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.e(i);
                    this.f = false;
                    return;
                }
                if (this.f) {
                    b();
                    Interpolator interpolator = this.e;
                    if (interpolator == null) {
                        int i2 = this.c;
                        if (i2 == Integer.MIN_VALUE) {
                            recyclerView.oa.b(this.a, this.b);
                        } else {
                            recyclerView.oa.a(this.a, this.b, i2);
                        }
                    } else {
                        recyclerView.oa.a(this.a, this.b, this.c, interpolator);
                    }
                    this.g++;
                    if (this.g > 10) {
                        Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                    }
                    this.f = false;
                } else {
                    this.g = 0;
                }
            }

            public void a(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }
        }

        public interface b {
            PointF a(int i);
        }

        /* access modifiers changed from: protected */
        public abstract void a(int i, int i2, s sVar, a aVar);

        /* access modifiers changed from: protected */
        public abstract void a(View view, s sVar, a aVar);

        /* access modifiers changed from: 0000 */
        public void a(RecyclerView recyclerView, i iVar) {
            if (this.h) {
                StringBuilder sb = new StringBuilder();
                sb.append("An instance of ");
                sb.append(getClass().getSimpleName());
                sb.append(" was started ");
                sb.append("more than once. Each instance of");
                sb.append(getClass().getSimpleName());
                sb.append(" ");
                sb.append("is intended to only be used once. You should create a new instance for ");
                sb.append("each use.");
                Log.w("RecyclerView", sb.toString());
            }
            this.b = recyclerView;
            this.c = iVar;
            int i = this.a;
            if (i != -1) {
                this.b.ra.a = i;
                this.e = true;
                this.d = true;
                this.f = b(c());
                f();
                this.b.oa.a();
                this.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public i b() {
            return this.c;
        }

        public void c(int i) {
            this.a = i;
        }

        public boolean d() {
            return this.d;
        }

        public boolean e() {
            return this.e;
        }

        /* access modifiers changed from: protected */
        public abstract void f();

        /* access modifiers changed from: protected */
        public abstract void g();

        /* access modifiers changed from: protected */
        public final void h() {
            if (this.e) {
                this.e = false;
                g();
                this.b.ra.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.a(this);
                this.c = null;
                this.b = null;
            }
        }

        public View b(int i) {
            return this.b.w.c(i);
        }

        public int c() {
            return this.a;
        }

        /* access modifiers changed from: protected */
        public void b(View view) {
            if (a(view) == c()) {
                this.f = view;
            }
        }

        public PointF a(int i) {
            i b2 = b();
            if (b2 instanceof b) {
                return ((b) b2).a(i);
            }
            StringBuilder sb = new StringBuilder();
            sb.append("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            sb.append(b.class.getCanonicalName());
            Log.w("RecyclerView", sb.toString());
            return null;
        }

        /* access modifiers changed from: 0000 */
        public void a(int i, int i2) {
            RecyclerView recyclerView = this.b;
            if (!this.e || this.a == -1 || recyclerView == null) {
                h();
            }
            if (this.d && this.f == null && this.c != null) {
                PointF a2 = a(this.a);
                if (!(a2 == null || (a2.x == 0.0f && a2.y == 0.0f))) {
                    recyclerView.a((int) Math.signum(a2.x), (int) Math.signum(a2.y), (int[]) null);
                }
            }
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (a(view) == this.a) {
                    a(this.f, recyclerView.ra, this.g);
                    this.g.a(recyclerView);
                    h();
                } else {
                    Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                a(i, i2, recyclerView.ra, this.g);
                boolean a3 = this.g.a();
                this.g.a(recyclerView);
                if (!a3) {
                    return;
                }
                if (this.e) {
                    this.d = true;
                    recyclerView.oa.a();
                    return;
                }
                h();
            }
        }

        public int a(View view) {
            return this.b.g(view);
        }

        public int a() {
            return this.b.w.e();
        }

        /* access modifiers changed from: protected */
        public void a(PointF pointF) {
            float f2 = pointF.x;
            float f3 = f2 * f2;
            float f4 = pointF.y;
            float sqrt = (float) Math.sqrt((double) (f3 + (f4 * f4)));
            pointF.x /= sqrt;
            pointF.y /= sqrt;
        }
    }

    public static class s {
        int a = -1;
        private SparseArray<Object> b;
        int c = 0;
        int d = 0;
        int e = 1;
        int f = 0;
        boolean g = false;
        boolean h = false;
        boolean i = false;
        boolean j = false;
        boolean k = false;
        boolean l = false;
        int m;
        long n;
        int o;
        int p;
        int q;

        /* access modifiers changed from: 0000 */
        public void a(int i2) {
            if ((this.e & i2) == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Layout state should be one of ");
                sb.append(Integer.toBinaryString(i2));
                sb.append(" but it is ");
                sb.append(Integer.toBinaryString(this.e));
                throw new IllegalStateException(sb.toString());
            }
        }

        public int b() {
            return this.a;
        }

        public boolean c() {
            return this.a != -1;
        }

        public boolean d() {
            return this.h;
        }

        public boolean e() {
            return this.l;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("State{mTargetPosition=");
            sb.append(this.a);
            sb.append(", mData=");
            sb.append(this.b);
            sb.append(", mItemCount=");
            sb.append(this.f);
            sb.append(", mIsMeasuring=");
            sb.append(this.j);
            sb.append(", mPreviousLayoutItemCount=");
            sb.append(this.c);
            sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            sb.append(this.d);
            sb.append(", mStructureChanged=");
            sb.append(this.g);
            sb.append(", mInPreLayout=");
            sb.append(this.h);
            sb.append(", mRunSimpleAnimations=");
            sb.append(this.k);
            sb.append(", mRunPredictiveAnimations=");
            sb.append(this.l);
            sb.append('}');
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        public void a(a aVar) {
            this.e = 1;
            this.f = aVar.b();
            this.h = false;
            this.i = false;
            this.j = false;
        }

        public int a() {
            return this.h ? this.c - this.d : this.f;
        }
    }

    public static abstract class t {
        public abstract View a(o oVar, int i, int i2);
    }

    class u implements Runnable {
        private int a;
        private int b;
        OverScroller c;
        Interpolator d = RecyclerView.j;
        private boolean e = false;
        private boolean f = false;

        u() {
            this.c = new OverScroller(RecyclerView.this.getContext(), RecyclerView.j);
        }

        private void c() {
            this.f = false;
            this.e = true;
        }

        private void d() {
            this.e = false;
            if (this.f) {
                a();
            }
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            if (this.e) {
                this.f = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            C1778vc.a((View) RecyclerView.this, (Runnable) this);
        }

        public void b(int i, int i2) {
            a(i, i2, 0, 0);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:45:0x00eb, code lost:
            if (r8 > 0) goto L_0x00ef;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00e7  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f7  */
        public void run() {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            if (RecyclerView.this.w == null) {
                b();
                return;
            }
            c();
            RecyclerView.this.b();
            OverScroller overScroller = this.c;
            r rVar = RecyclerView.this.w.g;
            if (overScroller.computeScrollOffset()) {
                int[] iArr = RecyclerView.this.Da;
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i6 = currX - this.a;
                int i7 = currY - this.b;
                this.a = currX;
                this.b = currY;
                if (RecyclerView.this.a(i6, i7, iArr, (int[]) null, 1)) {
                    i6 -= iArr[0];
                    i7 -= iArr[1];
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.v != null) {
                    recyclerView.a(i6, i7, recyclerView.Fa);
                    int[] iArr2 = RecyclerView.this.Fa;
                    i3 = iArr2[0];
                    i4 = iArr2[1];
                    i2 = i6 - i3;
                    i = i7 - i4;
                    if (rVar != null && !rVar.d() && rVar.e()) {
                        int a2 = RecyclerView.this.ra.a();
                        if (a2 == 0) {
                            rVar.h();
                        } else if (rVar.c() >= a2) {
                            rVar.c(a2 - 1);
                            rVar.a(i6 - i2, i7 - i);
                        } else {
                            rVar.a(i6 - i2, i7 - i);
                        }
                    }
                } else {
                    i4 = 0;
                    i3 = 0;
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.y.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.b(i6, i7);
                }
                if (!RecyclerView.this.a(i3, i4, i2, i, (int[]) null, 1) && !(i2 == 0 && i == 0)) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i2 != currX) {
                        if (i2 < 0) {
                            i5 = -currVelocity;
                        } else if (i2 > 0) {
                            i5 = currVelocity;
                        }
                        if (i != currY) {
                            if (i < 0) {
                                currVelocity = -currVelocity;
                            }
                            if (RecyclerView.this.getOverScrollMode() != 2) {
                                RecyclerView.this.a(i5, currVelocity);
                            }
                            if ((i5 != 0 || i2 == currX || overScroller.getFinalX() == 0) && (currVelocity != 0 || i == currY || overScroller.getFinalY() == 0)) {
                                overScroller.abortAnimation();
                            }
                        }
                        currVelocity = 0;
                        if (RecyclerView.this.getOverScrollMode() != 2) {
                        }
                        overScroller.abortAnimation();
                    }
                    i5 = 0;
                    if (i != currY) {
                    }
                    currVelocity = 0;
                    if (RecyclerView.this.getOverScrollMode() != 2) {
                    }
                    overScroller.abortAnimation();
                }
                if (!(i3 == 0 && i4 == 0)) {
                    RecyclerView.this.d(i3, i4);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = (i6 == 0 && i7 == 0) || (i6 != 0 && RecyclerView.this.w.a() && i3 == i6) || (i7 != 0 && RecyclerView.this.w.b() && i4 == i7);
                if (overScroller.isFinished() || (!z && !RecyclerView.this.d(1))) {
                    RecyclerView.this.setScrollState(0);
                    if (RecyclerView.f) {
                        RecyclerView.this.qa.a();
                    }
                    RecyclerView.this.a(1);
                } else {
                    a();
                    RecyclerView recyclerView2 = RecyclerView.this;
                    C0430y yVar = recyclerView2.pa;
                    if (yVar != null) {
                        yVar.a(recyclerView2, i6, i7);
                    }
                }
            }
            if (rVar != null) {
                if (rVar.d()) {
                    rVar.a(0, 0);
                }
                if (!this.f) {
                    rVar.h();
                }
            }
            d();
        }

        private int b(int i, int i2, int i3, int i4) {
            int i5;
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z = abs > abs2;
            int sqrt = (int) Math.sqrt((double) ((i3 * i3) + (i4 * i4)));
            int sqrt2 = (int) Math.sqrt((double) ((i * i) + (i2 * i2)));
            int width = z ? RecyclerView.this.getWidth() : RecyclerView.this.getHeight();
            int i6 = width / 2;
            float f2 = (float) width;
            float f3 = (float) i6;
            float a2 = f3 + (a(Math.min(1.0f, (((float) sqrt2) * 1.0f) / f2)) * f3);
            if (sqrt > 0) {
                i5 = Math.round(Math.abs(a2 / ((float) sqrt)) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i5 = (int) (((((float) abs) / f2) + 1.0f) * 300.0f);
            }
            return Math.min(i5, 2000);
        }

        public void a(int i, int i2) {
            RecyclerView.this.setScrollState(2);
            this.b = 0;
            this.a = 0;
            this.c.fling(0, 0, i, i2, Integer.MIN_VALUE, BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, BaseClientBuilder.API_PRIORITY_OTHER);
            a();
        }

        public void a(int i, int i2, int i3, int i4) {
            a(i, i2, b(i, i2, i3, i4));
        }

        private float a(float f2) {
            return (float) Math.sin((double) ((f2 - 0.5f) * 0.47123894f));
        }

        public void a(int i, int i2, int i3) {
            a(i, i2, i3, RecyclerView.j);
        }

        public void a(int i, int i2, Interpolator interpolator) {
            int b2 = b(i, i2, 0, 0);
            if (interpolator == null) {
                interpolator = RecyclerView.j;
            }
            a(i, i2, b2, interpolator);
        }

        public void b() {
            RecyclerView.this.removeCallbacks(this);
            this.c.abortAnimation();
        }

        public void a(int i, int i2, int i3, Interpolator interpolator) {
            if (this.d != interpolator) {
                this.d = interpolator;
                this.c = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            RecyclerView.this.setScrollState(2);
            this.b = 0;
            this.a = 0;
            this.c.startScroll(0, 0, i, i2, i3);
            if (VERSION.SDK_INT < 23) {
                this.c.computeScrollOffset();
            }
            a();
        }
    }

    static {
        int i2 = VERSION.SDK_INT;
        c = i2 == 18 || i2 == 19 || i2 == 20;
        Class cls = Integer.TYPE;
        i = new Class[]{Context.class, AttributeSet.class, cls, cls};
    }

    public RecyclerView(Context context) {
        this(context, null);
    }

    private void A() {
        int i2 = this.J;
        this.J = 0;
        if (i2 != 0 && n()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            Kc.a(obtain, i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void B() {
        boolean z2 = true;
        this.ra.a(1);
        a(this.ra);
        this.ra.j = false;
        x();
        this.p.a();
        r();
        J();
        O();
        s sVar = this.ra;
        if (!sVar.k || !this.va) {
            z2 = false;
        }
        sVar.i = z2;
        this.va = false;
        this.ua = false;
        s sVar2 = this.ra;
        sVar2.h = sVar2.l;
        sVar2.f = this.v.b();
        a(this.Aa);
        if (this.ra.k) {
            int a2 = this.o.a();
            for (int i2 = 0; i2 < a2; i2++) {
                ViewHolder i3 = i(this.o.c(i2));
                if (!i3.shouldIgnore() && (!i3.isInvalid() || this.v.d())) {
                    this.p.c(i3, this.W.a(this.ra, i3, f.a(i3), i3.getUnmodifiedPayloads()));
                    if (this.ra.i && i3.isUpdated() && !i3.isRemoved() && !i3.shouldIgnore() && !i3.isInvalid()) {
                        this.p.a(d(i3), i3);
                    }
                }
            }
        }
        if (this.ra.l) {
            w();
            s sVar3 = this.ra;
            boolean z3 = sVar3.g;
            sVar3.g = false;
            this.w.e(this.l, sVar3);
            this.ra.g = z3;
            for (int i4 = 0; i4 < this.o.a(); i4++) {
                ViewHolder i5 = i(this.o.c(i4));
                if (!i5.shouldIgnore() && !this.p.c(i5)) {
                    int a3 = f.a(i5);
                    boolean hasAnyOfTheFlags = i5.hasAnyOfTheFlags(8192);
                    if (!hasAnyOfTheFlags) {
                        a3 |= 4096;
                    }
                    c a4 = this.W.a(this.ra, i5, a3, i5.getUnmodifiedPayloads());
                    if (hasAnyOfTheFlags) {
                        a(i5, a4);
                    } else {
                        this.p.a(i5, a4);
                    }
                }
            }
            a();
        } else {
            a();
        }
        s();
        c(false);
        this.ra.e = 2;
    }

    private void C() {
        x();
        r();
        this.ra.a(6);
        this.n.b();
        this.ra.f = this.v.b();
        s sVar = this.ra;
        sVar.d = 0;
        sVar.h = false;
        this.w.e(this.l, sVar);
        s sVar2 = this.ra;
        sVar2.g = false;
        this.m = null;
        sVar2.k = sVar2.k && this.W != null;
        this.ra.e = 4;
        s();
        c(false);
    }

    private void D() {
        this.ra.a(4);
        x();
        r();
        s sVar = this.ra;
        sVar.e = 1;
        if (sVar.k) {
            for (int a2 = this.o.a() - 1; a2 >= 0; a2--) {
                ViewHolder i2 = i(this.o.c(a2));
                if (!i2.shouldIgnore()) {
                    long d2 = d(i2);
                    c a3 = this.W.a(this.ra, i2);
                    ViewHolder a4 = this.p.a(d2);
                    if (a4 == null || a4.shouldIgnore()) {
                        this.p.b(i2, a3);
                    } else {
                        boolean b2 = this.p.b(a4);
                        boolean b3 = this.p.b(i2);
                        if (!b2 || a4 != i2) {
                            c f2 = this.p.f(a4);
                            this.p.b(i2, a3);
                            c e2 = this.p.e(i2);
                            if (f2 == null) {
                                a(d2, i2, a4);
                            } else {
                                a(a4, i2, f2, e2, b2, b3);
                            }
                        } else {
                            this.p.b(i2, a3);
                        }
                    }
                }
            }
            this.p.a(this.Ia);
        }
        this.w.c(this.l);
        s sVar2 = this.ra;
        sVar2.c = sVar2.f;
        this.N = false;
        this.O = false;
        sVar2.k = false;
        sVar2.l = false;
        this.w.h = false;
        ArrayList<ViewHolder> arrayList = this.l.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        i iVar = this.w;
        if (iVar.n) {
            iVar.m = 0;
            iVar.n = false;
            this.l.j();
        }
        this.w.g(this.ra);
        s();
        c(false);
        this.p.a();
        int[] iArr = this.Aa;
        if (k(iArr[0], iArr[1])) {
            d(0, 0);
        }
        K();
        M();
    }

    private View E() {
        int i2 = this.ra.m;
        if (i2 == -1) {
            i2 = 0;
        }
        int a2 = this.ra.a();
        int i3 = i2;
        while (i3 < a2) {
            ViewHolder c2 = c(i3);
            if (c2 == null) {
                break;
            } else if (c2.itemView.hasFocusable()) {
                return c2.itemView;
            } else {
                i3++;
            }
        }
        int min = Math.min(a2, i2);
        while (true) {
            min--;
            if (min < 0) {
                return null;
            }
            ViewHolder c3 = c(min);
            if (c3 == null) {
                return null;
            }
            if (c3.itemView.hasFocusable()) {
                return c3.itemView;
            }
        }
    }

    private boolean F() {
        int a2 = this.o.a();
        for (int i2 = 0; i2 < a2; i2++) {
            ViewHolder i3 = i(this.o.c(i2));
            if (i3 != null && !i3.shouldIgnore() && i3.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void G() {
        if (C1778vc.k(this) == 0) {
            C1778vc.g(this, 8);
        }
    }

    private void H() {
        this.o = new C0415i(new aa(this));
    }

    private boolean I() {
        return this.W != null && this.w.D();
    }

    private void J() {
        if (this.N) {
            this.n.f();
            if (this.O) {
                this.w.d(this);
            }
        }
        if (I()) {
            this.n.e();
        } else {
            this.n.b();
        }
        boolean z2 = false;
        boolean z3 = this.ua || this.va;
        this.ra.k = this.E && this.W != null && (this.N || z3 || this.w.h) && (!this.N || this.v.d());
        s sVar = this.ra;
        if (sVar.k && z3 && !this.N && I()) {
            z2 = true;
        }
        sVar.l = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ab, code lost:
        if (r0.isFocusable() != false) goto L_0x00af;
     */
    private void K() {
        View view;
        if (this.na && this.v != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (!isFocused()) {
                View focusedChild = getFocusedChild();
                if (!h || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                    if (!this.o.c(focusedChild)) {
                        return;
                    }
                } else if (this.o.a() == 0) {
                    requestFocus();
                    return;
                }
            }
            View view2 = null;
            ViewHolder a2 = (this.ra.n == -1 || !this.v.d()) ? null : a(this.ra.n);
            if (a2 != null && !this.o.c(a2.itemView) && a2.itemView.hasFocusable()) {
                view2 = a2.itemView;
            } else if (this.o.a() > 0) {
                view2 = E();
            }
            if (view2 != null) {
                int i2 = this.ra.o;
                if (((long) i2) != -1) {
                    view = view2.findViewById(i2);
                    if (view != null) {
                    }
                }
                view = view2;
                view.requestFocus();
            }
        }
    }

    private void L() {
        boolean z2;
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.S.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.T;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.V.isFinished();
        }
        if (z2) {
            C1778vc.F(this);
        }
    }

    private void M() {
        s sVar = this.ra;
        sVar.n = -1;
        sVar.m = -1;
        sVar.o = -1;
    }

    private void N() {
        VelocityTracker velocityTracker = this.ca;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        a(0);
        L();
    }

    private void O() {
        int i2;
        ViewHolder viewHolder = null;
        View focusedChild = (!this.na || !hasFocus() || this.v == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            viewHolder = d(focusedChild);
        }
        if (viewHolder == null) {
            M();
            return;
        }
        this.ra.n = this.v.d() ? viewHolder.getItemId() : -1;
        s sVar = this.ra;
        if (this.N) {
            i2 = -1;
        } else if (viewHolder.isRemoved()) {
            i2 = viewHolder.mOldPosition;
        } else {
            i2 = viewHolder.getAdapterPosition();
        }
        sVar.m = i2;
        this.ra.o = n(viewHolder.itemView);
    }

    private void P() {
        this.oa.b();
        i iVar = this.w;
        if (iVar != null) {
            iVar.C();
        }
    }

    private void e(ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        boolean z2 = view.getParent() == this;
        this.l.c(h(view));
        if (viewHolder.isTmpDetached()) {
            this.o.a(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.o.a(view, true);
        } else {
            this.o.a(view);
        }
    }

    private C1352hc getScrollingChildHelper() {
        if (this.Ba == null) {
            this.Ba = new C1352hc(this);
        }
        return this.Ba;
    }

    private void z() {
        N();
        setScrollState(0);
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        i iVar = this.w;
        if (iVar == null || !iVar.a(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void b(j jVar) {
        List<j> list = this.M;
        if (list != null) {
            list.remove(jVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(boolean z2) {
        if (this.F < 1) {
            this.F = 1;
        }
        if (!z2 && !this.H) {
            this.G = false;
        }
        if (this.F == 1) {
            if (z2 && this.G && !this.H && this.w != null && this.v != null) {
                c();
            }
            if (!this.H) {
                this.G = false;
            }
        }
        this.F--;
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && this.w.a((LayoutParams) layoutParams);
    }

    public int computeHorizontalScrollExtent() {
        i iVar = this.w;
        int i2 = 0;
        if (iVar == null) {
            return 0;
        }
        if (iVar.a()) {
            i2 = this.w.a(this.ra);
        }
        return i2;
    }

    public int computeHorizontalScrollOffset() {
        i iVar = this.w;
        int i2 = 0;
        if (iVar == null) {
            return 0;
        }
        if (iVar.a()) {
            i2 = this.w.b(this.ra);
        }
        return i2;
    }

    public int computeHorizontalScrollRange() {
        i iVar = this.w;
        int i2 = 0;
        if (iVar == null) {
            return 0;
        }
        if (iVar.a()) {
            i2 = this.w.c(this.ra);
        }
        return i2;
    }

    public int computeVerticalScrollExtent() {
        i iVar = this.w;
        int i2 = 0;
        if (iVar == null) {
            return 0;
        }
        if (iVar.b()) {
            i2 = this.w.d(this.ra);
        }
        return i2;
    }

    public int computeVerticalScrollOffset() {
        i iVar = this.w;
        int i2 = 0;
        if (iVar == null) {
            return 0;
        }
        if (iVar.b()) {
            i2 = this.w.e(this.ra);
        }
        return i2;
    }

    public int computeVerticalScrollRange() {
        i iVar = this.w;
        int i2 = 0;
        if (iVar == null) {
            return 0;
        }
        if (iVar.b()) {
            i2 = this.w.f(this.ra);
        }
        return i2;
    }

    /* access modifiers changed from: 0000 */
    public long d(ViewHolder viewHolder) {
        return this.v.d() ? viewHolder.getItemId() : (long) viewHolder.mPosition;
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().a(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr);
    }

    /* access modifiers changed from: protected */
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    /* access modifiers changed from: protected */
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        boolean z3;
        super.draw(canvas);
        int size = this.y.size();
        boolean z4 = false;
        for (int i2 = 0; i2 < size; i2++) {
            ((h) this.y.get(i2)).b(canvas, this, this.ra);
        }
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.q ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.S;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.q) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.T;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.U;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.q ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) (-paddingTop), (float) (-width));
            EdgeEffect edgeEffect6 = this.U;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.V;
        if (edgeEffect7 == null || edgeEffect7.isFinished()) {
            z3 = z2;
        } else {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.q) {
                canvas.translate((float) ((-getWidth()) + getPaddingRight()), (float) ((-getHeight()) + getPaddingBottom()));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.V;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z3 = z4 | z2;
            canvas.restoreToCount(save4);
        }
        if (!z3 && this.W != null && this.y.size() > 0 && this.W.g()) {
            z3 = true;
        }
        if (z3) {
            C1778vc.F(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    /* access modifiers changed from: 0000 */
    public void f() {
        if (this.S == null) {
            this.S = this.R.a(this, 0);
            if (this.q) {
                this.S.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.S.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View d2 = this.w.d(view, i2);
        if (d2 != null) {
            return d2;
        }
        boolean z3 = this.v != null && this.w != null && !o() && !this.H;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z3 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z3) {
                view2 = findNextFocus;
            } else {
                b();
                if (c(view) == null) {
                    return null;
                }
                x();
                view2 = this.w.a(view, i2, this.l, this.ra);
                c(false);
            }
        } else {
            if (this.w.b()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = instance.findNextFocus(this, view, i3) == null;
                if (g) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.w.a()) {
                int i4 = (this.w.k() == 1) ^ (i2 == 2) ? 66 : 17;
                z2 = instance.findNextFocus(this, view, i4) == null;
                if (g) {
                    i2 = i4;
                }
            }
            if (z2) {
                b();
                if (c(view) == null) {
                    return null;
                }
                x();
                this.w.a(view, i2, this.l, this.ra);
                c(false);
            }
            view2 = instance.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            if (!a(view, view2, i2)) {
                view2 = super.focusSearch(view, i2);
            }
            return view2;
        } else if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        } else {
            a(view2, (View) null);
            return view;
        }
    }

    /* access modifiers changed from: 0000 */
    public void g() {
        if (this.U == null) {
            this.U = this.R.a(this, 2);
            if (this.q) {
                this.U.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                this.U.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        i iVar = this.w;
        if (iVar != null) {
            return iVar.c();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(i());
        throw new IllegalStateException(sb.toString());
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        i iVar = this.w;
        if (iVar != null) {
            return iVar.a(getContext(), attributeSet);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(i());
        throw new IllegalStateException(sb.toString());
    }

    public a getAdapter() {
        return this.v;
    }

    public int getBaseline() {
        i iVar = this.w;
        if (iVar != null) {
            return iVar.d();
        }
        return super.getBaseline();
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i2, int i3) {
        d dVar = this.za;
        if (dVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return dVar.a(i2, i3);
    }

    public boolean getClipToPadding() {
        return this.q;
    }

    public fa getCompatAccessibilityDelegate() {
        return this.ya;
    }

    public e getEdgeEffectFactory() {
        return this.R;
    }

    public f getItemAnimator() {
        return this.W;
    }

    public int getItemDecorationCount() {
        return this.y.size();
    }

    public i getLayoutManager() {
        return this.w;
    }

    public int getMaxFlingVelocity() {
        return this.ka;
    }

    public int getMinFlingVelocity() {
        return this.ja;
    }

    /* access modifiers changed from: 0000 */
    public long getNanoTime() {
        if (f) {
            return System.nanoTime();
        }
        return 0;
    }

    public k getOnFlingListener() {
        return this.ia;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.na;
    }

    public n getRecycledViewPool() {
        return this.l.d();
    }

    public int getScrollState() {
        return this.aa;
    }

    /* access modifiers changed from: 0000 */
    public void h() {
        if (this.T == null) {
            this.T = this.R.a(this, 1);
            if (this.q) {
                this.T.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.T.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void h(int i2) {
    }

    public void h(int i2, int i3) {
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().a();
    }

    /* access modifiers changed from: 0000 */
    public String i() {
        StringBuilder sb = new StringBuilder();
        sb.append(" ");
        sb.append(super.toString());
        sb.append(", adapter:");
        sb.append(this.v);
        sb.append(", layout:");
        sb.append(this.w);
        sb.append(", context:");
        sb.append(getContext());
        return sb.toString();
    }

    public boolean isAttachedToWindow() {
        return this.B;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().b();
    }

    public void j(int i2) {
        if (!this.H) {
            i iVar = this.w;
            if (iVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                iVar.a(this, this.ra, i2);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void k() {
        this.n = new C0407a(new ba(this));
    }

    public void k(View view) {
    }

    /* access modifiers changed from: 0000 */
    public void l() {
        this.V = null;
        this.T = null;
        this.U = null;
        this.S = null;
    }

    public void l(View view) {
    }

    /* access modifiers changed from: 0000 */
    public boolean m(View view) {
        x();
        boolean e2 = this.o.e(view);
        if (e2) {
            ViewHolder i2 = i(view);
            this.l.c(i2);
            this.l.b(i2);
        }
        c(!e2);
        return e2;
    }

    /* access modifiers changed from: 0000 */
    public boolean n() {
        AccessibilityManager accessibilityManager = this.L;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean o() {
        return this.P > 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004f, code lost:
        if (r0 >= 30.0f) goto L_0x0054;
     */
    public void onAttachedToWindow() {
        float f2;
        super.onAttachedToWindow();
        this.P = 0;
        boolean z2 = true;
        this.B = true;
        if (!this.E || isLayoutRequested()) {
            z2 = false;
        }
        this.E = z2;
        i iVar = this.w;
        if (iVar != null) {
            iVar.a(this);
        }
        this.xa = false;
        if (f) {
            this.pa = (C0430y) C0430y.a.get();
            if (this.pa == null) {
                this.pa = new C0430y();
                Display g2 = C1778vc.g(this);
                if (!isInEditMode() && g2 != null) {
                    f2 = g2.getRefreshRate();
                }
                f2 = 60.0f;
                C0430y yVar = this.pa;
                yVar.e = (long) (1.0E9f / f2);
                C0430y.a.set(yVar);
            }
            this.pa.a(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.W;
        if (fVar != null) {
            fVar.b();
        }
        y();
        this.B = false;
        i iVar = this.w;
        if (iVar != null) {
            iVar.a(this, this.l);
        }
        this.Ga.clear();
        removeCallbacks(this.Ha);
        this.p.b();
        if (f) {
            C0430y yVar = this.pa;
            if (yVar != null) {
                yVar.b(this);
                this.pa = null;
            }
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.y.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((h) this.y.get(i2)).a(canvas, this, this.ra);
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.w != null && !this.H && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.w.b() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.w.a()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        a((int) (f2 * this.la), (int) (f3 * this.ma), motionEvent);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.w.b()) {
                        f3 = -axisValue;
                    } else if (this.w.a()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        a((int) (f2 * this.la), (int) (f3 * this.ma), motionEvent);
                    }
                }
                f3 = 0.0f;
            }
            f2 = 0.0f;
            a((int) (f2 * this.la), (int) (f3 * this.ma), motionEvent);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        boolean z3 = false;
        if (this.H) {
            return false;
        }
        if (b(motionEvent)) {
            z();
            return true;
        }
        i iVar = this.w;
        if (iVar == null) {
            return false;
        }
        boolean a2 = iVar.a();
        boolean b2 = this.w.b();
        if (this.ca == null) {
            this.ca = VelocityTracker.obtain();
        }
        this.ca.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.I) {
                this.I = false;
            }
            this.ba = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.fa = x2;
            this.da = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.ga = y2;
            this.ea = y2;
            if (this.aa == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
            }
            int[] iArr = this.Ea;
            iArr[1] = 0;
            iArr[0] = 0;
            int i2 = a2 ? 1 : 0;
            if (b2) {
                i2 |= 2;
            }
            j(i2, 0);
        } else if (actionMasked == 1) {
            this.ca.clear();
            a(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.ba);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.ba);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sb.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.aa != 1) {
                int i3 = x3 - this.da;
                int i4 = y3 - this.ea;
                if (!a2 || Math.abs(i3) <= this.ha) {
                    z2 = false;
                } else {
                    this.fa = x3;
                    z2 = true;
                }
                if (b2 && Math.abs(i4) > this.ha) {
                    this.ga = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            z();
        } else if (actionMasked == 5) {
            this.ba = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.fa = x4;
            this.da = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ga = y4;
            this.ea = y4;
        } else if (actionMasked == 6) {
            c(motionEvent);
        }
        if (this.aa == 1) {
            z3 = true;
        }
        return z3;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        C1777vb.a("RV OnLayout");
        c();
        C1777vb.a();
        this.E = true;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        i iVar = this.w;
        if (iVar == null) {
            c(i2, i3);
            return;
        }
        boolean z2 = false;
        if (iVar.v()) {
            int mode = MeasureSpec.getMode(i2);
            int mode2 = MeasureSpec.getMode(i3);
            this.w.a(this.l, this.ra, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            if (!z2 && this.v != null) {
                if (this.ra.e == 1) {
                    B();
                }
                this.w.b(i2, i3);
                this.ra.j = true;
                C();
                this.w.d(i2, i3);
                if (this.w.B()) {
                    this.w.b(MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.ra.j = true;
                    C();
                    this.w.d(i2, i3);
                }
            }
        } else if (this.C) {
            this.w.a(this.l, this.ra, i2, i3);
        } else {
            if (this.K) {
                x();
                r();
                J();
                s();
                s sVar = this.ra;
                if (sVar.l) {
                    sVar.h = true;
                } else {
                    this.n.b();
                    this.ra.h = false;
                }
                this.K = false;
                c(false);
            } else if (this.ra.l) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            a aVar = this.v;
            if (aVar != null) {
                this.ra.f = aVar.b();
            } else {
                this.ra.f = 0;
            }
            x();
            this.w.a(this.l, this.ra, i2, i3);
            c(false);
            this.ra.h = false;
        }
    }

    /* access modifiers changed from: protected */
    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (o()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        this.m = (SavedState) parcelable;
        super.onRestoreInstanceState(this.m.a());
        i iVar = this.w;
        if (iVar != null) {
            Parcelable parcelable2 = this.m.c;
            if (parcelable2 != null) {
                iVar.a(parcelable2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.m;
        if (savedState2 != null) {
            savedState.a(savedState2);
        } else {
            i iVar = this.w;
            if (iVar != null) {
                savedState.c = iVar.y();
            } else {
                savedState.c = null;
            }
        }
        return savedState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            l();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x011c  */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int i2;
        int i3;
        boolean z2;
        boolean z3 = false;
        if (this.H || this.I) {
            return false;
        }
        if (a(motionEvent)) {
            z();
            return true;
        }
        i iVar = this.w;
        if (iVar == null) {
            return false;
        }
        boolean a2 = iVar.a();
        boolean b2 = this.w.b();
        if (this.ca == null) {
            this.ca = VelocityTracker.obtain();
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            int[] iArr = this.Ea;
            iArr[1] = 0;
            iArr[0] = 0;
        }
        int[] iArr2 = this.Ea;
        obtain.offsetLocation((float) iArr2[0], (float) iArr2[1]);
        if (actionMasked == 0) {
            this.ba = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.fa = x2;
            this.da = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.ga = y2;
            this.ea = y2;
            int i4 = a2 ? 1 : 0;
            if (b2) {
                i4 |= 2;
            }
            j(i4, 0);
        } else if (actionMasked == 1) {
            this.ca.addMovement(obtain);
            this.ca.computeCurrentVelocity(1000, (float) this.ka);
            float f2 = a2 ? -this.ca.getXVelocity(this.ba) : 0.0f;
            float f3 = b2 ? -this.ca.getYVelocity(this.ba) : 0.0f;
            if ((f2 == 0.0f && f3 == 0.0f) || !e((int) f2, (int) f3)) {
                setScrollState(0);
            }
            N();
            z3 = true;
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.ba);
            if (findPointerIndex < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error processing scroll; pointer index for id ");
                sb.append(this.ba);
                sb.append(" not found. Did any MotionEvents get skipped?");
                Log.e("RecyclerView", sb.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            int i5 = this.fa - x3;
            int i6 = this.ga - y3;
            if (a(i5, i6, this.Da, this.Ca, 0)) {
                int[] iArr3 = this.Da;
                i5 -= iArr3[0];
                i6 -= iArr3[1];
                int[] iArr4 = this.Ca;
                obtain.offsetLocation((float) iArr4[0], (float) iArr4[1]);
                int[] iArr5 = this.Ea;
                int i7 = iArr5[0];
                int[] iArr6 = this.Ca;
                iArr5[0] = i7 + iArr6[0];
                iArr5[1] = iArr5[1] + iArr6[1];
            }
            if (this.aa != 1) {
                if (a2) {
                    int abs = Math.abs(i3);
                    int i8 = this.ha;
                    if (abs > i8) {
                        i3 = i3 > 0 ? i3 - i8 : i3 + i8;
                        z2 = true;
                        if (b2) {
                            int abs2 = Math.abs(i2);
                            int i9 = this.ha;
                            if (abs2 > i9) {
                                i2 = i2 > 0 ? i2 - i9 : i2 + i9;
                                z2 = true;
                            }
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                }
                z2 = false;
                if (b2) {
                }
                if (z2) {
                }
            }
            if (this.aa == 1) {
                int[] iArr7 = this.Ca;
                this.fa = x3 - iArr7[0];
                this.ga = y3 - iArr7[1];
                if (a(a2 ? i3 : 0, b2 ? i2 : 0, obtain)) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                if (!(this.pa == null || (i3 == 0 && i2 == 0))) {
                    this.pa.a(this, i3, i2);
                }
            }
        } else if (actionMasked == 3) {
            z();
        } else if (actionMasked == 5) {
            this.ba = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.fa = x4;
            this.da = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.ga = y4;
            this.ea = y4;
        } else if (actionMasked == 6) {
            c(motionEvent);
        }
        if (!z3) {
            this.ca.addMovement(obtain);
        }
        obtain.recycle();
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void p() {
        int b2 = this.o.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ((LayoutParams) this.o.d(i2).getLayoutParams()).c = true;
        }
        this.l.g();
    }

    /* access modifiers changed from: 0000 */
    public void q() {
        int b2 = this.o.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ViewHolder i3 = i(this.o.d(i2));
            if (i3 != null && !i3.shouldIgnore()) {
                i3.addFlags(6);
            }
        }
        p();
        this.l.h();
    }

    /* access modifiers changed from: 0000 */
    public void r() {
        this.P++;
    }

    /* access modifiers changed from: protected */
    public void removeDetachedView(View view, boolean z2) {
        ViewHolder i2 = i(view);
        if (i2 != null) {
            if (i2.isTmpDetached()) {
                i2.clearTmpDetachFlag();
            } else if (!i2.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(i2);
                sb.append(i());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        view.clearAnimation();
        b(view);
        super.removeDetachedView(view, z2);
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.w.a(this, this.ra, view, view2) && view2 != null) {
            a(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.w.a(this, view, rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.z.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((l) this.z.get(i2)).a(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.F != 0 || this.H) {
            this.G = true;
        } else {
            super.requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    public void s() {
        a(true);
    }

    public void scrollBy(int i2, int i3) {
        i iVar = this.w;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.H) {
            boolean a2 = iVar.a();
            boolean b2 = this.w.b();
            if (a2 || b2) {
                if (!a2) {
                    i2 = 0;
                }
                if (!b2) {
                    i3 = 0;
                }
                a(i2, i3, (MotionEvent) null);
            }
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!a(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(fa faVar) {
        this.ya = faVar;
        C1778vc.a((View) this, (C0273Wb) this.ya);
    }

    public void setAdapter(a aVar) {
        setLayoutFrozen(false);
        a(aVar, false, true);
        b(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(d dVar) {
        if (dVar != this.za) {
            this.za = dVar;
            setChildrenDrawingOrderEnabled(this.za != null);
        }
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.q) {
            l();
        }
        this.q = z2;
        super.setClipToPadding(z2);
        if (this.E) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(e eVar) {
        C0263Ub.a(eVar);
        this.R = eVar;
        l();
    }

    public void setHasFixedSize(boolean z2) {
        this.C = z2;
    }

    public void setItemAnimator(f fVar) {
        f fVar2 = this.W;
        if (fVar2 != null) {
            fVar2.b();
            this.W.a((b) null);
        }
        this.W = fVar;
        f fVar3 = this.W;
        if (fVar3 != null) {
            fVar3.a(this.wa);
        }
    }

    public void setItemViewCacheSize(int i2) {
        this.l.f(i2);
    }

    public void setLayoutFrozen(boolean z2) {
        if (z2 != this.H) {
            a("Do not setLayoutFrozen in layout or scroll");
            if (!z2) {
                this.H = false;
                if (!(!this.G || this.w == null || this.v == null)) {
                    requestLayout();
                }
                this.G = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.H = true;
            this.I = true;
            y();
        }
    }

    public void setLayoutManager(i iVar) {
        if (iVar != this.w) {
            y();
            if (this.w != null) {
                f fVar = this.W;
                if (fVar != null) {
                    fVar.b();
                }
                this.w.b(this.l);
                this.w.c(this.l);
                this.l.a();
                if (this.B) {
                    this.w.a(this, this.l);
                }
                this.w.f((RecyclerView) null);
                this.w = null;
            } else {
                this.l.a();
            }
            this.o.c();
            this.w = iVar;
            if (iVar != null) {
                if (iVar.b == null) {
                    this.w.f(this);
                    if (this.B) {
                        this.w.a(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(iVar);
                    sb.append(" is already attached to a RecyclerView:");
                    sb.append(iVar.b.i());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            this.l.j();
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean z2) {
        getScrollingChildHelper().a(z2);
    }

    public void setOnFlingListener(k kVar) {
        this.ia = kVar;
    }

    @Deprecated
    public void setOnScrollListener(m mVar) {
        this.sa = mVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.na = z2;
    }

    public void setRecycledViewPool(n nVar) {
        this.l.a(nVar);
    }

    public void setRecyclerListener(p pVar) {
        this.x = pVar;
    }

    /* access modifiers changed from: 0000 */
    public void setScrollState(int i2) {
        if (i2 != this.aa) {
            this.aa = i2;
            if (i2 != 2) {
                P();
            }
            b(i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                StringBuilder sb = new StringBuilder();
                sb.append("setScrollingTouchSlop(): bad argument constant ");
                sb.append(i2);
                sb.append("; using default value");
                Log.w("RecyclerView", sb.toString());
            } else {
                this.ha = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.ha = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(t tVar) {
        this.l.a(tVar);
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().b(i2);
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().c();
    }

    /* access modifiers changed from: 0000 */
    public void t() {
        if (!this.xa && this.B) {
            C1778vc.a((View) this, this.Ha);
            this.xa = true;
        }
    }

    /* access modifiers changed from: 0000 */
    public void u() {
        f fVar = this.W;
        if (fVar != null) {
            fVar.b();
        }
        i iVar = this.w;
        if (iVar != null) {
            iVar.b(this.l);
            this.w.c(this.l);
        }
        this.l.a();
    }

    /* access modifiers changed from: 0000 */
    public void v() {
        int a2 = this.o.a();
        for (int i2 = 0; i2 < a2; i2++) {
            View c2 = this.o.c(i2);
            ViewHolder h2 = h(c2);
            if (h2 != null) {
                ViewHolder viewHolder = h2.mShadowingHolder;
                if (viewHolder != null) {
                    View view = viewHolder.itemView;
                    int left = c2.getLeft();
                    int top = c2.getTop();
                    if (left != view.getLeft() || top != view.getTop()) {
                        view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void w() {
        int b2 = this.o.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ViewHolder i3 = i(this.o.d(i2));
            if (!i3.shouldIgnore()) {
                i3.saveOldPosition();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void x() {
        this.F++;
        if (this.F == 1 && !this.H) {
            this.G = false;
        }
    }

    public void y() {
        setScrollState(0);
        P();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean k(int i2, int i3) {
        a(this.Aa);
        int[] iArr = this.Aa;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private int n(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    public ViewHolder d(View view) {
        View c2 = c(view);
        if (c2 == null) {
            return null;
        }
        return h(c2);
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.k = new q();
        this.l = new o();
        this.p = new oa();
        this.r = new W(this);
        this.s = new Rect();
        this.t = new Rect();
        this.u = new RectF();
        this.y = new ArrayList<>();
        this.z = new ArrayList<>();
        this.F = 0;
        this.N = false;
        this.O = false;
        this.P = 0;
        this.Q = 0;
        this.R = new e();
        this.W = new r();
        this.aa = 0;
        this.ba = -1;
        this.la = Float.MIN_VALUE;
        this.ma = Float.MIN_VALUE;
        boolean z2 = true;
        this.na = true;
        this.oa = new u();
        this.qa = f ? new a() : null;
        this.ra = new s();
        this.ua = false;
        this.va = false;
        this.wa = new g();
        this.xa = false;
        this.Aa = new int[2];
        this.Ca = new int[2];
        this.Da = new int[2];
        this.Ea = new int[2];
        this.Fa = new int[2];
        this.Ga = new ArrayList();
        this.Ha = new X(this);
        this.Ia = new Z(this);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b, i2, 0);
            this.q = obtainStyledAttributes.getBoolean(0, true);
            obtainStyledAttributes.recycle();
        } else {
            this.q = true;
        }
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.ha = viewConfiguration.getScaledTouchSlop();
        this.la = C1808wc.a(viewConfiguration, context);
        this.ma = C1808wc.b(viewConfiguration, context);
        this.ja = viewConfiguration.getScaledMinimumFlingVelocity();
        this.ka = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.W.a(this.wa);
        k();
        H();
        G();
        if (C1778vc.j(this) == 0) {
            C1778vc.f(this, 1);
        }
        this.L = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new fa(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, Jd.RecyclerView, i2, 0);
            String string = obtainStyledAttributes2.getString(Jd.RecyclerView_layoutManager);
            if (obtainStyledAttributes2.getInt(Jd.RecyclerView_android_descendantFocusability, -1) == -1) {
                setDescendantFocusability(262144);
            }
            this.D = obtainStyledAttributes2.getBoolean(Jd.RecyclerView_fastScrollEnabled, false);
            if (this.D) {
                a((StateListDrawable) obtainStyledAttributes2.getDrawable(Jd.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes2.getDrawable(Jd.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes2.getDrawable(Jd.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes2.getDrawable(Jd.RecyclerView_fastScrollHorizontalTrackDrawable));
            }
            obtainStyledAttributes2.recycle();
            a(context, string, attributeSet, i2, 0);
            if (VERSION.SDK_INT >= 21) {
                TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, a, i2, 0);
                boolean z3 = obtainStyledAttributes3.getBoolean(0, true);
                obtainStyledAttributes3.recycle();
                z2 = z3;
            }
        } else {
            setDescendantFocusability(262144);
        }
        setNestedScrollingEnabled(z2);
    }

    public void b(h hVar) {
        i iVar = this.w;
        if (iVar != null) {
            iVar.a("Cannot remove item decoration during a scroll  or layout");
        }
        this.y.remove(hVar);
        if (this.y.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        p();
        requestLayout();
    }

    public void i(int i2) {
        if (!this.H) {
            y();
            i iVar = this.w;
            if (iVar == null) {
                Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            iVar.i(i2);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: 0000 */
    public void d(int i2, int i3) {
        this.Q++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX, scrollY);
        h(i2, i3);
        m mVar = this.sa;
        if (mVar != null) {
            mVar.a(this, i2, i3);
        }
        List<m> list = this.ta;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((m) this.ta.get(size)).a(this, i2, i3);
            }
        }
        this.Q--;
    }

    /* access modifiers changed from: protected */
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        i iVar = this.w;
        if (iVar != null) {
            return iVar.a(layoutParams);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("RecyclerView has no LayoutManager");
        sb.append(i());
        throw new IllegalStateException(sb.toString());
    }

    private void a(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor constructor;
        String str2 = ": Could not instantiate the LayoutManager: ";
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String a2 = a(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class asSubclass = classLoader.loadClass(a2).asSubclass(i.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(i);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((i) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e3) {
                    e3.initCause(e2);
                    StringBuilder sb = new StringBuilder();
                    sb.append(attributeSet.getPositionDescription());
                    sb.append(": Error creating LayoutManager ");
                    sb.append(a2);
                    throw new IllegalStateException(sb.toString(), e3);
                } catch (ClassNotFoundException e4) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(attributeSet.getPositionDescription());
                    sb2.append(": Unable to find LayoutManager ");
                    sb2.append(a2);
                    throw new IllegalStateException(sb2.toString(), e4);
                } catch (InvocationTargetException e5) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(attributeSet.getPositionDescription());
                    sb3.append(str2);
                    sb3.append(a2);
                    throw new IllegalStateException(sb3.toString(), e5);
                } catch (InstantiationException e6) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(attributeSet.getPositionDescription());
                    sb4.append(str2);
                    sb4.append(a2);
                    throw new IllegalStateException(sb4.toString(), e6);
                } catch (IllegalAccessException e7) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(attributeSet.getPositionDescription());
                    sb5.append(": Cannot access non-public constructor ");
                    sb5.append(a2);
                    throw new IllegalStateException(sb5.toString(), e7);
                } catch (ClassCastException e8) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(attributeSet.getPositionDescription());
                    sb6.append(": Class is not a LayoutManager ");
                    sb6.append(a2);
                    throw new IllegalStateException(sb6.toString(), e8);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public Rect j(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.c) {
            return layoutParams.b;
        }
        if (this.ra.d() && (layoutParams.b() || layoutParams.d())) {
            return layoutParams.b;
        }
        Rect rect = layoutParams.b;
        rect.set(0, 0, 0, 0);
        int size = this.y.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.s.set(0, 0, 0, 0);
            ((h) this.y.get(i2)).a(this.s, view, this, this.ra);
            int i3 = rect.left;
            Rect rect2 = this.s;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        layoutParams.c = false;
        return rect;
    }

    public void m() {
        if (this.y.size() != 0) {
            i iVar = this.w;
            if (iVar != null) {
                iVar.a("Cannot invalidate item decorations during a scroll or layout");
            }
            p();
            requestLayout();
        }
    }

    /* access modifiers changed from: 0000 */
    public void e(int i2) {
        i iVar = this.w;
        if (iVar != null) {
            iVar.i(i2);
            awakenScrollBars();
        }
    }

    /* access modifiers changed from: 0000 */
    public void f(int i2, int i3) {
        int b2 = this.o.b();
        for (int i4 = 0; i4 < b2; i4++) {
            ViewHolder i5 = i(this.o.d(i4));
            if (i5 != null && !i5.shouldIgnore() && i5.mPosition >= i2) {
                i5.offsetPosition(i3, false);
                this.ra.g = true;
            }
        }
        this.l.a(i2, i3);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void g(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int b2 = this.o.b();
        if (i2 < i3) {
            i6 = i2;
            i5 = i3;
            i4 = -1;
        } else {
            i5 = i2;
            i6 = i3;
            i4 = 1;
        }
        for (int i7 = 0; i7 < b2; i7++) {
            ViewHolder i8 = i(this.o.d(i7));
            if (i8 != null) {
                int i9 = i8.mPosition;
                if (i9 >= i6 && i9 <= i5) {
                    if (i9 == i2) {
                        i8.offsetPosition(i3 - i2, false);
                    } else {
                        i8.offsetPosition(i4, false);
                    }
                    this.ra.g = true;
                }
            }
        }
        this.l.b(i2, i3);
        requestLayout();
    }

    public ViewHolder h(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return i(view);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("View ");
        sb.append(view);
        sb.append(" is not a direct child of ");
        sb.append(this);
        throw new IllegalArgumentException(sb.toString());
    }

    public void i(int i2, int i3) {
        a(i2, i3, (Interpolator) null);
    }

    static ViewHolder i(View view) {
        if (view == null) {
            return null;
        }
        return ((LayoutParams) view.getLayoutParams()).a;
    }

    public void b(m mVar) {
        List<m> list = this.ta;
        if (list != null) {
            list.remove(mVar);
        }
    }

    private void c(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.ba) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.ba = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.fa = x2;
            this.da = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.ga = y2;
            this.ea = y2;
        }
    }

    public boolean e(int i2, int i3) {
        i iVar = this.w;
        int i4 = 0;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return false;
        } else if (this.H) {
            return false;
        } else {
            boolean a2 = iVar.a();
            boolean b2 = this.w.b();
            if (!a2 || Math.abs(i2) < this.ja) {
                i2 = 0;
            }
            if (!b2 || Math.abs(i3) < this.ja) {
                i3 = 0;
            }
            if (i2 == 0 && i3 == 0) {
                return false;
            }
            float f2 = (float) i2;
            float f3 = (float) i3;
            if (!dispatchNestedPreFling(f2, f3)) {
                boolean z2 = a2 || b2;
                dispatchNestedFling(f2, f3, z2);
                k kVar = this.ia;
                if (kVar != null && kVar.a(i2, i3)) {
                    return true;
                }
                if (z2) {
                    if (a2) {
                        i4 = 1;
                    }
                    if (b2) {
                        i4 |= 2;
                    }
                    j(i4, 1);
                    int i5 = this.ka;
                    int max = Math.max(-i5, Math.min(i2, i5));
                    int i6 = this.ka;
                    this.oa.a(max, Math.max(-i6, Math.min(i3, i6)));
                    return true;
                }
            }
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        String str = "RV FullInvalidate";
        if (!this.E || this.N) {
            C1777vb.a(str);
            c();
            C1777vb.a();
        } else if (this.n.c()) {
            if (this.n.c(4) && !this.n.c(11)) {
                C1777vb.a("RV PartialInvalidate");
                x();
                r();
                this.n.e();
                if (!this.G) {
                    if (F()) {
                        c();
                    } else {
                        this.n.a();
                    }
                }
                c(true);
                s();
                C1777vb.a();
            } else if (this.n.c()) {
                C1777vb.a(str);
                c();
                C1777vb.a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        for (int size = this.Ga.size() - 1; size >= 0; size--) {
            ViewHolder viewHolder = (ViewHolder) this.Ga.get(size);
            if (viewHolder.itemView.getParent() == this && !viewHolder.shouldIgnore()) {
                int i2 = viewHolder.mPendingAccessibilityState;
                if (i2 != -1) {
                    C1778vc.f(viewHolder.itemView, i2);
                    viewHolder.mPendingAccessibilityState = -1;
                }
            }
        }
        this.Ga.clear();
    }

    public int f(View view) {
        ViewHolder i2 = i(view);
        if (i2 != null) {
            return i2.getAdapterPosition();
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2, int i3) {
        setMeasuredDimension(i.a(i2, getPaddingLeft() + getPaddingRight(), C1778vc.n(this)), i.a(i3, getPaddingTop() + getPaddingBottom(), C1778vc.m(this)));
    }

    public int g(View view) {
        ViewHolder i2 = i(view);
        if (i2 != null) {
            return i2.getLayoutPosition();
        }
        return -1;
    }

    public void f(int i2) {
        int a2 = this.o.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.o.c(i3).offsetLeftAndRight(i2);
        }
    }

    public void g(int i2) {
        int a2 = this.o.a();
        for (int i3 = 0; i3 < a2; i3++) {
            this.o.c(i3).offsetTopAndBottom(i2);
        }
    }

    public boolean j() {
        return !this.E || this.N || this.n.c();
    }

    public boolean d(int i2) {
        return getScrollingChildHelper().a(i2);
    }

    public boolean j(int i2, int i3) {
        return getScrollingChildHelper().a(i2, i3);
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        String str = "RecyclerView";
        if (this.v == null) {
            Log.e(str, "No adapter attached; skipping layout");
        } else if (this.w == null) {
            Log.e(str, "No layout manager attached; skipping layout");
        } else {
            s sVar = this.ra;
            sVar.j = false;
            if (sVar.e == 1) {
                B();
                this.w.e(this);
                C();
            } else if (!this.n.d() && this.w.r() == getWidth() && this.w.h() == getHeight()) {
                this.w.e(this);
            } else {
                this.w.e(this);
                C();
            }
            D();
        }
    }

    private String a(Context context, String str) {
        if (str.charAt(0) == '.') {
            StringBuilder sb = new StringBuilder();
            sb.append(context.getPackageName());
            sb.append(str);
            return sb.toString();
        } else if (str.contains(".")) {
            return str;
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(RecyclerView.class.getPackage().getName());
            sb2.append('.');
            sb2.append(str);
            return sb2.toString();
        }
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        if (this.V == null) {
            this.V = this.R.a(this, 3);
            if (this.q) {
                this.V.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                this.V.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    private void a(a aVar, boolean z2, boolean z3) {
        a aVar2 = this.v;
        if (aVar2 != null) {
            aVar2.b((c) this.k);
            this.v.b(this);
        }
        if (!z2 || z3) {
            u();
        }
        this.n.f();
        a aVar3 = this.v;
        this.v = aVar;
        if (aVar != null) {
            aVar.a((c) this.k);
            aVar.a(this);
        }
        i iVar = this.w;
        if (iVar != null) {
            iVar.a(aVar3, this.v);
        }
        this.l.a(aVar3, this.v, z2);
        this.ra.g = true;
    }

    static RecyclerView e(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView e2 = e(viewGroup.getChildAt(i2));
            if (e2 != null) {
                return e2;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.S;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.S.onRelease();
            z2 = this.S.isFinished();
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.U.onRelease();
            z2 |= this.U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.T;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.T.onRelease();
            z2 |= this.T.isFinished();
        }
        EdgeEffect edgeEffect4 = this.V;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.V.onRelease();
            z2 |= this.V.isFinished();
        }
        if (z2) {
            C1778vc.F(this);
        }
    }

    public View c(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public void a(j jVar) {
        if (this.M == null) {
            this.M = new ArrayList();
        }
        this.M.add(jVar);
    }

    public ViewHolder c(int i2) {
        ViewHolder viewHolder = null;
        if (this.N) {
            return null;
        }
        int b2 = this.o.b();
        for (int i3 = 0; i3 < b2; i3++) {
            ViewHolder i4 = i(this.o.d(i3));
            if (i4 != null && !i4.isRemoved() && c(i4) == i2) {
                if (!this.o.c(i4.itemView)) {
                    return i4;
                }
                viewHolder = i4;
            }
        }
        return viewHolder;
    }

    public void a(h hVar, int i2) {
        i iVar = this.w;
        if (iVar != null) {
            iVar.a("Cannot add item decoration during a scroll  or layout");
        }
        if (this.y.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.y.add(hVar);
        } else {
            this.y.add(i2, hVar);
        }
        p();
        requestLayout();
    }

    public void b(l lVar) {
        this.z.remove(lVar);
        if (this.A == lVar) {
            this.A = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public int c(ViewHolder viewHolder) {
        if (viewHolder.hasAnyOfTheFlags(524) || !viewHolder.isBound()) {
            return -1;
        }
        return this.n.a(viewHolder.mPosition);
    }

    private boolean b(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 3 || action == 0) {
            this.A = null;
        }
        int size = this.z.size();
        int i2 = 0;
        while (i2 < size) {
            l lVar = (l) this.z.get(i2);
            if (!lVar.b(this, motionEvent) || action == 3) {
                i2++;
            } else {
                this.A = lVar;
                return true;
            }
        }
        return false;
    }

    public void a(h hVar) {
        a(hVar, -1);
    }

    public void a(m mVar) {
        if (this.ta == null) {
            this.ta = new ArrayList();
        }
        this.ta.add(mVar);
    }

    /* access modifiers changed from: 0000 */
    public void b(ViewHolder viewHolder, c cVar, c cVar2) {
        e(viewHolder);
        viewHolder.setIsRecyclable(false);
        if (this.W.b(viewHolder, cVar, cVar2)) {
            t();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3, int[] iArr) {
        x();
        r();
        C1777vb.a("RV Scroll");
        a(this.ra);
        int a2 = i2 != 0 ? this.w.a(i2, this.l, this.ra) : 0;
        int b2 = i3 != 0 ? this.w.b(i3, this.l, this.ra) : 0;
        C1777vb.a();
        v();
        s();
        c(false);
        if (iArr != null) {
            iArr[0] = a2;
            iArr[1] = b2;
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(boolean z2) {
        this.O = z2 | this.O;
        this.N = true;
        q();
    }

    static void b(View view, Rect rect) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rect2 = layoutParams.b;
        rect.set((view.getLeft() - rect2.left) - layoutParams.leftMargin, (view.getTop() - rect2.top) - layoutParams.topMargin, view.getRight() + rect2.right + layoutParams.rightMargin, view.getBottom() + rect2.bottom + layoutParams.bottomMargin);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009b, code lost:
        if (r0 != 0) goto L_0x00a0;
     */
    public boolean a(int i2, int i3, MotionEvent motionEvent) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        int i10 = i3;
        MotionEvent motionEvent2 = motionEvent;
        b();
        if (this.v != null) {
            a(i9, i10, this.Fa);
            int[] iArr = this.Fa;
            int i11 = iArr[0];
            int i12 = iArr[1];
            i7 = i12;
            i4 = i11;
            i6 = i9 - i11;
            i5 = i10 - i12;
        } else {
            i7 = 0;
            i6 = 0;
            i5 = 0;
            i4 = 0;
        }
        if (!this.y.isEmpty()) {
            invalidate();
        }
        int i13 = i7;
        if (a(i4, i7, i6, i5, this.Ca, 0)) {
            int i14 = this.fa;
            int[] iArr2 = this.Ca;
            this.fa = i14 - iArr2[0];
            this.ga -= iArr2[1];
            if (motionEvent2 != null) {
                motionEvent2.offsetLocation((float) iArr2[0], (float) iArr2[1]);
            }
            int[] iArr3 = this.Ea;
            int i15 = iArr3[0];
            int[] iArr4 = this.Ca;
            iArr3[0] = i15 + iArr4[0];
            iArr3[1] = iArr3[1] + iArr4[1];
        } else if (getOverScrollMode() != 2) {
            if (motionEvent2 != null && !C1229dc.d(motionEvent2, 8194)) {
                a(motionEvent.getX(), (float) i6, motionEvent.getY(), (float) i5);
            }
            b(i2, i3);
        }
        if (i4 == 0) {
            i8 = i13;
        } else {
            i8 = i13;
        }
        d(i4, i8);
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (i4 == 0 && i8 == 0) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2) {
        i iVar = this.w;
        if (iVar != null) {
            iVar.g(i2);
        }
        h(i2);
        m mVar = this.sa;
        if (mVar != null) {
            mVar.a(this, i2);
        }
        List<m> list = this.ta;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((m) this.ta.get(size)).a(this, i2);
            }
        }
    }

    static void b(ViewHolder viewHolder) {
        WeakReference<RecyclerView> weakReference = viewHolder.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != viewHolder.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            viewHolder.mNestedRecyclerView = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(View view) {
        ViewHolder i2 = i(view);
        l(view);
        a aVar = this.v;
        if (!(aVar == null || i2 == null)) {
            aVar.c(i2);
        }
        List<j> list = this.M;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((j) this.M.get(size)).a(view);
            }
        }
    }

    public void a(int i2, int i3, Interpolator interpolator) {
        i iVar = this.w;
        if (iVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.H) {
            if (!iVar.a()) {
                i2 = 0;
            }
            if (!this.w.b()) {
                i3 = 0;
            }
            if (!(i2 == 0 && i3 == 0)) {
                this.oa.a(i2, i3, interpolator);
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    private void a(float f2, float f3, float f4, float f5) {
        boolean z2;
        boolean z3 = true;
        if (f3 < 0.0f) {
            f();
            androidx.core.widget.f.a(this.S, (-f3) / ((float) getWidth()), 1.0f - (f4 / ((float) getHeight())));
        } else if (f3 > 0.0f) {
            g();
            androidx.core.widget.f.a(this.U, f3 / ((float) getWidth()), f4 / ((float) getHeight()));
        } else {
            z2 = false;
            if (f5 >= 0.0f) {
                h();
                androidx.core.widget.f.a(this.T, (-f5) / ((float) getHeight()), f2 / ((float) getWidth()));
            } else if (f5 > 0.0f) {
                e();
                androidx.core.widget.f.a(this.V, f5 / ((float) getHeight()), 1.0f - (f2 / ((float) getWidth())));
            } else {
                z3 = z2;
            }
            if (!z3 || f3 != 0.0f || f5 != 0.0f) {
                C1778vc.F(this);
            }
            return;
        }
        z2 = true;
        if (f5 >= 0.0f) {
        }
        if (!z3) {
        }
        C1778vc.F(this);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3) {
        if (i2 < 0) {
            f();
            this.S.onAbsorb(-i2);
        } else if (i2 > 0) {
            g();
            this.U.onAbsorb(i2);
        }
        if (i3 < 0) {
            h();
            this.T.onAbsorb(-i3);
        } else if (i3 > 0) {
            e();
            this.V.onAbsorb(i3);
        }
        if (i2 != 0 || i3 != 0) {
            C1778vc.F(this);
        }
    }

    private boolean a(View view, View view2, int i2) {
        int i3;
        boolean z2 = false;
        if (!(view2 == null || view2 == this)) {
            if (c(view2) == null) {
                return false;
            }
            if (view == null || c(view) == null) {
                return true;
            }
            this.s.set(0, 0, view.getWidth(), view.getHeight());
            this.t.set(0, 0, view2.getWidth(), view2.getHeight());
            offsetDescendantRectToMyCoords(view, this.s);
            offsetDescendantRectToMyCoords(view2, this.t);
            char c2 = 65535;
            int i4 = this.w.k() == 1 ? -1 : 1;
            Rect rect = this.s;
            int i5 = rect.left;
            int i6 = this.t.left;
            if ((i5 < i6 || rect.right <= i6) && this.s.right < this.t.right) {
                i3 = 1;
            } else {
                Rect rect2 = this.s;
                int i7 = rect2.right;
                int i8 = this.t.right;
                i3 = ((i7 > i8 || rect2.left >= i8) && this.s.left > this.t.left) ? -1 : 0;
            }
            Rect rect3 = this.s;
            int i9 = rect3.top;
            int i10 = this.t.top;
            if ((i9 < i10 || rect3.bottom <= i10) && this.s.bottom < this.t.bottom) {
                c2 = 1;
            } else {
                Rect rect4 = this.s;
                int i11 = rect4.bottom;
                int i12 = this.t.bottom;
                if ((i11 <= i12 && rect4.top < i12) || this.s.top <= this.t.top) {
                    c2 = 0;
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    if (c2 > 0 || (c2 == 0 && i3 * i4 >= 0)) {
                        z2 = true;
                    }
                    return z2;
                } else if (i2 == 17) {
                    if (i3 < 0) {
                        z2 = true;
                    }
                    return z2;
                } else if (i2 == 33) {
                    if (c2 < 0) {
                        z2 = true;
                    }
                    return z2;
                } else if (i2 == 66) {
                    if (i3 > 0) {
                        z2 = true;
                    }
                    return z2;
                } else if (i2 == 130) {
                    if (c2 > 0) {
                        z2 = true;
                    }
                    return z2;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Invalid direction: ");
                    sb.append(i2);
                    sb.append(i());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else if (c2 < 0 || (c2 == 0 && i3 * i4 <= 0)) {
                z2 = true;
            }
        }
        return z2;
    }

    private void a(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.s.set(0, 0, view3.getWidth(), view3.getHeight());
        android.view.ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof LayoutParams) {
            LayoutParams layoutParams2 = (LayoutParams) layoutParams;
            if (!layoutParams2.c) {
                Rect rect = layoutParams2.b;
                Rect rect2 = this.s;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.s);
            offsetRectIntoDescendantCoords(view, this.s);
        }
        this.w.a(this, view, this.s, !this.E, view2 == null);
    }

    /* access modifiers changed from: 0000 */
    public void a(String str) {
        if (o()) {
            if (str == null) {
                StringBuilder sb = new StringBuilder();
                sb.append("Cannot call this method while RecyclerView is computing a layout or scrolling");
                sb.append(i());
                throw new IllegalStateException(sb.toString());
            }
            throw new IllegalStateException(str);
        } else if (this.Q > 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("");
            sb2.append(i());
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(sb2.toString()));
        }
    }

    public void a(l lVar) {
        this.z.add(lVar);
    }

    private boolean a(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        l lVar = this.A;
        if (lVar != null) {
            if (action == 0) {
                this.A = null;
            } else {
                lVar.a(this, motionEvent);
                if (action == 3 || action == 1) {
                    this.A = null;
                }
                return true;
            }
        }
        if (action != 0) {
            int size = this.z.size();
            for (int i2 = 0; i2 < size; i2++) {
                l lVar2 = (l) this.z.get(i2);
                if (lVar2.b(this, motionEvent)) {
                    this.A = lVar2;
                    return true;
                }
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z2) {
        this.P--;
        if (this.P < 1) {
            this.P = 0;
            if (z2) {
                A();
                d();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(AccessibilityEvent accessibilityEvent) {
        if (!o()) {
            return false;
        }
        int a2 = accessibilityEvent != null ? Kc.a(accessibilityEvent) : 0;
        if (a2 == 0) {
            a2 = 0;
        }
        this.J = a2 | this.J;
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final void a(s sVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.oa.c;
            sVar.p = overScroller.getFinalX() - overScroller.getCurrX();
            sVar.q = overScroller.getFinalY() - overScroller.getCurrY();
            return;
        }
        sVar.p = 0;
        sVar.q = 0;
    }

    private void a(long j2, ViewHolder viewHolder, ViewHolder viewHolder2) {
        int a2 = this.o.a();
        for (int i2 = 0; i2 < a2; i2++) {
            ViewHolder i3 = i(this.o.c(i2));
            if (i3 != viewHolder && d(i3) == j2) {
                a aVar = this.v;
                String str = " \n View Holder 2:";
                if (aVar == null || !aVar.d()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(i3);
                    sb.append(str);
                    sb.append(viewHolder);
                    sb.append(i());
                    throw new IllegalStateException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(i3);
                sb2.append(str);
                sb2.append(viewHolder);
                sb2.append(i());
                throw new IllegalStateException(sb2.toString());
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Problem while matching changed view holders with the newones. The pre-layout information for the change holder ");
        sb3.append(viewHolder2);
        sb3.append(" cannot be found but it is necessary for ");
        sb3.append(viewHolder);
        sb3.append(i());
        Log.e("RecyclerView", sb3.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a(ViewHolder viewHolder, c cVar) {
        viewHolder.setFlags(0, 8192);
        if (this.ra.i && viewHolder.isUpdated() && !viewHolder.isRemoved() && !viewHolder.shouldIgnore()) {
            this.p.a(d(viewHolder), viewHolder);
        }
        this.p.c(viewHolder, cVar);
    }

    private void a(int[] iArr) {
        int a2 = this.o.a();
        if (a2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = BaseClientBuilder.API_PRIORITY_OTHER;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < a2; i4++) {
            ViewHolder i5 = i(this.o.c(i4));
            if (!i5.shouldIgnore()) {
                int layoutPosition = i5.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    /* access modifiers changed from: 0000 */
    public void a(ViewHolder viewHolder, c cVar, c cVar2) {
        viewHolder.setIsRecyclable(false);
        if (this.W.a(viewHolder, cVar, cVar2)) {
            t();
        }
    }

    private void a(ViewHolder viewHolder, ViewHolder viewHolder2, c cVar, c cVar2, boolean z2, boolean z3) {
        viewHolder.setIsRecyclable(false);
        if (z2) {
            e(viewHolder);
        }
        if (viewHolder != viewHolder2) {
            if (z3) {
                e(viewHolder2);
            }
            viewHolder.mShadowedHolder = viewHolder2;
            e(viewHolder);
            this.l.c(viewHolder);
            viewHolder2.setIsRecyclable(false);
            viewHolder2.mShadowingHolder = viewHolder;
        }
        if (this.W.a(viewHolder, viewHolder2, cVar, cVar2)) {
            t();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        int b2 = this.o.b();
        for (int i2 = 0; i2 < b2; i2++) {
            ViewHolder i3 = i(this.o.d(i2));
            if (!i3.shouldIgnore()) {
                i3.clearOldPosition();
            }
        }
        this.l.b();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int b2 = this.o.b();
        for (int i5 = 0; i5 < b2; i5++) {
            ViewHolder i6 = i(this.o.d(i5));
            if (i6 != null && !i6.shouldIgnore()) {
                int i7 = i6.mPosition;
                if (i7 >= i4) {
                    i6.offsetPosition(-i3, z2);
                    this.ra.g = true;
                } else if (i7 >= i2) {
                    i6.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    this.ra.g = true;
                }
            }
        }
        this.l.a(i2, i3, z2);
        requestLayout();
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, int i3, Object obj) {
        int b2 = this.o.b();
        int i4 = i2 + i3;
        for (int i5 = 0; i5 < b2; i5++) {
            View d2 = this.o.d(i5);
            ViewHolder i6 = i(d2);
            if (i6 != null && !i6.shouldIgnore()) {
                int i7 = i6.mPosition;
                if (i7 >= i2 && i7 < i4) {
                    i6.addFlags(2);
                    i6.addChangePayload(obj);
                    ((LayoutParams) d2.getLayoutParams()).c = true;
                }
            }
        }
        this.l.c(i2, i3);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(ViewHolder viewHolder) {
        f fVar = this.W;
        return fVar == null || fVar.a(viewHolder, viewHolder.getUnmodifiedPayloads());
    }

    /* access modifiers changed from: 0000 */
    public ViewHolder a(int i2, boolean z2) {
        int b2 = this.o.b();
        ViewHolder viewHolder = null;
        for (int i3 = 0; i3 < b2; i3++) {
            ViewHolder i4 = i(this.o.d(i3));
            if (i4 != null && !i4.isRemoved()) {
                if (z2) {
                    if (i4.mPosition != i2) {
                        continue;
                    }
                } else if (i4.getLayoutPosition() != i2) {
                    continue;
                }
                if (!this.o.c(i4.itemView)) {
                    return i4;
                }
                viewHolder = i4;
            }
        }
        return viewHolder;
    }

    public ViewHolder a(long j2) {
        a aVar = this.v;
        ViewHolder viewHolder = null;
        if (aVar != null && aVar.d()) {
            int b2 = this.o.b();
            for (int i2 = 0; i2 < b2; i2++) {
                ViewHolder i3 = i(this.o.d(i2));
                if (i3 != null && !i3.isRemoved() && i3.getItemId() == j2) {
                    if (!this.o.c(i3.itemView)) {
                        return i3;
                    }
                    viewHolder = i3;
                }
            }
        }
        return viewHolder;
    }

    public View a(float f2, float f3) {
        for (int a2 = this.o.a() - 1; a2 >= 0; a2--) {
            View c2 = this.o.c(a2);
            float translationX = c2.getTranslationX();
            float translationY = c2.getTranslationY();
            if (f2 >= ((float) c2.getLeft()) + translationX && f2 <= ((float) c2.getRight()) + translationX && f3 >= ((float) c2.getTop()) + translationY && f3 <= ((float) c2.getBottom()) + translationY) {
                return c2;
            }
        }
        return null;
    }

    public void a(View view, Rect rect) {
        b(view, rect);
    }

    /* access modifiers changed from: 0000 */
    public void a(View view) {
        ViewHolder i2 = i(view);
        k(view);
        a aVar = this.v;
        if (!(aVar == null || i2 == null)) {
            aVar.b(i2);
        }
        List<j> list = this.M;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((j) this.M.get(size)).b(view);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(ViewHolder viewHolder, int i2) {
        if (o()) {
            viewHolder.mPendingAccessibilityState = i2;
            this.Ga.add(viewHolder);
            return false;
        }
        C1778vc.f(viewHolder.itemView, i2);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void a(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Trying to set fast scroller without both required drawables.");
            sb.append(i());
            throw new IllegalArgumentException(sb.toString());
        }
        Resources resources = getContext().getResources();
        new C0428w(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(Hd.fastscroll_default_thickness), resources.getDimensionPixelSize(Hd.fastscroll_minimum_range), resources.getDimensionPixelOffset(Hd.fastscroll_margin));
    }

    public void a(int i2) {
        getScrollingChildHelper().c(i2);
    }

    public boolean a(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().a(i2, i3, i4, i5, iArr, i6);
    }

    public boolean a(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().a(i2, i3, iArr, iArr2, i4);
    }
}
