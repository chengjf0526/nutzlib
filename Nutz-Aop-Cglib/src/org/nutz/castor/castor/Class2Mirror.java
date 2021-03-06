package org.nutz.castor.castor;

import org.nutz.castor.Castor;
import org.nutz.lang.Mirror;

@SuppressWarnings("unchecked")
public class Class2Mirror extends Castor<Class, Mirror> {

	@Override
	protected Mirror<?> cast(Class src, Class toType, String... args) {
		return Mirror.me(src);
	}

}
