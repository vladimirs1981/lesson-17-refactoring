package optional;

import java.awt.Color;

/* Use the following refactorings to reduce the long parameter list;
 * 		Introduce Parameter Object
 *  	Change Method Signature
 */



public class WorkIt {

	void putMyThingDown(PutMyThingDownParameter parameterObject) {
		flipIt(parameterObject.missySneakerSize, parameterObject.missyCapColor, parameterObject.bling);
	}

	void flipIt(int missySneakerSize, Color missyCapColor, String bling) {
		reverseIt(missySneakerSize, missyCapColor, bling);
	}

	void reverseIt(int missySneakerSize, Color missyCapColor, String bling) {
		System.out.println(missySneakerSize + bling + missyCapColor);
	}

}
