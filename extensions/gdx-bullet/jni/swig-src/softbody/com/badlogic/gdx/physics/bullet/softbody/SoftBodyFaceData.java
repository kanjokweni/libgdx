/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.softbody;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;
import com.badlogic.gdx.physics.bullet.dynamics.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class SoftBodyFaceData extends BulletBase {
	private long swigCPtr;
	
	protected SoftBodyFaceData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new SoftBodyFaceData, normally you should not need this constructor it's intended for low-level usage. */ 
	public SoftBodyFaceData(long cPtr, boolean cMemoryOwn) {
		this("SoftBodyFaceData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(SoftBodyFaceData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				SoftbodyJNI.delete_SoftBodyFaceData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setNormal(btVector3FloatData value) {
    SoftbodyJNI.SoftBodyFaceData_normal_set(swigCPtr, this, btVector3FloatData.getCPtr(value), value);
  }

  public btVector3FloatData getNormal() {
    long cPtr = SoftbodyJNI.SoftBodyFaceData_normal_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3FloatData(cPtr, false);
  }

  public void setMaterial(SoftBodyMaterialData value) {
    SoftbodyJNI.SoftBodyFaceData_material_set(swigCPtr, this, SoftBodyMaterialData.getCPtr(value), value);
  }

  public SoftBodyMaterialData getMaterial() {
    long cPtr = SoftbodyJNI.SoftBodyFaceData_material_get(swigCPtr, this);
    return (cPtr == 0) ? null : new SoftBodyMaterialData(cPtr, false);
  }

  public void setNodeIndices(int[] value) {
    SoftbodyJNI.SoftBodyFaceData_nodeIndices_set(swigCPtr, this, value);
  }

  public int[] getNodeIndices() {
    return SoftbodyJNI.SoftBodyFaceData_nodeIndices_get(swigCPtr, this);
}

  public void setRestArea(float value) {
    SoftbodyJNI.SoftBodyFaceData_restArea_set(swigCPtr, this, value);
  }

  public float getRestArea() {
    return SoftbodyJNI.SoftBodyFaceData_restArea_get(swigCPtr, this);
  }

  public SoftBodyFaceData() {
    this(SoftbodyJNI.new_SoftBodyFaceData(), true);
  }

}
