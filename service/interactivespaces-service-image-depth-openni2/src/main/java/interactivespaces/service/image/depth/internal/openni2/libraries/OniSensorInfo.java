package interactivespaces.service.image.depth.internal.openni2.libraries;
import interactivespaces.service.image.depth.internal.openni2.libraries.OpenNI2Library.OniSensorType;
import org.bridj.IntValuedEnum;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Field;
import org.bridj.ann.Library;
/**
 * <i>native declaration : OniCTypes.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> or <a href="http://bridj.googlecode.com/">BridJ</a> .
 */
@Library("OpenNI2") 
public class OniSensorInfo extends StructObject {
	/** C type : OniSensorType */
	@Field(0) 
	public IntValuedEnum<OniSensorType > sensorType() {
		return this.io.getEnumField(this, 0);
	}
	/** C type : OniSensorType */
	@Field(0) 
	public OniSensorInfo sensorType(IntValuedEnum<OniSensorType > sensorType) {
		this.io.setEnumField(this, 0, sensorType);
		return this;
	}
	@Field(1) 
	public int numSupportedVideoModes() {
		return this.io.getIntField(this, 1);
	}
	@Field(1) 
	public OniSensorInfo numSupportedVideoModes(int numSupportedVideoModes) {
		this.io.setIntField(this, 1, numSupportedVideoModes);
		return this;
	}
	/** C type : OniVideoMode* */
	@Field(2) 
	public Pointer<OniVideoMode > pSupportedVideoModes() {
		return this.io.getPointerField(this, 2);
	}
	/** C type : OniVideoMode* */
	@Field(2) 
	public OniSensorInfo pSupportedVideoModes(Pointer<OniVideoMode > pSupportedVideoModes) {
		this.io.setPointerField(this, 2, pSupportedVideoModes);
		return this;
	}
	public OniSensorInfo() {
		super();
	}
	public OniSensorInfo(Pointer pointer) {
		super(pointer);
	}
}