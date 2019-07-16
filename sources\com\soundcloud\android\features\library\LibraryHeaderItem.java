package com.soundcloud.android.features.library;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs;
import com.soundcloud.android.features.library.aa.i;
import com.soundcloud.android.features.library.aa.l;
import com.soundcloud.android.soul.components.cells.standard.CellStandardIcon;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u0014\u0010\u000f\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/features/library/LibraryHeaderItem;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "downloads", "Lcom/soundcloud/android/soul/components/cells/standard/CellStandardIcon;", "getDownloads", "()Lcom/soundcloud/android/soul/components/cells/standard/CellStandardIcon;", "following", "getFollowing", "likes", "getLikes", "playlists", "getPlaylists", "stations", "getStations", "setOnClickListeners", "", "listener", "Lcom/soundcloud/android/features/library/LibraryHeaderListener;", "collections-ui_release"}, mv = {1, 1, 15})
/* compiled from: LibraryHeaderItem.kt */
public class LibraryHeaderItem extends ConstraintLayout {
    private final CellStandardIcon u;
    private final CellStandardIcon v;
    private final CellStandardIcon w;
    private final CellStandardIcon x;
    private final CellStandardIcon y;

    public LibraryHeaderItem(Context context, AttributeSet attributeSet) {
        C7471uYa.b(context, "context");
        C7471uYa.b(attributeSet, "attrs");
        super(context, attributeSet);
        View.inflate(context, l.library_preview_item, this);
        View findViewById = findViewById(i.library_header_likes);
        C7471uYa.a((Object) findViewById, "findViewById(R.id.library_header_likes)");
        this.u = (CellStandardIcon) findViewById;
        View findViewById2 = findViewById(i.library_header_playlists);
        C7471uYa.a((Object) findViewById2, "findViewById(R.id.library_header_playlists)");
        this.v = (CellStandardIcon) findViewById2;
        View findViewById3 = findViewById(i.library_header_following);
        C7471uYa.a((Object) findViewById3, "findViewById(R.id.library_header_following)");
        this.w = (CellStandardIcon) findViewById3;
        View findViewById4 = findViewById(i.library_header_stations);
        C7471uYa.a((Object) findViewById4, "findViewById(R.id.library_header_stations)");
        this.x = (CellStandardIcon) findViewById4;
        View findViewById5 = findViewById(i.library_header_downloads);
        C7471uYa.a((Object) findViewById5, "findViewById(R.id.library_header_downloads)");
        this.y = (CellStandardIcon) findViewById5;
    }

    public CellStandardIcon getDownloads() {
        return this.y;
    }

    public CellStandardIcon getFollowing() {
        return this.w;
    }

    public CellStandardIcon getLikes() {
        return this.u;
    }

    public CellStandardIcon getPlaylists() {
        return this.v;
    }

    public CellStandardIcon getStations() {
        return this.x;
    }

    public void setOnClickListeners(C3644v vVar) {
        C7471uYa.b(vVar, CastExtraArgs.LISTENER);
        getLikes().setOnClickListener(new C3640q(vVar));
        getPlaylists().setOnClickListener(new r(vVar));
        getFollowing().setOnClickListener(new C3641s(vVar));
        getStations().setOnClickListener(new C3642t(vVar));
        getDownloads().setOnClickListener(new C3643u(vVar));
    }
}
