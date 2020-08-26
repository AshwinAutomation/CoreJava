package com.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
        Map<Object, Object> m1=new HashMap<Object, Object>();
        m1.put(101, "Ashwin");
        m1.put(102, "Mahakul");
        m1.put(103, "QA");
        m1.put(102, "EY");
        Map<Object, Object> m2=new HashMap<Object, Object>();
        m2.put(104, "Bangalore");
        m2.putAll(m1);
        System.out.println(m2);
        System.out.println(m2.get(102));
        System.out.println(m2.size());
        Set<Object> keys=m2.keySet();
        System.out.println("keys" + keys);
        Collection<Object> values= m2.values();
        System.out.println("values :" + values);
        Set<Entry<Object, Object>> entry=m2.entrySet();
        System.out.println("entry :" + entry);
	}

}
