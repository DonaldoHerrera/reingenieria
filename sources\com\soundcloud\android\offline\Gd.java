package com.soundcloud.android.offline;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: OfflineContentStorage */
public class Gd {
    private final SharedPreferences a;
    private final HPa b;

    public Gd(SharedPreferences sharedPreferences, HPa hPa) {
        this.a = sharedPreferences;
        this.b = hPa;
    }

    /* access modifiers changed from: 0000 */
    public IPa<Boolean> a(C3508cda cda) {
        return IPa.c((Callable<? extends T>) new Ba<Object>(this, cda));
    }

    public /* synthetic */ Boolean b(C3508cda cda) throws Exception {
        return Boolean.valueOf(this.a.getStringSet("playlists_marked_for_offline", Collections.emptySet()).contains(cda.toString()));
    }

    public IPa<Boolean> c() {
        return IPa.c((Callable<? extends T>) new C4189xa<Object>(this));
    }

    /* access modifiers changed from: 0000 */
    public C6979nPa d(List<C3508cda> list) {
        return b((C7054oVa<Set<String>>) new Ca<Set<String>>(this, list));
    }

    /* access modifiers changed from: 0000 */
    public C6979nPa e(List<C3508cda> list) {
        return b((C7054oVa<Set<String>>) new C4167ta<Set<String>>(list));
    }

    public /* synthetic */ Boolean f() throws Exception {
        return Boolean.valueOf(this.a.getBoolean("likes_marked_for_offline", false));
    }

    public /* synthetic */ void g() throws Exception {
        this.a.edit().clear().commit();
    }

    public /* synthetic */ void h() throws Exception {
        this.a.edit().putBoolean("likes_marked_for_offline", false).commit();
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"ApplySharedPref"})
    public C6979nPa i() {
        return a((C6368eQa) new C4194ya(this));
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"ApplySharedPref"})
    public C6979nPa j() {
        return a((C6368eQa) new C4161sa(this));
    }

    static /* synthetic */ Set b(List list) {
        return new HashSet(C5526_Ha.b(list));
    }

    public /* synthetic */ Set a(List list) {
        HashSet a2 = C2458bE.a((Iterable<? extends E>) this.a.getStringSet("playlists_marked_for_offline", Collections.emptySet()));
        a2.removeAll(C5526_Ha.b(list));
        return a2;
    }

    public C6979nPa c(C3508cda cda) {
        return d(Collections.singletonList(cda));
    }

    public /* synthetic */ void d() throws Exception {
        this.a.edit().putBoolean("likes_marked_for_offline", true).commit();
    }

    public /* synthetic */ ArrayList e() throws Exception {
        return new ArrayList(this.a.getStringSet("playlists_marked_for_offline", Collections.emptySet()));
    }

    /* access modifiers changed from: 0000 */
    public C6979nPa f(List<C3508cda> list) {
        return b((C7054oVa<Set<String>>) new C4179va<Set<String>>(this, list));
    }

    public IPa<List<C3508cda>> b() {
        return IPa.c((Callable<? extends T>) new C4173ua<Object>(this)).e(C4199za.a);
    }

    public /* synthetic */ Set c(List list) {
        HashSet a2 = C2458bE.a((Iterable<? extends E>) this.a.getStringSet("playlists_marked_for_offline", new HashSet()));
        a2.addAll(C5526_Ha.b(list));
        return a2;
    }

    @SuppressLint({"ApplySharedPref"})
    private C6979nPa b(C7054oVa<Set<String>> ova) {
        return a((C6368eQa) new Aa(this, ova));
    }

    public /* synthetic */ void a(C7054oVa ova) throws Exception {
        this.a.edit().putStringSet("playlists_marked_for_offline", (Set) ova.get()).commit();
    }

    /* access modifiers changed from: 0000 */
    @SuppressLint({"ApplySharedPref"})
    public C6979nPa a() {
        return a((C6368eQa) new C4184wa(this));
    }

    private C6979nPa a(C6368eQa eqa) {
        return C6979nPa.b(eqa).b(this.b);
    }
}
