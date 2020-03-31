package org.w3.www.geo;

import ca.ryerson.rnet.ls3.annotation.OwlIri;
import ca.ryerson.rnet.ls3.annotation.OwlIriFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import org.w3.www.owl.Thing;

/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 Source Class: SpatialThing <br>
 * @version generated on Wed Dec 10 20:15:17 EST 2014 by  Hossein Fani  <https://sites.google.com/site/hosseinfani at ls3.rnet.ryerson.ca>
 */

public class SpatialThing extends Thing{

    public SpatialThing(String text){
        formattedText = text;
    } 
    /* ***************************************************
     * Property http://ls3.rnet.ryerson.ca/ontologies/sio/formattedText
     */
    @OwlIri
    private String formattedText; 
    public String getFormattedText(){
        return formattedText;
    }

    @Override
    public Resource getRdfResource() throws ClassNotFoundException {
        Resource r = super.getRdfResource();
        if(formattedText != null){
            Property p = ResourceFactory.createProperty(OwlIriFactory.getIri(this.getClass(), "formattedText"));
            r.addLiteral(p, formattedText);
        }
        
        return r;
    }
    

}