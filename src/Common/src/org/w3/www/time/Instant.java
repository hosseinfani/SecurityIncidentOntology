package org.w3.www.time;

import ca.ryerson.rnet.ls3.annotation.OwlIri;
import ca.ryerson.rnet.ls3.annotation.OwlIriFactory;
import ca.ryerson.rnet.ls3.si.ProximityAdverb;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import java.time.DayOfWeek;
import org.w3.www.owl.Thing;
/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Instant <br>
 * @version generated on Wed Dec 10 20:15:17 EST 2014 by Hossein Fani <https://sites.google.com/site/hosseinfani at ls3.rnet.ryerson.ca>
 */

public class Instant extends Thing{

    private DateTimeDescription inDateTime;
    public DateTimeDescription getDateTime(){
        return inDateTime;
    }
    
    public Instant(int year, int month, int day, int hour, int minute, int second, DayOfWeek dayOfWeek, ProximityAdverb pa){
        inDateTime = new DateTimeDescription(year, month, day, hour, minute, second, dayOfWeek);
        timeProximity = pa;
    }
    /* ***************************************************
     * Property http://ls3.rnet.ryerson.ca/ontologies/sio/timeProximity
     */
    @OwlIri
    private ProximityAdverb timeProximity;
    public ProximityAdverb getTimeProximity(){
        return timeProximity;
    }
    
    @Override
    public Resource getRdfResource() throws ClassNotFoundException {
        Resource r = super.getRdfResource();
        if(timeProximity != null){
            Property p = ResourceFactory.createProperty(OwlIriFactory.getIri(this.getClass(), "timeProximity"));
            Resource o = ResourceFactory.createResource(timeProximity.getIri());
            r.addProperty(p, o);
        }
        if(inDateTime != null){
            r.getModel().add(inDateTime.getRdfResource().getModel());
            Property p = ResourceFactory.createProperty(OwlIriFactory.getIri(this.getClass(), "inDateTime"));
            Resource o = ResourceFactory.createResource(OwlIriFactory.getIri(inDateTime.getId()));
            r.addProperty(p, o);
        }
        
        return r;
    }

}
