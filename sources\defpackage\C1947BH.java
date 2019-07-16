package defpackage;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

/* renamed from: BH reason: default package and case insensitive filesystem */
public class C1947BH {
    private final HashMap<View, String> a = new HashMap<>();
    private final HashMap<View, ArrayList<String>> b = new HashMap<>();
    private final HashSet<View> c = new HashSet<>();
    private final HashSet<String> d = new HashSet<>();
    private final HashSet<String> e = new HashSet<>();
    private boolean f;

    private void a(C2218PG pg) {
        for (C3105lH lHVar : pg.d()) {
            View view = (View) lHVar.get();
            if (view != null) {
                a(view, pg);
            }
        }
    }

    private void a(View view, C2218PG pg) {
        ArrayList arrayList = (ArrayList) this.b.get(view);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.b.put(view, arrayList);
        }
        arrayList.add(pg.b());
    }

    private boolean d(View view) {
        if (!view.hasWindowFocus()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            if (!C3086kH.d(view)) {
                return false;
            }
            hashSet.add(view);
            ViewParent parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        this.c.addAll(hashSet);
        return true;
    }

    public String a(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String str = (String) this.a.get(view);
        if (str != null) {
            this.a.remove(view);
        }
        return str;
    }

    public HashSet<String> a() {
        return this.d;
    }

    public ArrayList<String> b(View view) {
        if (this.b.size() == 0) {
            return null;
        }
        ArrayList<String> arrayList = (ArrayList) this.b.get(view);
        if (arrayList != null) {
            this.b.remove(view);
            Collections.sort(arrayList);
        }
        return arrayList;
    }

    public HashSet<String> b() {
        return this.e;
    }

    public C1987DH c(View view) {
        if (this.c.contains(view)) {
            return C1987DH.PARENT_VIEW;
        }
        return this.f ? C1987DH.OBSTRUCTION_VIEW : C1987DH.UNDERLYING_VIEW;
    }

    public void c() {
        C2331VG a2 = C2331VG.a();
        if (a2 != null) {
            for (C2218PG pg : a2.c()) {
                View f2 = pg.f();
                if (pg.g()) {
                    if (f2 == null || !d(f2)) {
                        this.e.add(pg.b());
                    } else {
                        this.d.add(pg.b());
                        this.a.put(f2, pg.b());
                        a(pg);
                    }
                }
            }
        }
    }

    public void d() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f = false;
    }

    public void e() {
        this.f = true;
    }
}
