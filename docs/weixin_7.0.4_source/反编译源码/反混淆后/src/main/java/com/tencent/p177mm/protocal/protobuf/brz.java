package com.tencent.p177mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.p177mm.p205bt.C1331a;
import com.tencent.p177mm.p205bt.C1332b;
import java.util.LinkedList;
import p690e.p691a.p692a.C6087a;
import p690e.p691a.p692a.p693a.C6086a;
import p690e.p691a.p692a.p695b.p697b.C6091a;
import p690e.p691a.p692a.p698c.C6093a;

/* renamed from: com.tencent.mm.protocal.protobuf.brz */
public final class brz extends bsr {
    public float cEB;
    public float cGm;
    public String cMC;
    public float wUa;
    public C1332b wUb;
    public boolean wUc;
    public boolean wUd;

    /* renamed from: op */
    public final int mo4669op(int i, Object... objArr) {
        AppMethodBeat.m2504i(89131);
        int ix;
        if (i == 0) {
            C6093a c6093a = (C6093a) objArr[0];
            if (this.BaseRequest != null) {
                c6093a.mo13479iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(c6093a);
            }
            c6093a.mo13481r(2, this.cGm);
            c6093a.mo13481r(3, this.cEB);
            c6093a.mo13481r(4, this.wUa);
            if (this.wUb != null) {
                c6093a.mo13473c(5, this.wUb);
            }
            if (this.cMC != null) {
                c6093a.mo13475e(6, this.cMC);
            }
            c6093a.mo13471aO(7, this.wUc);
            c6093a.mo13471aO(8, this.wUd);
            AppMethodBeat.m2505o(89131);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = C6087a.m9557ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            ix = ((ix + (C6091a.m9576fv(2) + 4)) + (C6091a.m9576fv(3) + 4)) + (C6091a.m9576fv(4) + 4);
            if (this.wUb != null) {
                ix += C6091a.m9571b(5, this.wUb);
            }
            if (this.cMC != null) {
                ix += C6091a.m9575f(6, this.cMC);
            }
            int fv = (ix + (C6091a.m9576fv(7) + 1)) + (C6091a.m9576fv(8) + 1);
            AppMethodBeat.m2505o(89131);
            return fv;
        } else if (i == 2) {
            C6086a c6086a = new C6086a((byte[]) objArr[0], unknownTagHandler);
            for (ix = C1331a.getNextFieldNumber(c6086a); ix > 0; ix = C1331a.getNextFieldNumber(c6086a)) {
                if (!super.populateBuilderWithField(c6086a, this, ix)) {
                    c6086a.ems();
                }
            }
            AppMethodBeat.m2505o(89131);
            return 0;
        } else if (i == 3) {
            C6086a c6086a2 = (C6086a) objArr[0];
            brz brz = (brz) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList Vh = c6086a2.mo13445Vh(intValue);
                    int size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) Vh.get(intValue);
                        C7267hl c7267hl = new C7267hl();
                        C6086a c6086a3 = new C6086a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = c7267hl.populateBuilderWithField(c6086a3, c7267hl, C1331a.getNextFieldNumber(c6086a3))) {
                        }
                        brz.BaseRequest = c7267hl;
                    }
                    AppMethodBeat.m2505o(89131);
                    return 0;
                case 2:
                    brz.cGm = Float.intBitsToFloat(c6086a2.BTU.eia());
                    AppMethodBeat.m2505o(89131);
                    return 0;
                case 3:
                    brz.cEB = Float.intBitsToFloat(c6086a2.BTU.eia());
                    AppMethodBeat.m2505o(89131);
                    return 0;
                case 4:
                    brz.wUa = Float.intBitsToFloat(c6086a2.BTU.eia());
                    AppMethodBeat.m2505o(89131);
                    return 0;
                case 5:
                    brz.wUb = c6086a2.BTU.emu();
                    AppMethodBeat.m2505o(89131);
                    return 0;
                case 6:
                    brz.cMC = c6086a2.BTU.readString();
                    AppMethodBeat.m2505o(89131);
                    return 0;
                case 7:
                    brz.wUc = c6086a2.BTU.ehX();
                    AppMethodBeat.m2505o(89131);
                    return 0;
                case 8:
                    brz.wUd = c6086a2.BTU.ehX();
                    AppMethodBeat.m2505o(89131);
                    return 0;
                default:
                    AppMethodBeat.m2505o(89131);
                    return -1;
            }
        } else {
            AppMethodBeat.m2505o(89131);
            return -1;
        }
    }
}
