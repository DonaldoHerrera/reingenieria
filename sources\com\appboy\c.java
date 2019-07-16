package com.appboy;

import org.json.JSONException;

class c implements Runnable {
    final /* synthetic */ h a;

    c(h hVar) {
        this.a = hVar;
    }

    public void run() {
        try {
            this.a.n.a(this.a.s.a(), Xf.class);
        } catch (JSONException e) {
            Hg.d(h.a, "Failed to retrieve and publish feed from offline cache.", e);
        }
    }
}
