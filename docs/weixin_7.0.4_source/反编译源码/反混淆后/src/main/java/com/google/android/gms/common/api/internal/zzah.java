package com.google.android.gms.common.api.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;

final class zzah extends zzbe {
    private final /* synthetic */ zzag zzhh;

    zzah(zzag zzag, zzbc zzbc) {
        this.zzhh = zzag;
        super(zzbc);
    }

    public final void zzaq() {
        AppMethodBeat.m2504i(60718);
        this.zzhh.onConnectionSuspended(1);
        AppMethodBeat.m2505o(60718);
    }
}
