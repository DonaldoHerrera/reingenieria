package com.soundcloud.android.settings.streamingquality;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.N;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import androidx.recyclerview.widget.RecyclerView.h;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.soul.components.cells.standard.CellStandard;
import com.soundcloud.android.soul.components.cells.standard.CellStandard.a.C0173a;
import java.util.List;

@EVa(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B%\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u001c\u0010\t\u001a\u0010\u0012\f\u0012\n \u000b*\u0004\u0018\u00010\u00070\u00070\nX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/soundcloud/android/settings/streamingquality/SettingsListPicker;", "Landroidx/recyclerview/widget/RecyclerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "settingSelectedSubject", "Lio/reactivex/subjects/PublishSubject;", "kotlin.jvm.PlatformType", "positionClick", "Lio/reactivex/Observable;", "render", "", "viewModel", "Lcom/soundcloud/android/settings/streamingquality/SettingsListPicker$ViewModel;", "Setting", "SettingsListPickerAdapter", "ViewModel", "base_release"}, mv = {1, 1, 15})
/* compiled from: SettingsListPicker.kt */
public final class SettingsListPicker extends RecyclerView {
    /* access modifiers changed from: private */
    public final C6781kVa<Integer> Ja;

    /* compiled from: SettingsListPicker.kt */
    public static final class a {
        private final String a;

        public a(String str) {
            C7471uYa.b(str, "title");
            this.a = str;
        }

        public final String a() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.settings.streamingquality.SettingsListPicker.a) r2).a) != false) goto L_0x0015;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("Setting(title=");
            sb.append(this.a);
            sb.append(")");
            return sb.toString();
        }
    }

    @EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0017\u0018B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0007H\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/settings/streamingquality/SettingsListPicker$SettingsListPickerAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/soundcloud/android/settings/streamingquality/SettingsListPicker$Setting;", "Lcom/soundcloud/android/settings/streamingquality/SettingsListPicker$SettingsListPickerAdapter$SettingsListPickerAdapterViewHolder;", "settings", "", "selectedPosition", "", "listener", "Lcom/soundcloud/android/settings/streamingquality/SettingsListPicker$SettingsListPickerAdapter$Listener;", "(Ljava/util/List;ILcom/soundcloud/android/settings/streamingquality/SettingsListPicker$SettingsListPickerAdapter$Listener;)V", "getListener", "()Lcom/soundcloud/android/settings/streamingquality/SettingsListPicker$SettingsListPickerAdapter$Listener;", "getSelectedPosition", "()I", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "Listener", "SettingsListPickerAdapterViewHolder", "base_release"}, mv = {1, 1, 15})
    /* compiled from: SettingsListPicker.kt */
    private static final class b extends N<a, C0170b> {
        private final int d;
        private final a e;

        /* compiled from: SettingsListPicker.kt */
        public interface a {
            void a(a aVar);
        }

        /* renamed from: com.soundcloud.android.settings.streamingquality.SettingsListPicker$b$b reason: collision with other inner class name */
        /* compiled from: SettingsListPicker.kt */
        private static final class C0170b extends ViewHolder {
            private final CellStandard a;
            private final a b;

            public C0170b(CellStandard cellStandard, a aVar) {
                C7471uYa.b(cellStandard, "cellStandard");
                C7471uYa.b(aVar, CastExtraArgs.LISTENER);
                super(cellStandard);
                this.a = cellStandard;
                this.b = aVar;
            }

            public final void a(a aVar, boolean z) {
                C7471uYa.b(aVar, "setting");
                this.a.a(new com.soundcloud.android.soul.components.cells.standard.CellStandard.b(aVar.a(), z ? C0173a.a : com.soundcloud.android.soul.components.cells.standard.CellStandard.a.b.a));
                this.a.setOnClickListener(new c(this, aVar));
            }

            public final a b() {
                return this.b;
            }
        }

        public b(List<a> list, int i, a aVar) {
            C7471uYa.b(list, "settings");
            C7471uYa.b(aVar, CastExtraArgs.LISTENER);
            super(new b());
            this.d = i;
            this.e = aVar;
            a(list);
        }

        /* renamed from: a */
        public void b(C0170b bVar, int i) {
            C7471uYa.b(bVar, "holder");
            Object f = f(i);
            C7471uYa.a(f, "getItem(position)");
            bVar.a((a) f, this.d == i);
        }

        public C0170b b(ViewGroup viewGroup, int i) {
            C7471uYa.b(viewGroup, "parent");
            Context context = viewGroup.getContext();
            C7471uYa.a((Object) context, "parent.context");
            CellStandard cellStandard = new CellStandard(context, null, 0, 6, null);
            return new C0170b(cellStandard, this.e);
        }
    }

    /* compiled from: SettingsListPicker.kt */
    public static final class c {
        private final List<a> a;
        private final int b;

        public c(List<a> list, int i) {
            C7471uYa.b(list, "settings");
            this.a = list;
            this.b = i;
        }

        public final int a() {
            return this.b;
        }

        public final List<a> b() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.a, (Object) cVar.a)) {
                        if (this.b == cVar.b) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            List<a> list = this.a;
            return ((list != null ? list.hashCode() : 0) * 31) + this.b;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ViewModel(settings=");
            sb.append(this.a);
            sb.append(", selectedPosition=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    public SettingsListPicker(Context context) {
        this(context, null, 0, 6, null);
    }

    public SettingsListPicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ SettingsListPicker(Context context, AttributeSet attributeSet, int i, int i2, C7264rYa rya) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final APa<Integer> z() {
        return this.Ja;
    }

    public SettingsListPicker(Context context, AttributeSet attributeSet, int i) {
        C7471uYa.b(context, "context");
        super(context, attributeSet, i);
        C6781kVa<Integer> s = C6781kVa.s();
        C7471uYa.a((Object) s, "PublishSubject.create<Int>()");
        this.Ja = s;
        setLayoutManager(new LinearLayoutManager(context, 1, false));
        Drawable c2 = androidx.core.content.a.c(context, g.divider_1_mist);
        if (c2 != null) {
            C7471uYa.a((Object) c2, "ContextCompat.getDrawabl…rawable.divider_1_mist)!!");
            a((h) new C7851zxa(c2));
            return;
        }
        C7471uYa.a();
        throw null;
    }

    public final void a(c cVar) {
        C7471uYa.b(cVar, "viewModel");
        setAdapter(new b(cVar.b(), cVar.a(), new d(this, cVar)));
    }
}
