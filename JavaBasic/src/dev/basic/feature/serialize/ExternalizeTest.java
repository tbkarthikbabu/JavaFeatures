package dev.basic.feature.serialize;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizeTest implements Externalizable {

	Integer id;

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(id);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		in.readInt();
	}

}

class ExternalizeTestDemo{
	public static void main(String[] args) {
		
	}
}
