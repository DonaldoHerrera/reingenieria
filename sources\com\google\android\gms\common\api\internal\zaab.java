package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.WeakHashMap;

public final class zaab {
    /* access modifiers changed from: private */
    public final Map<BasePendingResult<?>, Boolean> zafk = Collections.synchronizedMap(new WeakHashMap());
    /* access modifiers changed from: private */
    public final Map<Xy<?>, Boolean> zafl = Collections.synchronizedMap(new WeakHashMap());

    /* access modifiers changed from: 0000 */
    public final void zaa(BasePendingResult<? extends Result> basePendingResult, boolean z) {
        this.zafk.put(basePendingResult, Boolean.valueOf(z));
        basePendingResult.addStatusListener(new zaac(this, basePendingResult));
    }

    /* access modifiers changed from: 0000 */
    public final boolean zaag() {
        return !this.zafk.isEmpty() || !this.zafl.isEmpty();
    }

    public final void zaah() {
        zaa(false, GoogleApiManager.zahx);
    }

    public final void zaai() {
        zaa(true, zacp.zakx);
    }

    /* access modifiers changed from: 0000 */
    public final <TResult> void zaa(Xy<TResult> xy, boolean z) {
        this.zafl.put(xy, Boolean.valueOf(z));
        xy.a().a((Ry<TResult>) new zaad<TResult>(this, xy));
    }

    private final void zaa(boolean z, Status status) {
        HashMap hashMap;
        HashMap hashMap2;
        synchronized (this.zafk) {
            hashMap = new HashMap(this.zafk);
        }
        synchronized (this.zafl) {
            hashMap2 = new HashMap(this.zafl);
        }
        for (Entry entry : hashMap.entrySet()) {
            if (z || ((Boolean) entry.getValue()).booleanValue()) {
                ((BasePendingResult) entry.getKey()).zab(status);
            }
        }
        for (Entry entry2 : hashMap2.entrySet()) {
            if (z || ((Boolean) entry2.getValue()).booleanValue()) {
                ((Xy) entry2.getKey()).b((Exception) new ApiException(status));
            }
        }
    }
}
