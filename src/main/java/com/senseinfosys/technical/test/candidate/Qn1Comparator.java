package com.senseinfosys.technical.test.candidate;

import java.util.Comparator;
import java.util.Map;

public class Qn1Comparator implements Comparator<String>  {
	Map<String, Integer> refMap;

    public Qn1Comparator(Map<String, Integer> base) {
            this.refMap = base;
    }

    @Override
    public int compare(String k1, String k2) {
            Integer val1 = refMap.get(k1);
            Integer val2 = refMap.get(k2);

            int num = val1.compareTo(val2);
            // if frequencies are the same for the same string
            return num == 0 ? k1.compareTo(k2) : num;
    }
}
