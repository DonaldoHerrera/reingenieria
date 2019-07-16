package defpackage;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.SharedPreferences.OnSharedPreferenceChangeListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: MHa reason: default package and case insensitive filesystem */
/* compiled from: ObfuscatedPreferences */
public class C5112MHa implements SharedPreferences {
    /* access modifiers changed from: private */
    public final C2041FV a;
    /* access modifiers changed from: private */
    public final SharedPreferences b;
    private final WeakHashMap<OnSharedPreferenceChangeListener, b> c = new WeakHashMap<>();

    /* renamed from: MHa$a */
    /* compiled from: ObfuscatedPreferences */
    public class a implements Editor {
        private final Editor a;

        @SuppressLint({"CommitPrefEdits"})
        public a() {
            this.a = C5112MHa.this.b.edit();
        }

        public void apply() {
            this.a.apply();
        }

        public Editor clear() {
            return this.a.clear();
        }

        public boolean commit() {
            return this.a.commit();
        }

        public Editor putBoolean(String str, boolean z) {
            this.a.putString(C5112MHa.this.a.c(str), C5112MHa.this.a.a(z));
            return this;
        }

        public Editor putFloat(String str, float f) {
            throw C5112MHa.this.a();
        }

        public Editor putInt(String str, int i) {
            this.a.putInt(C5112MHa.this.a.c(str), i);
            return this;
        }

        public Editor putLong(String str, long j) {
            throw C5112MHa.this.a();
        }

        public Editor putString(String str, String str2) {
            this.a.putString(C5112MHa.this.a.c(str), C5112MHa.this.a.c(str2));
            return this;
        }

        public Editor putStringSet(String str, Set<String> set) {
            HashSet hashSet = new HashSet();
            for (String c : set) {
                hashSet.add(C5112MHa.this.a.c(c));
            }
            this.a.putStringSet(C5112MHa.this.a.c(str), hashSet);
            return this;
        }

        public Editor remove(String str) {
            return this.a.remove(C5112MHa.this.a.c(str));
        }
    }

    /* renamed from: MHa$b */
    /* compiled from: ObfuscatedPreferences */
    public class b implements OnSharedPreferenceChangeListener {
        private final OnSharedPreferenceChangeListener a;

        public b(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
            this.a = onSharedPreferenceChangeListener;
        }

        public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = this.a;
            C5112MHa mHa = C5112MHa.this;
            onSharedPreferenceChangeListener.onSharedPreferenceChanged(mHa, mHa.a.b(str));
        }
    }

    public C5112MHa(SharedPreferences sharedPreferences, C2041FV fv) {
        this.b = sharedPreferences;
        this.a = fv;
    }

    public boolean contains(String str) {
        return this.b.contains(this.a.c(str));
    }

    public Editor edit() {
        return new a();
    }

    public Map<String, ?> getAll() {
        throw a();
    }

    public boolean getBoolean(String str, boolean z) {
        return a(this.b.getString(this.a.c(str), null), z);
    }

    public float getFloat(String str, float f) {
        throw a();
    }

    public int getInt(String str, int i) {
        return this.b.getInt(this.a.c(str), i);
    }

    public long getLong(String str, long j) {
        throw a();
    }

    public String getString(String str, String str2) {
        String string = this.b.getString(this.a.c(str), null);
        if (string == null) {
            return str2;
        }
        return this.a.b(string);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        HashSet hashSet = new HashSet();
        Set<String> stringSet = this.b.getStringSet(this.a.c(str), null);
        if (stringSet == null) {
            return set;
        }
        for (String b2 : stringSet) {
            hashSet.add(this.a.b(b2));
        }
        return hashSet;
    }

    public void registerOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        synchronized (this) {
            b bVar = new b(onSharedPreferenceChangeListener);
            this.c.put(onSharedPreferenceChangeListener, bVar);
            this.b.registerOnSharedPreferenceChangeListener(bVar);
        }
    }

    public void unregisterOnSharedPreferenceChangeListener(OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        OnSharedPreferenceChangeListener onSharedPreferenceChangeListener2;
        b bVar;
        synchronized (this) {
            Iterator it = this.c.entrySet().iterator();
            while (true) {
                onSharedPreferenceChangeListener2 = null;
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                Entry entry = (Entry) it.next();
                if (((OnSharedPreferenceChangeListener) entry.getKey()).equals(onSharedPreferenceChangeListener)) {
                    onSharedPreferenceChangeListener2 = (OnSharedPreferenceChangeListener) entry.getKey();
                    bVar = (b) entry.getValue();
                    break;
                }
            }
            if (onSharedPreferenceChangeListener2 != null) {
                this.c.remove(onSharedPreferenceChangeListener2);
            }
            if (bVar != null) {
                this.b.unregisterOnSharedPreferenceChangeListener(bVar);
            }
        }
    }

    private boolean a(String str, boolean z) {
        return str == null ? z : this.a.a(str);
    }

    /* access modifiers changed from: private */
    public RuntimeException a() {
        StringBuilder sb = new StringBuilder();
        sb.append("Not implemented in ");
        sb.append(C5112MHa.class.getSimpleName());
        return new UnsupportedOperationException(sb.toString());
    }
}
