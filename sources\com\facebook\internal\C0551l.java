package com.facebook.internal;

import android.content.Intent;
import com.facebook.B;
import com.facebook.C0566k;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.internal.l reason: case insensitive filesystem */
/* compiled from: CallbackManagerImpl */
public final class C0551l implements C0566k {
    private static Map<Integer, a> a = new HashMap();
    private Map<Integer, a> b = new HashMap();

    /* renamed from: com.facebook.internal.l$a */
    /* compiled from: CallbackManagerImpl */
    public interface a {
        boolean a(int i, Intent intent);
    }

    /* renamed from: com.facebook.internal.l$b */
    /* compiled from: CallbackManagerImpl */
    public enum b {
        Login(0),
        Share(1),
        Message(2),
        Like(3),
        GameRequest(4),
        AppGroupCreate(5),
        AppGroupJoin(6),
        AppInvite(7),
        DeviceShare(8);
        
        private final int k;

        private b(int i) {
            this.k = i;
        }

        public int a() {
            return B.j() + this.k;
        }
    }

    private static synchronized a a(Integer num) {
        a aVar;
        synchronized (C0551l.class) {
            aVar = (a) a.get(num);
        }
        return aVar;
    }

    public static synchronized void b(int i, a aVar) {
        synchronized (C0551l.class) {
            ja.a((Object) aVar, "callback");
            if (!a.containsKey(Integer.valueOf(i))) {
                a.put(Integer.valueOf(i), aVar);
            }
        }
    }

    public boolean onActivityResult(int i, int i2, Intent intent) {
        a aVar = (a) this.b.get(Integer.valueOf(i));
        if (aVar != null) {
            return aVar.a(i2, intent);
        }
        return a(i, i2, intent);
    }

    private static boolean a(int i, int i2, Intent intent) {
        a a2 = a(Integer.valueOf(i));
        if (a2 != null) {
            return a2.a(i2, intent);
        }
        return false;
    }

    public void a(int i, a aVar) {
        ja.a((Object) aVar, "callback");
        this.b.put(Integer.valueOf(i), aVar);
    }
}
