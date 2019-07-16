package com.soundcloud.android.playback;

import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.ads.C3678e;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* compiled from: VideoSurfaceProvider */
public class ke implements com.soundcloud.android.playback.me.b {
    private final Map<String, WeakReference<me>> a = new HashMap(5);
    private final a b;
    private final C3678e c;
    private final List<a> d = new LinkedList();

    /* compiled from: VideoSurfaceProvider */
    public interface a {
        void a(String str, Surface surface);
    }

    /* compiled from: VideoSurfaceProvider */
    public enum b {
        FULLSCREEN,
        STREAM,
        PLAYER,
        PRESTITIAL
    }

    ke(a aVar, C3678e eVar) {
        this.b = aVar;
        this.c = eVar;
    }

    public void a(a aVar) {
        this.d.add(aVar);
    }

    public void b(b bVar) {
        a((Predicate<me>) new r<me>(bVar));
    }

    public View c(String str) {
        if (this.a.containsKey(str)) {
            me meVar = (me) ((WeakReference) this.a.get(str)).get();
            if (meVar != null) {
                return meVar.e();
            }
        }
        return null;
    }

    public void a(String str, Surface surface) {
        a((C7733yKa<a>) new C4410q<a>(str, surface));
    }

    public Surface b(String str) {
        if (this.a.containsKey(str)) {
            me meVar = (me) ((WeakReference) this.a.get(str)).get();
            if (meVar != null) {
                return meVar.c();
            }
        }
        return null;
    }

    public void a(String str, b bVar, TextureView textureView, View view) {
        if (!this.a.containsKey(str) || ((WeakReference) this.a.get(str)).get() == null || ((me) ((WeakReference) this.a.get(str)).get()).b() != bVar) {
            a((Predicate<me>) new C4419s<me>(textureView, str));
            this.a.put(str, new WeakReference(this.b.a(str, bVar, textureView, view, a(textureView), this)));
            a(str, bVar, "Created container");
        } else {
            ((me) ((WeakReference) this.a.get(str)).get()).a(textureView, view, a(textureView));
            a(str, bVar, "Reattached to existing container");
        }
        this.c.a(str, view);
    }

    static /* synthetic */ boolean a(TextureView textureView, String str, me meVar) {
        return meVar.a(textureView) || meVar.d().equals(str);
    }

    private List<WeakReference<View>> a(TextureView textureView) {
        ArrayList arrayList = new ArrayList();
        ViewParent parent = textureView.getParent();
        if (parent != null) {
            while (parent.getParent() != null && (parent.getParent() instanceof ViewGroup)) {
                parent = parent.getParent();
            }
            a((ViewGroup) parent, (List<WeakReference<View>>) arrayList);
            return arrayList;
        }
        throw new La("textureView has no parent!");
    }

    private void a(ViewGroup viewGroup, List<WeakReference<View>> list) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            list.add(new WeakReference(childAt));
            if (childAt instanceof ViewGroup) {
                a((ViewGroup) childAt, list);
            }
        }
    }

    private void a(Predicate<me> predicate) {
        Iterator it = this.a.entrySet().iterator();
        while (it.hasNext()) {
            me meVar = (me) ((WeakReference) ((Entry) it.next()).getValue()).get();
            if (meVar != null && predicate.apply(meVar)) {
                a(meVar.d(), meVar.b(), "Removing container");
                meVar.f();
                it.remove();
            }
        }
    }

    public void a(b bVar) {
        for (WeakReference weakReference : this.a.values()) {
            me meVar = (me) weakReference.get();
            if (meVar != null && meVar.b() == bVar) {
                meVar.g();
                a(meVar.d(), bVar, "Unbinded TextureView from container");
            }
        }
    }

    private void a(C7733yKa<a> yka) {
        for (a accept : this.d) {
            yka.accept(accept);
        }
    }

    private void a(String str, b bVar, String str2) {
        SDb.a("VideoSurfaceProvider").d(String.format("[UUID: %s, Origin: %s] %s", new Object[]{str, bVar, str2}), new Object[0]);
    }

    static /* synthetic */ boolean a(b bVar, me meVar) {
        return meVar != null && meVar.b() == bVar;
    }

    public List<WeakReference<View>> a(String str) {
        if (this.a.containsKey(str)) {
            me meVar = (me) ((WeakReference) this.a.get(str)).get();
            if (meVar != null) {
                return meVar.a();
            }
        }
        return Collections.emptyList();
    }
}
