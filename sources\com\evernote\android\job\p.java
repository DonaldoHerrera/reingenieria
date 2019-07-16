package com.evernote.android.job;

import com.evernote.android.job.s.c;

/* compiled from: JobRequest */
class p implements c {
    p() {
    }

    public void a(int i, String str, Exception exc) {
        if (exc != null) {
            s.f.a(exc, "The job with tag %s couldn't be scheduled", str);
        }
    }
}
