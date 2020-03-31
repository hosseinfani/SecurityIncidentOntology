package ca.ryerson.rnet.ls3.si;

import ca.ryerson.rnet.ls3.annotation.OwlIriFactory;
import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.Resource;
import com.hp.hpl.jena.rdf.model.ResourceFactory;
import com.xmlns.foaf.Person;
import java.util.List;
/**
 * 
 * <p>
 * Generated by Protege (http://protege.stanford.edu). <br>
 * Source Class: Victim <br>
 * @version generated on Wed Dec 10 20:15:17 EST 2014 by Hossein Fani <https://sites.google.com/site/hosseinfani at ls3.rnet.ryerson.ca>
 */

public class Victim extends Person {
    
    public Victim(
            String name, 
            List<Integer> age, 
            ProximityAdverb ageProximityAdverb, 
            String gender, 
            String wearing, 
            String carrying, 
            String preState, 
            String postState) {
        super(name, ageProximityAdverb, gender, wearing, carrying);
        this.preState = preState;
        this.postState = postState;
    }
    
    /* ***************************************************
     * Property http://ls3.rnet.ryerson.ca/ontologies/sio/postState
     */
    private String postState; 
    public String getPostState(){
        return postState;
    }

    /* ***************************************************
     * Property http://ls3.rnet.ryerson.ca/ontologies/sio/preState
     */
    private String preState;
    public String getPreState(){
        return preState;
    }
    
    @Override
    public Resource getRdfResource() throws ClassNotFoundException{
        Resource r = super.getRdfResource();
        if(preState != null){
            Property s = ResourceFactory.createProperty(OwlIriFactory.getIri(this.getClass(), "preState"));
            r.addLiteral(s, preState);
        }
        if(postState != null){
            Property s = ResourceFactory.createProperty(OwlIriFactory.getIri(this.getClass(), "postState"));
            r.addLiteral(s, postState);
        }
        
        return r;
    }
}