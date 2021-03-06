package module4;

import de.fhpotsdam.unfolding.data.PointFeature;
import processing.core.PGraphics;

/** Implements a visual marker for ocean earthquakes on an earthquake map
 * 
 * @author UC San Diego Intermediate Software Development MOOC team
 * @author Gabriel Alejandro Garoz Gonzalez
 *
 */
public class OceanQuakeMarker extends EarthquakeMarker {
	
	public OceanQuakeMarker(PointFeature quake) {
		super(quake);
		
		// setting field in earthquake marker
		isOnLand = false;
	}
	

	@Override
	public void drawEarthquake(PGraphics pg, float x, float y) {
		// Drawing a centered square for Ocean earthquakes
		// DO NOT set the fill color.  That will be set in the EarthquakeMarker
		// class to indicate the depth of the earthquake.
		// Simply draw a centered square.
		
		// HINT: Notice the radius variable in the EarthquakeMarker class
		// and how it is set in the EarthquakeMarker constructor
		
		// TODO: Implement this method
		
		double magni = this.getMagnitude();
		
	    if(magni < THRESHOLD_LIGHT) {
		    
	    	pg.rect(x,y,10,10);
	    }
	    else if(magni >= THRESHOLD_LIGHT && magni < THRESHOLD_MODERATE) {
	    	
	    	pg.rect(x,y,15,15);
	    }
	    else if(magni > THRESHOLD_MODERATE) {
	    	
	    	pg.rect(x,y,20,20);
	    }
		
	}
	


	

}
