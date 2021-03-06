package com.tencent.p177mm.plugin.facedetect.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.C25738R;
import com.tencent.p177mm.plugin.appbrand.jsapi.C45580bd;
import com.tencent.p177mm.plugin.appbrand.jsapi.p308i.C16666c;
import com.tencent.p177mm.sdk.platformtools.C4990ab;

/* renamed from: com.tencent.mm.plugin.facedetect.views.FaceDetectDecorView */
public class FaceDetectDecorView extends View {
    public boolean mau;
    public boolean mav;
    public boolean maw;
    public RectF may;
    private Paint maz;

    public FaceDetectDecorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FaceDetectDecorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AppMethodBeat.m2504i(C16666c.CTRL_INDEX);
        this.mau = false;
        this.mav = false;
        this.maw = false;
        this.may = null;
        this.maz = null;
        this.maz = new Paint();
        this.maz.setColor(getResources().getColor(C25738R.color.f11782h4));
        this.maz.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        setLayerType(1, null);
        AppMethodBeat.m2505o(C16666c.CTRL_INDEX);
    }

    /* Access modifiers changed, original: protected */
    public void onDraw(Canvas canvas) {
        AppMethodBeat.m2504i(C45580bd.CTRL_INDEX);
        super.onDraw(canvas);
        C4990ab.m7417i("MicroMsg.FaceDetectDecorView", "mTargetCoverMode: %b, mIsInCoverMode: %b, %s", Boolean.valueOf(this.mav), Boolean.valueOf(this.mau), this.may);
        if (this.mav != this.mau || this.maw) {
            if (this.mav) {
                canvas.drawColor(getResources().getColor(C25738R.color.f11977nv));
                canvas.drawRect(this.may, this.maz);
            } else {
                canvas.drawColor(getResources().getColor(C25738R.color.a3p));
            }
        }
        this.mau = this.mav;
        AppMethodBeat.m2505o(C45580bd.CTRL_INDEX);
    }
}
