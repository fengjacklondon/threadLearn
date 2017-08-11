package javathreads.examples.ch02;

import java.util.*;

public class CharacterEventHandler {
    private Vector<CharacterListener> listeners = new Vector<CharacterListener>();

    public void addCharacterListener(CharacterListener cl) {
        listeners.add(cl);
    }

    public void removeCharacterListener(CharacterListener cl) {
        listeners.remove(cl);
    }

    public void fireNewCharacter(CharacterSource source, int c) {
        CharacterEvent ce = new CharacterEvent(source, c);
        CharacterListener[] cl = (CharacterListener[] )listeners.toArray(new CharacterListener[0]);
	for (int i = 0; i < cl.length; i++)
		//为每个监听器新增一个字符，这个应用有多少个监听器呢？
	    cl[i].newCharacter(ce);
    }
}
