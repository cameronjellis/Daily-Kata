package com.smt.kata.object;

// JDK 11.x
import java.io.IOException;


/****************************************************************************
 * <b>Title:</b> SerializerUtil.java
 * <b>Project:</b> SMT-Kata
 * <b>Description:</b> This Kata determines whether or not a class instance (Object) 
 * can be serialized.  Generally, the best way to determine this is to serialize
 * and deserialize the original object and compare it back.
 * 
 * You can only use standard JDK in the lang, util and io packages.  
 * 
 * <b>Copyright:</b> Copyright (c) 2021
 * <b>Company:</b> Silicon Mountain Technologies
 * 
 * @author James Camire
 * @version 3.0
 * @since Apr 19, 2021
 * <b>updates:</b>
 * 
 ****************************************************************************/
public class SerializerUtil {

	/**
	 * Determines if the passed object instance can be serialized
	 * @param o Object to validate
	 * @return True if the object can be successfully serialized and de-serialized
	 * and is equal to the original object
	 */
	public boolean isSerializable(Object o) {
		return o == null;
	}
	
	
	/**
	 * Converts the object into a byte array stream
	 * @param inst Object instance to evaluate
	 * @return byte array of the serialized object
	 * @throws IOException thrown if the object instance can not be serialized
	 */
	public byte[] serialize(Object inst) throws IOException {
	    return new byte[0];
	}

	/**
	 * Converts the provided byte[] back into the original object
	 * @param pickled byte array representing the original object
	 * @return Original object class
	 * @throws IOException When byte[] can not be processed
	 * @throws ClassNotFoundException Cannot recreate the original class type
	 */
	public Object deserialize(byte[] pickled) 
	throws IOException, ClassNotFoundException {
	    return pickled;
	}
}
