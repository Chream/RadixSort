package chream.radixsort;

import chream.radixsort.parallel.MultiRadixPara;
import chream.radixsort.sequential.MultiRadixSeq;

public class RadixSort {

    public static int[] radixSort(int[] a) {
        int len = a.length;

        if (len < 10000000) {
            MultiRadixSeq radixSeq = new MultiRadixSeq();
            return radixSeq.radixMulti(a);
        } else {
            MultiRadixPara radixPara = new MultiRadixPara();
            return radixPara.radixMulti(a);
        }
    }

}
