package collections.FindRepeatSymbol;

import com.google.common.base.Splitter;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import jdk.nashorn.internal.runtime.regexp.joni.encoding.CharacterType;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ivaylo Penev (ipenev91@gmail.com)
 */
public class RepeatSymbol {

    private Map<Character, Integer> map = new HashMap<>();

    // Collection Framework Java

    public Map<Character, Integer> countSymbol(String str) {

        int counter = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (map.containsKey(ch)) {
                counter = map.get(ch);

                map.put(ch, ++counter);
            } else {

                map.put(ch, 1);
            }
        }
        return map;
    }

    // Guava Google Library

    public void wordCounter(String str1) {

        Multiset<String> words = HashMultiset.create(Splitter.fixedLength(1).split(str1.toLowerCase()));

        for (Multiset.Entry<String> entry : words.entrySet()) {

            System.out.println(entry.getElement() + "->" + entry.getCount());
        }
    }
}
