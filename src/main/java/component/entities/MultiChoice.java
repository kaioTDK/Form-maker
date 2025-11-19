package component.entities;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public final class MultiChoice implements Answer {
    Map choices = new TreeMap<Character,String>();
}
