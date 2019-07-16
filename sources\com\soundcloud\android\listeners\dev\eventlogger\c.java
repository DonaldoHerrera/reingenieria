package com.soundcloud.android.listeners.dev.eventlogger;

/* compiled from: lambda */
public final /* synthetic */ class c implements C7733yKa {
    private final /* synthetic */ b a;
    private final /* synthetic */ C2110JM b;

    public /* synthetic */ c(b bVar, C2110JM jm) {
        this.a = bVar;
        this.b = jm;
    }

    public final void accept(Object obj) {
        this.a.itemView.setOnClickListener(new b((a) obj, this.b));
    }
}
