package com.soundcloud.android;

import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import com.soundcloud.android.ia.c;

public class BugReporterTileService extends TileService {
    C5322TGa a;

    public BugReporterTileService() {
        SoundCloudApplication.f().a(this);
    }

    private void a(int i) {
        Tile qsTile = getQsTile();
        qsTile.setState(i);
        qsTile.updateTile();
    }

    public void onClick() {
        showDialog(this.a.a(getApplicationContext(), c.feedback_all));
    }

    public void onTileAdded() {
        a(2);
        super.onTileAdded();
    }

    public void onTileRemoved() {
        a(1);
        super.onTileRemoved();
    }
}
