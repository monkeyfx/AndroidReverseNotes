package com.tencent.mm.plugin.appbrand.report.quality;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;

public class QualitySession implements Parcelable {
    public static final Creator<QualitySession> CREATOR = new Creator<QualitySession>() {
        public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
            return new QualitySession[i];
        }

        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            AppMethodBeat.i(132703);
            QualitySession qualitySession = new QualitySession(parcel);
            AppMethodBeat.o(132703);
            return qualitySession;
        }
    };
    public String appId;
    public int apptype;
    public int iCZ;
    public int iDa;
    public final String igT;
    public int scene;

    public QualitySession(String str, AppBrandInitConfigWC appBrandInitConfigWC, AppBrandStatObject appBrandStatObject) {
        AppMethodBeat.i(132704);
        this.igT = str;
        this.appId = appBrandInitConfigWC.appId;
        switch (appBrandInitConfigWC.gVs) {
            case 0:
                this.iCZ = 1;
                break;
            case 1:
                this.iCZ = 2;
                break;
            case 2:
                this.iCZ = 3;
                break;
        }
        this.apptype = appBrandInitConfigWC.bQe + 1000;
        this.scene = appBrandStatObject.scene;
        this.iDa = appBrandInitConfigWC.axy;
        AppMethodBeat.o(132704);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        AppMethodBeat.i(132705);
        parcel.writeString(this.igT);
        parcel.writeString(this.appId);
        parcel.writeInt(this.iCZ);
        parcel.writeInt(this.apptype);
        parcel.writeInt(this.scene);
        parcel.writeInt(this.iDa);
        AppMethodBeat.o(132705);
    }

    protected QualitySession(Parcel parcel) {
        AppMethodBeat.i(132706);
        this.igT = parcel.readString();
        this.appId = parcel.readString();
        this.iCZ = parcel.readInt();
        this.apptype = parcel.readInt();
        this.scene = parcel.readInt();
        this.iDa = parcel.readInt();
        AppMethodBeat.o(132706);
    }

    static {
        AppMethodBeat.i(132707);
        AppMethodBeat.o(132707);
    }
}
