package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.c.a;
import java.util.LinkedList;

public final class azr extends bsr {
    public LinkedList<azo> wDy = new LinkedList();
    public String wxX;

    public azr() {
        AppMethodBeat.i(11790);
        AppMethodBeat.o(11790);
    }

    public final int op(int i, Object... objArr) {
        AppMethodBeat.i(11791);
        int ix;
        byte[] bArr;
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.BaseRequest != null) {
                aVar.iy(1, this.BaseRequest.computeSize());
                this.BaseRequest.writeFields(aVar);
            }
            if (this.wxX != null) {
                aVar.e(2, this.wxX);
            }
            aVar.e(3, 8, this.wDy);
            AppMethodBeat.o(11791);
            return 0;
        } else if (i == 1) {
            if (this.BaseRequest != null) {
                ix = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0;
            } else {
                ix = 0;
            }
            if (this.wxX != null) {
                ix += e.a.a.b.b.a.f(2, this.wxX);
            }
            int c = ix + e.a.a.a.c(3, 8, this.wDy);
            AppMethodBeat.o(11791);
            return c;
        } else if (i == 2) {
            bArr = (byte[]) objArr[0];
            this.wDy.clear();
            e.a.a.a.a aVar2 = new e.a.a.a.a(bArr, unknownTagHandler);
            for (ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2); ix > 0; ix = com.tencent.mm.bt.a.getNextFieldNumber(aVar2)) {
                if (!super.populateBuilderWithField(aVar2, this, ix)) {
                    aVar2.ems();
                }
            }
            AppMethodBeat.o(11791);
            return 0;
        } else if (i == 3) {
            e.a.a.a.a aVar3 = (e.a.a.a.a) objArr[0];
            azr azr = (azr) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList Vh;
            int size;
            e.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        hl hlVar = new hl();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = hlVar.populateBuilderWithField(aVar4, hlVar, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        azr.BaseRequest = hlVar;
                    }
                    AppMethodBeat.o(11791);
                    return 0;
                case 2:
                    azr.wxX = aVar3.BTU.readString();
                    AppMethodBeat.o(11791);
                    return 0;
                case 3:
                    Vh = aVar3.Vh(intValue);
                    size = Vh.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) Vh.get(intValue);
                        azo azo = new azo();
                        aVar4 = new e.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = azo.populateBuilderWithField(aVar4, azo, com.tencent.mm.bt.a.getNextFieldNumber(aVar4))) {
                        }
                        azr.wDy.add(azo);
                    }
                    AppMethodBeat.o(11791);
                    return 0;
                default:
                    AppMethodBeat.o(11791);
                    return -1;
            }
        } else {
            AppMethodBeat.o(11791);
            return -1;
        }
    }
}
