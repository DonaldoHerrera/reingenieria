package com.google.android.gms.common.api.internal;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import java.util.Collections;
import java.util.Map;

final class zaaa implements Ry<Map<zai<?>, String>> {
    private final /* synthetic */ zax zafi;
    private SignInConnectionListener zafj;

    zaaa(zax zax, SignInConnectionListener signInConnectionListener) {
        this.zafi = zax;
        this.zafj = signInConnectionListener;
    }

    /* access modifiers changed from: 0000 */
    public final void cancel() {
        this.zafj.onComplete();
    }

    public final void onComplete(Wy<Map<zai<?>, String>> wy) {
        this.zafi.zaeo.lock();
        try {
            if (!this.zafi.zafd) {
                this.zafj.onComplete();
                return;
            }
            if (wy.e()) {
                this.zafi.zaff = new T(this.zafi.zaev.size());
                for (zaw zak : this.zafi.zaev.values()) {
                    this.zafi.zaff.put(zak.zak(), ConnectionResult.RESULT_SUCCESS);
                }
            } else if (wy.a() instanceof AvailabilityException) {
                AvailabilityException availabilityException = (AvailabilityException) wy.a();
                if (this.zafi.zafb) {
                    this.zafi.zaff = new T(this.zafi.zaev.size());
                    for (zaw zaw : this.zafi.zaev.values()) {
                        zai zak2 = zaw.zak();
                        ConnectionResult connectionResult = availabilityException.getConnectionResult(zaw);
                        if (this.zafi.zaa(zaw, connectionResult)) {
                            this.zafi.zaff.put(zak2, new ConnectionResult(16));
                        } else {
                            this.zafi.zaff.put(zak2, connectionResult);
                        }
                    }
                } else {
                    this.zafi.zaff = availabilityException.zaj();
                }
            } else {
                Log.e("ConnectionlessGAC", "Unexpected availability exception", wy.a());
                this.zafi.zaff = Collections.emptyMap();
            }
            if (this.zafi.isConnected()) {
                this.zafi.zafe.putAll(this.zafi.zaff);
                if (this.zafi.zaaf() == null) {
                    this.zafi.zaad();
                    this.zafi.zaae();
                    this.zafi.zaez.signalAll();
                }
            }
            this.zafj.onComplete();
            this.zafi.zaeo.unlock();
        } finally {
            this.zafi.zaeo.unlock();
        }
    }
}
